package st2;

/* loaded from: classes3.dex */
public final class e implements pq.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f493800a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.ce0 f493801b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 f493802c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk2.e f493803d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.y23 f493804e;

    public e(java.lang.ref.WeakReference weakReference, r45.ce0 ce0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var, gk2.e eVar, r45.y23 y23Var) {
        this.f493800a = weakReference;
        this.f493801b = ce0Var;
        this.f493802c = k0Var;
        this.f493803d = eVar;
        this.f493804e = y23Var;
    }

    @Override // pq.b
    public void a(java.lang.Object appBundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 c11816x5915d2c1;
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.ShareActionConfig shareActionConfig;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appBundle, "appBundle");
        if (appBundle instanceof l81.b1) {
            android.content.Context context = (android.content.Context) this.f493800a.get();
            gk2.e eVar = this.f493803d;
            if (context != null) {
                pf5.z zVar = pf5.z.f435481a;
                if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.aa) ((zy2.v9) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(zy2.v9.class))).U6(((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0), (l81.b1) appBundle);
            }
            zl2.q4 q4Var = zl2.q4.f555466a;
            l81.b1 b1Var = (l81.b1) appBundle;
            r45.ce0 i17 = q4Var.i(b1Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 c11816x5915d2c12 = b1Var.G;
            st2.c2 c2Var = st2.c2.f493782a;
            r45.y23 y23Var = this.f493804e;
            java.lang.String str2 = null;
            if (c11816x5915d2c12 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.l e17 = c11816x5915d2c12.e();
                e17.f159063j = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.CustomSubjectInfo customSubjectInfo = q4Var.h(this.f493801b);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(customSubjectInfo, "customSubjectInfo");
                e17.A = customSubjectInfo;
                e17.H = true;
                if (y23Var != null) {
                    e17.f159074u = c2Var.b(eVar, y23Var, i17);
                }
                c11816x5915d2c1 = e17.a();
            } else {
                c11816x5915d2c1 = null;
            }
            b1Var.G = c11816x5915d2c1;
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            l81.p0 p0Var = b1Var.f398561i;
            java.lang.String a17 = p0Var != null ? p0Var.a() : null;
            h0Var.f391656d = a17;
            try {
                org.json.JSONObject jSONObject = a17 != null ? new org.json.JSONObject(a17) : new org.json.JSONObject();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 c11816x5915d2c13 = ((l81.b1) appBundle).G;
                if (c11816x5915d2c13 != null && (shareActionConfig = c11816x5915d2c13.f158906w) != null) {
                    str2 = shareActionConfig.f158924e;
                }
                jSONObject.put("finderLiveToken", str2);
                h0Var.f391656d = jSONObject.toString();
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveECRouter", "add finderLiveToken fail " + e18);
            }
            b1Var.f398561i = new st2.d(h0Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 c11816x5915d2c14 = b1Var.G;
            if (c11816x5915d2c14 != null) {
                c11816x5915d2c14.f158899p = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.C14967xb77206cb(this.f493802c);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            if (y23Var == null || (str = y23Var.m75945x2fec8307(26)) == null) {
                str = "";
            }
            jSONObject2.put("cookies", str);
            c11812xa040dc98.f158855d = 1;
            c11812xa040dc98.f158858g = jSONObject2.toString();
            b1Var.f398574s = c11812xa040dc98;
            c2Var.k(b1Var);
        }
    }
}
