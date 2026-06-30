package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes.dex */
public final class j7 implements q80.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.k7 f225159a;

    public j7(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.k7 k7Var) {
        this.f225159a = k7Var;
    }

    @Override // q80.x
    /* renamed from: onActivityResult */
    public final void mo55562x9d4787cb(int i17, int i18, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(intent);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.k7 k7Var = this.f225159a;
        if (i17 != 4132) {
            k7Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiShareMediaToTimeline", "onSnsActivityResult receive other code(not 4132): " + i18);
            return;
        }
        if (i18 == -1) {
            k7Var.f224976f.c(new org.json.JSONObject().put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54560xfb23a562, "ok"), false);
            return;
        }
        if (i18 == 0) {
            k7Var.f224976f.c(new org.json.JSONObject().put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54560xfb23a562, "canceled"), false);
            return;
        }
        k7Var.f224976f.a("activity result is invalid, result code: " + i18);
    }
}
