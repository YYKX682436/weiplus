package sj4;

/* loaded from: classes10.dex */
public final class n1 extends bi4.o0 {

    /* renamed from: c, reason: collision with root package name */
    public org.json.JSONObject f490410c;

    @Override // bi4.o0
    public boolean d(android.content.Context context, android.os.Bundle bundle) {
        sj4.m1 r17 = r();
        if (r17 == null) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6 h6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class);
        if (h6Var == null) {
            return true;
        }
        l81.b1 b1Var = new l81.b1();
        java.lang.String str = r17.f490403a;
        b1Var.f398545a = str;
        b1Var.f398555f = r17.f490404b;
        b1Var.f398551d = r17.f490405c;
        b1Var.f398549c = r17.f490406d;
        b1Var.f398565k = tj.f.f76816x366c91de;
        b1Var.f398567l = str;
        java.lang.String str2 = r17.f490407e;
        if (str2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98();
            c11812xa040dc98.f158855d = 6;
            c11812xa040dc98.f158859h = str2;
            b1Var.f398574s = c11812xa040dc98;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) h6Var).bj(context, b1Var);
        return true;
    }

    @Override // bi4.o0
    public void e(pj4.w wVar) {
        sj4.m1 r17 = r();
        if (r17 != null) {
            if (wVar != null) {
                wVar.f436847g = r17.f490403a;
            }
            if (wVar == null) {
                return;
            }
            wVar.f436848h = r17.f490404b;
        }
    }

    @Override // bi4.o0
    public boolean j() {
        return false;
    }

    @Override // bi4.o0
    public void m(java.lang.String str, pj4.j0 j0Var) {
        org.json.JSONObject jSONObject;
        super.m(str, j0Var);
        if (j0Var == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(j0Var.f436672d, "7")) {
            return;
        }
        try {
            jSONObject = new org.json.JSONObject(j0Var.f436674f);
        } catch (java.lang.Throwable th6) {
            int i17 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TextStatus.WeAppStatusService", th6, "WeAppStatus parse err", new java.lang.Object[0]);
            jSONObject = null;
        }
        this.f490410c = jSONObject;
    }

    @Override // bi4.o0
    public void n() {
    }

    @Override // bi4.o0
    public boolean p(android.widget.FrameLayout container) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        android.widget.ImageView imageView = (android.widget.ImageView) container.findViewWithTag("MicroMsg.TextStatus.WeAppStatusService");
        if (imageView == null) {
            imageView = new android.widget.ImageView(container.getContext());
        }
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        container.removeAllViews();
        container.addView(imageView);
        imageView.setOutlineProvider(new bk4.g2(0.5f));
        imageView.setClipToOutline(true);
        org.json.JSONObject jSONObject = this.f490410c;
        java.lang.String optString = jSONObject != null ? jSONObject.optString("headImageURL") : null;
        if (!(optString == null || r26.n0.N(optString))) {
            n11.a.b().g(optString, imageView);
        }
        return true;
    }

    public final sj4.m1 r() {
        org.json.JSONObject jSONObject;
        pj4.j0 j0Var = this.f102607b;
        if (j0Var == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(j0Var.f436672d, "7")) {
            return null;
        }
        java.lang.String str = j0Var.f436674f;
        if (!(str == null || str.length() == 0)) {
            try {
                jSONObject = new org.json.JSONObject(j0Var.f436674f);
            } catch (java.lang.Throwable unused) {
                jSONObject = new org.json.JSONObject();
            }
            return new sj4.m1(jSONObject.optString(dm.i4.f66875xa013b0d5), jSONObject.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714), jSONObject.optInt("version"), jSONObject.optInt("versionType", 0), jSONObject.optString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099));
        }
        java.lang.String keyBusiBuf = j0Var.f436675g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keyBusiBuf, "keyBusiBuf");
        if (!(keyBusiBuf.length() > 0)) {
            return null;
        }
        pj4.x1 x1Var = new pj4.x1();
        x1Var.mo11468x92b714fd(android.util.Base64.decode(j0Var.f436675g, 2));
        return new sj4.m1(x1Var.f436865f, x1Var.f436864e, x1Var.f436867h, x1Var.f436866g, x1Var.f436869m);
    }
}
