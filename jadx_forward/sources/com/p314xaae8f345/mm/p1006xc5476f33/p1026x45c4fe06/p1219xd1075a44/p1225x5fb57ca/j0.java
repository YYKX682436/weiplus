package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public class j0 extends al5.j2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q0 f173035d;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q0 q0Var) {
        this.f173035d = q0Var;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q0 q0Var = this.f173035d;
        java.lang.ref.WeakReference weakReference = q0Var.f173143o;
        if (weakReference == null || weakReference.get() == null || q0Var.f173145q == null) {
            return;
        }
        q0Var.r();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.m5.e(editable)) {
            return;
        }
        q0Var.f173153y.a(q0Var.f173145q.getEditableText(), q0Var.f173154z);
    }
}
