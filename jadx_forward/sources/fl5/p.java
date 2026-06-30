package fl5;

/* loaded from: classes15.dex */
public class p implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.api.C22664x9cc02e6d f345493d;

    public p(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.api.C22664x9cc02e6d c22664x9cc02e6d) {
        this.f345493d = c22664x9cc02e6d;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.api.C22664x9cc02e6d c22664x9cc02e6d = this.f345493d;
        if (c22664x9cc02e6d.f293099v2) {
            c22664x9cc02e6d.f293099v2 = false;
            c22664x9cc02e6d.A2 = c22664x9cc02e6d.f293101x2;
            c22664x9cc02e6d.f293103z2 = c22664x9cc02e6d.f293102y2;
            java.util.Iterator it = c22664x9cc02e6d.F2.iterator();
            if (it.hasNext()) {
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
                java.lang.CharSequence charSequence = c22664x9cc02e6d.f293102y2;
                int i17 = c22664x9cc02e6d.f293100w2;
                int i18 = c22664x9cc02e6d.f293101x2;
                throw null;
            }
        }
        int length = editable.length() - c22664x9cc02e6d.C2.length();
        if (!c22664x9cc02e6d.B2 && length >= 10) {
            c22664x9cc02e6d.B2 = true;
        }
        if (length >= 10) {
            c22664x9cc02e6d.D2.add(java.lang.Integer.valueOf(length));
        }
        c22664x9cc02e6d.C2 = editable.toString();
        java.util.Iterator it6 = c22664x9cc02e6d.E2.iterator();
        while (it6.hasNext()) {
            ((android.text.TextWatcher) it6.next()).afterTextChanged(editable);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        java.util.Iterator it = this.f345493d.E2.iterator();
        while (it.hasNext()) {
            ((android.text.TextWatcher) it.next()).beforeTextChanged(charSequence, i17, i18, i19);
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.api.C22664x9cc02e6d c22664x9cc02e6d = this.f345493d;
        c22664x9cc02e6d.f293100w2 = i17;
        c22664x9cc02e6d.f293101x2 = i19;
        c22664x9cc02e6d.f293102y2 = charSequence.subSequence(i17, i17 + i19);
        java.util.Iterator it = c22664x9cc02e6d.E2.iterator();
        while (it.hasNext()) {
            ((android.text.TextWatcher) it.next()).onTextChanged(charSequence, i17, i18, i19);
        }
    }
}
