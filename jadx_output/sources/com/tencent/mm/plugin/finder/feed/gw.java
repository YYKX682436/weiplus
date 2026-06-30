package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class gw extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.pz f106866d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw(com.tencent.mm.plugin.finder.feed.pz pzVar) {
        super(0);
        this.f106866d = pzVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f106866d.C.requestRefresh();
        return jz5.f0.f302826a;
    }
}
