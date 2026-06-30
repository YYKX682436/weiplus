package ot5;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final ot5.h f430410a = new ot5.h();

    public final boolean a(java.lang.String str, java.lang.String str2, java.lang.String tag, boolean z17) {
        byte[] bytes;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        byte[] bArr4 = null;
        boolean z18 = false;
        if (str2 != null) {
            try {
                bytes = str2.getBytes(r26.c.f450398a);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            } catch (java.lang.Exception unused) {
            }
        } else {
            bytes = null;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.g b17 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bytes);
        b17.f(16);
        java.lang.String b18 = ot5.e.b(b17.g());
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, b18);
        try {
        } catch (java.lang.Exception unused2) {
            z18 = z19;
        }
        if (z19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, "checkDeviceUUID, deviceUUId[" + str + "], localDeviceUUId[" + b18 + ']');
            return z19;
        }
        if (str != null) {
            bArr = str.getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bArr, "getBytes(...)");
        } else {
            bArr = null;
        }
        byte[] decode = android.util.Base64.decode(bArr, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decode, "decode(...)");
        java.nio.charset.Charset charset = r26.c.f450398a;
        java.lang.String str3 = new java.lang.String(decode, charset);
        if (str2 != null) {
            bArr2 = str2.getBytes(charset);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bArr2, "getBytes(...)");
        } else {
            bArr2 = null;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.g b19 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr2);
        b19.f(16);
        byte[] bArr5 = b19.f273689a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bArr5, "getBytes(...)");
        java.lang.String str4 = new java.lang.String(bArr5, charset);
        boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, str4);
        if (!z27) {
            try {
                str4 = android.util.Base64.encodeToString(b17.g(), 2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, "encodeToString(...)");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, str4)) {
                    z27 = false;
                }
                z27 = true;
            } catch (java.lang.Exception unused3) {
                z18 = z27;
            }
        }
        if (!z27 && z17 && str != null) {
            if (str2 != null) {
                bArr3 = str2.getBytes(charset);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bArr3, "getBytes(...)");
            } else {
                bArr3 = null;
            }
            str4 = android.util.Base64.encodeToString(bArr3, 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, "encodeToString(...)");
            if (str.length() > 0) {
                java.lang.String substring = str.substring(0, java.lang.Math.max(0, str.length() - 10));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                if (r26.n0.B(str4, substring, false)) {
                    z27 = true;
                }
            }
            z27 = false;
        }
        if (z27) {
            z18 = z27;
        } else {
            if (str2 != null) {
                bArr4 = str2.getBytes(charset);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bArr4, "getBytes(...)");
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g b27 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr4);
            b27.f(16);
            str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(b27.f273689a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, "encodeHexString(...)");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, str4)) {
                    z18 = true;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, "checkDeviceID, deviceId[" + str + "], localDeviceId[" + str4 + "], ret: " + z18);
        return z18;
    }
}
