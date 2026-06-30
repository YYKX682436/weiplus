package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes15.dex */
public class h2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0100x4c79dc8d.SearchAutoComplete f91136d;

    public h2(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0100x4c79dc8d.SearchAutoComplete searchAutoComplete) {
        this.f91136d = searchAutoComplete;
    }

    @Override // java.lang.Runnable
    public void run() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0100x4c79dc8d.SearchAutoComplete searchAutoComplete = this.f91136d;
        if (searchAutoComplete.f90987i) {
            ((android.view.inputmethod.InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.f90987i = false;
        }
    }
}
