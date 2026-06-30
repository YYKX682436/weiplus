package com.tencent.midas.comm;

/* loaded from: classes13.dex */
public class APProgressDialog extends android.app.ProgressDialog {
    private android.content.Context context;
    private java.lang.String loadingTxt;
    private android.widget.TextView loading_txt;

    public APProgressDialog(android.content.Context context) {
        super(context);
        this.loadingTxt = "请稍候...";
        this.loading_txt = null;
        this.context = context;
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(ub.a.d(this.context, "unipay_layout_loadding"));
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) findViewById(ub.a.c(this.context, "unipay_progress"));
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.2f);
        alphaAnimation.setDuration(600L);
        alphaAnimation.setRepeatCount(-1);
        alphaAnimation.setRepeatMode(2);
        progressBar.setAnimation(alphaAnimation);
        alphaAnimation.start();
        android.widget.TextView textView = (android.widget.TextView) findViewById(ub.a.c(this.context, "unipay_id_LoadingTxt"));
        this.loading_txt = textView;
        textView.setText(this.loadingTxt);
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
        this.loadingTxt = java.lang.String.valueOf(charSequence);
    }
}
