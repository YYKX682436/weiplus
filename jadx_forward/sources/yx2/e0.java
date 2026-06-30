package yx2;

/* loaded from: classes14.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1676x2ef9413f.C15435x142f8d24 f549374d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1676x2ef9413f.C15435x142f8d24 c15435x142f8d24) {
        super(1);
        this.f549374d = c15435x142f8d24;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2160xed08e3c8.C17858x5da04085 m62956x4eb0f6e5;
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18690x34c5bc78 c18690x34c5bc78;
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1676x2ef9413f.C15435x142f8d24 c15435x142f8d24 = this.f549374d;
        m62956x4eb0f6e5 = c15435x142f8d24.m62956x4eb0f6e5();
        m62956x4eb0f6e5.setVisibility(0);
        c18690x34c5bc78 = c15435x142f8d24.playView;
        if (c18690x34c5bc78 != null) {
            c18690x34c5bc78.m71981xa2fa530b(new yx2.d0(c15435x142f8d24));
        }
        str = c15435x142f8d24.TAG;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onSurfaceDestroyListener");
        return jz5.f0.f384359a;
    }
}
