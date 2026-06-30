package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class nn extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.ak0 f110350d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI f110351e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f110352f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn(com.tencent.mm.plugin.finder.storage.ak0 ak0Var, com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI finderTopicTimelineUI, java.lang.Integer num) {
        super(0);
        this.f110350d = ak0Var;
        this.f110351e = finderTopicTimelineUI;
        this.f110352f = num;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.uz0 uz0Var = this.f110350d.field_courseInfo;
        long j17 = uz0Var != null ? uz0Var.getLong(0) : 0L;
        java.lang.Integer num = this.f110352f;
        com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI finderTopicTimelineUI = this.f110351e;
        if (j17 != 0) {
            androidx.appcompat.app.AppCompatActivity context = finderTopicTimelineUI.getContext();
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.f211776c = finderTopicTimelineUI.getContext().getString(com.tencent.mm.R.string.lqd, num.toString());
            e4Var.c();
        } else {
            androidx.appcompat.app.AppCompatActivity context2 = finderTopicTimelineUI.getContext();
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context2);
            e4Var2.f211776c = finderTopicTimelineUI.getContext().getString(com.tencent.mm.R.string.f491344mh2, num.toString());
            e4Var2.c();
        }
        return jz5.f0.f302826a;
    }
}
