package androidx.appcompat.widget;

/* loaded from: classes13.dex */
public class u1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.SearchView f9727d;

    public u1(androidx.appcompat.widget.SearchView searchView) {
        this.f9727d = searchView;
    }

    @Override // java.lang.Runnable
    public void run() {
        r3.c cVar = this.f9727d.V;
        if (cVar == null || !(cVar instanceof androidx.appcompat.widget.k2)) {
            return;
        }
        cVar.c(null);
    }
}
