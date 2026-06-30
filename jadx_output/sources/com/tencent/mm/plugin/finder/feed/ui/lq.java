package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class lq extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.SelectLocalFileRouterUI f110287d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq(com.tencent.mm.plugin.finder.feed.ui.SelectLocalFileRouterUI selectLocalFileRouterUI) {
        super(0);
        this.f110287d = selectLocalFileRouterUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return this.f110287d.getIntent().getStringExtra("MAX_FILE_SIZE_WORDING");
    }
}
