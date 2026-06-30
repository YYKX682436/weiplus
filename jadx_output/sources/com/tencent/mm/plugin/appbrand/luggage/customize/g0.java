package com.tencent.mm.plugin.appbrand.luggage.customize;

/* loaded from: classes7.dex */
public class g0 extends qd.c {
    @Override // qd.c, o91.a
    public boolean a(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        java.lang.String lowerCase = str.toLowerCase();
        return lowerCase.startsWith("http://") || lowerCase.startsWith("https://");
    }

    @Override // qd.a, o91.a
    public void b(java.lang.String str, java.util.Map map, o91.c cVar) {
        l01.d0.f314761a.p(str, map, new com.tencent.mm.plugin.appbrand.luggage.customize.f0(this, cVar));
    }

    @Override // qd.c, o91.a
    public android.graphics.Bitmap c(java.lang.String str, android.graphics.Rect rect, o91.b bVar) {
        if (!a(str)) {
            return null;
        }
        zg1.a aVar = rect != null ? new zg1.a(rect.left, rect.top, rect.width(), rect.height()) : null;
        l01.b bVar2 = l01.d0.f314761a;
        android.graphics.Bitmap f17 = bVar2.f(str, aVar);
        if (f17 == null) {
            bVar2.n(new com.tencent.mm.plugin.appbrand.luggage.customize.e0(this, bVar), str, null, aVar);
        }
        return f17;
    }
}
