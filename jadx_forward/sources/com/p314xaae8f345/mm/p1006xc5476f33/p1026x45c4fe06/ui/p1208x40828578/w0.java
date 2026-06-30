package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578;

/* loaded from: classes7.dex */
public class w0 extends rl5.r {

    /* renamed from: p1, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c1 f171702p1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c1 c1Var, android.content.Context context) {
        super(context);
        this.f171702p1 = c1Var;
    }

    @Override // rl5.r
    public boolean n(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c1 c1Var = this.f171702p1;
        if (c1Var.f3639x46306858.getParent() != null) {
            c1Var.f3639x46306858.getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.n(i17, i18);
    }

    @Override // rl5.r, android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c1 c1Var = this.f171702p1;
        if (c1Var.f3639x46306858.getParent() != null) {
            c1Var.f3639x46306858.getParent().requestDisallowInterceptTouchEvent(false);
        }
        super.onDismiss();
    }
}
