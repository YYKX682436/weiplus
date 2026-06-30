package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class g4 extends pq5.g {
    public final /* synthetic */ java.lang.String A;
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.j3 B;

    public g4(com.tencent.mm.plugin.appbrand.j3 j3Var, java.lang.String str) {
        this.B = j3Var;
        this.A = str;
    }

    @Override // km5.q, km5.g
    public synchronized km5.g a(km5.f fVar) {
        lm5.j jVar = lm5.d.f319600a;
        b(lm5.i.a(), fVar);
        return this;
    }

    @Override // km5.q, km5.g
    public synchronized km5.g b(lm5.d dVar, km5.f fVar) {
        super.b(dVar, new com.tencent.mm.plugin.appbrand.f4(this, fVar, this));
        return this;
    }

    @Override // km5.q, im5.a
    public void dead() {
        this.B.h("pipeline(%s) will be stopped", this.A);
        j(true);
    }
}
