package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class h2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.SearchView.SearchAutoComplete f9603d;

    public h2(androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete) {
        this.f9603d = searchAutoComplete;
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = this.f9603d;
        if (searchAutoComplete.f9454i) {
            ((android.view.inputmethod.InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.f9454i = false;
        }
    }
}
