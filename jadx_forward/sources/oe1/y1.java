package oe1;

/* loaded from: classes12.dex */
public final class y1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oe1.e1 f426289d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(oe1.e1 e1Var) {
        super(3);
        this.f426289d = e1Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String str;
        int intValue = ((java.lang.Number) obj).intValue();
        long longValue = ((java.lang.Number) obj2).longValue();
        long longValue2 = ((java.lang.Number) obj3).longValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1119x60b7c31.i iVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1119x60b7c31.i) this.f426289d;
        iVar.getClass();
        java.util.Map k17 = kz5.c1.k(new jz5.l("totalSize", java.lang.Long.valueOf(longValue2)), new jz5.l("finishedSize", java.lang.Long.valueOf(longValue)), new jz5.l("result", java.lang.Integer.valueOf(intValue)));
        if (intValue >= 0) {
            str = "ok";
        } else {
            str = "fail:preDownload complete with result:" + intValue;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l) iVar.f165156a.get();
        if (lVar != null) {
            lVar.a(iVar.f165157b, iVar.f165158c.p(str, k17));
        }
        return jz5.f0.f384359a;
    }
}
