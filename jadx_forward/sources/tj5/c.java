package tj5;

/* loaded from: classes8.dex */
public class c implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 f501369d;

    public c(com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 c22479x68a26381) {
        this.f501369d = c22479x68a26381;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 c22479x68a26381 = this.f501369d;
        java.lang.String m80978xc3706fda = c22479x68a26381.m80978xc3706fda();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSEditTextView", "[hitest] onTextChanged, query=%s, lastText=%s, textChangeStatus=%s, hasFocus=%s", m80978xc3706fda, c22479x68a26381.f291363x, c22479x68a26381.G, java.lang.Boolean.valueOf(c22479x68a26381.f291349g.hasFocus()));
        java.lang.String str = c22479x68a26381.f291363x;
        if (m80978xc3706fda == str || m80978xc3706fda.equals(str)) {
            return;
        }
        c22479x68a26381.f291363x = m80978xc3706fda;
        if (c22479x68a26381.f291359t) {
            return;
        }
        if (m80978xc3706fda.length() > 0) {
            c22479x68a26381.f291348f.setVisibility(0);
        } else {
            c22479x68a26381.f291348f.setVisibility(8);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSEditTextView", "[hitest] onTextChanged -> onEditTextChange, textChangeStatus=%s", c22479x68a26381.G);
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381.a(c22479x68a26381);
    }
}
