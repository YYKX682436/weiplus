package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class ge extends qw4.a implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.ge f267741d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.ge();

    /* renamed from: e, reason: collision with root package name */
    public static nw4.k f267742e;

    /* renamed from: f, reason: collision with root package name */
    public static nw4.y2 f267743f;

    /* JADX WARN: Removed duplicated region for block: B:82:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x021f  */
    @Override // nw4.q2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(nw4.k r25, nw4.y2 r26) {
        /*
            Method dump skipped, instructions count: 617
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.ge.a(nw4.k, nw4.y2):boolean");
    }

    @Override // nw4.q2
    public int b() {
        return 64;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "timelineCheckIn";
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        nw4.k kVar;
        nw4.y2 y2Var;
        if (i17 != 225 || (kVar = f267742e) == null || (y2Var = f267743f) == null) {
            return;
        }
        nw4.g gVar = kVar.f422396d;
        if (i18 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiTimelineCheckIn", "timeline_check_in ok");
            gVar.e(y2Var.f422546c, y2Var.f422552i + ":ok", null);
        } else if (i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiTimelineCheckIn", "timeline_check_in fail");
            gVar.e(y2Var.f422546c, y2Var.f422552i + ":fail", null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiTimelineCheckIn", "timeline_check_in cancel, resultCode=%d", java.lang.Integer.valueOf(i18));
            gVar.e(y2Var.f422546c, y2Var.f422552i + ":cancel", null);
        }
        f267742e = null;
        f267743f = null;
    }
}
