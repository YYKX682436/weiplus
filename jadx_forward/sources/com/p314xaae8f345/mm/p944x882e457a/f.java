package com.p314xaae8f345.mm.p944x882e457a;

/* loaded from: classes7.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public int f152148a;

    /* renamed from: b, reason: collision with root package name */
    public int f152149b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f152150c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f f152151d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.m1 f152152e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.i f152153f;

    public static com.p314xaae8f345.mm.p944x882e457a.f a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, com.p314xaae8f345.mm.p944x882e457a.i iVar) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar2 = new com.p314xaae8f345.mm.p944x882e457a.f();
        fVar2.f152148a = i17;
        fVar2.f152149b = i18;
        fVar2.f152150c = str;
        fVar2.f152151d = fVar;
        fVar2.f152152e = m1Var;
        fVar2.f152153f = iVar;
        if (iVar != null) {
            iVar.k(i17, i18, str, fVar, m1Var);
        }
        return fVar2;
    }

    public boolean b() {
        return this.f152148a == 0 && this.f152149b == 0;
    }

    /* renamed from: toString */
    public java.lang.String m47956x9616526c() {
        return "CgiBack{errType=" + this.f152148a + ", errCode=" + this.f152149b + ", errMsg='" + this.f152150c + "', cgiFunId=" + this.f152153f.f152179f.f152243a.f152219c + ", cgiUri=" + this.f152153f.f152179f.f152245c + '}';
    }
}
