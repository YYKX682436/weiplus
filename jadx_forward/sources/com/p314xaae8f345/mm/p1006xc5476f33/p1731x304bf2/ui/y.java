package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes8.dex */
public class y extends android.widget.LinearLayout implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f223401d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.LayoutInflater f223402e;

    /* renamed from: f, reason: collision with root package name */
    public int f223403f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f223404g;

    public y(android.content.Context context) {
        super(context);
        this.f223401d = context;
        this.f223402e = (android.view.LayoutInflater) context.getSystemService("layout_inflater");
        setOrientation(0);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameBlockEntranceView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() == null || !(view.getTag() instanceof m53.q)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameBlockEntranceView", "getTag is null");
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameBlockEntranceView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        m53.q qVar = (m53.q) view.getTag();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.f405505g)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameBlockEntranceView", "jumpUrl is null");
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameBlockEntranceView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.f(this.f223401d, 10, 1002, qVar.f405506h, r53.f.v(this.f223401d, qVar.f405505g, "game_center_mygame_comm", null), this.f223404g, this.f223403f, n53.a.e(qVar.f405507i));
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameBlockEntranceView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
