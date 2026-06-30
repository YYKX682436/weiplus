package a0;

/* loaded from: classes14.dex */
public final class v2 extends a0.t2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(android.widget.Magnifier magnifier) {
        super(magnifier);
        kotlin.jvm.internal.o.g(magnifier, "magnifier");
    }

    @Override // a0.t2, a0.r2
    public void a(long j17, long j18, float f17) {
        boolean isNaN = java.lang.Float.isNaN(f17);
        android.widget.Magnifier magnifier = this.f298a;
        if (!isNaN) {
            magnifier.setZoom(f17);
        }
        if (d1.f.c(j18)) {
            magnifier.show(d1.e.c(j17), d1.e.d(j17), d1.e.c(j18), d1.e.d(j18));
        } else {
            magnifier.show(d1.e.c(j17), d1.e.d(j17));
        }
    }
}
