package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316;

/* loaded from: classes11.dex */
public final class d implements lr3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.h f235423a;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.h hVar) {
        this.f235423a = hVar;
    }

    @Override // lr3.a
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.h hVar = this.f235423a;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a) hVar.f392926h;
        if (c21503x6e5a020a == null) {
            return;
        }
        java.lang.String str = hVar.f235451r;
        if (str == null || r26.n0.N(str)) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21525x1d56253b editText = c21503x6e5a020a.getEditText();
            editText.requestFocus();
            android.text.Editable text = editText.getText();
            editText.setSelection(text != null ? text.length() : 0);
            java.lang.Object systemService = hVar.m158354x19263085().getSystemService("input_method");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((android.view.inputmethod.InputMethodManager) systemService).showSoftInput(editText, 0);
        }
    }

    @Override // lr3.a
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.h hVar = this.f235423a;
        float h17 = i65.a.h(hVar.m158354x19263085(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a) hVar.f392926h;
        if (c21503x6e5a020a != null) {
            sa5.d.e(c21503x6e5a020a, h17, (r14 & 2) != 0 ? 1 : 0, (r14 & 4) != 0 ? 1000L : 0L, (r14 & 8) != 0 ? 300L : 0L, (r14 & 16) != 0 ? null : null);
        }
    }
}
