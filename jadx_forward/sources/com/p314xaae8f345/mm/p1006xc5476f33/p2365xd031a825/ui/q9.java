package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes8.dex */
public class q9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3 f262125d;

    public q9(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3 activityC19125x69c29dd3) {
        this.f262125d = activityC19125x69c29dd3;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletVerifyCodeUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3 activityC19125x69c29dd3 = this.f262125d;
        if (activityC19125x69c29dd3.f261650n == null) {
            activityC19125x69c29dd3.f261650n = "";
        }
        java.lang.String format = java.lang.String.format(c01.z1.I() ? activityC19125x69c29dd3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l0r) : activityC19125x69c29dd3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l0q), activityC19125x69c29dd3.f261650n);
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) activityC19125x69c29dd3.mo55332x76847179().getSystemService("layout_inflater");
        android.widget.TextView textView = (android.widget.TextView) layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570710bk3, (android.view.ViewGroup) null);
        int dimensionPixelSize = layoutInflater.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561399hf);
        textView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        textView.setText(format);
        db5.e1.w(activityC19125x69c29dd3.mo55332x76847179(), activityC19125x69c29dd3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l0s), activityC19125x69c29dd3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kmf), textView, new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.j9(activityC19125x69c29dd3));
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletVerifyCodeUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
