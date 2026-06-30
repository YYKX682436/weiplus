package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class i3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f289271d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f289272e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 f289273f;

    public i3(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c2226, int i17) {
        this.f289273f = viewOnTouchListenerC22366xcd5c2226;
        this.f289272e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c2226 = this.f289273f;
        android.view.View view = viewOnTouchListenerC22366xcd5c2226.C;
        if (view == null) {
            return;
        }
        if (view.getTop() != 0) {
            viewOnTouchListenerC22366xcd5c2226.E = viewOnTouchListenerC22366xcd5c2226.C.getTop();
        }
        int i17 = viewOnTouchListenerC22366xcd5c2226.E;
        int i18 = this.f289272e;
        if (i17 <= 0) {
            int i19 = this.f289271d;
            if (i19 <= 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationListView", "initActionBarView try again tryCount: %d", java.lang.Integer.valueOf(i19));
                viewOnTouchListenerC22366xcd5c2226.post(this);
            } else {
                int[] iArr = new int[2];
                viewOnTouchListenerC22366xcd5c2226.C.getLocationOnScreen(iArr);
                int i27 = iArr[1];
                int[] iArr2 = new int[2];
                viewOnTouchListenerC22366xcd5c2226.getLocationOnScreen(iArr2);
                int i28 = iArr2[1];
                android.view.ViewGroup.LayoutParams layoutParams = viewOnTouchListenerC22366xcd5c2226.getLayoutParams();
                int i29 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? ((android.widget.RelativeLayout.LayoutParams) layoutParams).topMargin : 0;
                java.lang.String str = android.os.Build.MANUFACTURER;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str == null) {
                    str = "";
                }
                java.lang.String lowerCase = str.toLowerCase();
                boolean z18 = lowerCase.contains("vivo") && android.os.Build.VERSION.SDK_INT == 28;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationListView", "initActionBarView actionBarTopOnScreen: %d, listTopOnScreen: %d, listTopMargin: %d, manufacturer: %s, isVivoAbove28: %b", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29), lowerCase, java.lang.Boolean.valueOf(z18));
                if (i28 - i29 == i27 && z18) {
                    viewOnTouchListenerC22366xcd5c2226.E = 0;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationListView", "initActionBarView set top to 0");
                    viewOnTouchListenerC22366xcd5c2226.x(0, i18);
                    viewOnTouchListenerC22366xcd5c2226.v(0, true);
                } else {
                    int h17 = com.p314xaae8f345.mm.ui.bl.h(viewOnTouchListenerC22366xcd5c2226.getContext());
                    viewOnTouchListenerC22366xcd5c2226.E = h17;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConversationListView", "initActionBarView get default status bar height: %d", java.lang.Integer.valueOf(h17));
                    viewOnTouchListenerC22366xcd5c2226.x(viewOnTouchListenerC22366xcd5c2226.E, i18);
                    viewOnTouchListenerC22366xcd5c2226.v(viewOnTouchListenerC22366xcd5c2226.E, false);
                }
            }
        } else {
            viewOnTouchListenerC22366xcd5c2226.x(i17, i18);
            viewOnTouchListenerC22366xcd5c2226.v(viewOnTouchListenerC22366xcd5c2226.E, false);
        }
        this.f289271d++;
    }
}
