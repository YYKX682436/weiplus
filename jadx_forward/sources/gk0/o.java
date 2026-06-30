package gk0;

/* loaded from: classes11.dex */
public final class o extends g75.t {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(g75.r pipeline) {
        super(pipeline);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pipeline, "pipeline");
    }

    @Override // g75.t
    public void c() {
        d75.c cVar = (d75.c) h().d("Common_ImageViewRef");
        if (cVar != null) {
            d75.b.g(new gk0.m(h().k("Common_ImageKey"), cVar));
        }
    }

    @Override // g75.t
    public void e() {
        java.lang.String k17 = h().k("Common_ImageKey");
        android.graphics.Bitmap e17 = n11.a.b().e(k17);
        if (e17 != null) {
            d75.b.g(new gk0.n(k17, this, e17));
        }
    }
}
