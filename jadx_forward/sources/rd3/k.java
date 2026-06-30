package rd3;

/* loaded from: classes.dex */
public final class k extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "showToast";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
        java.lang.String optString2 = data.optString("icon", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString2, "optString(...)");
        if (optString.length() == 0) {
            s().mo146xb9724478(h(1, "title can not empty!"));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBJsApiShowToast", "title:" + optString + " icon:" + optString2);
        int hashCode = optString2.hashCode();
        if (hashCode == -1867169789) {
            if (optString2.equals(ya.b.f77504xbb80cbe3)) {
                db5.t7.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, optString);
            }
            db5.t7.m(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, optString);
        } else if (hashCode != 3387192) {
            if (hashCode == 96784904 && optString2.equals("error")) {
                db5.t7.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, optString);
            }
            db5.t7.m(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, optString);
        } else {
            if (optString2.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37138xa03a0bfc)) {
                db5.t7.m(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, optString);
            }
            db5.t7.m(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, optString);
        }
        s().mo146xb9724478(k());
    }
}
