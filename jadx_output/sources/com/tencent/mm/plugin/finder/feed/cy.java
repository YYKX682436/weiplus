package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class cy extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.pz f106515d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy(com.tencent.mm.plugin.finder.feed.pz pzVar) {
        super(0);
        this.f106515d = pzVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Long.valueOf(this.f106515d.f108755g.getIntent().getLongExtra("KEY_OBJECT_ID", 0L));
    }
}
