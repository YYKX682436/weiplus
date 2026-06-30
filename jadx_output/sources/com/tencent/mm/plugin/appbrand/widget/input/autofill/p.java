package com.tencent.mm.plugin.appbrand.widget.input.autofill;

/* loaded from: classes7.dex */
public class p implements com.tencent.mm.plugin.appbrand.widget.input.autofill.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f91354a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f91355b;

    public p(java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2) {
        this.f91354a = weakReference;
        this.f91355b = weakReference2;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.autofill.e0
    public void a(java.lang.String str, com.tencent.mm.plugin.appbrand.widget.input.autofill.d0 d0Var) {
        android.view.KeyEvent.Callback callback = (android.widget.EditText) this.f91354a.get();
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = (com.tencent.mm.plugin.appbrand.page.v5) this.f91355b.get();
        if (callback == null || v5Var == null) {
            return;
        }
        int inputId = ((com.tencent.mm.plugin.appbrand.widget.input.e4) ((com.tencent.mm.plugin.appbrand.widget.input.t4) callback)).getInputId();
        com.tencent.mm.plugin.appbrand.widget.input.autofill.q qVar = new com.tencent.mm.plugin.appbrand.widget.input.autofill.q();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(dm.i4.COL_ID, str);
        hashMap.put("type", d0Var.name().toLowerCase());
        hashMap.put("inputId", java.lang.Integer.valueOf(inputId));
        qVar.u(v5Var);
        qVar.t(hashMap);
        qVar.m();
    }
}
