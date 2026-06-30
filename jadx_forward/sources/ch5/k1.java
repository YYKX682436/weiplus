package ch5;

/* loaded from: classes14.dex */
public final class k1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22426x8efb1b1c f123130d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f123131e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22426x8efb1b1c c22426x8efb1b1c, int i17) {
        super(0);
        this.f123130d = c22426x8efb1b1c;
        this.f123131e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        yz5.a dragFullScreenListener;
        com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22426x8efb1b1c c22426x8efb1b1c = this.f123130d;
        c22426x8efb1b1c.getClass();
        if (java.lang.Math.abs(this.f123131e - c22426x8efb1b1c.f290383o) >= 5 || (dragFullScreenListener = c22426x8efb1b1c.getDragFullScreenListener()) == null) {
            return null;
        }
        dragFullScreenListener.mo152xb9724478();
        return null;
    }
}
