package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public class w0 extends rl5.r {

    /* renamed from: p1, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.c1 f90169p1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(com.tencent.mm.plugin.appbrand.ui.recents.c1 c1Var, android.content.Context context) {
        super(context);
        this.f90169p1 = c1Var;
    }

    @Override // rl5.r
    public boolean n(int i17, int i18) {
        com.tencent.mm.plugin.appbrand.ui.recents.c1 c1Var = this.f90169p1;
        if (c1Var.itemView.getParent() != null) {
            c1Var.itemView.getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.n(i17, i18);
    }

    @Override // rl5.r, android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        com.tencent.mm.plugin.appbrand.ui.recents.c1 c1Var = this.f90169p1;
        if (c1Var.itemView.getParent() != null) {
            c1Var.itemView.getParent().requestDisallowInterceptTouchEvent(false);
        }
        super.onDismiss();
    }
}
