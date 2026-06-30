package com.tencent.mm.plugin.emoji.ui.v2;

/* loaded from: classes12.dex */
public final class a extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f98348d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.autogen.mmdata.rpt.EmoticonDesignerProfileIPExposeNewStruct f98349e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f98348d = "MicroMsg.EmojiStoreDesignerReportUIC";
        this.f98349e = new com.tencent.mm.autogen.mmdata.rpt.EmoticonDesignerProfileIPExposeNewStruct();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onBeforeFinish(android.content.Intent intent) {
        super.onBeforeFinish(intent);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBeforeFinish: ");
        com.tencent.mm.autogen.mmdata.rpt.EmoticonDesignerProfileIPExposeNewStruct emoticonDesignerProfileIPExposeNewStruct = this.f98349e;
        sb6.append(emoticonDesignerProfileIPExposeNewStruct.n());
        com.tencent.mars.xlog.Log.i(this.f98348d, sb6.toString());
        if (getIntent().getBooleanExtra("only_emoji_pack", false)) {
            return;
        }
        emoticonDesignerProfileIPExposeNewStruct.k();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f98348d = "MicroMsg.EmojiStoreDesignerReportUIC";
        this.f98349e = new com.tencent.mm.autogen.mmdata.rpt.EmoticonDesignerProfileIPExposeNewStruct();
    }
}
