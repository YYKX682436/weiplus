package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class z1 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f72904d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f72905e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f72906f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f72907g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f72908h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.BaseAAPresenterActivity f72909i;

    public z1(com.tencent.mm.plugin.aa.ui.BaseAAPresenterActivity baseAAPresenterActivity, boolean z17, boolean z18, android.widget.EditText editText, android.view.View view, int i17) {
        this.f72909i = baseAAPresenterActivity;
        this.f72904d = z17;
        this.f72905e = z18;
        this.f72906f = editText;
        this.f72907g = view;
        this.f72908h = i17;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        com.tenpay.android.wechat.MyKeyboardWindow myKeyboardWindow;
        boolean isFocused = view.isFocused();
        com.tencent.mm.plugin.aa.ui.BaseAAPresenterActivity baseAAPresenterActivity = this.f72909i;
        if (isFocused && !this.f72904d) {
            ((android.view.inputmethod.InputMethodManager) baseAAPresenterActivity.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.plugin.aa.ui.x1(this, view), 300L);
            return;
        }
        java.util.regex.Pattern pattern = com.tencent.mm.wallet_core.ui.r1.f214222a;
        android.view.View view2 = this.f72907g;
        if (view2 instanceof com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView) {
            myKeyboardWindow = ((com.tencent.mm.wallet_core.ui.WalletBaseUI) baseAAPresenterActivity).mKeyboard;
            com.tencent.mm.wallet_core.ui.r1.p0(view2, myKeyboardWindow);
        }
        new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.plugin.aa.ui.y1(this), 200L);
    }
}
