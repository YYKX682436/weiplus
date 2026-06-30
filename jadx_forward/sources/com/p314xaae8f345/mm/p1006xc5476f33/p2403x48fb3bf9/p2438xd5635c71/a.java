package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f269270a = new java.util.HashMap();

    public static final java.lang.String a(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        try {
            java.lang.String host = android.net.Uri.parse(str).getHost();
            return host == null ? "unknow" : host;
        } catch (java.lang.Exception unused) {
            return "unknow";
        }
    }

    public static final int b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.u3 u3Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(u3Var, "<this>");
        java.util.HashMap hashMap = f269270a;
        java.lang.Integer num = (java.lang.Integer) hashMap.get(u3Var.b());
        if (num == null) {
            num = java.lang.Integer.valueOf(new cl0.g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.v3.a(u3Var, "/meta.json")).optInt("version"));
            int intValue = num.intValue();
            java.lang.String b17 = u3Var.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getPkgPath(...)");
            hashMap.put(b17, java.lang.Integer.valueOf(intValue));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("pkgVersion", "getPkgVersion pkgPath=" + u3Var.b() + ", pkgVersion=" + intValue);
        }
        return num.intValue();
    }

    public static final java.lang.String c(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        return "'" + u46.k.a(str) + '\'';
    }
}
