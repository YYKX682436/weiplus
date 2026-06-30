package lq0;

/* loaded from: classes7.dex */
public class a extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "createFrameSetRoot";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("bizName");
        java.lang.String optString2 = data.optString("frameSetRootPath");
        java.lang.String optString3 = data.optString("query");
        if (optString3 == null) {
            optString3 = "";
        }
        java.lang.String str = optString3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBJsApiCreateFrameSetRoot", "createFrameSetRoot bizName: " + optString + ", path: " + optString2);
        boolean z17 = true;
        boolean z18 = optString == null || optString.length() == 0;
        lc3.z zVar = lc3.x.f399470d;
        if (z18) {
            s().mo146xb9724478(j(zVar, "bizName is null"));
            return;
        }
        if (optString2 != null && optString2.length() != 0) {
            z17 = false;
        }
        if (z17) {
            s().mo146xb9724478(j(zVar, "frameSetRootPath is null"));
            return;
        }
        if (!(this.f399423a instanceof hq0.h)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBJsApiCreateFrameSetRoot", "only support starter biz");
            s().mo146xb9724478(j(zVar, "only support starter biz"));
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
        iq0.e eVar = new iq0.e(optString2, str, 0, 0, 12, null);
        java.lang.Object obj = this.f399423a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.magicbrush.plugin.scl.biz.IMagicCardStarterSclBiz");
        ((hq0.b0) ((hq0.h) obj)).R1(eVar, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBJsApiCreateFrameSetRoot", "createFrameSetRoot frameSetRootPath: ".concat(optString2));
        s().mo146xb9724478(k());
    }
}
