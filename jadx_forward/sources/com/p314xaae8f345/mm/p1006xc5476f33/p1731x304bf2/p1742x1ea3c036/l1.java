package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036;

/* loaded from: classes8.dex */
public class l1 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.m1 f221340d;

    public l1(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.m1 m1Var) {
        this.f221340d = m1Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        boolean z17 = bundle.getBoolean("preload_success");
        boolean z18 = bundle.getBoolean("has_preload");
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.m1 m1Var = this.f221340d;
        if (m1Var != null) {
            m1Var.a(z18, z17);
        }
    }
}
