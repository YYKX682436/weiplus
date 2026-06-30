package com.p314xaae8f345.p592x631407a.p595x2eaf0c;

/* renamed from: com.tencent.midas.comm.APProgressDialog */
/* loaded from: classes13.dex */
public class ProgressDialogC4761x9393ebe4 extends android.app.ProgressDialog {

    /* renamed from: context */
    private android.content.Context f20310x38b735af;

    /* renamed from: loadingTxt */
    private java.lang.String f20311x18540f94;

    /* renamed from: loading_txt */
    private android.widget.TextView f20312xf232d4ed;

    public ProgressDialogC4761x9393ebe4(android.content.Context context) {
        super(context);
        this.f20311x18540f94 = "请稍候...";
        this.f20312xf232d4ed = null;
        this.f20310x38b735af = context;
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(ub.a.d(this.f20310x38b735af, "unipay_layout_loadding"));
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) findViewById(ub.a.c(this.f20310x38b735af, "unipay_progress"));
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.2f);
        alphaAnimation.setDuration(600L);
        alphaAnimation.setRepeatCount(-1);
        alphaAnimation.setRepeatMode(2);
        progressBar.setAnimation(alphaAnimation);
        alphaAnimation.start();
        android.widget.TextView textView = (android.widget.TextView) findViewById(ub.a.c(this.f20310x38b735af, "unipay_id_LoadingTxt"));
        this.f20312xf232d4ed = textView;
        textView.setText(this.f20311x18540f94);
        setCancelable(false);
    }

    @Override // android.app.AlertDialog, android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        cancel();
        return false;
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog
    public void setMessage(java.lang.CharSequence charSequence) {
        super.setMessage(charSequence);
        this.f20311x18540f94 = java.lang.String.valueOf(charSequence);
    }
}
