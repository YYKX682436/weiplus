package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class ei extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.oj f103264g;

    public ei(com.tencent.mm.plugin.finder.convert.oj ojVar) {
        this.f103264g = ojVar;
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        boolean z17 = ev6 instanceof fc2.v;
        com.tencent.mm.plugin.finder.convert.oj ojVar = this.f103264g;
        if (z17 && ((fc2.v) ev6).f260997d == 1) {
            ik1.h0.b(new com.tencent.mm.plugin.finder.convert.ai(ev6, ojVar));
            return;
        }
        if (ev6 instanceof fc2.t) {
            int i17 = ((fc2.t) ev6).f260985d;
            if (i17 == 6 || i17 == 5 || i17 == 0) {
                pm0.v.X(new com.tencent.mm.plugin.finder.convert.bi(ojVar, ev6));
                if (i17 == 0) {
                    pm0.v.X(new com.tencent.mm.plugin.finder.convert.ci(ojVar, ev6));
                }
            }
            pm0.v.X(new com.tencent.mm.plugin.finder.convert.di(ojVar, ev6));
        }
    }
}
