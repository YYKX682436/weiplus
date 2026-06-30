package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes7.dex */
public class x6 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f269134a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f269135b = "";

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21467xa0ba12ff f269136c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f269137d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f269138e;

    public x6(android.content.Context context) {
        this.f269138e = context;
    }

    public boolean a(java.util.LinkedList linkedList, java.lang.String str, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.t6 t6Var) {
        this.f269135b = str;
        this.f269134a = str2;
        if (linkedList == null || linkedList.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandAuthorizeDialog", "scopeInfoList is empty or null");
            return false;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 k2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2(this.f269138e, com.p314xaae8f345.mm.R.C30868x68b1db1.f576326wf);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ((android.view.LayoutInflater) this.f269138e.getSystemService("layout_inflater")).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569694iu, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.pjg);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            textView.setText(str3);
        }
        android.widget.ImageView imageView = (android.widget.ImageView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.a17);
        f3.i iVar = new f3.i(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e, bp.b.m10969xb866ec1c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e, com.p314xaae8f345.mm.R.raw.f78922x61de8d17, null));
        iVar.b(true);
        if (imageView != null) {
            l01.d0.f396294a.b(imageView, this.f269134a, iVar, new l01.n0());
        }
        android.widget.TextView textView2 = (android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.a1p);
        if (this.f269135b == null) {
            this.f269135b = "";
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = this.f269138e;
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ghf, this.f269135b);
        ((ke0.e) xVar).getClass();
        textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, string));
        this.f269136c = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21467xa0ba12ff) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.f564828a81);
        this.f269136c.setAdapter((android.widget.ListAdapter) new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.w6(this, linkedList));
        if (linkedList.size() > 5) {
            this.f269136c.f278765d = linkedList.size();
            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.a8b);
            this.f269137d = linearLayout2;
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) linearLayout2.getLayoutParams();
            layoutParams.height = this.f269138e.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a4b);
            this.f269137d.setLayoutParams(layoutParams);
        }
        ((android.widget.Button) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.ioc)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p6(this, linkedList, t6Var, k2Var));
        ((android.widget.Button) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.ipb)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.q6(this, linkedList, t6Var, k2Var));
        k2Var.setCanceledOnTouchOutside(false);
        k2Var.setOnDismissListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.r6(this));
        k2Var.setOnCancelListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.s6(this, t6Var));
        k2Var.setContentView(linearLayout);
        try {
            k2Var.show();
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandAuthorizeDialog", "dialog show failed %s", e17.getMessage());
            return false;
        }
    }
}
