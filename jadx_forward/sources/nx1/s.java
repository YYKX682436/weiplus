package nx1;

/* loaded from: classes12.dex */
public class s implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a f422854d;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a c13158x154ec45a) {
        this.f422854d = c13158x154ec45a;
    }

    @Override // android.text.TextWatcher
    public synchronized void afterTextChanged(android.text.Editable editable) {
        java.lang.String obj = editable.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a c13158x154ec45a = this.f422854d;
        java.lang.String str = c13158x154ec45a.f178142z;
        if (str == null) {
            str = "";
        }
        if (c13158x154ec45a.B != 0) {
            c13158x154ec45a.f178142z = "";
        }
        if (!c13158x154ec45a.f178136v && c13158x154ec45a.m54595x9925e2d6().f422848d == this.f422854d.m54595x9925e2d6().f422849e && (((!str.endsWith("\n") && str.concat("\n").equals(obj)) || (str.endsWith("\n") && !str.endsWith("\n\n") && str.equals(obj))) && ((android.text.style.ParagraphStyle[]) this.f422854d.getText().getSpans(str.length(), str.length(), android.text.style.ParagraphStyle.class)).length > 0)) {
            int selectionStart = this.f422854d.getSelectionStart();
            com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a c13158x154ec45a2 = this.f422854d;
            c13158x154ec45a2.f178136v = true;
            c13158x154ec45a2.getText().append((java.lang.CharSequence) "\n");
            com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a c13158x154ec45a3 = this.f422854d;
            c13158x154ec45a3.f178136v = false;
            c13158x154ec45a3.setSelection(selectionStart);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a c13158x154ec45a4 = this.f422854d;
        if (c13158x154ec45a4.f178132r != null && !c13158x154ec45a4.f178136v && !str.equals(obj)) {
            android.text.Spannable v17 = this.f422854d.v();
            com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a c13158x154ec45a5 = this.f422854d;
            c13158x154ec45a5.f178142z = obj;
            ((nx1.z) c13158x154ec45a5.f178132r).e(c13158x154ec45a5.C, c13158x154ec45a5.A, v17, c13158x154ec45a5.f178137w, c13158x154ec45a5.f178138x, c13158x154ec45a5.getSelectionStart(), this.f422854d.getSelectionEnd());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a c13158x154ec45a6 = this.f422854d;
        c13158x154ec45a6.I = true;
        c13158x154ec45a6.getClass();
        this.f422854d.m54586x97e02678(false);
        this.f422854d.t();
    }

    @Override // android.text.TextWatcher
    public synchronized void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a c13158x154ec45a = this.f422854d;
        java.lang.String str = c13158x154ec45a.f178140y;
        if (str == null) {
            str = "";
        }
        if (!c13158x154ec45a.f178136v && !charSequence.toString().equals(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a c13158x154ec45a2 = this.f422854d;
            c13158x154ec45a2.f178137w = c13158x154ec45a2.getSelectionStart();
            com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a c13158x154ec45a3 = this.f422854d;
            c13158x154ec45a3.f178138x = c13158x154ec45a3.getSelectionEnd();
            this.f422854d.f178140y = charSequence.toString();
            com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a c13158x154ec45a4 = this.f422854d;
            c13158x154ec45a4.f178142z = c13158x154ec45a4.f178140y;
            c13158x154ec45a4.A = c13158x154ec45a4.v();
        }
    }

    @Override // android.text.TextWatcher
    public synchronized void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        this.f422854d.I = true;
    }
}
