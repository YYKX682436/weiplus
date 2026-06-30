package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class z6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f289839d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f289840e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b7 f289841f;

    public z6(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b7 b7Var, int i17, int i18) {
        this.f289841f = b7Var;
        this.f289839d = i17;
        this.f289840e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f289839d;
        int i18 = this.f289840e;
        if (i17 != i18) {
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b7 b7Var = this.f289841f;
            if (b7Var.f289015f != i18) {
                return;
            }
            int firstVisiblePosition = b7Var.f289016g.f288905o.getFirstVisiblePosition();
            if (i17 == firstVisiblePosition && java.lang.Math.abs(i18 - i17) > 2) {
                b7Var.f289016g.f288905o.setSelection(i18);
            } else if (java.lang.Math.abs(firstVisiblePosition - i18) > 2) {
                com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c2226 = b7Var.f289016g.f288905o;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                arrayList.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(viewOnTouchListenerC22366xcd5c2226, arrayList.toArray(), "com/tencent/mm/ui/conversation/MainUI$3$1", "run", "()V", "Undefined", "smoothScrollToPositionFromTop", "(II)V");
                viewOnTouchListenerC22366xcd5c2226.smoothScrollToPositionFromTop(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
                yj0.a.f(viewOnTouchListenerC22366xcd5c2226, "com/tencent/mm/ui/conversation/MainUI$3$1", "run", "()V", "Undefined", "smoothScrollToPositionFromTop", "(II)V");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MainUI", "auto pos result:%d, %d, %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(firstVisiblePosition));
        }
    }
}
