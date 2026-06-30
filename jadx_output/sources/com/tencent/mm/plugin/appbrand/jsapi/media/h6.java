package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public class h6 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f81836a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.i6 f81837b;

    public h6(com.tencent.mm.plugin.appbrand.jsapi.media.i6 i6Var, java.lang.String[] strArr) {
        this.f81837b = i6Var;
        this.f81836a = strArr;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        int i19 = 0;
        if (this.f81837b.f81852g != i17) {
            return false;
        }
        while (true) {
            java.lang.String[] strArr = this.f81836a;
            if (i19 >= strArr.length) {
                return true;
            }
            try {
                com.tencent.mm.vfs.w6.h(strArr[i19]);
            } catch (java.lang.Exception unused) {
            }
            i19++;
        }
    }
}
