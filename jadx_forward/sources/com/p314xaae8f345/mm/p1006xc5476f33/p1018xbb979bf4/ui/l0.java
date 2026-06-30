package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

/* loaded from: classes8.dex */
public class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f156108d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ViewOnFocusChangeListenerC11491x93fec4d2 f156109e;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ViewOnFocusChangeListenerC11491x93fec4d2 viewOnFocusChangeListenerC11491x93fec4d2, android.view.View view) {
        this.f156109e = viewOnFocusChangeListenerC11491x93fec4d2;
        this.f156108d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        int top = this.f156108d.getTop();
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ViewOnFocusChangeListenerC11491x93fec4d2 viewOnFocusChangeListenerC11491x93fec4d2 = this.f156109e;
        viewOnFocusChangeListenerC11491x93fec4d2.scrollTo(0, top - i65.a.b(viewOnFocusChangeListenerC11491x93fec4d2.getContext(), 10));
    }
}
