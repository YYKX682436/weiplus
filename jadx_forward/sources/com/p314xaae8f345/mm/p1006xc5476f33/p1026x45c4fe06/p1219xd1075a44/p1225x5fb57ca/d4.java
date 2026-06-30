package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public final class d4 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f172932d = new java.util.concurrent.ConcurrentLinkedQueue();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4 f172933e;

    public d4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4 e4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.z3 z3Var) {
        this.f172933e = e4Var;
    }

    public final void a(java.lang.CharSequence charSequence, int i17, int i18, java.lang.Class cls) {
        android.text.SpannableStringBuilder spannableStringBuilder;
        java.lang.Object[] spans;
        try {
            if (!(charSequence instanceof android.text.SpannableStringBuilder) || (spans = (spannableStringBuilder = (android.text.SpannableStringBuilder) charSequence).getSpans(i17, i18 + i17, cls)) == null || spans.length <= 0) {
                return;
            }
            for (java.lang.Object obj : spans) {
                spannableStringBuilder.removeSpan(obj);
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        java.lang.String str;
        com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a = new com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4 e4Var = this.f172933e;
        e4Var.getClass();
        c19767x257d7f.f38864x6ac9171 = 0;
        c19762x487075a.f38859x6ac9171 = false;
        if (editable == null || editable.length() <= 0) {
            str = null;
        } else {
            str = editable.toString();
            int length = editable.length();
            for (int i17 = 0; i17 < length; i17++) {
                int codePointAt = str.codePointAt(i17);
                kl1.h hVar = (kl1.h) i95.n0.c(kl1.h.class);
                if (hVar == null) {
                    hVar = kl1.b.f390276a;
                }
                kl1.g v27 = hVar.v2(codePointAt);
                if (v27 != null && v27.f390280a != 0) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(java.lang.Character.toChars(v27.f390280a));
                    int i18 = v27.f390281b;
                    sb6.append(i18 != 0 ? java.lang.Character.toChars(i18) : "");
                    str = str.replace(new java.lang.String(java.lang.Character.toChars(codePointAt)), sb6.toString());
                    c19762x487075a.f38859x6ac9171 = true;
                    c19767x257d7f.f38864x6ac9171++;
                }
            }
        }
        java.lang.String str2 = str;
        int i19 = c19767x257d7f.f38864x6ac9171;
        if (c19762x487075a.f38859x6ac9171 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            e4Var.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.c4(this, e4Var.f172950q > 0, str2, android.text.Selection.getSelectionEnd(editable), i19));
            return;
        }
        if (e4Var.f172950q > 0) {
            return;
        }
        e4Var.f172950q = 0;
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f172932d;
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        java.util.Iterator it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            ((android.text.TextWatcher) it.next()).afterTextChanged(editable);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        if (this.f172933e.f172950q > 0) {
            return;
        }
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f172932d;
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        java.util.Iterator it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            ((android.text.TextWatcher) it.next()).beforeTextChanged(charSequence, i17, i18, i19);
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        if (this.f172933e.f172950q > 0) {
            return;
        }
        a(charSequence, i17, i19, android.text.style.StyleSpan.class);
        a(charSequence, i17, i19, android.text.style.RelativeSizeSpan.class);
        a(charSequence, i17, i19, android.text.style.AlignmentSpan.class);
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f172932d;
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        java.util.Iterator it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            ((android.text.TextWatcher) it.next()).onTextChanged(charSequence, i17, i18, i19);
        }
    }
}
