package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public class k6 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.n6 f81903a;

    public k6(com.tencent.mm.plugin.appbrand.jsapi.media.n6 n6Var) {
        this.f81903a = n6Var;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        java.lang.String[] strArr;
        com.tencent.mm.plugin.appbrand.jsapi.media.n6 n6Var = this.f81903a;
        if (n6Var.f81951g != i17) {
            return false;
        }
        if (n6Var.f81952h.isEmpty()) {
            return true;
        }
        synchronized (this.f81903a.f81954m) {
            strArr = (java.lang.String[]) this.f81903a.f81952h.toArray(new java.lang.String[0]);
        }
        for (java.lang.String str : strArr) {
            try {
                com.tencent.mm.vfs.w6.h(str);
            } catch (java.lang.Exception unused) {
            }
        }
        return true;
    }
}
