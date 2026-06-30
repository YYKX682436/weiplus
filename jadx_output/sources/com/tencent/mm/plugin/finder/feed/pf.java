package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class pf extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.uf f108716d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f108717e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f108718f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pf(com.tencent.mm.plugin.finder.feed.uf ufVar, boolean z17, java.lang.String str) {
        super(0);
        this.f108716d = ufVar;
        this.f108717e = z17;
        this.f108718f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.uf ufVar = this.f108716d;
        com.tencent.mm.plugin.finder.feed.kf kfVar = ufVar.f109168n;
        boolean z17 = this.f108717e;
        kfVar.e(z17, this.f108718f);
        yz5.l lVar = ufVar.B;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.valueOf(z17));
        }
        return jz5.f0.f302826a;
    }
}
