package at2;

/* loaded from: classes3.dex */
public final class y1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l implements android.view.View.OnClickListener {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f95313p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.p1621xd1075a44.C14938xc9a3f782 f95314q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f95315r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.TextView f95316s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.TextView f95317t;

    /* renamed from: u, reason: collision with root package name */
    public int f95318u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f95313p = "ReplayerSeekbarPlugin";
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.lym);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.p1621xd1075a44.C14938xc9a3f782) findViewById).setContentDescription(root.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eax));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "also(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.p1621xd1075a44.C14938xc9a3f782 c14938xc9a3f782 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.p1621xd1075a44.C14938xc9a3f782) findViewById;
        this.f95314q = c14938xc9a3f782;
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.lyn);
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById2).setContentDescription(root.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eaz));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "also(...)");
        this.f95315r = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById2;
        android.view.View findViewById3 = root.findViewById(com.p314xaae8f345.mm.R.id.lyo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f95316s = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = root.findViewById(com.p314xaae8f345.mm.R.id.lyp);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f95317t = (android.widget.TextView) findViewById4;
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            c14938xc9a3f782.setMaxHeight(x0() ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561952xe));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        super.O0();
        ((java.util.ArrayList) this.f95314q.f206461p).clear();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        at2.u1 u1Var;
        dt2.d0 uiClickListener;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/replay/plugin/ReplayerSeekbarPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.lyn && (u1Var = (at2.u1) X0(at2.u1.class)) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 R0 = R0();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14929x59565fb6 c14929x59565fb6 = R0 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14929x59565fb6 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14929x59565fb6) R0 : null;
            if (c14929x59565fb6 != null && (uiClickListener = c14929x59565fb6.getUiClickListener()) != null) {
                uiClickListener.a(!u1Var.u1());
            }
            boolean u17 = u1Var.u1();
            android.view.ViewGroup viewGroup = this.f446856d;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f95315r;
            if (u17) {
                android.graphics.drawable.Drawable drawable = viewGroup.getContext().getDrawable(com.p314xaae8f345.mm.R.raw.f79865xc8527e4c);
                com.p314xaae8f345.mm.ui.uk.f(drawable, -1);
                c22699x3dcdb352.setImageDrawable(drawable);
                dt2.a0 a0Var = u1Var.f95295q;
                if (a0Var != null) {
                    a0Var.d();
                }
                c22699x3dcdb352.setContentDescription(viewGroup.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eau));
            } else {
                android.graphics.drawable.Drawable drawable2 = viewGroup.getContext().getDrawable(com.p314xaae8f345.mm.R.raw.f79844x41f895de);
                com.p314xaae8f345.mm.ui.uk.f(drawable2, -1);
                c22699x3dcdb352.setImageDrawable(drawable2);
                u1Var.v1(null, false);
                c22699x3dcdb352.setContentDescription(viewGroup.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eaz));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/replay/plugin/ReplayerSeekbarPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return true;
    }

    public final java.lang.String t1(java.lang.String str) {
        java.util.List x07 = kz5.n0.x0(r26.n0.f0(str, new java.lang.String[]{":"}, false, 0, 6, null));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.List i17 = kz5.c0.i("秒", "分钟", "小时");
        int size = x07.size();
        for (int i18 = 0; i18 < size; i18++) {
            int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) x07.get(i18), 0);
            if (P > 0) {
                sb6.insert(0, P + ((java.lang.String) i17.get(i18)));
            }
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final void u1(float f17) {
        float S6 = ((ct2.j) P0(ct2.j.class)).S6();
        int a17 = (int) h3.a.a(f17 * S6, 0.0f, S6 - 1.0f);
        no0.l lVar = no0.m.f420263a;
        this.f95316s.setText(a17 >= 3600 ? no0.l.a(lVar, a17, ":", true, false, false, 24, null) : no0.l.a(lVar, a17, ":", false, false, false, 24, null));
    }

    public final void v1() {
        android.graphics.drawable.Drawable drawable = this.f446856d.getContext().getDrawable(com.p314xaae8f345.mm.R.raw.f79865xc8527e4c);
        com.p314xaae8f345.mm.ui.uk.f(drawable, -1);
        this.f95315r.setImageDrawable(drawable);
        x1();
    }

    public final void w1() {
        android.graphics.drawable.Drawable drawable = this.f446856d.getContext().getDrawable(com.p314xaae8f345.mm.R.raw.f79844x41f895de);
        com.p314xaae8f345.mm.ui.uk.f(drawable, -1);
        this.f95315r.setImageDrawable(drawable);
    }

    public final void x1() {
        if (((ct2.j) P0(ct2.j.class)).D) {
            return;
        }
        K0(0);
    }

    public final void y1(int i17) {
        if (((ct2.j) P0(ct2.j.class)).S6() > 0) {
            x1();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.p1621xd1075a44.C14938xc9a3f782 c14938xc9a3f782 = this.f95314q;
            c14938xc9a3f782.setProgress((int) ((i17 / ((ct2.j) P0(ct2.j.class)).S6()) * c14938xc9a3f782.getMax()));
            ws2.n1 n1Var = ws2.n1.f530638a;
            java.lang.String b17 = n1Var.b(i17);
            android.widget.TextView textView = this.f95316s;
            textView.setText(b17);
            android.view.ViewGroup viewGroup = this.f446856d;
            textView.setContentDescription(viewGroup.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eav, t1(b17)));
            ct2.j jVar = (ct2.j) P0(ct2.j.class);
            int i18 = jVar.f303809t;
            if (i18 <= 0) {
                i18 = jVar.f303807r;
            }
            java.lang.String b18 = n1Var.b(i18);
            android.widget.TextView textView2 = this.f95317t;
            textView2.setText(b18);
            textView2.setContentDescription(viewGroup.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573342eb0, t1(b18)));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        super.z0();
        at2.v1 v1Var = new at2.v1(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.p1621xd1075a44.C14938xc9a3f782 c14938xc9a3f782 = this.f95314q;
        c14938xc9a3f782.getClass();
        ((java.util.ArrayList) c14938xc9a3f782.f206461p).add(v1Var);
        r45.i72 i72Var = (r45.i72) ((mm2.e1) P0(mm2.e1.class)).f410521r.m75936x14adae67(44);
        java.util.List<? extends r45.w94> m75941xfb821914 = i72Var != null ? i72Var.m75941xfb821914(7) : null;
        if (m75941xfb821914 == null) {
            m75941xfb821914 = kz5.p0.f395529d;
        }
        for (r45.w94 w94Var : m75941xfb821914) {
            zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
            ml2.o3[] o3VarArr = ml2.o3.f409306d;
            java.lang.String jSONObject = ml2.z0.b(ml2.z0.f409863a, null, 1, null).toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
            ((ml2.j0) zbVar).Wj("watch_live_point_exp", jSONObject);
        }
        this.f95315r.setOnClickListener(this);
        android.content.Context context = this.f446856d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        c14938xc9a3f782.m58816xd392ca96(new dt2.h(context));
        c14938xc9a3f782.m58815x1bcf2a0e(m75941xfb821914);
        c14938xc9a3f782.m58813x8252aaba(new at2.w1(this));
        c14938xc9a3f782.m58812xe88970c9(new at2.x1(this));
        zl2.r4 r4Var = zl2.r4.f555483a;
        this.f194857f.post(new zl2.u0(this, true, true));
    }
}
