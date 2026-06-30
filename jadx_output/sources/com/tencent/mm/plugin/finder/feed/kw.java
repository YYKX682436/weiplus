package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class kw extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.pz f107256d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw(com.tencent.mm.plugin.finder.feed.pz pzVar) {
        super(0);
        this.f107256d = pzVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return this.f107256d.f108755g.getIntent().getStringExtra("KEY_BY_PASS_INFO");
    }
}
