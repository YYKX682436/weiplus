package al5;

/* loaded from: classes14.dex */
public class l1 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMEditText f5944d;

    public l1(com.tencent.mm.ui.widget.MMEditText mMEditText) {
        this.f5944d = mMEditText;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        int i27 = b85.e.f18347e0;
        b85.e eVar = (b85.e) i95.n0.c(b85.e.class);
        if (eVar != null ? eVar.isEvilTraceNow() : false) {
            this.f5944d.post(new java.lang.Runnable() { // from class: al5.l1$$a
                @Override // java.lang.Runnable
                public final void run() {
                    al5.l1 l1Var = al5.l1.this;
                    l1Var.getClass();
                    ((com.tencent.mm.accessibility.feature.IAccessibilityService) i95.n0.c(com.tencent.mm.accessibility.feature.IAccessibilityService.class)).onEvilTextChange();
                    l1Var.f5944d.setText("");
                }
            });
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
