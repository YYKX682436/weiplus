package zh5;

/* loaded from: classes12.dex */
public final class e0 implements sf3.c {

    /* renamed from: a, reason: collision with root package name */
    public final kk.j f554553a = new jt0.i(10, zh5.e0.class);

    @Override // sf3.c
    public android.graphics.Bitmap a(sf3.g param) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(param, "param");
        return (android.graphics.Bitmap) ((jt0.i) this.f554553a).get(param.c());
    }

    @Override // sf3.c
    public void b(sf3.g param, android.graphics.Bitmap bitmap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(param, "param");
        if (bitmap == null) {
            return;
        }
        ((jt0.i) this.f554553a).put(param.c(), bitmap);
    }
}
