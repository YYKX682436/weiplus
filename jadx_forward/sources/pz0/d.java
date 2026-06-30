package pz0;

/* loaded from: classes5.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f440647d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f440648e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pz0.m f440649f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f440650g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f440651h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f440652i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(pz0.m mVar, java.lang.String str, java.lang.String str2, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f440649f = mVar;
        this.f440650g = str;
        this.f440651h = str2;
        this.f440652i = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        pz0.d dVar = new pz0.d(this.f440649f, this.f440650g, this.f440651h, this.f440652i, interfaceC29045xdcb5ca57);
        dVar.f440648e = obj;
        return dVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pz0.d) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j b17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f440647d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
            az0.n7 n7Var = this.f440649f.f440683g;
            yz5.l lVar = this.f440652i;
            if (n7Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "recreateCreation: movieSessionManager is null");
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE)));
                return f0Var;
            }
            java.lang.String str = this.f440650g;
            boolean z17 = str.length() == 0;
            java.lang.String str2 = this.f440651h;
            if (z17) {
                if (str2.length() == 0) {
                    str2 = null;
                }
                b17 = az0.rc.b("222", new az0.i6(n7Var, str2), new az0.l6(n7Var), false);
            } else {
                if (str2.length() == 0) {
                    str2 = null;
                }
                b17 = az0.rc.b("221", new az0.q6(str, n7Var, str2), new az0.t6(n7Var), false);
            }
            p3325xe03a0797.p3326xc267989b.p3328x30012e.g0 g0Var = new p3325xe03a0797.p3326xc267989b.p3328x30012e.g0(new p3325xe03a0797.p3326xc267989b.p3328x30012e.l0(b17, new pz0.a(lVar, c0Var, null)), new pz0.b(c0Var, lVar, null));
            pz0.c cVar = pz0.c.f440646d;
            this.f440647d = 1;
            if (g0Var.a(cVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return f0Var;
    }
}
