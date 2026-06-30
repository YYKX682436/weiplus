package ku1;

/* loaded from: classes15.dex */
public class g0 extends ku1.m {

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f393612b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f393613c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f393614d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f393615e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f393616f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f393617g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f393618h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f393619i;

    /* renamed from: j, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f393620j;

    /* renamed from: k, reason: collision with root package name */
    public final android.view.View.OnClickListener f393621k = new ku1.f0(this);

    @Override // ku1.m
    public void c() {
        this.f393612b = b(com.p314xaae8f345.mm.R.id.mtv);
        this.f393613c = b(com.p314xaae8f345.mm.R.id.mtx);
        this.f393614d = (android.widget.ImageView) b(com.p314xaae8f345.mm.R.id.mtp);
        this.f393615e = (android.widget.TextView) b(com.p314xaae8f345.mm.R.id.mtq);
        this.f393616f = (android.widget.TextView) b(com.p314xaae8f345.mm.R.id.mts);
        this.f393617g = (android.widget.ImageView) b(com.p314xaae8f345.mm.R.id.mtr);
        android.view.View view = this.f393612b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f393618h = b(com.p314xaae8f345.mm.R.id.mtt);
        this.f393619i = (android.widget.LinearLayout) b(com.p314xaae8f345.mm.R.id.mtu);
        android.view.View view2 = this.f393618h;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f393620j = ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) this.f393665a).f176469e;
    }

    @Override // ku1.m
    public void d(int i17) {
        android.view.View view = this.f393612b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // ku1.m
    public void e() {
        java.lang.String str;
        tt1.j jVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) this.f393665a).E;
        java.util.ArrayList h17 = eu1.f.h(jVar.f());
        hu1.g gVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) this.f393665a).f176470f;
        java.lang.String str2 = null;
        boolean z17 = false;
        java.lang.String str3 = "";
        if (!gVar.n()) {
            if (gVar.n()) {
                return;
            }
            android.view.View view = this.f393612b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView", "updateShareUsersInfoLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView", "updateShareUsersInfoLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f393614d.setVisibility(0);
            this.f393615e.setVisibility(0);
            this.f393616f.setVisibility(8);
            this.f393617g.setVisibility(8);
            if (android.text.TextUtils.isEmpty("") && !android.text.TextUtils.isEmpty(jVar.a())) {
                str3 = jVar.a();
            }
            if (android.text.TextUtils.isEmpty(str3)) {
                return;
            }
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.f393614d, str3, null);
            java.lang.String string = this.f393620j.getString(com.p314xaae8f345.mm.R.C30867xcad56011.avf, lu1.a0.p(str3));
            android.widget.TextView textView = this.f393615e;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f393620j;
            int dimensionPixelOffset = abstractActivityC21394xb3d2c0cf.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia);
            ((ke0.e) xVar).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.h(abstractActivityC21394xb3d2c0cf, string, dimensionPixelOffset, true));
            return;
        }
        android.view.View view2 = this.f393612b;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView", "updateShareUsersInfoLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView", "updateShareUsersInfoLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (eu1.f.d(jVar.f()) > 1) {
            this.f393613c.setOnClickListener(((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) this.f393665a).X);
        } else {
            this.f393617g.setVisibility(8);
            android.view.View view3 = this.f393618h;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView", "updateShareUsersInfoLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView", "updateShareUsersInfoLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f393619i.removeAllViews();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) this.f393665a).f176472h = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0 b0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) this.f393665a;
        tt1.j jVar2 = b0Var.E;
        if (b0Var.f176472h) {
            this.f393614d.setVisibility(8);
            this.f393615e.setVisibility(8);
            this.f393616f.setVisibility(0);
            this.f393617g.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562660bz1);
            this.f393616f.setText(this.f393620j.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ava));
        } else {
            this.f393614d.setVisibility(0);
            this.f393615e.setVisibility(0);
            this.f393616f.setVisibility(8);
            if (eu1.f.d(jVar2.f()) <= 1) {
                this.f393617g.setVisibility(8);
            } else {
                this.f393617g.setVisibility(0);
                this.f393617g.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562659bz0);
            }
            if (h17.size() > 0) {
                for (int i17 = 0; i17 < h17.size(); i17++) {
                    fu1.p pVar = (fu1.p) h17.get(i17);
                    if (pVar.f348403e) {
                        str = pVar.f348399a;
                        break;
                    }
                }
            }
            str = "";
            if (android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(jVar2.a())) {
                str = jVar2.a();
            }
            if (!android.text.TextUtils.isEmpty(str)) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.f393614d, str, null);
                java.lang.String string2 = this.f393620j.getString(com.p314xaae8f345.mm.R.C30867xcad56011.avf, lu1.a0.p(str));
                android.widget.TextView textView2 = this.f393615e;
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = this.f393620j;
                int dimensionPixelOffset2 = abstractActivityC21394xb3d2c0cf2.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia);
                ((ke0.e) xVar2).getClass();
                textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.h(abstractActivityC21394xb3d2c0cf2, string2, dimensionPixelOffset2, true));
            }
        }
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) this.f393665a).f176472h) {
            android.view.View view4 = this.f393618h;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView", "updateShareUserBottomLayout", "(Ljava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView", "updateShareUserBottomLayout", "(Ljava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f393619i.removeAllViews();
            return;
        }
        android.view.View view5 = this.f393618h;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView", "updateShareUserBottomLayout", "(Ljava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView", "updateShareUserBottomLayout", "(Ljava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f393619i.getChildCount() != 0) {
            for (int i18 = 0; i18 < this.f393619i.getChildCount(); i18++) {
                android.view.View childAt = this.f393619i.getChildAt(i18);
                fu1.p pVar2 = h17.size() >= this.f393619i.getChildCount() ? (fu1.p) h17.get(i18) : null;
                android.widget.ImageView imageView = (android.widget.ImageView) childAt.findViewById(com.p314xaae8f345.mm.R.id.oug);
                android.widget.ImageView imageView2 = (android.widget.ImageView) childAt.findViewById(com.p314xaae8f345.mm.R.id.ouf);
                if (pVar2 == null || !pVar2.f348403e) {
                    imageView.setVisibility(8);
                    imageView2.setVisibility(8);
                } else {
                    imageView.setVisibility(0);
                    imageView2.setVisibility(0);
                }
            }
            this.f393619i.invalidate();
            return;
        }
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) this.f393620j.getSystemService("layout_inflater");
        java.util.Iterator it = h17.iterator();
        while (it.hasNext()) {
            fu1.p pVar3 = (fu1.p) it.next();
            android.view.View inflate = layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cn7, this.f393619i, z17);
            android.widget.ImageView imageView3 = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.oue);
            android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ouu);
            android.widget.TextView textView4 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.msl);
            if (!android.text.TextUtils.isEmpty(pVar3.f348399a)) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView3, pVar3.f348399a, str2);
                java.lang.String p17 = lu1.a0.p(pVar3.f348399a);
                if (android.text.TextUtils.isEmpty(p17)) {
                    textView3.setText("");
                } else {
                    le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
                    com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf3 = this.f393620j;
                    int dimensionPixelOffset3 = abstractActivityC21394xb3d2c0cf3.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561463ja);
                    ((ke0.e) xVar3).getClass();
                    textView3.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.h(abstractActivityC21394xb3d2c0cf3, p17, dimensionPixelOffset3, true));
                }
            }
            textView4.setText("x " + pVar3.f348401c);
            inflate.setTag(pVar3);
            inflate.setOnClickListener(this.f393621k);
            android.widget.ImageView imageView4 = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.oug);
            android.widget.ImageView imageView5 = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ouf);
            if (pVar3.f348403e) {
                imageView4.setVisibility(0);
                imageView5.setVisibility(0);
            } else {
                imageView4.setVisibility(8);
                imageView5.setVisibility(8);
            }
            this.f393619i.addView(inflate);
            str2 = null;
            z17 = false;
        }
        this.f393619i.invalidate();
    }
}
