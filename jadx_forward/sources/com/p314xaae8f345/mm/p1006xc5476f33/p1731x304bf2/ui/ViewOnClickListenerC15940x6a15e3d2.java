package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* renamed from: com.tencent.mm.plugin.game.ui.GameBestSellingItemView */
/* loaded from: classes8.dex */
public class ViewOnClickListenerC15940x6a15e3d2 extends android.widget.LinearLayout implements android.view.View.OnClickListener, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1759xd1075a44.C16030x9e47e9f5 f222201d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f222202e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f222203f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1759xd1075a44.C16037x7e3b52ab f222204g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ViewOnClickListenerC15956x2c9f7c7f f222205h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f222206i;

    /* renamed from: m, reason: collision with root package name */
    public int f222207m;

    /* renamed from: n, reason: collision with root package name */
    public m53.o0 f222208n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c f222209o;

    public ViewOnClickListenerC15940x6a15e3d2(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameBestSellingItemView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        m53.o0 o0Var = this.f222208n;
        if (o0Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o0Var.f405465d.f405255i)) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameBestSellingItemView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.f(getContext(), 10, com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46404xa5f7fd74, this.f222209o.f221772e + 1, r53.f.v(getContext(), this.f222208n.f405465d.f405255i, null, null), this.f222208n.f405465d.f405250d, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15971xe6741863.m64756xd419dffb(), n53.a.e(this.f222209o.f221771d.f405718f));
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameBestSellingItemView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f222201d = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1759xd1075a44.C16030x9e47e9f5) findViewById(com.p314xaae8f345.mm.R.id.gnz);
        this.f222202e = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.glm);
        this.f222203f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.gnr);
        this.f222204g = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1759xd1075a44.C16037x7e3b52ab) findViewById(com.p314xaae8f345.mm.R.id.nwu);
        this.f222205h = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ViewOnClickListenerC15956x2c9f7c7f) findViewById(com.p314xaae8f345.mm.R.id.giw);
        this.f222206i = findViewById(com.p314xaae8f345.mm.R.id.nd6);
        this.f222207m = r53.f.h(getContext()) - i65.a.b(getContext(), 190);
        setOnClickListener(this);
    }

    /* renamed from: setData */
    public void m64734x76491f2c(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c cVar) {
        m53.y0 y0Var;
        m53.m1 m1Var;
        m53.h hVar;
        if (cVar == null || (y0Var = cVar.f221771d) == null || (m1Var = y0Var.f405727r) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(m1Var.f405425d)) {
            setVisibility(8);
            return;
        }
        this.f222209o = cVar;
        m53.o0 o0Var = (m53.o0) cVar.f221771d.f405727r.f405425d.get(cVar.f221772e);
        int i17 = cVar.f221772e + 1;
        if (o0Var == null || (hVar = o0Var.f405465d) == null) {
            setVisibility(8);
        } else {
            this.f222208n = o0Var;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.t1.a(hVar);
            a17.f221745o2 = 10;
            a17.f221746p2 = com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46404xa5f7fd74;
            a17.f221747q2 = this.f222209o.f221772e + 1;
            this.f222205h.m64740xd951aad8(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c0(a17));
            setVisibility(0);
            this.f222201d.setText("" + i17);
            if (i17 == 1) {
                this.f222201d.setTextColor(r53.f.z("#EED157"));
            } else if (i17 == 2) {
                this.f222201d.setTextColor(r53.f.z("#BDC5CB"));
            } else if (i17 == 3) {
                this.f222201d.setTextColor(r53.f.z("#D4B897"));
            } else {
                this.f222201d.setTextColor(r53.f.z("#B2B2B2"));
            }
            r53.y.a().b(this.f222202e, o0Var.f405465d.f405250d, i65.a.g(getContext()));
            this.f222203f.setText(o0Var.f405465d.f405252f);
            this.f222204g.a(o0Var.f405465d.C, this.f222207m);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(o0Var.f405466e) && o0Var.f405467f == null && o0Var.f405468g == null) {
                android.view.View view = this.f222206i;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/GameBestSellingItemView", "setData", "(Lcom/tencent/mm/plugin/game/protobuf/Game;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/game/ui/GameBestSellingItemView", "setData", "(Lcom/tencent/mm/plugin/game/protobuf/Game;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view2 = this.f222206i;
                if (view2 instanceof android.view.ViewStub) {
                    this.f222206i = ((android.view.ViewStub) view2).inflate();
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15966x60b8abf0) this.f222206i.findViewById(com.p314xaae8f345.mm.R.id.gow)).m64752x76491f2c(o0Var);
            }
        }
        if (cVar.f221773f) {
            return;
        }
        n53.a.b(getContext(), 10, com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46404xa5f7fd74, cVar.f221772e + 1, 1, o0Var.f405465d.f405250d, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15971xe6741863.m64756xd419dffb(), n53.a.e(cVar.f221771d.f405718f));
        cVar.f221773f = true;
    }
}
