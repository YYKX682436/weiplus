package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class ob extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l75.n0 f105757d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.pb f105758e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f105759f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.pb f105760g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f105761h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob(l75.n0 n0Var, com.tencent.mm.plugin.finder.extension.reddot.pb pbVar, java.lang.String str, com.tencent.mm.plugin.finder.extension.reddot.pb pbVar2, long j17) {
        super(0);
        this.f105757d = n0Var;
        this.f105758e = pbVar;
        this.f105759f = str;
        this.f105760g = pbVar2;
        this.f105761h = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        try {
            com.tencent.mars.xlog.Log.i("Finder.RedDotFreqCtrlInfo", this.f105759f + " [store] ret=" + this.f105757d.replace(this.f105758e) + ' ' + this.f105760g + " cost=" + (java.lang.System.currentTimeMillis() - this.f105761h));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("Finder.RedDotFreqCtrlInfo", e17.getMessage());
        }
        return jz5.f0.f302826a;
    }
}
