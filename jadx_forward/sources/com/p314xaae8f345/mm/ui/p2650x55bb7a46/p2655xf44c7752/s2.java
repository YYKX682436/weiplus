package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes9.dex */
public class s2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 f282885d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f282886e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewTreeObserverOnPreDrawListenerC21747x53cf88d1 f282887f;

    public s2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewTreeObserverOnPreDrawListenerC21747x53cf88d1 viewTreeObserverOnPreDrawListenerC21747x53cf88d1, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73, java.util.List list) {
        this.f282887f = viewTreeObserverOnPreDrawListenerC21747x53cf88d1;
        this.f282885d = c5303xc75d2f73;
        this.f282886e = list;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = this.f282885d;
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        int i18 = c4Var.f87850c;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewTreeObserverOnPreDrawListenerC21747x53cf88d1 viewTreeObserverOnPreDrawListenerC21747x53cf88d1 = this.f282887f;
        if (i18 == 14 && c4Var.f87848a.f452497f.size() == 0) {
            viewTreeObserverOnPreDrawListenerC21747x53cf88d1.a7();
            return;
        }
        int i19 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewTreeObserverOnPreDrawListenerC21747x53cf88d1.E;
        viewTreeObserverOnPreDrawListenerC21747x53cf88d1.U6(c5303xc75d2f73);
        java.util.Iterator it = this.f282886e.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.e.c(com.p314xaae8f345.mm.ui.p2650x55bb7a46.c.Fav, com.p314xaae8f345.mm.ui.p2650x55bb7a46.d.Samll, (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next(), 0);
        }
    }
}
