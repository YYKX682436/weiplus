package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public abstract class BaseAAPresenterActivity extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: f, reason: collision with root package name */
    public static final int f72472f = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 300);

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f72473d;

    /* renamed from: e, reason: collision with root package name */
    public final em5.i f72474e = new em5.i();

    public static void Z6(com.tencent.mm.plugin.aa.ui.BaseAAPresenterActivity baseAAPresenterActivity, android.widget.EditText editText) {
        if (baseAAPresenterActivity.f72473d != null) {
            int[] iArr = new int[2];
            editText.getLocationInWindow(iArr);
            int height = iArr[1] + editText.getHeight();
            int height2 = baseAAPresenterActivity.getWindow().getDecorView().getHeight() - baseAAPresenterActivity.getSupportActionBar().l();
            int i17 = height2 - height;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(height);
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(height2);
            java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i17);
            int i18 = f72472f;
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseAAPresenterActivity", "scrollToFormEditPosAfterShowTenPay, editText locationY: %s, height: %s, diff: %s, hardcodeKeyboardHeight: %s", valueOf, valueOf2, valueOf3, java.lang.Integer.valueOf(i18));
            if (i17 <= 0 || i17 >= i18) {
                return;
            }
            int b17 = (i18 - i17) + i65.a.b(baseAAPresenterActivity, 10);
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseAAPresenterActivity", "scrollToFormEditPosAfterShowTenPay, scrollDistance: %s", java.lang.Integer.valueOf(b17));
            baseAAPresenterActivity.f72473d.scrollBy(0, b17);
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public void hideTenpayKB() {
        super.hideTenpayKB();
        android.view.View view = this.f72473d;
        if (view != null) {
            view.scrollTo(0, 0);
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f72474e.c(getIntent(), this);
        this.isVKBFirstTimeShown = true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        em5.i iVar = this.f72474e;
        iVar.f255232g.dead();
        iVar.e(4);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f72474e.e(3);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f72474e.e(2);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public void setEditFocusListener(android.view.View view, int i17, boolean z17, boolean z18) {
        android.view.View view2;
        this.mKeyboard = (com.tenpay.android.wechat.MyKeyboardWindow) findViewById(com.tencent.mm.R.id.tenpay_num_keyboard);
        this.mKBLayout = findViewById(com.tencent.mm.R.id.o1v);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.tenpay_push_down);
        android.widget.EditText editText = (android.widget.EditText) view.findViewById(com.tencent.mm.R.id.pbn);
        if (this.mKeyboard == null || editText == null || (view2 = this.mKBLayout) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/aa/ui/BaseAAPresenterActivity", "setEditFocusListener", "(Landroid/view/View;IZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/aa/ui/BaseAAPresenterActivity", "setEditFocusListener", "(Landroid/view/View;IZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.wallet_core.ui.r1.v0(editText);
        editText.setOnFocusChangeListener(new com.tencent.mm.plugin.aa.ui.z1(this, z17, z18, editText, view, i17));
        editText.setOnClickListener(new com.tencent.mm.plugin.aa.ui.a2(this, z17, editText, i17));
        findViewById.setOnClickListener(new com.tencent.mm.plugin.aa.ui.b2(this));
    }
}
