package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class ay extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.pz f106329d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay(com.tencent.mm.plugin.finder.feed.pz pzVar) {
        super(0);
        this.f106329d = pzVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f106329d.f108755g.getIntent().getStringExtra("KEY_OBJECT_NONCE_ID");
        return stringExtra == null ? "" : stringExtra;
    }
}
