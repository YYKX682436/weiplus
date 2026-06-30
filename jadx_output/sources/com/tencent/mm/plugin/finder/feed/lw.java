package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class lw extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.pz f107332d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw(com.tencent.mm.plugin.finder.feed.pz pzVar) {
        super(0);
        this.f107332d = pzVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f107332d.f108755g.getIntent().getIntExtra("KEY_BY_PASS_INFO_TYPE", 0));
    }
}
