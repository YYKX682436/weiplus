package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class wx extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.pz f111013d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wx(com.tencent.mm.plugin.finder.feed.pz pzVar) {
        super(0);
        this.f111013d = pzVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        long longExtra = this.f111013d.f108755g.getIntent().getLongExtra("KEY_GUIDE_BAR_OBJ_ID", -1L);
        if (longExtra != -1) {
            return java.lang.Long.valueOf(longExtra);
        }
        return null;
    }
}
