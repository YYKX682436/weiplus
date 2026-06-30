package zt;

/* loaded from: classes12.dex */
public final class e extends g75.t {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g75.r pipeline) {
        super(pipeline);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pipeline, "pipeline");
    }

    @Override // g75.t
    public void c() {
        d75.c cVar = (d75.c) h().d("Common_ImageViewRef");
        if (cVar != null) {
            d75.b.g(new zt.c(h().k("Common_ImageKey"), cVar));
        }
    }

    @Override // g75.t
    public void e() {
        java.lang.String k17 = h().k("Common_ImageKey");
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((jt0.i) m11.b1.Di().f404271e).i(k17);
        if (bitmap != null) {
            d75.b.g(new zt.d(k17, this, bitmap));
        }
    }
}
