package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class fl extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.tl f106752d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.u1 f106753e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl(com.tencent.mm.plugin.finder.feed.tl tlVar, so2.u1 u1Var) {
        super(0);
        this.f106752d = tlVar;
        this.f106753e = u1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.tl.b(this.f106752d, this.f106753e, null, 0, 6, null);
        com.tencent.mm.plugin.finder.feed.tl tlVar = this.f106752d;
        long longExtra = tlVar.f109069d.getIntent().getLongExtra("KEY_VIDEO_START_PLAY_TIME_MS", 0L);
        if (longExtra > 0) {
            pm0.v.V(0L, new com.tencent.mm.plugin.finder.feed.zj(tlVar, longExtra));
        }
        return jz5.f0.f302826a;
    }
}
