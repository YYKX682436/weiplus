package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class r5 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderHotSearchUI f110481d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(com.tencent.mm.plugin.finder.feed.ui.FinderHotSearchUI finderHotSearchUI) {
        super(3);
        this.f110481d = finderHotSearchUI;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        r45.lu2 hotWord = (r45.lu2) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        java.util.List list = (java.util.List) obj3;
        kotlin.jvm.internal.o.g(hotWord, "hotWord");
        int i17 = com.tencent.mm.plugin.finder.feed.ui.FinderHotSearchUI.f109298v;
        com.tencent.mm.plugin.finder.feed.ui.FinderHotSearchUI finderHotSearchUI = this.f110481d;
        finderHotSearchUI.getClass();
        android.content.Intent intent = new android.content.Intent();
        java.lang.String string = hotWord.getString(0);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            if (string == null) {
                string = "";
            }
            intent.putExtra("key_search_query", string);
            com.tencent.mm.protobuf.g byteString = hotWord.getByteString(4);
            intent.putExtra("key_search_session_buffer", byteString != null ? byteString.g() : null);
            intent.putExtra("key_search_hot_word_info", com.tencent.mm.plugin.finder.search.data.SearchHotWordListParcelable.CREATOR.a(hotWord, intValue, list));
        }
        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        androidx.appcompat.app.AppCompatActivity context = finderHotSearchUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        i0Var.wj(context, null, intent);
        return jz5.f0.f302826a;
    }
}
