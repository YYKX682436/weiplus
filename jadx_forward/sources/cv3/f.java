package cv3;

/* loaded from: classes5.dex */
public final class f extends vu3.i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cv3.h f304106b;

    public f(cv3.h hVar) {
        this.f304106b = hVar;
    }

    @Override // vu3.c
    public void b(uu3.u layout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        cv3.h hVar = this.f304106b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(hVar.f304108h, "onDrawerClose: ");
        yz5.l lVar = hVar.f304109i;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.FALSE);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.t0(hVar.d());
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.a) hVar.d().b(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.a.class);
        if (aVar != null) {
            aVar.o(true);
        }
    }

    @Override // vu3.c
    public void d(uu3.u layout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        cv3.h hVar = this.f304106b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(hVar.f304108h, "onDrawerOpen: ");
        yz5.l lVar = hVar.f304109i;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.TRUE);
        }
    }

    @Override // vu3.c
    public void f(uu3.u layout, float f17, java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        cv3.h hVar = this.f304106b;
        yz5.p pVar = hVar.f304110m;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Float.valueOf(f17), source);
        }
        java.lang.String str = hVar.f304108h;
    }
}
