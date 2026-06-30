package wu3;

/* loaded from: classes10.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f531319a;

    /* renamed from: b, reason: collision with root package name */
    public long f531320b;

    public o0(java.util.List editorItems) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editorItems, "editorItems");
        this.f531319a = editorItems;
    }

    public final long a(android.graphics.Canvas canvas, android.graphics.Paint paint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        java.util.List<av3.a> list = this.f531319a;
        if (list.size() <= 0) {
            return 0L;
        }
        long j17 = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        for (av3.a aVar : list) {
            long a17 = aVar.a(this.f531320b);
            aVar.c(canvas, paint);
            if (a17 < j17) {
                j17 = a17;
            }
        }
        this.f531320b = j17;
        return j17;
    }
}
