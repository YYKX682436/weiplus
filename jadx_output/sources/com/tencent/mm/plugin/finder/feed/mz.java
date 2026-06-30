package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class mz extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.pz f108535d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mz(com.tencent.mm.plugin.finder.feed.pz pzVar) {
        super(0);
        this.f108535d = pzVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f108535d.f108755g.getIntent().getIntExtra("KEY_TARGET_TAB_TYPE", 4));
    }
}
