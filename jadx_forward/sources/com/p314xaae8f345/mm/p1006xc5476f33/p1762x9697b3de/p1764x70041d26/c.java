package com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1764x70041d26;

/* loaded from: classes8.dex */
public class c extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g2 {

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1764x70041d26.e f223631f;

    /* renamed from: h, reason: collision with root package name */
    public int f223633h;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f223630e = null;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f223632g = new java.util.ArrayList();

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1764x70041d26.e eVar) {
        this.f223631f = eVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g2
    public android.view.View a(android.content.Context context) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569573f5, (android.view.ViewGroup) null, false);
        this.f223630e = inflate;
        inflate.findViewById(com.p314xaae8f345.mm.R.id.krl).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.gamelive.playgame.c$$a
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1764x70041d26.c cVar = com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1764x70041d26.c.this;
                cVar.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameConditionChoosePage", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", cVar, array);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(view);
                java.lang.Object[] array2 = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameConditionChoosePage", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", cVar, array2);
                cVar.h();
                yj0.a.h(cVar, "com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameConditionChoosePage", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                yj0.a.h(cVar, "com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameConditionChoosePage", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) this.f223630e.findViewById(com.p314xaae8f345.mm.R.id.krm);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.gamelive.playgame.GameLivePlayGameConditionChoosePage$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int i17) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1764x70041d26.g(com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1764x70041d26.c.this);
            }
        }, this.f223632g, false);
        c22848x6ddd90cf.f374638o = new com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1764x70041d26.d(this);
        c22849x81a93d25.mo7960x6cab2c8d(c22848x6ddd90cf);
        return this.f223630e;
    }
}
