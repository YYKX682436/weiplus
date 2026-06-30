package a85;

/* loaded from: classes15.dex */
public final class g extends android.widget.RelativeLayout implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final a85.b f2400d;

    /* renamed from: e, reason: collision with root package name */
    public final x75.a f2401e;

    /* renamed from: f, reason: collision with root package name */
    public final a85.a f2402f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.emoji.panel.EmojiPanelRecyclerView f2403g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.content.Context context, a85.b bVar) {
        super(context, null, 0);
        kotlin.jvm.internal.o.g(context, "context");
        this.f2400d = bVar;
        x75.b bVar2 = new x75.b();
        this.f2401e = bVar2;
        a85.a aVar = new a85.a();
        this.f2402f = aVar;
        gm0.j1.n().f273288b.a(2999, bVar2);
        setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.a9e));
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489473co0, (android.view.ViewGroup) this, true);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) inflate;
        relativeLayout.findViewById(com.tencent.mm.R.id.bzg).setOnClickListener(this);
        android.view.View findViewById = relativeLayout.findViewById(com.tencent.mm.R.id.dbs);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.emoji.panel.EmojiPanelRecyclerView emojiPanelRecyclerView = (com.tencent.mm.emoji.panel.EmojiPanelRecyclerView) findViewById;
        this.f2403g = emojiPanelRecyclerView;
        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = new androidx.recyclerview.widget.GridLayoutManager(context, 4);
        gridLayoutManager.B = new a85.c(this, gridLayoutManager);
        emojiPanelRecyclerView.setLayoutManager(gridLayoutManager);
        emojiPanelRecyclerView.setItemViewCacheSize(0);
        emojiPanelRecyclerView.setAdapter(aVar);
        emojiPanelRecyclerView.i(new kr.b(emojiPanelRecyclerView));
        emojiPanelRecyclerView.setScene(1);
        emojiPanelRecyclerView.setEmojiPopupType(3);
        int i17 = com.tencent.mm.pluginsdk.ui.ChatFooterPanel.f189765e;
        aVar.f320620g = new y75.c(1);
    }

    public static final java.util.ArrayList a(a85.g gVar, org.json.JSONArray jSONArray) {
        gVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = jSONArray.length();
        for (int i17 = 0; i17 < length; i17++) {
            org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
            ((com.tencent.mm.feature.emoji.k0) ((com.tencent.mm.feature.emoji.api.v5) i95.n0.c(com.tencent.mm.feature.emoji.api.v5.class))).getClass();
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = new com.tencent.mm.storage.emotion.EmojiInfo();
            ((com.tencent.mm.feature.emoji.h2) ((com.tencent.mm.feature.emoji.api.j6) i95.n0.c(com.tencent.mm.feature.emoji.api.j6.class))).wi("MicroMsg.SimilarEmoji", jSONObject, emojiInfo);
            arrayList.add(emojiInfo);
        }
        return arrayList;
    }

    public static final java.util.List b(a85.g gVar, org.json.JSONArray jSONArray) {
        gVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = jSONArray.length();
        for (int i17 = 0; i17 < length; i17++) {
            org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
            ((com.tencent.mm.feature.emoji.k0) ((com.tencent.mm.feature.emoji.api.v5) i95.n0.c(com.tencent.mm.feature.emoji.api.v5.class))).getClass();
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = new com.tencent.mm.storage.emotion.EmojiInfo();
            ((com.tencent.mm.feature.emoji.h2) ((com.tencent.mm.feature.emoji.api.j6) i95.n0.c(com.tencent.mm.feature.emoji.api.j6.class))).wi("MicroMsg.SimilarEmoji", jSONObject, emojiInfo);
            arrayList.add(new ir.g(emojiInfo, 102, null, 0, 12, null));
        }
        return arrayList;
    }

    public final a85.b getDialog() {
        return this.f2400d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        a85.b bVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/search/ui/SimilarEmojiView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.bzg && (bVar = this.f2400d) != null) {
            bVar.cancel();
        }
        yj0.a.h(this, "com/tencent/mm/search/ui/SimilarEmojiView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
