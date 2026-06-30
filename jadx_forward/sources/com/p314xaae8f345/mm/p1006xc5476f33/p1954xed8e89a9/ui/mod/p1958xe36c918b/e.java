package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b;

/* loaded from: classes11.dex */
public final class e implements uc0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.g f235576a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a f235577b;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.g gVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a) {
        this.f235576a = gVar;
        this.f235577b = c21503x6e5a020a;
    }

    @Override // uc0.p
    public final void a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.g gVar = this.f235576a;
        gVar.f235594t[1] = 1;
        if (!x51.t1.b(str)) {
            gVar.f235594t[2] = 1;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a = this.f235577b;
        sb6.append((java.lang.Object) c21503x6e5a020a.m79028xfb85ada3());
        sb6.append(str);
        c21503x6e5a020a.m79040x765074af(sb6.toString());
        c21503x6e5a020a.clearFocus();
        android.widget.TextView textView = gVar.f393011f;
        if (textView == null) {
            return;
        }
        textView.setVisibility(8);
    }
}
