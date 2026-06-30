package yo4;

/* loaded from: classes10.dex */
public final class l0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18794x5f9cad3a f545787d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z23.f f545788e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f545789f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f545790g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f545791h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 f545792i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18794x5f9cad3a c18794x5f9cad3a, z23.f fVar, java.lang.String[] strArr, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046) {
        super(2);
        this.f545787d = c18794x5f9cad3a;
        this.f545788e = fVar;
        this.f545789f = strArr;
        this.f545790g = arrayList;
        this.f545791h = arrayList2;
        this.f545792i = c16991x15ced046;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = (java.lang.String) obj2;
        if (((java.lang.Boolean) obj).booleanValue()) {
            if (!(str == null || str.length() == 0)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiVideoFullScreenPluginLayout", "download music success, " + str);
                p3325xe03a0797.p3326xc267989b.i2 i2Var = p3325xe03a0797.p3326xc267989b.i2.f392010d;
                p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                p3325xe03a0797.p3326xc267989b.l.d(i2Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new yo4.k0(this.f545787d, str, this.f545788e, this.f545789f, this.f545790g, this.f545791h, this.f545792i, null), 2, null);
                return jz5.f0.f384359a;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiVideoFullScreenPluginLayout", "download music failed");
        return jz5.f0.f384359a;
    }
}
