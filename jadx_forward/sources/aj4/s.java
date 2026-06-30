package aj4;

/* loaded from: classes10.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f86899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c f86900e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 f86901f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f86902g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c activityC0053x3d3f670c, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f86900e = activityC0053x3d3f670c;
        this.f86901f = c16993xacc19624;
        this.f86902g = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new aj4.s(this.f86900e, this.f86901f, this.f86902g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((aj4.s) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f86899d;
        kz5.p0 p0Var = kz5.p0.f395529d;
        yz5.l lVar = this.f86902g;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                qc0.c1 c1Var = (qc0.c1) i95.n0.c(qc0.c1.class);
                p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c activityC0053x3d3f670c = this.f86900e;
                com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 provider = this.f86901f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(provider, "$provider");
                this.f86899d = 1;
                obj = ((pc0.e2) c1Var).wi(activityC0053x3d3f670c, provider, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            qc0.m1 m1Var = (qc0.m1) obj;
            int i18 = m1Var.f442944b;
            if (i18 == -1 && m1Var.f442945c == 0) {
                qc0.l1 a17 = m1Var.a();
                bw5.sb sbVar = null;
                if (a17 != null) {
                    aj4.v vVar = aj4.v.f86910a;
                    boolean b17 = a17.b();
                    java.lang.String str = a17.f442929b;
                    sbVar = b17 ? vVar.c(str, a17.f442930c, null) : vVar.b(str);
                }
                if (sbVar != null) {
                    lVar.mo146xb9724478(new aj4.n(kz5.b0.c(sbVar), 0L, null, 6, null));
                } else {
                    lVar.mo146xb9724478(new aj4.n(p0Var, -1L, "capture result empty"));
                }
            } else {
                lVar.mo146xb9724478(new aj4.n(p0Var, i18, "capture cancelled"));
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TextStatusFlutterMediaProvider", th6, "pickFromCapture failed", new java.lang.Object[0]);
            java.lang.String message = th6.getMessage();
            if (message == null) {
                message = "capture failed";
            }
            lVar.mo146xb9724478(new aj4.n(p0Var, -1L, message));
        }
        return jz5.f0.f384359a;
    }
}
