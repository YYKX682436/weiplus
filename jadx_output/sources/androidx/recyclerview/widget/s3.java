package androidx.recyclerview.widget;

/* loaded from: classes15.dex */
public class s3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.StaggeredGridLayoutManager f12219d;

    public s3(androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f12219d = staggeredGridLayoutManager;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f12219d.n();
    }
}
