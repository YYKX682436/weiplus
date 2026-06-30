package androidx.preference;

/* loaded from: classes13.dex */
public class DropDownPreference extends androidx.preference.ListPreference {

    /* renamed from: l1, reason: collision with root package name */
    public android.widget.Spinner f11729l1;

    /* renamed from: p1, reason: collision with root package name */
    public final android.widget.AdapterView.OnItemSelectedListener f11730p1;

    /* renamed from: y0, reason: collision with root package name */
    public final android.widget.ArrayAdapter f11731y0;

    public DropDownPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.tencent.mm.R.attr.e_);
    }

    @Override // androidx.preference.Preference
    public void n() {
        super.n();
        this.f11731y0.notifyDataSetChanged();
    }

    @Override // androidx.preference.Preference
    public void s(androidx.preference.f0 f0Var) {
        android.widget.Spinner spinner = (android.widget.Spinner) f0Var.itemView.findViewById(com.tencent.mm.R.id.f487079nf4);
        this.f11729l1 = spinner;
        spinner.setAdapter((android.widget.SpinnerAdapter) this.f11731y0);
        this.f11729l1.setOnItemSelectedListener(this.f11730p1);
        android.widget.Spinner spinner2 = this.f11729l1;
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

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public void t() {
        this.f11729l1.performClick();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropDownPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
        this.f11730p1 = new androidx.preference.f(this);
        android.widget.ArrayAdapter arrayAdapter = new android.widget.ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item);
        this.f11731y0 = arrayAdapter;
        arrayAdapter.clear();
        java.lang.CharSequence[] charSequenceArr = this.X;
        if (charSequenceArr != null) {
            for (java.lang.CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }
}
