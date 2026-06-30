package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad;

@j95.b
/* loaded from: classes7.dex */
public final class m5 extends i95.w implements com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d4 {
    public jc3.k0 Ai(java.lang.String instanceName, java.lang.String pkgPath, java.lang.String customName, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceName, "instanceName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgPath, "pkgPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(customName, "customName");
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.k kVar = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.k.f229512a;
        java.lang.String lowerCase = instanceName.toLowerCase(java.util.Locale.ROOT);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
        jc3.k0 k0Var = (jc3.k0) com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.k.f229513b.get(lowerCase);
        if (k0Var != null) {
            k0Var.Vf(pkgPath, customName, str);
        }
        return k0Var;
    }

    public java.lang.String Bi(java.lang.String instanceName, java.lang.String nonFlattenFilePath) {
        java.lang.String X3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceName, "instanceName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nonFlattenFilePath, "nonFlattenFilePath");
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.k kVar = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.k.f229512a;
        java.lang.String lowerCase = instanceName.toLowerCase(java.util.Locale.ROOT);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
        jc3.k0 k0Var = (jc3.k0) com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.k.f229513b.get(lowerCase);
        return (k0Var == null || (X3 = k0Var.X3(nonFlattenFilePath)) == null) ? "" : X3;
    }

    public bf3.p Di(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return new bf3.z(context);
    }

    public lc3.b0 Ni(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f jsapi, java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsapi, "jsapi");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return new bf3.q0(jsapi, appId);
    }

    public void wi(java.lang.String instanceName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceName, "instanceName");
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.k kVar = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.k.f229512a;
        java.lang.String lowerCase = instanceName.toLowerCase(java.util.Locale.ROOT);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
        java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.k.f229513b;
        if (hashMap.containsKey(lowerCase)) {
            jc3.k0 k0Var = (jc3.k0) hashMap.get(lowerCase);
            if (k0Var != null) {
                k0Var.s7(lowerCase);
                return;
            }
            return;
        }
        java.util.HashMap hashMap2 = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.k.f229514c;
        if (hashMap2.containsKey(lowerCase)) {
            jc3.k0 k0Var2 = (jc3.k0) hashMap2.get(lowerCase);
            if (k0Var2 != null) {
                k0Var2.s7(lowerCase);
            }
            synchronized (kVar) {
                hashMap2.remove(lowerCase);
            }
        }
    }
}
