package gd1;

/* loaded from: classes7.dex */
public final class f extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n5 {

    /* renamed from: CTRL_INDEX */
    public static final int f69795x366c91de = 790;

    /* renamed from: NAME */
    public static final java.lang.String f69796x24728b = "onNFCDiscovered";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n5
    public void m() {
        o();
        super.m();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n5
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n5 p(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        super.p(lVar);
        return this;
    }

    public final void u(byte[] bArr, java.util.List techs, java.util.HashMap hashMap) {
        java.util.Map map;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(techs, "techs");
        if (bArr == null) {
            bArr = new byte[0];
        }
        byte[] encode = android.util.Base64.encode(bArr, 2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(encode, "encode(...)");
        java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(UTF_8, "UTF_8");
        java.lang.String str = new java.lang.String(encode, UTF_8);
        if (hashMap != null) {
            hashMap.put(dm.i4.f66865x76d1ec5a, str);
            hashMap.put("techs", techs);
            map = hashMap;
        } else {
            map = kz5.c1.k(new jz5.l(dm.i4.f66865x76d1ec5a, str), new jz5.l("techs", techs));
        }
        t(map);
        m();
    }

    public gd1.f v(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        super.p(lVar);
        return this;
    }
}
