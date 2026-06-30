package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes13.dex */
public final class y6 extends android.view.ContextThemeWrapper {

    /* renamed from: b, reason: collision with root package name */
    public static final android.util.SparseArray f90348b = new android.util.SparseArray();

    /* renamed from: a, reason: collision with root package name */
    public volatile android.view.LayoutInflater f90349a;

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String str) {
        android.view.LayoutInflater layoutInflater;
        if (!"layout_inflater".equals(str)) {
            return super.getSystemService(str);
        }
        synchronized (this) {
            if (this.f90349a == null) {
                this.f90349a = ((android.view.LayoutInflater) getApplicationContext().getSystemService(str)).cloneInContext(this);
                android.view.LayoutInflater layoutInflater2 = this.f90349a;
                i65.a.q(layoutInflater2.getContext());
                com.tencent.mm.ui.fd fdVar = new com.tencent.mm.ui.fd(null);
                fdVar.f208450d = layoutInflater2;
                layoutInflater2.setFactory(fdVar);
            }
            layoutInflater = this.f90349a;
        }
        return layoutInflater;
    }
}
