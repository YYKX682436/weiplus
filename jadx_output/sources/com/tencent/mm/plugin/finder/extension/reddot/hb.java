package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class hb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.jb f105571d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zy2.ba f105572e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.jb f105573f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f105574g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb(com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, zy2.ba baVar, com.tencent.mm.plugin.finder.extension.reddot.jb jbVar2, long j17) {
        super(0);
        this.f105571d = jbVar;
        this.f105572e = baVar;
        this.f105573f = jbVar2;
        this.f105574g = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = this.f105571d;
        boolean h17 = jbVar.h1();
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar2 = this.f105573f;
        zy2.ba baVar = this.f105572e;
        com.tencent.mars.xlog.Log.i("Finder.RedDotCtrInfo", "[store] ret=" + (h17 ? baVar.c(jbVar2) : baVar.b(jbVar2, true)) + ' ' + jbVar + " cost=" + (java.lang.System.currentTimeMillis() - this.f105574g));
        return jz5.f0.f302826a;
    }
}
