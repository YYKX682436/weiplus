package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes14.dex */
public class f2 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 {
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2758x5f8b9e37.C22695xac2d47d6 A;
    public android.widget.Button B;
    public android.widget.Button C;
    public android.widget.TextView D;
    public android.view.animation.Animation E;
    public java.util.ArrayList F;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 G;
    public final android.view.View.OnClickListener H;
    public final int I;

    /* renamed from: J, reason: collision with root package name */
    public final int f224337J;
    public final int K;
    public final int L;

    /* renamed from: d, reason: collision with root package name */
    public int f224338d;

    /* renamed from: e, reason: collision with root package name */
    public final int f224339e;

    /* renamed from: f, reason: collision with root package name */
    public final long f224340f;

    /* renamed from: g, reason: collision with root package name */
    public final android.app.Activity f224341g;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.Context f224342h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f224343i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ScrollView f224344m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.LinearLayout f224345n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.LinearLayout f224346o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.RelativeLayout f224347p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.RelativeLayout f224348q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.RelativeLayout f224349r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ImageView f224350s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ImageView f224351t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.ImageView f224352u;

    /* renamed from: v, reason: collision with root package name */
    public int f224353v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.FrameLayout f224354w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 f224355x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.Button f224356y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.Button f224357z;

    public f2(android.app.Activity activity, android.content.Context context, int i17, long j17) {
        super(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        s83.f fVar;
        this.f224338d = 0;
        this.G = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
        this.H = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.x1(this);
        this.I = com.p314xaae8f345.mm.R.C30861xcebc809e.f563035uu;
        this.f224337J = com.p314xaae8f345.mm.R.C30859x5a72f63.f560504ma;
        this.K = com.p314xaae8f345.mm.R.C30861xcebc809e.f563032ur;
        this.L = com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0;
        setCancelable(false);
        this.f224342h = context;
        this.f224339e = i17;
        this.f224340f = j17;
        this.f224341g = activity;
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.blz, null);
        this.f224343i = inflate;
        this.f224345n = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.f567020hv0);
        this.f224346o = (android.widget.LinearLayout) this.f224343i.findViewById(com.p314xaae8f345.mm.R.id.f567021hv1);
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30854x2dc211.f559256k);
        this.E = loadAnimation;
        loadAnimation.setDuration(200L);
        this.E.setStartOffset(100L);
        this.f224354w = (android.widget.FrameLayout) this.f224343i.findViewById(com.p314xaae8f345.mm.R.id.g9f);
        this.f224355x = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18) this.f224343i.findViewById(com.p314xaae8f345.mm.R.id.g9e);
        this.f224356y = (android.widget.Button) this.f224343i.findViewById(com.p314xaae8f345.mm.R.id.c_8);
        this.f224357z = (android.widget.Button) this.f224343i.findViewById(com.p314xaae8f345.mm.R.id.c_9);
        this.A = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2758x5f8b9e37.C22695xac2d47d6) this.f224343i.findViewById(com.p314xaae8f345.mm.R.id.c_l);
        this.f224356y.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.y1(this));
        this.f224357z.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.z1(this));
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.l.f224011c == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.l.f224011c = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.l();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.l lVar = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.l.f224011c;
        if (lVar.f224012a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallFeedbackConfigUpdater", "getCurrentLanugageResource try get cacheResUpdate");
            java.lang.String Bi = ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Bi(39, 1);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Bi)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallFeedbackConfigUpdater", "getCurrentLanugageResource get cacheResUpdate no filePath");
            } else {
                byte[] N = com.p314xaae8f345.mm.vfs.w6.N(Bi, 0, -1);
                if (N != null) {
                    lVar.a(N);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallFeedbackConfigUpdater", "getCurrentLanugageResource file not exist");
                }
            }
        }
        if (lVar.f224012a != null) {
            java.lang.String p17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.p(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            if ("language_default".equalsIgnoreCase(p17) && java.util.Locale.getDefault() != null) {
                p17 = java.util.Locale.getDefault().toString();
            }
            java.util.Iterator it = lVar.f224012a.iterator();
            while (it.hasNext()) {
                fVar = (s83.f) it.next();
                if (p17.equalsIgnoreCase(fVar.f486408a)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallFeedbackConfigUpdater", "curLang: %s,resListCount: %s", p17, java.lang.Integer.valueOf(lVar.f224012a.size()));
                    break;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallFeedbackConfigUpdater", "no lanuage equal curLang, curLang: %s,resListCount: %s", p17, java.lang.Integer.valueOf(lVar.f224012a.size()));
        }
        fVar = null;
        if (fVar != null) {
            java.util.ArrayList arrayList = fVar.f486409b;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                s83.e eVar = (s83.e) it6.next();
                com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.e2 e2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.e2();
                e2Var.f224323a = eVar.f486406a;
                e2Var.f224324b = eVar.f486407b;
                e2Var.f224325c = false;
                arrayList2.add(e2Var);
            }
            this.F = arrayList2;
            java.util.Iterator it7 = arrayList2.iterator();
            while (it7.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.e2 e2Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.e2) it7.next();
                com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 c21475x81dbaa18 = this.f224355x;
                android.widget.TextView textView = new android.widget.TextView(getContext());
                textView.setTextSize(0, getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561949xb) * i65.a.q(getContext()));
                textView.setBackgroundResource(this.I);
                textView.setTextColor(context.getResources().getColor(this.f224337J));
                textView.setTag(e2Var2);
                textView.setGravity(17);
                textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
                textView.setSingleLine();
                textView.setText(e2Var2.f224324b);
                textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.a2(this));
                c21475x81dbaa18.addView(textView);
            }
        }
        this.f224347p = (android.widget.RelativeLayout) this.f224343i.findViewById(com.p314xaae8f345.mm.R.id.hv_);
        this.f224348q = (android.widget.RelativeLayout) this.f224343i.findViewById(com.p314xaae8f345.mm.R.id.hva);
        this.f224349r = (android.widget.RelativeLayout) this.f224343i.findViewById(com.p314xaae8f345.mm.R.id.hvb);
        android.widget.RelativeLayout relativeLayout = this.f224347p;
        android.view.View.OnClickListener onClickListener = this.H;
        relativeLayout.setOnClickListener(onClickListener);
        this.f224348q.setOnClickListener(onClickListener);
        this.f224349r.setOnClickListener(onClickListener);
        this.f224350s = (android.widget.ImageView) this.f224343i.findViewById(com.p314xaae8f345.mm.R.id.hae);
        this.f224351t = (android.widget.ImageView) this.f224343i.findViewById(com.p314xaae8f345.mm.R.id.haf);
        this.f224352u = (android.widget.ImageView) this.f224343i.findViewById(com.p314xaae8f345.mm.R.id.hag);
        this.f224353v = 0;
        c(0);
        this.B = (android.widget.Button) this.f224343i.findViewById(com.p314xaae8f345.mm.R.id.hem);
        this.C = (android.widget.Button) this.f224343i.findViewById(com.p314xaae8f345.mm.R.id.hen);
        this.D = (android.widget.TextView) this.f224343i.findViewById(com.p314xaae8f345.mm.R.id.hep);
        r45.zr3 e17 = t83.f.e();
        java.lang.String format = e17 != null ? java.lang.String.format(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g66), e17.f473860q) : null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(format)) {
            this.D.setVisibility(4);
        } else {
            this.D.setVisibility(0);
            this.D.setText(format);
        }
        this.B.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.b2(this));
        this.C.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.c2(this));
        this.f224344m = (android.widget.ScrollView) this.f224343i.findViewById(com.p314xaae8f345.mm.R.id.e0n);
        android.view.View childAt = ((android.view.ViewGroup) this.f224341g.findViewById(android.R.id.content)).getChildAt(0);
        childAt.getViewTreeObserver().addOnGlobalLayoutListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.v1(this, childAt));
    }

    public final void c(int i17) {
        this.f224353v = i17;
        if (i17 == 0) {
            this.f224350s.setVisibility(4);
            this.f224351t.setVisibility(4);
            this.f224352u.setVisibility(4);
            this.f224357z.setEnabled(false);
            f(0);
            return;
        }
        if (i17 == 1) {
            this.f224350s.setVisibility(0);
            this.f224351t.setVisibility(4);
            this.f224352u.setVisibility(4);
            this.f224357z.setEnabled(true);
            f(1);
            return;
        }
        if (i17 == 2) {
            this.f224350s.setVisibility(0);
            this.f224351t.setVisibility(0);
            this.f224352u.setVisibility(4);
            this.f224357z.setEnabled(true);
            f(1);
            return;
        }
        if (i17 == 3) {
            this.f224350s.setVisibility(0);
            this.f224351t.setVisibility(0);
            this.f224352u.setVisibility(0);
            this.f224357z.setEnabled(true);
            f(0);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        try {
            super.dismiss();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallFeedbackDialog", "dismiss exception, e = " + e17.getMessage());
        }
    }

    public final java.lang.String e(int i17) {
        if (i17 == 3) {
            return "";
        }
        java.lang.String str = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.A.getText().toString().trim()) ? "0" : "";
        java.util.ArrayList arrayList = this.F;
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.e2 e2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.e2) it.next();
                if (e2Var.f224325c) {
                    if (str.equals("")) {
                        str = e2Var.f224323a;
                    } else {
                        str = str + "_" + e2Var.f224323a;
                    }
                }
            }
        }
        return str;
    }

    public void f(int i17) {
        if (i17 == 0) {
            this.f224345n.setVisibility(0);
            this.f224346o.setVisibility(4);
            if (this.f224338d == 1) {
                ((android.widget.LinearLayout.LayoutParams) this.f224354w.getLayoutParams()).height = 0;
                this.f224354w.requestLayout();
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.t0(this.f224343i);
        } else if (i17 == 1) {
            this.f224345n.setVisibility(0);
            this.f224346o.setVisibility(4);
            if (this.f224338d == 0) {
                ((android.widget.LinearLayout.LayoutParams) this.f224354w.getLayoutParams()).height = -2;
                this.f224354w.requestLayout();
                this.f224354w.startAnimation(this.E);
            }
        } else if (i17 == 2) {
            this.f224345n.setVisibility(4);
            this.f224346o.setVisibility(0);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.t0(this.f224343i);
        }
        this.f224338d = i17;
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f224343i);
        getWindow().getAttributes().width = getWindow().getWindowManager().getDefaultDisplay().getWidth();
        getWindow().getDecorView().setPadding(0, 0, 0, 0);
        f(0);
    }

    @Override // android.app.Dialog
    public void setTitle(java.lang.CharSequence charSequence) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2, android.app.Dialog
    public void show() {
        super.show();
    }
}
