package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class w implements si1.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j f172459a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 f172460b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f172461c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f172462d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f172463e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x f172464f;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x xVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j jVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var, java.lang.String str, java.lang.String str2, int i17) {
        this.f172464f = xVar;
        this.f172459a = jVar;
        this.f172460b = k0Var;
        this.f172461c = str;
        this.f172462d = str2;
        this.f172463e = i17;
    }

    @Override // si1.k
    public void a(si1.j jVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f172464f.f173898c;
        if (lVar == null || !lVar.mo50262x39e05d35()) {
            return;
        }
        int i17 = jVar.f489803a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j jVar2 = this.f172459a;
        if (i17 == 0) {
            jVar2.a();
            return;
        }
        java.lang.String str = jVar.f489804b;
        if (android.text.TextUtils.isEmpty(str)) {
            str = "fail:internal error";
        }
        jVar2.b(this.f172460b.r(str, jVar.f489805c, null));
    }

    @Override // si1.k
    public void b(int i17) {
        this.f172464f.f(this.f172460b, this.f172461c, this.f172462d, this.f172463e, i17);
    }
}
