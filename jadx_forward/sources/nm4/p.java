package nm4;

/* loaded from: classes9.dex */
public final class p extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18737x1ba35fc6 f420039a;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18737x1ba35fc6 c18737x1ba35fc6) {
        this.f420039a = c18737x1ba35fc6;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        int m72282x83bb89bd;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outline, "outline");
        int width = view.getWidth();
        int height = view.getHeight();
        m72282x83bb89bd = this.f420039a.m72282x83bb89bd();
        outline.setRoundRect(0, 0, width, height, m72282x83bb89bd);
    }
}
