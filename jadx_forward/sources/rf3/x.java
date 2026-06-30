package rf3;

/* loaded from: classes12.dex */
public final class x extends sf3.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1856x5faa95b.C16491xb6370bb4 f476547a;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1856x5faa95b.C16491xb6370bb4 c16491xb6370bb4) {
        this.f476547a = c16491xb6370bb4;
    }

    @Override // sf3.j
    public void a(sf3.g param, sf3.i result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(param, "param");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1856x5faa95b.C16491xb6370bb4 c16491xb6370bb4 = this.f476547a;
        android.graphics.Bitmap bitmap = result.f488926a;
        if (bitmap == null) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1856x5faa95b.C16491xb6370bb4.f230094i;
            c16491xb6370bb4.h("onLoadFinish but bmp null", new java.lang.Object[0]);
        } else {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1856x5faa95b.C16491xb6370bb4.f230094i;
            c16491xb6370bb4.f(bitmap);
        }
    }

    @Override // sf3.j
    public void b(sf3.g param, com.p314xaae8f345.mm.p786x600aa8b.C10724x2c46e1f5 options) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(param, "param");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(options, "options");
        rf3.v vVar = this.f476547a.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String();
        if (vVar != null) {
            vVar.r(((android.graphics.BitmapFactory.Options) options).outWidth, ((android.graphics.BitmapFactory.Options) options).outHeight);
        }
    }
}
