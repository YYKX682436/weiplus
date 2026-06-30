package a82;

/* loaded from: classes11.dex */
public final class q1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f83669d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a82.u1 f83670e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f83671f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83672g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83673h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83674i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f83675m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83676n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83677o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ o72.o4 f83678p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ o72.n4 f83679q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(a82.u1 u1Var, long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4, java.lang.String str5, o72.o4 o4Var, o72.n4 n4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f83670e = u1Var;
        this.f83671f = j17;
        this.f83672g = str;
        this.f83673h = str2;
        this.f83674i = str3;
        this.f83675m = i17;
        this.f83676n = str4;
        this.f83677o = str5;
        this.f83678p = o4Var;
        this.f83679q = n4Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new a82.q1(this.f83670e, this.f83671f, this.f83672g, this.f83673h, this.f83674i, this.f83675m, this.f83676n, this.f83677o, this.f83678p, this.f83679q, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((a82.q1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f83669d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            a82.u1 u1Var = this.f83670e;
            long j17 = this.f83671f;
            java.lang.String str = this.f83672g;
            java.lang.String str2 = this.f83673h;
            java.lang.String str3 = this.f83674i;
            int i18 = this.f83675m;
            java.lang.String str4 = this.f83676n;
            java.lang.String str5 = this.f83677o;
            o72.o4 o4Var = this.f83678p;
            this.f83669d = 1;
            obj = u1Var.Bi(j17, str, str2, str3, i18, str4, str5, o4Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        o72.p4 p4Var = (o72.p4) obj;
        o72.n4 n4Var = this.f83679q;
        if (n4Var != null) {
            zf0.g gVar = (zf0.g) n4Var;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoMsg.SendVideoTask", gVar.f553947a.id() + " download fav file path: " + gVar.f553948b + " resultcode:" + p4Var.f424971a + ",resultmsg: " + p4Var.f424972b);
            int i19 = p4Var.f424971a;
            java.util.Map map = gVar.f553949c;
            if (map != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("download_fav_");
                vf0.o2 o2Var = gVar.f553951e;
                sb6.append(o2Var.name());
                sb6.append("_result");
                map.put(sb6.toString(), java.lang.Integer.valueOf(i19));
                map.put("download_fav_" + o2Var.name() + "_cost", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - gVar.f553952f));
            }
            boolean z17 = i19 == 0 || i19 == 1;
            p3325xe03a0797.p3326xc267989b.q qVar = gVar.f553950d;
            try {
                if (z17) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(0));
                } else {
                    ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Integer.valueOf(i19)));
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        return jz5.f0.f384359a;
    }
}
