package com.p314xaae8f345.mm.ui;

/* loaded from: classes7.dex */
public class nk implements android.view.View.OnApplyWindowInsetsListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.pk f290965d;

    public nk(com.p314xaae8f345.mm.ui.pk pkVar) {
        this.f290965d = pkVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
        java.util.LinkedList linkedList;
        synchronized (this.f290965d.f291051e) {
            com.p314xaae8f345.mm.ui.qk qkVar = this.f290965d.f291051e;
            new android.view.WindowInsets(windowInsets);
            qkVar.getClass();
        }
        synchronized (this.f290965d.f291051e.f291108a) {
            linkedList = new java.util.LinkedList(this.f290965d.f291051e.f291108a);
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((android.view.View.OnApplyWindowInsetsListener) it.next()).onApplyWindowInsets(view, windowInsets);
        }
        return view.onApplyWindowInsets(windowInsets);
    }
}
