package yg0;

@j95.b
/* loaded from: classes8.dex */
public class s4 extends i95.w implements zg0.q3 {
    public java.lang.String wi(java.lang.String str) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.i6 i6Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.f273141a;
        if (str != null && str.startsWith("Refused to frame")) {
            java.lang.String[] split = str.split("'");
            if (split.length > 2) {
                return split[1];
            }
        }
        return "";
    }
}
