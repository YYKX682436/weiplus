package vv4;

/* loaded from: classes11.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19216xc2476b75 f522035d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f522036e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.RectF f522037f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f522038g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f522039h;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19216xc2476b75 activityC19216xc2476b75, java.lang.String str, android.graphics.RectF rectF, java.lang.String str2, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f522035d = activityC19216xc2476b75;
        this.f522036e = str;
        this.f522037f = rectF;
        this.f522038g = str2;
        this.f522039h = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19216xc2476b75 activityC19216xc2476b75 = this.f522035d;
        java.lang.String str = activityC19216xc2476b75.f263171m;
        if (str == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("imgPath");
            throw null;
        }
        zv4.f fVar = zv4.f.f557993a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.g(str)) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            str = m11.b1.Di().P0(str);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        }
        android.graphics.Bitmap c17 = com.p314xaae8f345.mm.p786x600aa8b.e.c(str);
        java.lang.String b17 = c17 != null ? fVar.b(c17, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf, true) : null;
        if (b17 != null) {
            activityC19216xc2476b75.f263171m = b17;
        }
        java.lang.String str2 = this.f522036e;
        boolean z17 = str2.length() > 0;
        android.graphics.RectF rectF = this.f522037f;
        if (z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("skip upload with preRequestKey key=");
            sb6.append(str2);
            sb6.append(" rect=");
            sb6.append(rectF != null ? rectF.toString() : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMFTSImageRecognitionUI", sb6.toString());
            java.lang.String str3 = this.f522036e;
            java.lang.String str4 = activityC19216xc2476b75.f263171m;
            if (str4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("imgPath");
                throw null;
            }
            if (rectF == null) {
                rectF = new android.graphics.RectF(0.0f, 0.0f, 1.0f, 1.0f);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19216xc2476b75.V6(activityC19216xc2476b75, new vv4.b(activityC19216xc2476b75, str3, str4, rectF, this.f522038g).m172714x9616526c());
            return;
        }
        if (activityC19216xc2476b75.Y6() != 13) {
            p3325xe03a0797.p3326xc267989b.l.d(activityC19216xc2476b75.getLifecycleAsyncScope(), null, null, new vv4.t(activityC19216xc2476b75, null), 3, null);
            return;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("skip upload with scanQuery=");
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f522039h;
        sb7.append((java.lang.String) h0Var.f391656d);
        sb7.append(" rect=");
        sb7.append(rectF != null ? rectF.toString() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMFTSImageRecognitionUI", sb7.toString());
        java.lang.String str5 = (java.lang.String) h0Var.f391656d;
        java.lang.String str6 = activityC19216xc2476b75.f263171m;
        if (str6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("imgPath");
            throw null;
        }
        if (rectF == null) {
            rectF = new android.graphics.RectF(0.0f, 0.0f, 1.0f, 1.0f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19216xc2476b75.V6(activityC19216xc2476b75, new vv4.a(activityC19216xc2476b75, str5, str6, rectF, this.f522038g).m172712x9616526c());
    }
}
