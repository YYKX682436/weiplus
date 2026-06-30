package androidx.fragment.app;

/* loaded from: classes8.dex */
public class d3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.ListFragment f11307d;

    public d3(androidx.fragment.app.ListFragment listFragment) {
        this.f11307d = listFragment;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.ListView listView = this.f11307d.f11244h;
        listView.focusableViewAvailable(listView);
    }
}
