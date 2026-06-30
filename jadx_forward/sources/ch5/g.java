package ch5;

/* loaded from: classes14.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22418xd23ce184 f123099d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f123100e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f123101f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22418xd23ce184 c22418xd23ce184, float f17, yz5.a aVar) {
        super(0);
        this.f123099d = c22418xd23ce184;
        this.f123100e = f17;
        this.f123101f = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22418xd23ce184 c22418xd23ce184 = this.f123099d;
        c22418xd23ce184.m80700xfe48f991(this.f123100e);
        yz5.p dragStatusBlock = c22418xd23ce184.getDragStatusBlock();
        if (dragStatusBlock != null) {
            dragStatusBlock.mo149xb9724478("STATE_DID_CHANGE_HEIGHT", java.lang.String.valueOf(c22418xd23ce184.getCurVisiblePercent()));
        }
        yz5.a aVar = this.f123101f;
        if (aVar == null) {
            return null;
        }
        aVar.mo152xb9724478();
        return jz5.f0.f384359a;
    }
}
