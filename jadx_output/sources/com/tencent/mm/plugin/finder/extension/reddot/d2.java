package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes2.dex */
public final class d2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f105453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f105454e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(com.tencent.mm.protocal.protobuf.FinderObject finderObject, int i17) {
        super(0);
        this.f105453d = finderObject;
        this.f105454e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return "redDotFeedId = " + pm0.v.u(com.tencent.mm.plugin.finder.extension.reddot.e2.f105487b) + ", realShowFeedId=" + pm0.v.u(this.f105453d.getId()) + ", tabType = " + this.f105454e + ", redDotTipsId = " + com.tencent.mm.plugin.finder.extension.reddot.e2.f105488c;
    }
}
