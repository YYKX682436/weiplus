package yb1;

/* loaded from: classes7.dex */
public final class s implements vh0.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.C12063xb16c5aa3 f542213a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f542214b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f542215c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f542216d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vh0.n1 f542217e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f542218f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f542219g;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.C12063xb16c5aa3 c12063xb16c5aa3, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, java.lang.String str, vh0.n1 n1Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.lang.String str2) {
        this.f542213a = c12063xb16c5aa3;
        this.f542214b = lVar;
        this.f542215c = i17;
        this.f542216d = str;
        this.f542217e = n1Var;
        this.f542218f = h0Var;
        this.f542219g = str2;
    }

    @Override // vh0.i1
    /* renamed from: onResult */
    public void mo56534x57429edc(java.lang.Object obj) {
        if (!((java.lang.Boolean) obj).booleanValue()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.C12063xb16c5aa3.H(this.f542213a, this.f542214b, this.f542215c, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.C12063xb16c5aa3.f161813g, null, 8, null);
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putCharSequence("override_session_id", this.f542216d);
        if (((vh0.f3) this.f542217e).aj((android.content.Context) this.f542218f.f391656d, 12, this.f542219g, true, new yb1.r(this.f542213a, this.f542214b, this.f542215c), bundle) == vh0.l1.NOT_A_CHATBOT) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.C12063xb16c5aa3.H(this.f542213a, this.f542214b, this.f542215c, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.C12063xb16c5aa3.f161816m, null, 8, null);
        }
    }
}
