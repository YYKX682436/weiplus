package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class vt extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.yt f110927d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vt(com.tencent.mm.plugin.finder.feed.yt ytVar) {
        super(0);
        this.f110927d = ytVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f110927d.g().requestRefresh();
        return jz5.f0.f302826a;
    }
}
