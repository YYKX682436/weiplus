package yx2;

/* loaded from: classes15.dex */
public final class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1676x2ef9413f.C15435x142f8d24 f549368d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1676x2ef9413f.C15435x142f8d24 c15435x142f8d24) {
        super(3);
        this.f549368d = c15435x142f8d24;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2160xed08e3c8.C17858x5da04085 m62956x4eb0f6e5;
        v94.k kVar;
        java.lang.String str;
        v94.i mo69716xc4dd7296;
        ((java.lang.Number) obj2).intValue();
        ((java.lang.Number) obj3).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1676x2ef9413f.C15435x142f8d24 c15435x142f8d24 = this.f549368d;
        m62956x4eb0f6e5 = c15435x142f8d24.m62956x4eb0f6e5();
        m62956x4eb0f6e5.setVisibility(8);
        kVar = c15435x142f8d24.snsCoverStatusProvider;
        if (kVar != null && (mo69716xc4dd7296 = kVar.mo69716xc4dd7296()) != null) {
            ((ba4.a) mo69716xc4dd7296).d();
        }
        str = c15435x142f8d24.TAG;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onFrameAvailable");
        return jz5.f0.f384359a;
    }
}
