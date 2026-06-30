package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e;

/* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.CustomTabActionBar */
/* loaded from: classes3.dex */
public class C16000xd10a6419 extends android.widget.FrameLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f222645g = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f222646d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f222647e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f222648f;

    public C16000xd10a6419(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public final void a() {
        this.f222646d = getContext();
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bhv, (android.view.ViewGroup) this, false);
        this.f222647e = inflate.findViewById(com.p314xaae8f345.mm.R.id.f78238xaeb5384d);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.obc);
        this.f222648f = textView;
        com.p314xaae8f345.mm.ui.f.b(textView, com.p314xaae8f345.mm.R.C30860x5b28f31.f561108r);
        this.f222647e.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.game.ui.chat_tab.CustomTabActionBar$$a
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16000xd10a6419.f222645g;
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16000xd10a6419 c16000xd10a6419 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16000xd10a6419.this;
                c16000xd10a6419.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/game/ui/chat_tab/CustomTabActionBar", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", c16000xd10a6419, array);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(view);
                java.lang.Object[] array2 = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/game/ui/chat_tab/CustomTabActionBar", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", c16000xd10a6419, array2);
                ((android.app.Activity) c16000xd10a6419.f222646d).finish();
                yj0.a.h(c16000xd10a6419, "com/tencent/mm/plugin/game/ui/chat_tab/CustomTabActionBar", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                yj0.a.h(c16000xd10a6419, "com/tencent/mm/plugin/game/ui/chat_tab/CustomTabActionBar", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        addView(inflate, new android.widget.FrameLayout.LayoutParams(-1, com.p314xaae8f345.mm.ui.bl.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)));
    }

    /* renamed from: setBackBtn */
    public void m64776x9c8c0d33(android.view.View.OnClickListener onClickListener) {
        this.f222647e.setOnClickListener(onClickListener);
    }

    /* renamed from: setTitle */
    public void m64777x53bfe316(int i17) {
        this.f222648f.setText(i17);
    }

    /* renamed from: setTitle */
    public void m64778x53bfe316(java.lang.String str) {
        this.f222648f.setText(str);
    }

    public C16000xd10a6419(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a();
    }
}
