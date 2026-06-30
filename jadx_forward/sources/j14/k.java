package j14;

/* loaded from: classes8.dex */
public final class k extends com.p314xaae8f345.mm.app.z2 {
    @Override // com.p314xaae8f345.mm.app.a3
    /* renamed from: onAppBackground */
    public void mo510x3be51a90(java.lang.String str) {
        gm0.j1.a();
    }

    @Override // com.p314xaae8f345.mm.app.a3
    /* renamed from: onAppForeground */
    public void mo511x1952ea5(java.lang.String str) {
        if (gm0.j1.a()) {
            i95.m c17 = i95.n0.c(vd0.o3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            jm0.o oVar = (jm0.o) c17;
            if (!jm0.g.class.isAssignableFrom(xd0.b.class)) {
                throw new java.lang.IllegalArgumentException(oVar.getClass().getName().concat(" must extends FeatureServiceComponent"));
            }
            p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(oVar.getViewModel(), new jm0.e(oVar)).a(xd0.b.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            l14.c.f396534a.m175020x3cb8acf();
        }
    }
}
