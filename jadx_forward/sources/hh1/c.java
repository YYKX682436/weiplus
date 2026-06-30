package hh1;

/* loaded from: classes.dex */
public class c extends lc3.b0 {

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f362987f = jz5.h.b(hh1.a.f362985d);

    @Override // lc3.c0
    public java.lang.String f() {
        return "postMessageToWeApp";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("bizName");
        java.lang.String optString2 = data.optString("eventName");
        java.lang.String optString3 = data.optString(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7);
        int length = optString3 != null ? optString3.length() : 0;
        if ((optString3 == null || optString3.length() == 0) || length <= ((java.lang.Number) ((jz5.n) f362987f).mo141623x754a37bb()).intValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBJsApiPostMessageToWeApp", "bizName: " + optString + ", eventName: " + optString2 + ", message: " + optString3);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBJsApiPostMessageToWeApp", "bizName: " + optString + ", eventName: " + optString2 + ", message too long: " + length);
        }
        boolean z17 = optString == null || optString.length() == 0;
        lc3.z zVar = lc3.x.f399470d;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBJsApiPostMessageToWeApp", "has no bizName");
            s().mo146xb9724478(j(zVar, "has no bizName"));
            return;
        }
        if (optString2 == null || optString2.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBJsApiPostMessageToWeApp", "has no eventName");
            s().mo146xb9724478(j(zVar, "has no eventName"));
            return;
        }
        jz5.l[] lVarArr = new jz5.l[3];
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        lVarArr[0] = new jz5.l("bizName", optString);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
        lVarArr[1] = new jz5.l("eventName", optString2);
        if (optString3 == null) {
            optString3 = "";
        }
        lVarArr[2] = new jz5.l(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, optString3);
        java.util.HashMap i17 = kz5.c1.i(lVarArr);
        lc3.e eVar = this.f399423a;
        if (eVar instanceof hq0.i) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(eVar, "null cannot be cast to non-null type com.tencent.mm.magicbrush.plugin.scl.biz.IMagicCardStarterSclBizClass");
            ((hq0.b0) ((hq0.i) eVar)).O1("postMessageToWeApp", i17, new hh1.b(this));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBJsApiPostMessageToWeApp", "only support starter biz");
            s().mo146xb9724478(j(zVar, "only support starter biz"));
        }
    }
}
