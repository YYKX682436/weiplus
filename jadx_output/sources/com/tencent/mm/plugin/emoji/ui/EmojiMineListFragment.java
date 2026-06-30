package com.tencent.mm.plugin.emoji.ui;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/EmojiMineListFragment;", "Lcom/tencent/mm/ui/MMFragment;", "Ll75/q0;", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class EmojiMineListFragment extends com.tencent.mm.ui.MMFragment implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.emoji.model.e0 f97788d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f97789e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f97790f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f97791g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.storage.emotion.EmojiIPSetInfo f97792h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiMineListFragment(com.tencent.mm.plugin.emoji.model.e0 dataSource, java.lang.String str) {
        super(true);
        kotlin.jvm.internal.o.g(dataSource, "dataSource");
        this.f97788d = dataSource;
        this.f97789e = str;
        this.f97790f = jz5.h.b(new com.tencent.mm.plugin.emoji.ui.o2(this));
        this.f97791g = jz5.h.b(new com.tencent.mm.plugin.emoji.ui.l2(this));
        this.f97792h = com.tencent.mm.storage.n5.f().f195179q.y0(str);
    }

    @Override // com.tencent.mm.ui.MMFragment
    /* renamed from: getLayoutId */
    public int getF72225d() {
        return com.tencent.mm.R.layout.a6t;
    }

    public final m22.f l0() {
        return (m22.f) ((jz5.n) this.f97791g).getValue();
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        com.tencent.mm.storage.n5.f().b().add(this);
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        com.tencent.mm.storage.n5.f().b().remove(this);
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        if (kotlin.jvm.internal.o.b(str, "event_update_group")) {
            com.tencent.mm.plugin.emoji.model.e0 e0Var = this.f97788d;
            e0Var.reset();
            l0().f323045e.clear();
            l0().f323045e.addAll(e0Var.c());
            l0().notifyDataSetChanged();
        }
    }

    @Override // com.tencent.mm.ui.MMFragment, androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(view, "view");
        super.onViewCreated(view, bundle);
        l0().f323045e.addAll(this.f97788d.c());
        jz5.g gVar = this.f97790f;
        ((androidx.recyclerview.widget.RecyclerView) ((jz5.n) gVar).getValue()).setAdapter(l0());
        ((androidx.recyclerview.widget.RecyclerView) ((jz5.n) gVar).getValue()).setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(requireContext()));
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) ((jz5.n) gVar).getValue();
        android.content.Context requireContext = requireContext();
        kotlin.jvm.internal.o.f(requireContext, "requireContext(...)");
        recyclerView.N(new m22.h(requireContext, 0));
        com.tencent.mm.storage.emotion.EmojiIPSetInfo emojiIPSetInfo = this.f97792h;
        setMMTitle(emojiIPSetInfo != null ? emojiIPSetInfo.field_title : null);
        setBackBtn(new com.tencent.mm.plugin.emoji.ui.m2(this));
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f491106by1), new com.tencent.mm.plugin.emoji.ui.n2(this));
    }
}
