package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class ch implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21434x41a468ff f279630d;

    public ch(com.p314xaae8f345.mm.ui.AbstractActivityC21434x41a468ff abstractActivityC21434x41a468ff) {
        this.f279630d = abstractActivityC21434x41a468ff;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        android.view.View currentFocus;
        com.p314xaae8f345.mm.ui.AbstractActivityC21434x41a468ff abstractActivityC21434x41a468ff = this.f279630d;
        java.util.LinkedList linkedList = abstractActivityC21434x41a468ff.f278138x;
        if (!linkedList.isEmpty()) {
            linkedList.clear();
            abstractActivityC21434x41a468ff.mo2548x55429c53();
        }
        com.p314xaae8f345.mm.ui.ih ihVar = new com.p314xaae8f345.mm.ui.ih(abstractActivityC21434x41a468ff);
        abstractActivityC21434x41a468ff.f278588z = ihVar;
        ihVar.m80724xcd6a5043(abstractActivityC21434x41a468ff);
        abstractActivityC21434x41a468ff.f278588z.m80723x764b0e09(abstractActivityC21434x41a468ff.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k2_));
        abstractActivityC21434x41a468ff.mo2533x106ab264().y(abstractActivityC21434x41a468ff.f278588z);
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) abstractActivityC21434x41a468ff.getSystemService("input_method");
        if (inputMethodManager != null && (currentFocus = abstractActivityC21434x41a468ff.getCurrentFocus()) != null && currentFocus.getWindowToken() != null) {
            inputMethodManager.toggleSoftInput(0, 2);
        }
        return false;
    }
}
