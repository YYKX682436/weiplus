package c22;

/* loaded from: classes12.dex */
public final class c extends lr.s0 {

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f119526f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f119527g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f119528h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f119529i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c22.e f119530m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(c22.e eVar, android.view.View itemView, lr.k0 k0Var) {
        super(itemView, k0Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f119530m = eVar;
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.h88);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
        this.f119526f = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.p314xaae8f345.mm.R.id.btq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f119527g = findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.p314xaae8f345.mm.R.id.f568385mn1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f119528h = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = itemView.findViewById(com.p314xaae8f345.mm.R.id.mjg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f119529i = findViewById4;
    }

    @Override // lr.s0
    public void i(ir.u0 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.i(item);
        ir.g gVar = (ir.g) this.f402114e;
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = gVar != null ? gVar.f375369b : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(interfaceC4987x84e327cb, "null cannot be cast to non-null type com.tencent.mm.storage.emotion.EmojiInfo");
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) interfaceC4987x84e327cb;
        android.view.View view = this.f119529i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/adapter/EmojiCustomAdapter$EmojiCustomViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/adapter/EmojiCustomAdapter$EmojiCustomViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        c22.e eVar = this.f119530m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.q0 q0Var = eVar.f119531o;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.q0 q0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.q0.EDIT;
        android.widget.TextView textView = this.f119528h;
        if (q0Var != q0Var2) {
            android.view.View view2 = this.f119527g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/adapter/EmojiCustomAdapter$EmojiCustomViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/emoji/ui/adapter/EmojiCustomAdapter$EmojiCustomViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setVisibility(8);
        } else if (eVar.f119532p.contains(c21053xdbf1e5f4.mo42933xb5885648())) {
            android.view.View view3 = this.f119529i;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(java.lang.Float.valueOf(0.8f));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/emoji/ui/adapter/EmojiCustomAdapter$EmojiCustomViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/emoji/ui/adapter/EmojiCustomAdapter$EmojiCustomViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            android.view.View view4 = this.f119527g;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/emoji/ui/adapter/EmojiCustomAdapter$EmojiCustomViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/emoji/ui/adapter/EmojiCustomAdapter$EmojiCustomViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setVisibility(0);
            textView.setText(java.lang.String.valueOf(eVar.f119532p.indexOf(c21053xdbf1e5f4.mo42933xb5885648()) + 1));
        } else {
            android.view.View view5 = this.f119527g;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/emoji/ui/adapter/EmojiCustomAdapter$EmojiCustomViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/emoji/ui/adapter/EmojiCustomAdapter$EmojiCustomViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setVisibility(8);
        }
        int a17 = eVar.f119531o == com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.q0.DRAGGING ? ym5.x.a(this.f3639x46306858.getContext(), 7.0f) : 0;
        this.f3639x46306858.setPadding(a17, a17, a17, a17);
        ir.g gVar2 = (ir.g) this.f402114e;
        if (gVar2 != null) {
            android.widget.ImageView imageView = this.f119526f;
            if (gVar2.f375370c != 3) {
                zq.h.f556505a.d(c21053xdbf1e5f4, imageView, null);
            } else {
                zq.h.f556505a.b(imageView);
                imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f77983xe490a197);
            }
        }
    }
}
