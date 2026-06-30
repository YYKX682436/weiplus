package qw3;

/* loaded from: classes9.dex */
public class y implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f448756d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f448757e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569 f448758f;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569 activityC17101x8420a569, android.widget.EditText editText, android.widget.EditText editText2) {
        this.f448758f = activityC17101x8420a569;
        this.f448756d = editText;
        this.f448757e = editText2;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        int length = editable.length();
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569 activityC17101x8420a569 = this.f448758f;
        if (length == 0) {
            activityC17101x8420a569.f238011e.m83173x1e821d71().m75915x984ee11e(activityC17101x8420a569.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aew));
        }
        activityC17101x8420a569.f238012f.m83191x6bcad98a(true);
        activityC17101x8420a569.f238010J = false;
        activityC17101x8420a569.f238013g.setClickable(true);
        if (!activityC17101x8420a569.H || activityC17101x8420a569.f238019p == null) {
            activityC17101x8420a569.H = true;
        } else {
            activityC17101x8420a569.f238020q.getFilter().filter(editable.toString(), activityC17101x8420a569.f238021r);
        }
        if (activityC17101x8420a569.I) {
            activityC17101x8420a569.f238012f.d();
            activityC17101x8420a569.f238013g.d();
            activityC17101x8420a569.f238015i.setImageBitmap(null);
            activityC17101x8420a569.f238014h.d();
            activityC17101x8420a569.f238014h.setVisibility(8);
            activityC17101x8420a569.Z6();
            activityC17101x8420a569.f238029z = "";
            activityC17101x8420a569.A = "";
            activityC17101x8420a569.f238027x = "";
            activityC17101x8420a569.F = null;
            activityC17101x8420a569.E = null;
        }
        activityC17101x8420a569.e7();
        activityC17101x8420a569.I = false;
        if (activityC17101x8420a569.R) {
            int m83174xbad2461a = activityC17101x8420a569.f238011e.m83174xbad2461a();
            int i17 = activityC17101x8420a569.f238025v;
            if (m83174xbad2461a <= i17) {
                activityC17101x8420a569.f238011e.m83207x214db04e(i17);
                activityC17101x8420a569.f238011e.m83198x7e4f2d39(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(activityC17101x8420a569.f238025v)});
            }
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        android.widget.EditText editText;
        if (charSequence != null && charSequence.toString().substring(i17, i19 + i17).equals("\n")) {
            android.widget.EditText editText2 = this.f448756d;
            if (editText2 != null) {
                editText2.setText(charSequence.toString().replaceFirst("\n", ""));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569 activityC17101x8420a569 = this.f448758f;
            android.widget.ListView listView = activityC17101x8420a569.f238019p;
            if (listView != null) {
                listView.setVisibility(8);
            }
            if (activityC17101x8420a569.f238010J || (editText = this.f448757e) == null) {
                return;
            }
            editText.requestFocus();
        }
    }
}
