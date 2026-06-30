package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316;

/* loaded from: classes11.dex */
public final class f implements uc0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.h f235434a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a f235435b;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.h hVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a) {
        this.f235434a = hVar;
        this.f235435b = c21503x6e5a020a;
    }

    @Override // uc0.p
    public final void a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.h hVar = this.f235434a;
        hVar.f235453t[1] = 1;
        if (!x51.t1.b(str)) {
            hVar.f235453t[2] = 1;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a = this.f235435b;
        sb6.append((java.lang.Object) c21503x6e5a020a.m79028xfb85ada3());
        sb6.append(str);
        c21503x6e5a020a.m79040x765074af(sb6.toString());
        c21503x6e5a020a.clearFocus();
        android.widget.TextView textView = hVar.f392924f;
        if (textView == null) {
            return;
        }
        textView.setVisibility(8);
    }
}
