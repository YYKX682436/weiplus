package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* renamed from: com.tencent.mm.plugin.game.ui.GameFeedSubscriptView */
/* loaded from: classes8.dex */
public class ViewOnClickListenerC15967xc3165160 extends android.widget.LinearLayout implements android.view.View.OnClickListener, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f222359d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f222360e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f222361f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f222362g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f222363h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f222364i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f222365m;

    /* renamed from: n, reason: collision with root package name */
    public m53.y0 f222366n;

    public ViewOnClickListenerC15967xc3165160(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(int i17) {
        java.lang.String a17 = i17 == 1 ? n53.a.a(this.f222366n.f405718f, "clickType", "leftCorner") : n53.a.a(this.f222366n.f405718f, "clickType", "rightCorner");
        android.content.Context context = getContext();
        m53.y0 y0Var = this.f222366n;
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.f(context, 10, 1024, y0Var.f405717e, 7, y0Var.f405719g, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15971xe6741863.m64756xd419dffb(), a17);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        m53.w wVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameFeedSubscriptView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f222366n == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameFeedSubscriptView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (view.getId() == com.p314xaae8f345.mm.R.id.i0g || view.getId() == com.p314xaae8f345.mm.R.id.i0h || view.getId() == com.p314xaae8f345.mm.R.id.a_j) {
            m53.w wVar2 = this.f222366n.f405731v;
            if (wVar2 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wVar2.f405670g)) {
                r53.f.u(getContext(), this.f222366n.f405731v.f405670g);
                a(1);
            }
        } else if (view.getId() == com.p314xaae8f345.mm.R.id.m4f && (wVar = this.f222366n.f405732w) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wVar.f405670g)) {
            r53.f.u(getContext(), this.f222366n.f405732w.f405670g);
            a(2);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameFeedSubscriptView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570679bg1, (android.view.ViewGroup) this, true);
        this.f222359d = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.i0g);
        this.f222360e = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.i0h);
        this.f222361f = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.a_j);
        this.f222362g = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a9m);
        this.f222363h = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kb_);
        this.f222364i = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ou9);
        this.f222365m = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.m4f);
        this.f222359d.setOnClickListener(this);
        this.f222360e.setOnClickListener(this);
        this.f222361f.setOnClickListener(this);
        this.f222365m.setOnClickListener(this);
    }

    /* renamed from: setData */
    public void m64753x76491f2c(m53.y0 y0Var) {
        if (y0Var == null || (y0Var.f405731v == null && y0Var.f405732w == null)) {
            setVisibility(8);
            return;
        }
        this.f222366n = y0Var;
        setVisibility(0);
        this.f222359d.setVisibility(8);
        this.f222360e.setVisibility(8);
        this.f222361f.setVisibility(8);
        m53.w wVar = y0Var.f405731v;
        if (wVar != null) {
            int i17 = wVar.f405671h;
            if (i17 == 1) {
                this.f222360e.setVisibility(0);
                this.f222360e.setText(y0Var.f405731v.f405669f);
            } else if (i17 == 2) {
                this.f222359d.setVisibility(0);
                this.f222359d.setText(y0Var.f405731v.f405669f);
            } else if (i17 == 3) {
                this.f222361f.setVisibility(0);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y0Var.f405731v.f405667d)) {
                    r53.v vVar = new r53.v();
                    vVar.f474238c = true;
                    r53.y.a().e(this.f222362g, y0Var.f405731v.f405667d, vVar.a(), null);
                    this.f222362g.setVisibility(0);
                }
                this.f222363h.setText(y0Var.f405731v.f405668e);
                this.f222364i.setText(y0Var.f405731v.f405669f);
            }
        }
        m53.w wVar2 = y0Var.f405732w;
        if (wVar2 == null) {
            this.f222365m.setVisibility(8);
        } else {
            this.f222365m.setText(wVar2.f405669f);
            this.f222365m.setVisibility(0);
        }
    }
}
