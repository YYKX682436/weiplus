package nl5;

/* loaded from: classes15.dex */
public class t implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2758x5f8b9e37.C22695xac2d47d6 f419909d;

    public t(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2758x5f8b9e37.C22695xac2d47d6 c22695xac2d47d6) {
        this.f419909d = c22695xac2d47d6;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2758x5f8b9e37.C22695xac2d47d6 c22695xac2d47d6 = this.f419909d;
        if (c22695xac2d47d6.f293609d) {
            c22695xac2d47d6.f293609d = false;
            c22695xac2d47d6.f293614i = c22695xac2d47d6.f293611f;
            c22695xac2d47d6.f293613h = c22695xac2d47d6.f293612g;
            java.util.Iterator it = c22695xac2d47d6.f293619q.iterator();
            while (it.hasNext()) {
                ((nl5.u) it.next()).a(editable, c22695xac2d47d6.f293612g, c22695xac2d47d6.f293610e, c22695xac2d47d6.f293611f);
            }
        }
        int length = editable.length() - c22695xac2d47d6.f293616n.length();
        if (!c22695xac2d47d6.f293615m && length >= 10) {
            c22695xac2d47d6.f293615m = true;
        }
        if (length >= 10) {
            ((java.util.ArrayList) c22695xac2d47d6.f293617o).add(java.lang.Integer.valueOf(length));
        }
        c22695xac2d47d6.f293616n = editable.toString();
        java.util.Iterator it6 = c22695xac2d47d6.f293618p.iterator();
        while (it6.hasNext()) {
            ((android.text.TextWatcher) it6.next()).afterTextChanged(editable);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        java.util.Iterator it = this.f419909d.f293618p.iterator();
        while (it.hasNext()) {
            ((android.text.TextWatcher) it.next()).beforeTextChanged(charSequence, i17, i18, i19);
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2758x5f8b9e37.C22695xac2d47d6 c22695xac2d47d6 = this.f419909d;
        c22695xac2d47d6.f293610e = i17;
        c22695xac2d47d6.f293611f = i19;
        c22695xac2d47d6.f293612g = charSequence.subSequence(i17, i17 + i19);
        java.util.Iterator it = c22695xac2d47d6.f293618p.iterator();
        while (it.hasNext()) {
            ((android.text.TextWatcher) it.next()).onTextChanged(charSequence, i17, i18, i19);
        }
    }
}
