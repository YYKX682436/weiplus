package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class sc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104534d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f104535e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f104536f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.g f104537g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f104538h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.im2 f104539i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.g f104540m;

    public sc(in5.s0 s0Var, java.lang.String str, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.protobuf.g gVar, com.tencent.mm.plugin.finder.convert.qe qeVar, r45.im2 im2Var, com.tencent.mm.protobuf.g gVar2) {
        this.f104534d = s0Var;
        this.f104535e = str;
        this.f104536f = baseFinderFeed;
        this.f104537g = gVar;
        this.f104538h = qeVar;
        this.f104539i = im2Var;
        this.f104540m = gVar2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshHotSearch$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_search_query", this.f104535e);
        intent.putExtra("key_search_is_from_feed_list", true);
        intent.putExtra("key_search_feed_id", this.f104536f.getFeedObject().getId());
        com.tencent.mm.protobuf.g gVar = this.f104537g;
        if (gVar != null) {
            intent.putExtra("key_search_session_buffer", gVar.g());
        }
        this.f104538h.getClass();
        r45.im2 im2Var = this.f104539i;
        java.util.LinkedList list = im2Var.getList(1);
        com.tencent.mm.plugin.finder.search.data.SearchHotWordListParcelable a17 = !(list != null && list.size() == 0) ? com.tencent.mm.plugin.finder.search.data.SearchHotWordListParcelable.CREATOR.a((r45.lu2) im2Var.getCustom(0), 0, im2Var.getList(1)) : null;
        if (a17 != null) {
            intent.putExtra("key_search_hot_word_info", a17);
        }
        com.tencent.mm.protobuf.g gVar2 = this.f104540m;
        if (gVar2 != null) {
            intent.putExtra("key_search_hot_word_buffer", gVar2.g());
        }
        intent.putExtra("key_entrance_type", 8);
        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        android.content.Context context = this.f104534d.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        i0Var.wj(context, null, intent);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshHotSearch$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
