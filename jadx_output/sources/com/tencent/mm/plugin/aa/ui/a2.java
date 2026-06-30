package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class a2 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f72563d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f72564e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f72565f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.BaseAAPresenterActivity f72566g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(com.tencent.mm.plugin.aa.ui.BaseAAPresenterActivity baseAAPresenterActivity, boolean z17, android.widget.EditText editText, int i17) {
        super(false);
        this.f72566g = baseAAPresenterActivity;
        this.f72563d = z17;
        this.f72564e = editText;
        this.f72565f = i17;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        android.view.View view2;
        com.tencent.mm.plugin.aa.ui.BaseAAPresenterActivity baseAAPresenterActivity = this.f72566g;
        view2 = ((com.tencent.mm.wallet_core.ui.WalletBaseUI) baseAAPresenterActivity).mKBLayout;
        boolean isShown = view2.isShown();
        android.widget.EditText editText = this.f72564e;
        boolean z17 = this.f72563d;
        if (!isShown && !z17) {
            baseAAPresenterActivity.showTenpayKB();
            com.tencent.mm.plugin.aa.ui.BaseAAPresenterActivity.Z6(baseAAPresenterActivity, editText);
            baseAAPresenterActivity.setKBMode(this.f72565f);
        } else if (z17) {
            baseAAPresenterActivity.hideTenpayKB();
            ((android.view.inputmethod.InputMethodManager) baseAAPresenterActivity.getContext().getSystemService("input_method")).showSoftInput(editText, 0);
        }
    }
}
