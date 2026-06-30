package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class s1 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.SearchView f9699d;

    public s1(androidx.appcompat.widget.SearchView searchView) {
        this.f9699d = searchView;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        androidx.appcompat.widget.SearchView searchView = this.f9699d;
        android.text.Editable text = searchView.f9441v.getText();
        searchView.f9445x1 = text;
        boolean z17 = !android.text.TextUtils.isEmpty(text);
        searchView.x(z17);
        boolean z18 = !z17;
        int i27 = 8;
        if (searchView.f9440p1 && !searchView.U && z18) {
            searchView.A.setVisibility(8);
            i27 = 0;
        }
        searchView.C.setVisibility(i27);
        searchView.t();
        searchView.w();
        charSequence.toString();
    }
}
