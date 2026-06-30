package mx0;

/* loaded from: classes5.dex */
public final class e6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced f413485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 f413486e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f413487f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yx0.u f413488g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f413489h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f413490i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.q23 f413491m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f413492n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f413493o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ byte[] f413494p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ byte[] f413495q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624, java.lang.String str, yx0.u uVar, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, int i17, r45.q23 q23Var, boolean z17, java.lang.String str2, byte[] bArr, byte[] bArr2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f413485d = c10977x8e40eced;
        this.f413486e = c16993xacc19624;
        this.f413487f = str;
        this.f413488g = uVar;
        this.f413489h = c4128x879fba0a;
        this.f413490i = i17;
        this.f413491m = q23Var;
        this.f413492n = z17;
        this.f413493o = str2;
        this.f413494p = bArr;
        this.f413495q = bArr2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mx0.e6(this.f413485d, this.f413486e, this.f413487f, this.f413488g, this.f413489h, this.f413490i, this.f413491m, this.f413492n, this.f413493o, this.f413494p, this.f413495q, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.e6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        hu3.q0 m47305xbf78a9ee;
        java.lang.Integer num;
        hu3.q0 m47305xbf78a9ee2;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        m47305xbf78a9ee = this.f413485d.m47305xbf78a9ee();
        if (m47305xbf78a9ee.isShowing()) {
            m47305xbf78a9ee2 = this.f413485d.m47305xbf78a9ee();
            m47305xbf78a9ee2.dismiss();
        }
        this.f413485d.f151099z1 = true;
        android.os.Bundle bundle = this.f413486e.M;
        if (bundle != null) {
            bundle.remove("KEY_ORIGIN_MUSIC_PATH");
        }
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced = this.f413485d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = this.f413486e;
        bu0.c Q0 = c10977x8e40eced.Q0(c16993xacc19624, this.f413487f, this.f413488g);
        android.os.Bundle bundle2 = c16993xacc19624.M;
        if (bundle2 != null) {
            bundle2.putString("ShootComposingUI.KEY_ORIGIN_MUSIC_ID", Q0 != null ? Q0.f106020a : null);
        }
        android.os.Bundle bundle3 = c16993xacc19624.M;
        if (bundle3 != null) {
            bundle3.putByteArray("ShootComposingUI.KEY_ORIGIN_MUSIC_INFO", Q0 != null ? Q0.f106021b : null);
        }
        android.os.Bundle bundle4 = c16993xacc19624.M;
        if (bundle4 != null) {
            bundle4.putInt("ShootComposingUI.KEY_MEDIA_EXTRA_MUSIC_SOURCE", (Q0 == null || (num = Q0.f106022c) == null) ? 0 : num.intValue());
        }
        android.os.Bundle bundle5 = c16993xacc19624.M;
        if (bundle5 != null) {
            bundle5.putByteArray("ShootComposingUI.MEDIA_EXTRA_MUSIC", Q0 != null ? Q0.f106023d : null);
        }
        android.os.Bundle bundle6 = this.f413486e.M;
        if (bundle6 != null) {
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = this.f413489h;
            bundle6.putDouble("ShootComposingUI.SHOOT_TEMPLATE_COVER_START_TIME", c4128x879fba0a != null ? c4128x879fba0a.m33988x124aa384() : 0.0d);
        }
        return java.lang.Boolean.valueOf(ut3.m.f512715a.i(this.f413485d.getContext(), 292, 0, 0, this.f413486e, this.f413490i, 0, true, this.f413491m, false, this.f413492n, false, this.f413493o, this.f413494p, this.f413495q));
    }
}
