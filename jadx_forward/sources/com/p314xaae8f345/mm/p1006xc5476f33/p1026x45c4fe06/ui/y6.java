package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes13.dex */
public final class y6 extends android.view.ContextThemeWrapper {

    /* renamed from: b, reason: collision with root package name */
    public static final android.util.SparseArray f171881b = new android.util.SparseArray();

    /* renamed from: a, reason: collision with root package name */
    public volatile android.view.LayoutInflater f171882a;

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String str) {
        android.view.LayoutInflater layoutInflater;
        if (!"layout_inflater".equals(str)) {
            return super.getSystemService(str);
        }
        synchronized (this) {
            if (this.f171882a == null) {
                this.f171882a = ((android.view.LayoutInflater) getApplicationContext().getSystemService(str)).cloneInContext(this);
                android.view.LayoutInflater layoutInflater2 = this.f171882a;
                i65.a.q(layoutInflater2.getContext());
                com.p314xaae8f345.mm.ui.fd fdVar = new com.p314xaae8f345.mm.ui.fd(null);
                fdVar.f289983d = layoutInflater2;
                layoutInflater2.setFactory(fdVar);
            }
            layoutInflater = this.f171882a;
        }
        return layoutInflater;
    }
}
