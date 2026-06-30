package com.tencent.mm.plugin.appbrand.phonenumber;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberAddUI;", "Lcom/tencent/mm/ui/base/BaseLuggageActivity;", "<init>", "()V", "luggage-wechat-full-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class PhoneNumberAddUI extends com.tencent.mm.ui.base.BaseLuggageActivity {
    public vi1.d0 B;

    @Override // com.tencent.mm.ui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        vi1.e0 e0Var;
        java.lang.String stringExtra = getIntent().getStringExtra("APPID");
        nf.y yVar = nf.x.f336616b;
        if (yVar != null ? yVar.i(stringExtra) : false) {
            setTheme(com.tencent.mm.R.style.f494679t9);
        } else {
            setTheme(com.tencent.mm.R.style.t_);
        }
        super.onCreate(bundle);
        setNavigationbarColor(com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.f478490b));
        P6(com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.f478491c));
        if (getSupportActionBar() != null) {
            getSupportActionBar().G(0.0f);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PhoneNumberAddUI", "onCreate() appId:" + stringExtra);
        setTitle(com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.a3e));
        Q6(new vi1.c1(this), 0, com.tencent.mm.ui.p1.BACK);
        vi1.g0 a17 = vi1.l1.f437399a.a();
        kotlin.jvm.internal.o.d(stringExtra);
        vi1.d0 R5 = a17.R5(this, stringExtra, new vi1.d1(this));
        this.B = R5;
        if (R5 != null) {
            vi1.b1 b1Var = (vi1.b1) R5;
            b1Var.f437276d = new vi1.j1(b1Var.f437273a, b1Var);
            vi1.l2.f437401a.b(b1Var.f437274b);
        }
        vi1.d0 d0Var = this.B;
        setContentView((d0Var == null || (e0Var = ((vi1.b1) d0Var).f437276d) == null) ? null : ((vi1.j1) e0Var).f437346c);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.appbrand.phonenumber.widget.MMFormVerifyCodeInputView mMFormVerifyCodeInputView;
        super.onDestroy();
        vi1.d0 d0Var = this.B;
        if (d0Var != null) {
            vi1.b1 b1Var = (vi1.b1) d0Var;
            vi1.e0 e0Var = b1Var.f437276d;
            if (e0Var != null && (mMFormVerifyCodeInputView = ((vi1.j1) e0Var).f437347d) != null) {
                com.tencent.mm.sdk.platformtools.b4 b4Var = mMFormVerifyCodeInputView.f87418p;
                if (b4Var != null) {
                    b4Var.d();
                }
                mMFormVerifyCodeInputView.f87410e.setText("");
                mMFormVerifyCodeInputView.f87411f.setVisibility(8);
                mMFormVerifyCodeInputView.f87417o = mMFormVerifyCodeInputView.f87416n;
                mMFormVerifyCodeInputView.f87412g.setVisibility(0);
            }
            vi1.l2.f437401a.c(b1Var.f437274b);
        }
    }
}
