package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class k1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f105622d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(kotlin.jvm.internal.f0 f0Var) {
        super(0);
        this.f105622d = f0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        kotlin.jvm.internal.f0 f0Var = this.f105622d;
        if (f0Var.f310116d < 0) {
            java.util.Iterator it = c01.h2.f(3).entrySet().iterator();
            int i17 = 0;
            while (it.hasNext()) {
                if (c01.h2.a((java.lang.String) ((java.util.Map.Entry) it.next()).getKey(), "") == 1) {
                    i17++;
                }
            }
            f0Var.f310116d = i17;
        }
        return java.lang.Integer.valueOf(f0Var.f310116d);
    }
}
