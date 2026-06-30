package fm3;

/* loaded from: classes10.dex */
public interface n {
    static /* synthetic */ void b(fm3.n nVar, android.widget.ImageView imageView, f60.a aVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: attachThumb");
        }
        if ((i17 & 2) != 0) {
            aVar = null;
        }
        nVar.a(imageView, aVar);
    }

    void a(android.widget.ImageView imageView, f60.a aVar);
}
