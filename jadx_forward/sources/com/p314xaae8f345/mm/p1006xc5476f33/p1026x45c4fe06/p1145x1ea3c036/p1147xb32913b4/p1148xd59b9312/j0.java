package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312;

/* loaded from: classes7.dex */
public final class j0 implements ui1.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.a f167126a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.l0 f167127b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f167128c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f167129d;

    public j0(yz5.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.l0 l0Var, java.lang.String str, java.lang.String str2) {
        this.f167126a = aVar;
        this.f167127b = l0Var;
        this.f167128c = str;
        this.f167129d = str2;
    }

    @Override // ui1.r
    public void a() {
        this.f167126a.mo152xb9724478();
    }

    @Override // ui1.r
    public void c(int i17, java.lang.String str) {
        if (str == null) {
            str = "";
        }
        this.f167127b.d(this.f167128c, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.e.a("fail ".concat(str), this.f167129d));
    }

    @Override // ui1.r
    /* renamed from: onCancel */
    public void mo32123x3d6f0539() {
        this.f167127b.d(this.f167128c, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.e.a("fail:auth canceled", this.f167129d));
    }
}
