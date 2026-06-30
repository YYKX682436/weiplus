package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public final class j6 implements pm5.j {

    /* renamed from: d, reason: collision with root package name */
    public final int f294547d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f294548e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.p f294549f;

    public j6(int i17, java.lang.String fsName, yz5.p pVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fsName, "fsName");
        this.f294547d = i17;
        this.f294548e = fsName;
        this.f294549f = pVar;
    }

    @Override // pm5.j
    public java.lang.Object d(java.lang.Object obj) {
        com.p314xaae8f345.mm.vfs.x1 x1Var = (com.p314xaae8f345.mm.vfs.x1) obj;
        if (x1Var == null) {
            return null;
        }
        int i17 = this.f294547d;
        yz5.p pVar = this.f294549f;
        if (pVar != null) {
            i17 = ((java.lang.Number) pVar.mo149xb9724478(x1Var, java.lang.Integer.valueOf(i17))).intValue();
        }
        return new com.p314xaae8f345.mm.vfs.k6(i17, this.f294548e, x1Var);
    }
}
