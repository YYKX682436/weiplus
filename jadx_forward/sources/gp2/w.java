package gp2;

/* loaded from: classes2.dex */
public final class w implements zy2.ub {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.g5 f355868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f355869e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gp2.l0 f355870f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f355871g;

    public w(zy2.g5 g5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, gp2.l0 l0Var, int i17) {
        this.f355868d = g5Var;
        this.f355869e = abstractC14490x69736cb5;
        this.f355870f = l0Var;
        this.f355871g = i17;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void E(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void I(java.lang.String str, java.lang.String str2, int i17, int i18) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void N5(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
    }

    @Override // zy2.ub
    public void e3(int i17, int i18) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void i(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void l(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void m2(java.lang.String str, java.lang.String str2, boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void o(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    /* renamed from: onSeekComplete */
    public void mo55683xe1fdf750(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void p2(java.lang.String str, java.lang.String str2) {
        zy2.g5 g5Var = this.f355868d;
        g5Var.mo56698x4ee17f0a().setTag(com.p314xaae8f345.mm.R.id.f567633k62, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f355869e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = abstractC14490x69736cb5 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? abstractC14490x69736cb5 : null;
        gp2.l0 l0Var = this.f355870f;
        int i17 = this.f355871g;
        if (abstractC14490x69736cb52 != null) {
            sp2.i iVar = sp2.i.f492580a;
            long j17 = i17;
            ml2.x1 x1Var = ml2.x1.f409748v;
            java.lang.String str3 = l0Var.f355786l;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            c50.n0 n0Var = l0Var.G;
            if (n0Var != null) {
                n0Var.a(abstractC14490x69736cb52, jSONObject, i17);
            }
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            iVar.a(abstractC14490x69736cb52, j17, x1Var, str3, jSONObject2);
        }
        boolean z17 = gp2.l0.N;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(l0Var.t(), "checkAutoPlayVideo: onFirstFrameRendStartCallback pos=" + i17 + ", feed=" + abstractC14490x69736cb5 + " view=" + g5Var);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void v3(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
    }
}
