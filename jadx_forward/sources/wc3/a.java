package wc3;

/* loaded from: classes7.dex */
public final class a extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.y0 {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.y0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f
    /* renamed from: readFile */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49307xcc440832(java.lang.String str, ik1.b0 pByteBuffer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pByteBuffer, "pByteBuffer");
        if (r26.i0.q(str, "magicbrush.json", false, 2, null)) {
            pByteBuffer.f373357a = java.nio.charset.StandardCharsets.UTF_8.encode("{ \"publicservices\": { \"MBDemoService\": { \"provider\": \"MBDemoService\", \"version\": \"0\" } } }");
        } else {
            pByteBuffer.f373357a = java.nio.charset.StandardCharsets.UTF_8.encode("test read file");
        }
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK;
    }
}
