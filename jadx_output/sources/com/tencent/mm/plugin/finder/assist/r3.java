package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class r3 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.lite.s f102503a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.assist.q3 f102504b;

    public final synchronized boolean a() {
        if (this.f102503a == null) {
            com.tencent.mm.plugin.lite.s sVar = new com.tencent.mm.plugin.lite.s();
            this.f102503a = sVar;
            com.tencent.mm.plugin.finder.assist.q3 q3Var = new com.tencent.mm.plugin.finder.assist.q3(this);
            this.f102504b = q3Var;
            sVar.f144167d = q3Var;
            q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
            com.tencent.mm.plugin.lite.s sVar2 = this.f102503a;
            ((com.tencent.mm.feature.lite.i) g0Var).getClass();
            com.tencent.mm.plugin.lite.LiteAppCenter.addGlobalStore("wxalitenativee9ae700868f3002f12e96c843ed0a608", sVar2);
        }
        return true;
    }
}
