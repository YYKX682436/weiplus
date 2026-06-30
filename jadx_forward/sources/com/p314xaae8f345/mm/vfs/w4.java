package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public class w4 extends com.p314xaae8f345.mm.vfs.o8 {

    /* renamed from: f, reason: collision with root package name */
    public final java.security.Key f294760f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.C22762x6c03528c f294761g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(com.p314xaae8f345.mm.vfs.C22762x6c03528c c22762x6c03528c, com.p314xaae8f345.mm.vfs.q2 q2Var, java.security.Key key) {
        super(q2Var);
        this.f294761g = c22762x6c03528c;
        this.f294760f = key;
    }

    @Override // com.p314xaae8f345.mm.vfs.o8, com.p314xaae8f345.mm.vfs.a
    public long G(java.lang.String str, com.p314xaae8f345.mm.vfs.q2 q2Var, java.lang.String str2, boolean z17) {
        if (q2Var instanceof com.p314xaae8f345.mm.vfs.w4) {
            com.p314xaae8f345.mm.vfs.w4 w4Var = (com.p314xaae8f345.mm.vfs.w4) q2Var;
            com.p314xaae8f345.mm.vfs.C22762x6c03528c c22762x6c03528c = w4Var.f294761g;
            com.p314xaae8f345.mm.vfs.v2 v2Var = c22762x6c03528c.f294280f;
            com.p314xaae8f345.mm.vfs.C22762x6c03528c c22762x6c03528c2 = this.f294761g;
            if (v2Var == c22762x6c03528c2.f294280f && c22762x6c03528c.f294281g.equals(c22762x6c03528c2.f294281g) && w4Var.f294760f.equals(this.f294760f)) {
                com.p314xaae8f345.mm.vfs.q2 q2Var2 = this.f294651e;
                if (q2Var2 instanceof com.p314xaae8f345.mm.vfs.a) {
                    return ((com.p314xaae8f345.mm.vfs.a) q2Var2).G(str, w4Var.f294651e, str2, z17);
                }
            }
        }
        return super.G(str, q2Var, str2, z17);
    }

    @Override // com.p314xaae8f345.mm.vfs.o8, com.p314xaae8f345.mm.vfs.a
    public boolean H(java.lang.String str, com.p314xaae8f345.mm.vfs.q2 q2Var, java.lang.String str2) {
        if (q2Var instanceof com.p314xaae8f345.mm.vfs.w4) {
            com.p314xaae8f345.mm.vfs.w4 w4Var = (com.p314xaae8f345.mm.vfs.w4) q2Var;
            com.p314xaae8f345.mm.vfs.C22762x6c03528c c22762x6c03528c = w4Var.f294761g;
            com.p314xaae8f345.mm.vfs.v2 v2Var = c22762x6c03528c.f294280f;
            com.p314xaae8f345.mm.vfs.C22762x6c03528c c22762x6c03528c2 = this.f294761g;
            if (v2Var == c22762x6c03528c2.f294280f && c22762x6c03528c.f294281g.equals(c22762x6c03528c2.f294281g) && w4Var.f294760f.equals(this.f294760f)) {
                com.p314xaae8f345.mm.vfs.q2 q2Var2 = this.f294651e;
                if (q2Var2 instanceof com.p314xaae8f345.mm.vfs.a) {
                    return ((com.p314xaae8f345.mm.vfs.a) q2Var2).H(str, w4Var.f294651e, str2);
                }
            }
        }
        return super.H(str, q2Var, str2);
    }

    @Override // com.p314xaae8f345.mm.vfs.o8, com.p314xaae8f345.mm.vfs.q2
    public java.io.InputStream a(java.lang.String str) {
        java.security.Key key = this.f294760f;
        if (key == null) {
            throw new java.io.FileNotFoundException("Key is not initialized.");
        }
        try {
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("RC4");
            cipher.init(2, key);
            return new javax.crypto.CipherInputStream(this.f294651e.a(str), cipher);
        } catch (java.security.GeneralSecurityException e17) {
            throw ((java.io.FileNotFoundException) new java.io.FileNotFoundException("Failed to initialize cipher: " + e17.getMessage()).initCause(e17));
        }
    }

    @Override // com.p314xaae8f345.mm.vfs.o8, com.p314xaae8f345.mm.vfs.q2
    public java.io.OutputStream c(java.lang.String str, boolean z17) {
        java.security.Key key = this.f294760f;
        if (key == null) {
            throw new java.io.FileNotFoundException("Key is not initialized.");
        }
        if (z17) {
            throw new java.io.FileNotFoundException("Appending encrypted files is not supported.");
        }
        try {
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("RC4");
            cipher.init(1, key);
            return new javax.crypto.CipherOutputStream(this.f294651e.c(str, false), cipher);
        } catch (java.security.GeneralSecurityException e17) {
            throw ((java.io.FileNotFoundException) new java.io.FileNotFoundException("Failed to initialize cipher: " + e17.getMessage()).initCause(e17));
        }
    }

    @Override // com.p314xaae8f345.mm.vfs.o8, com.p314xaae8f345.mm.vfs.q2
    public int o() {
        return this.f294651e.o() & (-19);
    }

    @Override // com.p314xaae8f345.mm.vfs.a
    /* renamed from: toString */
    public java.lang.String mo82287x9616526c() {
        return "rc4 <- " + this.f294651e;
    }

    @Override // com.p314xaae8f345.mm.vfs.q2
    public com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb y() {
        return this.f294761g;
    }
}
