package bd5;

/* loaded from: classes10.dex */
public final class e extends androidx.recyclerview.widget.t0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.history.person.MsgHistoryGalleryPersonRecommendUI f19434c;

    public e(com.tencent.mm.ui.chatting.history.person.MsgHistoryGalleryPersonRecommendUI msgHistoryGalleryPersonRecommendUI) {
        this.f19434c = msgHistoryGalleryPersonRecommendUI;
    }

    @Override // androidx.recyclerview.widget.t0
    public int c(int i17) {
        int i18 = com.tencent.mm.ui.chatting.history.person.MsgHistoryGalleryPersonRecommendUI.F;
        androidx.recyclerview.widget.f2 adapter = this.f19434c.h7().getAdapter();
        return (adapter != null && adapter.getItemViewType(i17) == 0) ? 4 : 1;
    }
}
