package rf4;

/* loaded from: classes5.dex */
public final class h1 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18484xfde93083 f476592d;

    public h1(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18484xfde93083 c18484xfde93083) {
        this.f476592d = c18484xfde93083;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18484xfde93083 c18484xfde93083 = this.f476592d;
        if (editable == null) {
            c18484xfde93083.f253528s = false;
            c18484xfde93083.f253521i.setVisibility(8);
            return;
        }
        int length = editable.length();
        int i17 = 60 - length;
        c18484xfde93083.f253528s = (editable.length() > 0) && i17 >= 0 && c18484xfde93083.f253519g.getLineCount() <= 10;
        if (length < 55) {
            c18484xfde93083.f253521i.setVisibility(8);
            return;
        }
        c18484xfde93083.f253521i.setVisibility(0);
        c18484xfde93083.f253521i.setText(java.lang.String.valueOf(i17));
        if (i17 >= 0) {
            c18484xfde93083.f253521i.setTextColor(c18484xfde93083.f253529t);
        } else {
            c18484xfde93083.f253521i.setTextColor(c18484xfde93083.f253530u);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
