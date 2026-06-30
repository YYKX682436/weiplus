package kf3;

/* loaded from: classes5.dex */
public class a2 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16488xbf7e6679 f388851d;

    public a2(com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16488xbf7e6679 activityC16488xbf7e6679) {
        this.f388851d = activityC16488xbf7e6679;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        java.lang.String valueOf = java.lang.String.valueOf(charSequence);
        int i27 = i19 + i17;
        java.lang.String substring = valueOf.substring(i17, i27);
        com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16488xbf7e6679 activityC16488xbf7e6679 = this.f388851d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = activityC16488xbf7e6679.f230085s;
        if ((j0Var != null && j0Var.isShowing()) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.f(substring)) {
            activityC16488xbf7e6679.f230083q = valueOf;
            return;
        }
        android.graphics.Bitmap T = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.T(substring, 300, 300, false);
        if (T == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MassSendMsgUI", "showAlert fail, bmp is null");
            return;
        }
        android.widget.ImageView imageView = new android.widget.ImageView(activityC16488xbf7e6679);
        imageView.setImageBitmap(T);
        int dimensionPixelSize = activityC16488xbf7e6679.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561399hf);
        imageView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16488xbf7e6679 activityC16488xbf7e66792 = this.f388851d;
        activityC16488xbf7e66792.f230085s = db5.e1.r(activityC16488xbf7e66792, activityC16488xbf7e66792.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572422b63), imageView, activityC16488xbf7e6679.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), activityC16488xbf7e6679.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new kf3.z1(this, substring), null);
        java.lang.String str = valueOf.substring(0, i17) + valueOf.substring(i27);
        activityC16488xbf7e6679.f230077h.k1(str, -1, false);
        activityC16488xbf7e6679.f230083q = str;
    }
}
