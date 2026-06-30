package c22;

/* loaded from: classes12.dex */
public final class c extends lr.s0 {

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f37993f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f37994g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f37995h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f37996i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c22.e f37997m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(c22.e eVar, android.view.View itemView, lr.k0 k0Var) {
        super(itemView, k0Var);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f37997m = eVar;
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.h88);
        kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
        this.f37993f = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.btq);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f37994g = findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.f486852mn1);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f37995h = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = itemView.findViewById(com.tencent.mm.R.id.mjg);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f37996i = findViewById4;
    }

    @Override // lr.s0
    public void i(ir.u0 item) {
        kotlin.jvm.internal.o.g(item, "item");
        super.i(item);
        ir.g gVar = (ir.g) this.f320581e;
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = gVar != null ? gVar.f293836b : null;
        kotlin.jvm.internal.o.e(iEmojiInfo, "null cannot be cast to non-null type com.tencent.mm.storage.emotion.EmojiInfo");
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = (com.tencent.mm.storage.emotion.EmojiInfo) iEmojiInfo;
        android.view.View view = this.f37996i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/adapter/EmojiCustomAdapter$EmojiCustomViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/adapter/EmojiCustomAdapter$EmojiCustomViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        c22.e eVar = this.f37997m;
        com.tencent.mm.plugin.emoji.ui.q0 q0Var = eVar.f37998o;
        com.tencent.mm.plugin.emoji.ui.q0 q0Var2 = com.tencent.mm.plugin.emoji.ui.q0.EDIT;
        android.widget.TextView textView = this.f37995h;
        if (q0Var != q0Var2) {
            android.view.View view2 = this.f37994g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/adapter/EmojiCustomAdapter$EmojiCustomViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/emoji/ui/adapter/EmojiCustomAdapter$EmojiCustomViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setVisibility(8);
        } else if (eVar.f37999p.contains(emojiInfo.getMd5())) {
            android.view.View view3 = this.f37996i;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(java.lang.Float.valueOf(0.8f));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/emoji/ui/adapter/EmojiCustomAdapter$EmojiCustomViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/emoji/ui/adapter/EmojiCustomAdapter$EmojiCustomViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            android.view.View view4 = this.f37994g;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/emoji/ui/adapter/EmojiCustomAdapter$EmojiCustomViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/emoji/ui/adapter/EmojiCustomAdapter$EmojiCustomViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setVisibility(0);
            textView.setText(java.lang.String.valueOf(eVar.f37999p.indexOf(emojiInfo.getMd5()) + 1));
        } else {
            android.view.View view5 = this.f37994g;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/emoji/ui/adapter/EmojiCustomAdapter$EmojiCustomViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/emoji/ui/adapter/EmojiCustomAdapter$EmojiCustomViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setVisibility(8);
        }
        int a17 = eVar.f37998o == com.tencent.mm.plugin.emoji.ui.q0.DRAGGING ? ym5.x.a(this.itemView.getContext(), 7.0f) : 0;
        this.itemView.setPadding(a17, a17, a17, a17);
        ir.g gVar2 = (ir.g) this.f320581e;
        if (gVar2 != null) {
            android.widget.ImageView imageView = this.f37993f;
            if (gVar2.f293837c != 3) {
                zq.h.f474972a.d(emojiInfo, imageView, null);
            } else {
                zq.h.f474972a.b(imageView);
                imageView.setImageResource(com.tencent.mm.R.drawable.emoji_download_icon);
            }
        }
    }
}
