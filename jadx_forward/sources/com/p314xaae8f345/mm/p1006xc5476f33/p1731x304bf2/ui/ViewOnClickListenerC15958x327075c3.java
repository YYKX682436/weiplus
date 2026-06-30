package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* renamed from: com.tencent.mm.plugin.game.ui.GameFeedAddTopicView */
/* loaded from: classes8.dex */
public class ViewOnClickListenerC15958x327075c3 extends android.widget.LinearLayout implements android.view.View.OnClickListener, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15968xce00ec5e f222308d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f222309e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c f222310f;

    public ViewOnClickListenerC15958x327075c3(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        m53.y0 y0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameFeedAddTopicView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c cVar = this.f222310f;
        if (cVar == null || (y0Var = cVar.f221771d) == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameFeedAddTopicView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y0Var.f405720h)) {
            int v17 = r53.f.v(getContext(), this.f222310f.f221771d.f405720h, null, null);
            android.content.Context context = getContext();
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c cVar2 = this.f222310f;
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.f(context, 10, 1024, cVar2.f221769b, v17, cVar2.f221771d.f405719g, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15971xe6741863.m64756xd419dffb(), n53.a.a(this.f222310f.f221771d.f405718f, "clickType", "card"));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameFeedAddTopicView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f222308d = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15968xce00ec5e) findViewById(com.p314xaae8f345.mm.R.id.gl7);
        this.f222309e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f564253m3);
        setOnClickListener(this);
    }

    /* renamed from: setData */
    public void m64744x76491f2c(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c cVar) {
        m53.y0 y0Var;
        if (cVar == null || (y0Var = cVar.f221771d) == null || y0Var.f405728s == null) {
            setVisibility(8);
            return;
        }
        this.f222310f = cVar;
        setVisibility(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15968xce00ec5e c15968xce00ec5e = this.f222308d;
        m53.x xVar = cVar.f221771d.f405728s;
        c15968xce00ec5e.a(xVar.f405697d, xVar.f405698e, null);
        this.f222309e.setText(cVar.f221771d.f405728s.f405699f);
        if (this.f222310f.f221773f) {
            return;
        }
        android.content.Context context = getContext();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c cVar2 = this.f222310f;
        n53.a.b(context, 10, 1024, cVar2.f221769b, 1, cVar2.f221771d.f405719g, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15971xe6741863.m64756xd419dffb(), n53.a.e(this.f222310f.f221771d.f405718f));
        this.f222310f.f221773f = true;
    }
}
