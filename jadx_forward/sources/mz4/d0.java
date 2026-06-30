package mz4;

/* loaded from: classes12.dex */
public class d0 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a f414804d;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a) {
        this.f414804d = c19515x154ec45a;
    }

    @Override // android.text.TextWatcher
    public synchronized void afterTextChanged(android.text.Editable editable) {
        java.lang.String obj = editable.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a = this.f414804d;
        java.lang.String str = c19515x154ec45a.A;
        if (str == null) {
            str = "";
        }
        if (c19515x154ec45a.C != 0) {
            c19515x154ec45a.A = "";
        }
        if (!c19515x154ec45a.f269654w && c19515x154ec45a.m74973x9925e2d6().f414883d == this.f414804d.m74973x9925e2d6().f414884e && (((!str.endsWith("\n") && str.concat("\n").equals(obj)) || (str.endsWith("\n") && !str.endsWith("\n\n") && str.equals(obj))) && ((android.text.style.ParagraphStyle[]) this.f414804d.getText().getSpans(str.length(), str.length(), android.text.style.ParagraphStyle.class)).length > 0)) {
            int selectionStart = this.f414804d.getSelectionStart();
            com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a2 = this.f414804d;
            c19515x154ec45a2.f269654w = true;
            c19515x154ec45a2.getText().append((java.lang.CharSequence) "\n");
            com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a3 = this.f414804d;
            c19515x154ec45a3.f269654w = false;
            c19515x154ec45a3.setSelection(selectionStart);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a4 = this.f414804d;
        if (c19515x154ec45a4.f269649r != null && !c19515x154ec45a4.f269654w && !str.equals(obj)) {
            android.text.Spannable v17 = this.f414804d.v();
            com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a5 = this.f414804d;
            c19515x154ec45a5.A = obj;
            ((mz4.j0) c19515x154ec45a5.f269649r).h(c19515x154ec45a5, c19515x154ec45a5.B, v17, c19515x154ec45a5.f269655x, c19515x154ec45a5.f269657y, c19515x154ec45a5.getSelectionStart(), this.f414804d.getSelectionEnd());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a6 = this.f414804d;
        c19515x154ec45a6.I = true;
        c19515x154ec45a6.getClass();
        this.f414804d.m74963x97e02678(false);
        this.f414804d.t();
    }

    @Override // android.text.TextWatcher
    public synchronized void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a = this.f414804d;
        java.lang.String str = c19515x154ec45a.f269659z;
        if (str == null) {
            str = "";
        }
        if (!c19515x154ec45a.f269654w && !charSequence.toString().equals(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a2 = this.f414804d;
            c19515x154ec45a2.f269655x = c19515x154ec45a2.getSelectionStart();
            com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a3 = this.f414804d;
            c19515x154ec45a3.f269657y = c19515x154ec45a3.getSelectionEnd();
            this.f414804d.f269659z = charSequence.toString();
            com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a4 = this.f414804d;
            c19515x154ec45a4.A = c19515x154ec45a4.f269659z;
            c19515x154ec45a4.B = c19515x154ec45a4.v();
        }
    }

    @Override // android.text.TextWatcher
    public synchronized void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        this.f414804d.I = true;
    }
}
