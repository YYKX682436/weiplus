package cw1;

/* loaded from: classes12.dex */
public final class b1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public cw1.v0 f304336d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.CheckBox f304337e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f304338f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f304339g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f304340h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f304341i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13108x43db50db f304342m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13108x43db50db activityC13108x43db50db, android.view.View root) {
        super(root);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        this.f304342m = activityC13108x43db50db;
        this.f304336d = new cw1.v0(-4, 0L, false, 6, null);
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.bxf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById);
        this.f304337e = (android.widget.CheckBox) findViewById;
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.odf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById2);
        this.f304338f = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = root.findViewById(com.p314xaae8f345.mm.R.id.mzv);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById3);
        this.f304339g = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = root.findViewById(com.p314xaae8f345.mm.R.id.t3j);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById4);
        this.f304340h = findViewById4;
        android.view.View findViewById5 = root.findViewById(com.p314xaae8f345.mm.R.id.bxc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById5);
        this.f304341i = findViewById5;
        root.setOnClickListener(this);
    }

    public final void i() {
        java.lang.String a17;
        cw1.v0 v0Var = this.f304336d;
        this.f304337e.setChecked(v0Var.f304894c || v0Var.f304895d > 0);
        if (!v0Var.f304894c) {
            long j17 = v0Var.f304895d;
            if (j17 > 0) {
                a17 = this.f304342m.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n8k, fp.n0.a(j17));
                this.f304339g.setText(a17);
            }
        }
        a17 = fp.n0.a(v0Var.f304893b);
        this.f304339g.setText(a17);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View v17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheNewUI$ItemViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        boolean isChecked = this.f304337e.isChecked();
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13108x43db50db activityC13108x43db50db = this.f304342m;
        if (isChecked) {
            cw1.v0 v0Var = this.f304336d;
            v0Var.f304894c = false;
            v0Var.f304895d = 0L;
            int i17 = v0Var.f304892a;
            if (i17 == -2) {
                activityC13108x43db50db.f177203u[0] = activityC13108x43db50db.f177205w;
            } else if (i17 == -1) {
                activityC13108x43db50db.f177203u[1] = activityC13108x43db50db.f177205w;
            } else if (i17 == 3) {
                activityC13108x43db50db.f177201s = new java.lang.String[0];
            }
        } else {
            cw1.v0 v0Var2 = this.f304336d;
            v0Var2.f304894c = true;
            v0Var2.f304895d = v0Var2.f304893b;
            int i18 = v0Var2.f304892a;
            if (i18 == -2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.C13100x4dbf8b6d[] c13100x4dbf8b6dArr = activityC13108x43db50db.f177203u;
                com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.C13100x4dbf8b6d[] c13100x4dbf8b6dArr2 = activityC13108x43db50db.f177204v;
                if (c13100x4dbf8b6dArr2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("allOriginItems");
                    throw null;
                }
                c13100x4dbf8b6dArr[0] = c13100x4dbf8b6dArr2[0];
            } else if (i18 == -1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.C13100x4dbf8b6d[] c13100x4dbf8b6dArr3 = activityC13108x43db50db.f177203u;
                com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.C13100x4dbf8b6d[] c13100x4dbf8b6dArr4 = activityC13108x43db50db.f177204v;
                if (c13100x4dbf8b6dArr4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("allOriginItems");
                    throw null;
                }
                c13100x4dbf8b6dArr3[1] = c13100x4dbf8b6dArr4[1];
            } else if (i18 == 3) {
                activityC13108x43db50db.f177201s = new java.lang.String[0];
            }
        }
        i();
        cw1.t0 t0Var = activityC13108x43db50db.f177189d;
        if (t0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
        t0Var.f304859f.mo152xb9724478();
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheNewUI$ItemViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
