package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes.dex */
public final class h40 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50 f216111d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f216112e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f216113f;

    public h40(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50 f50Var, android.widget.TextView textView, android.widget.ImageView imageView) {
        this.f216111d = f50Var;
        this.f216112e = textView;
        this.f216113f = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50 f50Var = this.f216111d;
        if (f50Var.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.g28) == null) {
            return;
        }
        android.widget.TextView finderNickname = this.f216112e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderNickname, "$finderNickname");
        float measuredWidth = ((pm0.v.t(r0)[0] - pm0.v.t(finderNickname)[0]) - this.f216113f.getMeasuredWidth()) - f50Var.m80379x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
        if (finderNickname.getMeasuredWidth() > measuredWidth) {
            android.view.ViewGroup.LayoutParams layoutParams = finderNickname.getLayoutParams();
            layoutParams.width = (int) measuredWidth;
            finderNickname.setLayoutParams(layoutParams);
        }
    }
}
