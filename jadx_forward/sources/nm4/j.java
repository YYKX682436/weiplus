package nm4;

/* loaded from: classes9.dex */
public final class j extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18736x613b2f1 f420030a;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18736x613b2f1 c18736x613b2f1) {
        this.f420030a = c18736x613b2f1;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        int m72278x83bb89bd;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outline, "outline");
        int width = view.getWidth();
        int height = view.getHeight();
        m72278x83bb89bd = this.f420030a.m72278x83bb89bd();
        outline.setRoundRect(0, 0, width, height, m72278x83bb89bd);
    }
}
