package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes8.dex */
public class x extends android.widget.LinearLayout implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f223371d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.LayoutInflater f223372e;

    /* renamed from: f, reason: collision with root package name */
    public int f223373f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f223374g;

    public x(android.content.Context context) {
        super(context);
        this.f223371d = context;
        this.f223372e = (android.view.LayoutInflater) context.getSystemService("layout_inflater");
        setOrientation(1);
    }

    public final void a(android.view.ViewGroup viewGroup) {
        android.view.View view = (android.widget.ImageView) this.f223372e.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bfo, viewGroup, false);
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.leftMargin = i65.a.b(this.f223371d, 20);
        view.setLayoutParams(marginLayoutParams);
        viewGroup.addView(view);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameBlockContentView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() == null || !(view.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.w)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameBlockContentView", "getTag is null");
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameBlockContentView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.w wVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.w) view.getTag();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wVar.f223345b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameBlockContentView", "jumpUrl is null");
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameBlockContentView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.f(this.f223371d, 10, 1002, wVar.f223344a, r53.f.v(this.f223371d, wVar.f223345b, "game_center_mygame_comm", null), this.f223374g, this.f223373f, n53.a.e(wVar.f223346c));
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameBlockContentView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
