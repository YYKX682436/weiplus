package ch5;

/* loaded from: classes14.dex */
public final class l1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f123134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22426x8efb1b1c f123135e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f123136f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f123137g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(float f17, com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22426x8efb1b1c c22426x8efb1b1c, float f18, float f19) {
        super(0);
        this.f123134d = f17;
        this.f123135e = c22426x8efb1b1c;
        this.f123136f = f18;
        this.f123137g = f19;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        float f17;
        float f18 = this.f123134d;
        double d17 = f18;
        com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22426x8efb1b1c c22426x8efb1b1c = this.f123135e;
        if (d17 >= 0.0d) {
            f17 = c22426x8efb1b1c.m80707x64a929f8();
        } else {
            f18 = c22426x8efb1b1c.f290383o;
            f17 = this.f123136f;
        }
        int i17 = (int) (f18 * f17);
        android.view.View view = c22426x8efb1b1c.f290379h;
        if (view != null) {
            com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22426x8efb1b1c.e(c22426x8efb1b1c, (int) view.getTranslationY(), 0, this.f123137g * 1000, new ch5.j1(c22426x8efb1b1c), null, new ch5.k1(c22426x8efb1b1c, i17), 16, null);
        }
        return jz5.f0.f384359a;
    }
}
