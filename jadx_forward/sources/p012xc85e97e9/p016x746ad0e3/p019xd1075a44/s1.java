package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes15.dex */
public class s1 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0100x4c79dc8d f91232d;

    public s1(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0100x4c79dc8d c0100x4c79dc8d) {
        this.f91232d = c0100x4c79dc8d;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0100x4c79dc8d c0100x4c79dc8d = this.f91232d;
        android.text.Editable text = c0100x4c79dc8d.f90974v.getText();
        c0100x4c79dc8d.f90978x1 = text;
        boolean z17 = !android.text.TextUtils.isEmpty(text);
        c0100x4c79dc8d.x(z17);
        boolean z18 = !z17;
        int i27 = 8;
        if (c0100x4c79dc8d.f90973p1 && !c0100x4c79dc8d.U && z18) {
            c0100x4c79dc8d.A.setVisibility(8);
            i27 = 0;
        }
        c0100x4c79dc8d.C.setVisibility(i27);
        c0100x4c79dc8d.t();
        c0100x4c79dc8d.w();
        charSequence.toString();
    }
}
