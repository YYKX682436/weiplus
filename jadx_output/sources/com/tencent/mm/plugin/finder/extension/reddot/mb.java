package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class mb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l75.n0 f105712d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.pb f105713e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb(l75.n0 n0Var, com.tencent.mm.plugin.finder.extension.reddot.pb pbVar) {
        super(0);
        this.f105712d = n0Var;
        this.f105713e = pbVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.extension.reddot.pb pbVar = this.f105713e;
        try {
            com.tencent.mars.xlog.Log.i("Finder.RedDotFreqCtrlInfo", "[delete] ret=" + this.f105712d.delete((l75.f0) pbVar, true, new java.lang.String[0]) + ' ' + pbVar);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("Finder.RedDotFreqCtrlInfo", e17.getMessage());
        }
        return jz5.f0.f302826a;
    }
}
