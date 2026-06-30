package com.p314xaae8f345.mm.ui;

/* loaded from: classes13.dex */
public abstract class id {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f290452a = {android.R.attr.text, android.R.attr.hint, android.R.attr.contentDescription};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f290453b = {android.R.attr.contentDescription};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f290454c = {android.R.attr.textColor, android.R.attr.textColorHint, android.R.attr.background};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f290455d = {android.R.attr.textColor, android.R.attr.background};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f290456e = {android.R.attr.textColor, android.R.attr.button};

    /* renamed from: f, reason: collision with root package name */
    public static int f290457f;

    public static android.view.LayoutInflater a(android.view.LayoutInflater layoutInflater, android.content.Context context) {
        i65.a.q(context);
        android.view.LayoutInflater cloneInContext = layoutInflater.cloneInContext(context);
        com.p314xaae8f345.mm.ui.fd fdVar = new com.p314xaae8f345.mm.ui.fd(null);
        fdVar.f289983d = cloneInContext;
        cloneInContext.setFactory(fdVar);
        com.p314xaae8f345.mm.ui.gd gdVar = new com.p314xaae8f345.mm.ui.gd(cloneInContext, cloneInContext.getContext());
        com.p314xaae8f345.mm.ui.fd fdVar2 = new com.p314xaae8f345.mm.ui.fd(null);
        fdVar2.f289983d = gdVar;
        fdVar2.f289987h = fdVar;
        gdVar.setFactory(fdVar2);
        gdVar.f290221a = fdVar2;
        return gdVar;
    }

    public static android.view.LayoutInflater b(android.content.Context context) {
        i65.a.q(context);
        android.view.LayoutInflater cloneInContext = android.view.LayoutInflater.from(context).cloneInContext(context);
        com.p314xaae8f345.mm.ui.fd fdVar = new com.p314xaae8f345.mm.ui.fd(null);
        fdVar.f289983d = cloneInContext;
        cloneInContext.setFactory(fdVar);
        com.p314xaae8f345.mm.ui.gd gdVar = new com.p314xaae8f345.mm.ui.gd(cloneInContext, cloneInContext.getContext());
        com.p314xaae8f345.mm.ui.fd fdVar2 = new com.p314xaae8f345.mm.ui.fd(null);
        fdVar2.f289983d = gdVar;
        fdVar2.f289987h = fdVar;
        gdVar.setFactory(fdVar2);
        gdVar.f290221a = fdVar2;
        return gdVar;
    }

    public static android.view.LayoutInflater c(android.view.LayoutInflater layoutInflater) {
        i65.a.q(layoutInflater.getContext());
        android.view.LayoutInflater cloneInContext = layoutInflater.cloneInContext(layoutInflater.getContext());
        com.p314xaae8f345.mm.ui.fd fdVar = new com.p314xaae8f345.mm.ui.fd(null);
        fdVar.f289983d = cloneInContext;
        cloneInContext.setFactory(fdVar);
        com.p314xaae8f345.mm.ui.gd gdVar = new com.p314xaae8f345.mm.ui.gd(cloneInContext, cloneInContext.getContext());
        com.p314xaae8f345.mm.ui.fd fdVar2 = new com.p314xaae8f345.mm.ui.fd(null);
        fdVar2.f289983d = gdVar;
        fdVar2.f289987h = fdVar;
        gdVar.setFactory(fdVar2);
        gdVar.f290221a = fdVar2;
        return gdVar;
    }
}
