package q81;

/* loaded from: classes4.dex */
public final class g extends q81.a {
    @Override // q81.a
    public java.lang.Object b(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        r45.hf7 hf7Var = (r45.hf7) obj;
        if (str2 == null || str2.length() == 0) {
            return java.lang.Boolean.FALSE;
        }
        java.lang.String str3 = hf7Var != null ? hf7Var.f457658e : null;
        if (str3 == null) {
            return java.lang.Boolean.FALSE;
        }
        r81.f.INSTANCE.b(hf7Var.f457657d.f453064f, 215);
        return java.lang.Boolean.valueOf(((k91.x3) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(k91.x3.class)).J0(str2, str3, k91.u3.f387315h));
    }

    @Override // q81.a
    public r45.cf7 d(java.lang.Object obj) {
        r45.hf7 hf7Var = (r45.hf7) obj;
        if (hf7Var != null) {
            return hf7Var.f457657d;
        }
        return null;
    }

    @Override // q81.a
    public java.lang.String e() {
        return "CmdGetExptInfo";
    }
}
