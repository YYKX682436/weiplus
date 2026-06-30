package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public final class p7 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.SportHistoryUI f99622d;

    public p7(com.tencent.mm.plugin.exdevice.ui.SportHistoryUI sportHistoryUI) {
        this.f99622d = sportHistoryUI;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, int i17, androidx.recyclerview.widget.RecyclerView parent) {
        androidx.recyclerview.widget.f2 adapter;
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(parent, "parent");
        com.tencent.mm.plugin.exdevice.ui.SportHistoryUI sportHistoryUI = this.f99622d;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = sportHistoryUI.f99388d;
        if (i17 == ((wxRecyclerView == null || (adapter = wxRecyclerView.getAdapter()) == null) ? 1 : adapter.getItemCount()) - 1) {
            outRect.bottom = i65.a.b(sportHistoryUI, 16);
        }
    }
}
