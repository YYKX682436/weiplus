package wb1;

/* loaded from: classes7.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wb1.h f525887d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf.f f525888e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f525889f;

    public a(wb1.h hVar, sf.f fVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        this.f525887d = hVar;
        this.f525888e = fVar;
        this.f525889f = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wb1.h hVar = this.f525887d;
        sf.f fVar = this.f525888e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f525889f;
        synchronized (hVar) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b) fVar).f159554c;
            if (k0Var instanceof xb1.b) {
                org.json.JSONObject jSONObject = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b) fVar).f159553b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "getData(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b) fVar).f159554c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k0Var2, "getJsApi(...)");
                wb1.h.r(hVar, lVar, jSONObject, k0Var2, ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b) fVar).f159552a);
            } else if (k0Var instanceof xb1.d) {
                org.json.JSONObject jSONObject2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b) fVar).f159553b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "getData(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var3 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b) fVar).f159554c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k0Var3, "getJsApi(...)");
                wb1.h.t(hVar, lVar, jSONObject2, k0Var3, ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b) fVar).f159552a);
            } else if (k0Var instanceof xb1.c) {
                org.json.JSONObject jSONObject3 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b) fVar).f159553b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "getData(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var4 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b) fVar).f159554c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k0Var4, "getJsApi(...)");
                wb1.h.s(hVar, lVar, jSONObject3, k0Var4, ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b) fVar).f159552a);
            }
        }
    }
}
