package ku1;

/* loaded from: classes15.dex */
public class w extends ku1.m {

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f393686b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.ImageView f393687c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f393688d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f393689e;

    @Override // ku1.m
    public void c() {
        this.f393686b = b(com.p314xaae8f345.mm.R.id.gfb);
        this.f393687c = (android.widget.ImageView) b(com.p314xaae8f345.mm.R.id.gf_);
        this.f393688d = (android.widget.TextView) b(com.p314xaae8f345.mm.R.id.gfd);
        this.f393689e = (android.widget.TextView) b(com.p314xaae8f345.mm.R.id.gfc);
        android.view.View view = this.f393686b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardFromUserNameView", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/card/ui/view/CardFromUserNameView", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // ku1.m
    public void d(int i17) {
        android.view.View view = this.f393686b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardFromUserNameView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/card/ui/view/CardFromUserNameView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // ku1.m
    public void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.s4 s4Var = this.f393665a;
        tt1.j jVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) s4Var).E;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) s4Var).f176469e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.p0 p0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) s4Var).U;
        android.view.View view = this.f393686b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardFromUserNameView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/card/ui/view/CardFromUserNameView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = this.f393688d;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String f27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(p0Var.f176639d, true).f2();
        float textSize = this.f393688d.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(abstractActivityC21394xb3d2c0cf, f27, textSize));
        if (jVar.Y() != null && !android.text.TextUtils.isEmpty(jVar.Y().f459113d)) {
            android.widget.TextView textView2 = this.f393689e;
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str = jVar.Y().f459113d;
            float textSize2 = this.f393689e.getTextSize();
            ((ke0.e) xVar2).getClass();
            textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(abstractActivityC21394xb3d2c0cf, str, textSize2));
        } else if (android.text.TextUtils.isEmpty(jVar.s0().f470101y)) {
            if (jVar.m0()) {
                this.f393689e.setText(abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.atg, ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) this.f393665a).H.d()));
            } else {
                this.f393689e.setText(abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.asm, ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) this.f393665a).H.d()));
            }
        } else if (jVar.m0()) {
            this.f393689e.setText(abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.atg, jVar.s0().f470101y));
        } else {
            this.f393689e.setText(abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.asm, jVar.s0().f470101y));
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.f393687c, p0Var.f176639d, null);
        this.f393687c.setOnClickListener(((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) this.f393665a).X);
    }
}
