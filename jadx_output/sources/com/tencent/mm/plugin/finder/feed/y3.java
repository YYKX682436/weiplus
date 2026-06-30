package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class y3 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.gc f111142d;

    public y3(zy2.gc gcVar) {
        this.f111142d = gcVar;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.nh2 req = (r45.nh2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        zy2.gc gcVar = this.f111142d;
        if (gcVar != null) {
            gcVar.r5(req, ret);
        }
    }
}
