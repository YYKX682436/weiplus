package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class ug extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104705d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug(in5.s0 s0Var) {
        super(0);
        this.f104705d = s0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) this.f104705d.p(com.tencent.mm.R.id.e_k);
        boolean z17 = true;
        if (finderVideoLayout == null) {
            com.tencent.mars.xlog.Log.w("Finder.FeedFullVideoConvert", "videoLayout is null");
        } else if (finderVideoLayout.J()) {
            finderVideoLayout.L(true, true);
        } else {
            finderVideoLayout.M();
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
