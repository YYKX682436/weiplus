package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff;

/* loaded from: classes7.dex */
public final class c {
    public c(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.lang.String a() {
        x46.a aVar = new x46.a();
        byte[] byteArray = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.d.f169693b.toByteArray();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(byteArray, "toByteArray(...)");
        int length = byteArray.length;
        int i17 = 0;
        while (true) {
            java.lang.String str = "0";
            if (i17 >= length) {
                break;
            }
            java.lang.String valueOf = java.lang.String.valueOf((int) byteArray[i17]);
            if (!(valueOf.length() == 0)) {
                str = valueOf;
            }
            aVar.c(str);
            i17++;
        }
        return aVar.f533473e == 0 ? "0" : aVar.m175002x9616526c();
    }
}
