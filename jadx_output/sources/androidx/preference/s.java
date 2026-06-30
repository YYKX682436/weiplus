package androidx.preference;

/* loaded from: classes13.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.preference.PreferenceFragmentCompat f11837d;

    public s(androidx.preference.PreferenceFragmentCompat preferenceFragmentCompat) {
        this.f11837d = preferenceFragmentCompat;
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f11837d.f11776e;
        recyclerView.focusableViewAvailable(recyclerView);
    }
}
