package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class hj implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI f110123d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f110124e;

    public hj(com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI finderProfileUI, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo) {
        this.f110123d = finderProfileUI;
        this.f110124e = finderJumpInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xc2.y2 y2Var = xc2.y2.f453343a;
        com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI finderProfileUI = this.f110123d;
        xc2.p0 p0Var = new xc2.p0(this.f110124e);
        p0Var.f453253o = "commentScene=" + this.f110123d.getD();
        xc2.y2.i(y2Var, finderProfileUI, p0Var, 0, null, 12, null);
    }
}
