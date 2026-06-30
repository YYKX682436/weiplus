package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes8.dex */
public class s1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnClickListener f182957d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f182958e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.g f182959f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.h f182960g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f182961h;

    public s1(android.content.DialogInterface.OnClickListener onClickListener, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.g gVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.h hVar, android.app.Activity activity) {
        this.f182957d = onClickListener;
        this.f182958e = componentCallbacksC1101xa17d4670;
        this.f182959f = gVar;
        this.f182960g = hVar;
        this.f182961h = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        android.content.DialogInterface.OnClickListener onClickListener = this.f182957d;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, -2);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.h hVar = this.f182960g;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.g gVar = this.f182959f;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = this.f182958e;
        if (componentCallbacksC1101xa17d4670 == null) {
            android.app.Activity activity = this.f182961h;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cbq), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_a), activity, gVar, hVar);
            return;
        }
        componentCallbacksC1101xa17d4670.m7474xfb86a31b();
        if (componentCallbacksC1101xa17d4670 instanceof com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010) {
            ((com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010) componentCallbacksC1101xa17d4670).m78646xc2a54588();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(componentCallbacksC1101xa17d4670.mo7430x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cbq), componentCallbacksC1101xa17d4670.mo7430x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_a), componentCallbacksC1101xa17d4670.mo7438x76847179(), gVar, hVar);
    }
}
