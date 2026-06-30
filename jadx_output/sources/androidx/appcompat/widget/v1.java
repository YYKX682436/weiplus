package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class v1 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.SearchView f9731d;

    public v1(androidx.appcompat.widget.SearchView searchView) {
        this.f9731d = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        androidx.appcompat.widget.SearchView searchView = this.f9731d;
        android.view.View.OnFocusChangeListener onFocusChangeListener = searchView.R;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z17);
        }
    }
}
