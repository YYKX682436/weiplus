package com.p314xaae8f345.mm.p2802xd031a825.ui;

/* loaded from: classes8.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f295741d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.ui.ViewOnFocusChangeListenerC22901x93fec4d2 f295742e;

    public n(com.p314xaae8f345.mm.p2802xd031a825.ui.ViewOnFocusChangeListenerC22901x93fec4d2 viewOnFocusChangeListenerC22901x93fec4d2, android.view.View view) {
        this.f295742e = viewOnFocusChangeListenerC22901x93fec4d2;
        this.f295741d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        int top = this.f295741d.getTop();
        com.p314xaae8f345.mm.p2802xd031a825.ui.ViewOnFocusChangeListenerC22901x93fec4d2 viewOnFocusChangeListenerC22901x93fec4d2 = this.f295742e;
        viewOnFocusChangeListenerC22901x93fec4d2.scrollTo(0, top - i65.a.b(viewOnFocusChangeListenerC22901x93fec4d2.getContext(), 10));
    }
}
