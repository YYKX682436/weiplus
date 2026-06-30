package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class o3 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 f289455d;

    public o3(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c2226) {
        this.f289455d = viewOnTouchListenerC22366xcd5c2226;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c2226 = this.f289455d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationListView", "onItemLongClick isCanClose: %b", java.lang.Boolean.valueOf(viewOnTouchListenerC22366xcd5c2226.U));
        android.widget.AdapterView.OnItemLongClickListener onItemLongClickListener = viewOnTouchListenerC22366xcd5c2226.W;
        if (onItemLongClickListener == null || viewOnTouchListenerC22366xcd5c2226.U) {
            return false;
        }
        return onItemLongClickListener.onItemLongClick(adapterView, view, i17, j17);
    }
}
