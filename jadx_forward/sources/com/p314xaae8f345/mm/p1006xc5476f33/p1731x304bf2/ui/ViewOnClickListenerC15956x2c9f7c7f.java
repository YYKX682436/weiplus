package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* renamed from: com.tencent.mm.plugin.game.ui.GameDownloadView */
/* loaded from: classes8.dex */
public class ViewOnClickListenerC15956x2c9f7c7f extends android.widget.FrameLayout implements android.view.View.OnClickListener, xn5.a0 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f222294i = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f222295d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1759xd1075a44.C16038x89448319 f222296e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.s f222297f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c0 f222298g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.z f222299h;

    public ViewOnClickListenerC15956x2c9f7c7f(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f222299h = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.f3(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.z zVar = this.f222299h;
        java.util.Set set = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b0.f221758b;
        synchronized (set) {
            set.add(zVar);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameDownloadView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f222298g.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.s sVar = this.f222297f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c0 c0Var = this.f222298g;
        sVar.a(c0Var.f221774a, c0Var);
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameDownloadView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.z zVar = this.f222299h;
        java.util.Set set = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b0.f221758b;
        synchronized (set) {
            set.remove(zVar);
            set.size();
        }
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bfp, (android.view.ViewGroup) this, true);
        this.f222295d = (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.gkz);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1759xd1075a44.C16038x89448319 c16038x89448319 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1759xd1075a44.C16038x89448319) inflate.findViewById(com.p314xaae8f345.mm.R.id.f566646gl1);
        this.f222296e = c16038x89448319;
        c16038x89448319.m64852x3abfd950(14);
        this.f222295d.setOnClickListener(this);
        this.f222296e.setOnClickListener(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.s(getContext());
        this.f222297f = sVar;
        sVar.f223278f = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.c3(this);
    }

    /* renamed from: setDownloadInfo */
    public void m64740xd951aad8(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c0 c0Var) {
        this.f222298g = c0Var;
        r53.f.l().m77784x795fa299(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.d3(this));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.e3(this));
    }
}
