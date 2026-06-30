package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes5.dex */
public class v7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f72857d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f72858e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.d0 f72859f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.PaylistAAUI f72860g;

    public v7(com.tencent.mm.plugin.aa.ui.PaylistAAUI paylistAAUI, android.widget.TextView textView, java.lang.String str, r45.d0 d0Var) {
        this.f72860g = paylistAAUI;
        this.f72857d = textView;
        this.f72858e = str;
        this.f72859f = d0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.TextView textView = this.f72857d;
        if (textView.getMeasuredWidth() != 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("  ");
            com.tencent.mm.plugin.aa.ui.PaylistAAUI paylistAAUI = this.f72860g;
            sb6.append(paylistAAUI.getString(com.tencent.mm.R.string.hgw));
            java.lang.String sb7 = sb6.toString();
            java.lang.String str = sb7 + (" " + this.f72858e + " ");
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            androidx.appcompat.app.AppCompatActivity context = paylistAAUI.getContext();
            ((ke0.e) xVar).getClass();
            android.text.SpannableString i17 = com.tencent.mm.pluginsdk.ui.span.c0.i(context, str);
            int i18 = com.tencent.mm.plugin.aa.ui.PaylistAAUI.S;
            paylistAAUI.o7(textView, i17, sb7, this.f72859f);
        }
    }
}
