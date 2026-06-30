package com.p314xaae8f345.mm.p2802xd031a825.ui;

/* loaded from: classes9.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.ui.w f295769d;

    public u(com.p314xaae8f345.mm.p2802xd031a825.ui.w wVar) {
        this.f295769d = wVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.f295769d.f295791n.findViewById(com.p314xaae8f345.mm.R.id.jc9);
        if (viewGroup != null) {
            viewGroup.sendAccessibilityEvent(128);
        }
    }
}
