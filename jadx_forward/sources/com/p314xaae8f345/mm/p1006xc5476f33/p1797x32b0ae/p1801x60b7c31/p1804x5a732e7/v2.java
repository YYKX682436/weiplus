package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes14.dex */
public final class v2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.x2 f225338d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f225339e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225340f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.x2 x2Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.lang.String str) {
        super(1);
        this.f225338d = x2Var;
        this.f225339e = h0Var;
        this.f225340f = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        bw5.kp0 result = (bw5.kp0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        java.lang.String str = this.f225340f;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "cover");
        boolean[] zArr = result.f111000n;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.x2 x2Var = this.f225338d;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f225339e;
        if (b17) {
            bw5.rq0 rq0Var = zArr[3] ? result.f110995f : new bw5.rq0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(rq0Var, "getCoverColor(...)");
            h0Var.f391656d = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.x2.A(x2Var, rq0Var);
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "playerbg")) {
            bw5.rq0 rq0Var2 = zArr[4] ? result.f110996g : new bw5.rq0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(rq0Var2, "getPlayerBackgroundColor(...)");
            h0Var.f391656d = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.x2.A(x2Var, rq0Var2);
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "minibar")) {
            bw5.rq0 rq0Var3 = zArr[5] ? result.f110997h : new bw5.rq0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(rq0Var3, "getMinibarColor(...)");
            h0Var.f391656d = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.x2.A(x2Var, rq0Var3);
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "link")) {
            bw5.rq0 rq0Var4 = zArr[6] ? result.f110998i : new bw5.rq0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(rq0Var4, "getLinkColor(...)");
            h0Var.f391656d = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.x2.A(x2Var, rq0Var4);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiGetThemeColorForImage", "do not support this scene now! scene: %s", str);
        }
        java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.x2.f225356g;
        x2Var.f224976f.b(kz5.b1.e(new jz5.l("color", h0Var.f391656d)));
        return jz5.f0.f384359a;
    }
}
