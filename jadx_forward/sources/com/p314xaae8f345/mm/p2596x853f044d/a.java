package com.p314xaae8f345.mm.p2596x853f044d;

/* loaded from: classes12.dex */
public class a implements com.p314xaae8f345.mm.p2596x853f044d.c {
    public final void a(int i17, java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr) {
        java.lang.String str3;
        java.lang.String str4 = "[@" + new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", java.util.Locale.ENGLISH).format(new java.util.Date()) + "|" + com.p314xaae8f345.mm.p2596x853f044d.g.f273878a + "]";
        if (objArr == null || objArr.length == 0) {
            str3 = str4 + str2;
        } else {
            str3 = str4 + java.lang.String.format(str2, objArr);
        }
        if (th6 != null) {
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            java.io.PrintWriter printWriter = new java.io.PrintWriter(stringWriter);
            th6.printStackTrace(printWriter);
            printWriter.flush();
            str3 = str3 + "\n" + stringWriter.toString();
            printWriter.close();
        }
        boolean[] zArr = com.p314xaae8f345.mm.p2596x853f044d.g.f273880c;
        synchronized (zArr) {
            if (zArr[0]) {
                com.p314xaae8f345.mm.p2596x853f044d.g.a(i17, str, str3);
            } else if (i17 != 3) {
                com.p314xaae8f345.mm.p2596x853f044d.C20975x5e37b436 c20975x5e37b436 = com.p314xaae8f345.mm.p2596x853f044d.g.f273881d;
                c20975x5e37b436.getClass();
                c20975x5e37b436.f273871e.add(new com.p314xaae8f345.mm.p2596x853f044d.f(i17, str, str3));
            }
        }
    }
}
