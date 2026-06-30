package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class kq extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.SelectLocalFileRouterUI f110248d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq(com.tencent.mm.plugin.finder.feed.ui.SelectLocalFileRouterUI selectLocalFileRouterUI) {
        super(0);
        this.f110248d = selectLocalFileRouterUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f110248d.getIntent().getIntExtra("MAX_FILE_SIZE", 0));
    }
}
