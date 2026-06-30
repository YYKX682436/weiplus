package ch5;

/* loaded from: classes14.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22418xd23ce184 f123067d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22418xd23ce184 c22418xd23ce184) {
        super(0);
        this.f123067d = c22418xd23ce184;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22418xd23ce184 c22418xd23ce184 = this.f123067d;
        c22418xd23ce184.m80700xfe48f991(1.0f);
        yz5.p dragStatusBlock = c22418xd23ce184.getDragStatusBlock();
        if (dragStatusBlock != null) {
            dragStatusBlock.mo149xb9724478("STATE_DID_CHANGE_HEIGHT", java.lang.String.valueOf(c22418xd23ce184.getCurVisiblePercent()));
        }
        yz5.a dragFullScreenListener = c22418xd23ce184.getDragFullScreenListener();
        if (dragFullScreenListener == null) {
            return null;
        }
        dragFullScreenListener.mo152xb9724478();
        return jz5.f0.f384359a;
    }
}
