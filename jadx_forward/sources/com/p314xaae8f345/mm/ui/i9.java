package com.p314xaae8f345.mm.ui;

/* loaded from: classes3.dex */
public class i9 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 implements android.content.DialogInterface {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f290441d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f290442e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f290443f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f290444g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f290445h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f290446i;

    public i9(android.content.Context context) {
        super(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bxu, (android.view.ViewGroup) null);
        this.f290441d = linearLayout;
        this.f290442e = (android.widget.Button) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.f78304x89ab61fb);
        this.f290443f = (android.widget.TextView) this.f290441d.findViewById(com.p314xaae8f345.mm.R.id.jlo);
        this.f290444g = (android.widget.TextView) this.f290441d.findViewById(com.p314xaae8f345.mm.R.id.jlg);
        this.f290445h = this.f290441d.findViewById(com.p314xaae8f345.mm.R.id.jlp);
        this.f290446i = (android.widget.LinearLayout) this.f290441d.findViewById(com.p314xaae8f345.mm.R.id.jlh);
        setCanceledOnTouchOutside(true);
    }

    public void c(boolean z17) {
        super.setCancelable(z17);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.h9(this));
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteDependDialog", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
        } else {
            try {
                super.dismiss();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteDependDialog", "dismiss exception, e = " + e17.getMessage());
            }
        }
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f290441d);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z17) {
        super.setCancelable(z17);
        setCanceledOnTouchOutside(z17);
    }

    @Override // android.app.Dialog
    public void setTitle(java.lang.CharSequence charSequence) {
        android.view.View view = this.f290445h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/LiteDependDialog", "setTitle", "(Ljava/lang/CharSequence;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/LiteDependDialog", "setTitle", "(Ljava/lang/CharSequence;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f290443f.setVisibility(0);
        this.f290443f.setMaxLines(2);
        this.f290443f.setText(charSequence);
        android.widget.TextView textView = this.f290444g;
        if (textView != null) {
            textView.setTextColor(textView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560425k1));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2, android.app.Dialog
    public void show() {
        try {
            super.show();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteDependDialog", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // android.app.Dialog
    public void setTitle(int i17) {
        android.view.View view = this.f290445h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/LiteDependDialog", "setTitle", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/LiteDependDialog", "setTitle", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f290443f.setVisibility(0);
        this.f290443f.setMaxLines(2);
        this.f290443f.setText(i17);
        android.widget.TextView textView = this.f290444g;
        if (textView != null) {
            textView.setTextColor(textView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560425k1));
        }
    }
}
