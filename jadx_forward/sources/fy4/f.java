package fy4;

/* loaded from: classes12.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final fy4.f f348794a = new fy4.f();

    public final java.lang.String a(java.lang.String imgPath, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imgPath, "imgPath");
        android.graphics.Bitmap J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(imgPath, null);
        if (J2 == null || J2.isRecycled()) {
            return "";
        }
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            try {
                J2.compress(android.graphics.Bitmap.CompressFormat.JPEG, 90, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                java.lang.String encodeToString = android.util.Base64.encodeToString(byteArray, i17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewInputConnectionUtil", "rawData length = %d, base64 length = %d", java.lang.Integer.valueOf(byteArray.length), java.lang.Integer.valueOf(encodeToString.length()));
                vz5.b.a(byteArrayOutputStream, null);
                return encodeToString;
            } finally {
            }
        } finally {
            J2.recycle();
        }
    }

    public final java.lang.String b(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb oInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oInfo, "oInfo");
        r45.ri0 ri0Var = new r45.ri0();
        ri0Var.f466419d = oInfo.mo42933xb5885648();
        ri0Var.f466420e = oInfo.l0();
        ri0Var.f466421f = oInfo.l();
        ri0Var.f466422g = oInfo.X0();
        ri0Var.f466423h = oInfo.J1();
        ri0Var.f466424i = oInfo.mo42927x1061ea06();
        ri0Var.f466425m = oInfo.mo42930x4f4a97c4();
        ri0Var.f466426n = oInfo.Z();
        ri0Var.f466427o = oInfo.g1();
        ri0Var.f466428p = oInfo.S0();
        ri0Var.f466429q = oInfo.q0();
        ri0Var.f466430r = oInfo.k0();
        ri0Var.f466431s = oInfo.H1();
        try {
            java.lang.String encodeToString = android.util.Base64.encodeToString(ri0Var.mo14344x5f01b1f6(), 2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(encodeToString, "encodeToString(...)");
            return encodeToString;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebviewInputConnectionUtil", e17, "failed to encode emojiInfo.", new java.lang.Object[0]);
            return "";
        }
    }
}
