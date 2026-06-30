package db5;

/* loaded from: classes8.dex */
public class q9 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21535xbb7029d1 f310018d;

    public q9(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21535xbb7029d1 c21535xbb7029d1) {
        this.f310018d = c21535xbb7029d1;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21535xbb7029d1 c21535xbb7029d1 = this.f310018d;
        c21535xbb7029d1.f279263m = true;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21535xbb7029d1.a(c21535xbb7029d1);
    }
}
