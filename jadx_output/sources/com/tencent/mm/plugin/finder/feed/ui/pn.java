package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class pn extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI f110429d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn(com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI finderTopicTimelineUI) {
        super(0);
        this.f110429d = finderTopicTimelineUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI finderTopicTimelineUI = this.f110429d;
        java.lang.String stringExtra = finderTopicTimelineUI.getIntent().getStringExtra("KEY_COLLECTION_PREVIEW_WORDING");
        if (stringExtra != null) {
            androidx.appcompat.app.AppCompatActivity context = finderTopicTimelineUI.getContext();
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.f211776c = stringExtra;
            e4Var.c();
        }
        return jz5.f0.f302826a;
    }
}
