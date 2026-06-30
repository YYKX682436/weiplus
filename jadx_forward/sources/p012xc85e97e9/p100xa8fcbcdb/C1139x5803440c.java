package p012xc85e97e9.p100xa8fcbcdb;

/* renamed from: androidx.preference.DropDownPreference */
/* loaded from: classes13.dex */
public class C1139x5803440c extends p012xc85e97e9.p100xa8fcbcdb.C1142xedd26839 {

    /* renamed from: l1, reason: collision with root package name */
    public android.widget.Spinner f93262l1;

    /* renamed from: p1, reason: collision with root package name */
    public final android.widget.AdapterView.OnItemSelectedListener f93263p1;

    /* renamed from: y0, reason: collision with root package name */
    public final android.widget.ArrayAdapter f93264y0;

    public C1139x5803440c(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.p314xaae8f345.mm.R.C30857x2dd9f1.e_);
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb
    public void n() {
        super.n();
        this.f93264y0.notifyDataSetChanged();
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb
    public void s(p012xc85e97e9.p100xa8fcbcdb.f0 f0Var) {
        android.widget.Spinner spinner = (android.widget.Spinner) f0Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f568612nf4);
        this.f93262l1 = spinner;
        spinner.setAdapter((android.widget.SpinnerAdapter) this.f93264y0);
        this.f93262l1.setOnItemSelectedListener(this.f93263p1);
        android.widget.Spinner spinner2 = this.f93262l1;
        java.lang.String str = this.Z;
        java.lang.CharSequence[] charSequenceArr = this.Y;
        int i17 = -1;
        if (str != null && charSequenceArr != null) {
            int length = charSequenceArr.length - 1;
            while (true) {
                if (length < 0) {
                    break;
                }
                if (charSequenceArr[length].equals(str)) {
                    i17 = length;
                    break;
                }
                length--;
            }
        }
        spinner2.setSelection(i17);
        super.s(f0Var);
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.AbstractC1138x57e6e063, p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb
    public void t() {
        this.f93262l1.performClick();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1139x5803440c(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
        this.f93263p1 = new p012xc85e97e9.p100xa8fcbcdb.f(this);
        android.widget.ArrayAdapter arrayAdapter = new android.widget.ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item);
        this.f93264y0 = arrayAdapter;
        arrayAdapter.clear();
        java.lang.CharSequence[] charSequenceArr = this.X;
        if (charSequenceArr != null) {
            for (java.lang.CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }
}
