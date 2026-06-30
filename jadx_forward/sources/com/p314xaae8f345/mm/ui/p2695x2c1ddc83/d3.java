package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class d3 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 f289162d;

    public d3(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c2226) {
        this.f289162d = viewOnTouchListenerC22366xcd5c2226;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c2226 = this.f289162d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationListView", "onItemClick isCanClose: %b", java.lang.Boolean.valueOf(viewOnTouchListenerC22366xcd5c2226.U));
        android.widget.AdapterView.OnItemClickListener onItemClickListener = viewOnTouchListenerC22366xcd5c2226.f288855p0;
        if (onItemClickListener == null || viewOnTouchListenerC22366xcd5c2226.U) {
            return;
        }
        onItemClickListener.onItemClick(adapterView, view, i17, j17);
    }
}
