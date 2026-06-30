package xx3;

/* loaded from: classes10.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f539546d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f539547e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f539548f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f539549g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f539550h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f539551i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f539552m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f539553n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f539554o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f539555p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f539556q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i17, int i18, long j17, java.lang.String str, int i19, int i27, java.lang.String str2, int i28, int i29, java.lang.String str3, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f539547e = i17;
        this.f539548f = i18;
        this.f539549g = j17;
        this.f539550h = str;
        this.f539551i = i19;
        this.f539552m = i27;
        this.f539553n = str2;
        this.f539554o = i28;
        this.f539555p = i29;
        this.f539556q = str3;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xx3.g(this.f539547e, this.f539548f, this.f539549g, this.f539550h, this.f539551i, this.f539552m, this.f539553n, this.f539554o, this.f539555p, this.f539556q, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((xx3.g) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f539546d;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("saveExclusiveRingtone: opType=");
                int i18 = this.f539547e;
                sb6.append(i18);
                sb6.append(" ,useRingtone=");
                int i19 = this.f539548f;
                sb6.append(i19);
                sb6.append(", objectId=");
                long j17 = this.f539549g;
                sb6.append(j17);
                sb6.append(", nonceId=");
                java.lang.String str = this.f539550h;
                sb6.append(str);
                sb6.append(", start=");
                int i27 = this.f539551i;
                sb6.append(i27);
                sb6.append(", end=");
                int i28 = this.f539552m;
                sb6.append(i28);
                sb6.append(", username=");
                java.lang.String str2 = this.f539553n;
                sb6.append(str2);
                sb6.append(",musicUrl = ");
                int i29 = this.f539554o;
                sb6.append(i29);
                sb6.append(", extBusinessScene:");
                int i37 = this.f539555p;
                sb6.append(i37);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtoneSettingHelper", sb6.toString());
                t45.b1 b1Var = new t45.b1();
                b1Var.f497063g = i18;
                b1Var.f497060d = i19;
                t45.l0 l0Var = new t45.l0();
                l0Var.f497136f = i28;
                l0Var.f497135e = i27;
                if (i29 == 0) {
                    l0Var.f497134d = 2;
                } else {
                    l0Var.f497134d = 1;
                }
                t45.f fVar = new t45.f();
                fVar.f497083e = str;
                fVar.f497082d = j17;
                l0Var.f497138h = fVar;
                t45.e0 e0Var = new t45.e0();
                e0Var.f497080d = i29;
                l0Var.f497137g = e0Var;
                b1Var.f497061e = l0Var;
                b1Var.f497062f = str2;
                b1Var.f497065i = i37;
                b1Var.f497066m = this.f539556q;
                ux3.l lVar = new ux3.l(b1Var);
                this.f539546d = 1;
                obj = rm0.h.a(lVar, 0L, null, this, 3, null);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            return new rm0.i(true, (t45.c1) obj);
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RingtoneSettingHelper", "error happened in save ringtone ");
            return new rm0.i(false, null, 2, null);
        }
    }
}
