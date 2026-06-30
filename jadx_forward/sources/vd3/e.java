package vd3;

/* loaded from: classes7.dex */
public class e extends vd3.d {
    @Override // vd3.d, lc3.b0
    public void t(lc3.a0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.util.HashMap a17 = this.f517591f.a();
        a17.putAll(u());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getConfiguration().orientation == 2) {
            java.lang.Object obj = a17.get("screenWidth");
            java.lang.Object obj2 = a17.get("screenHeight");
            if (a17.containsKey("screenWidth") && a17.containsKey("screenHeight") && a17.containsKey("windowWidth") && a17.containsKey("windowHeight")) {
                a17.put("screenWidth", obj2);
                a17.put("screenHeight", obj);
                a17.put("windowWidth", obj2);
                a17.put("windowHeight", obj);
            }
        }
        s().mo146xb9724478(l(a17));
    }
}
