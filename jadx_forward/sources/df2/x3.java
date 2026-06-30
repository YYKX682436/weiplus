package df2;

/* loaded from: classes3.dex */
public final class x3 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.d4 f313288d;

    public x3(df2.d4 d4Var) {
        this.f313288d = d4Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        cm2.m0 m0Var = (cm2.m0) obj;
        df2.d4 d4Var = this.f313288d;
        android.view.View h17 = d4Var.h();
        android.widget.TextView textView = h17 != null ? (android.widget.TextView) h17.findViewById(com.p314xaae8f345.mm.R.id.rfo) : null;
        if (textView == null) {
            return;
        }
        textView.setText(m0Var == null ? d4Var.O6().getString(com.p314xaae8f345.mm.R.C30867xcad56011.moz) : d4Var.O6().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573374mp0, java.lang.Integer.valueOf(m0Var.f124901v.m75939xb282bd08(12)), m0Var.f124903x));
    }
}
