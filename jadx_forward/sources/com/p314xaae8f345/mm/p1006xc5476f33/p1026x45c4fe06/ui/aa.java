package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public final class aa implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f171039d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12683x695b32b4 f171040e;

    public aa(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12683x695b32b4 activityC12683x695b32b4) {
        this.f171039d = view;
        this.f171040e = activityC12683x695b32b4;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.f171039d.getViewTreeObserver().removeOnPreDrawListener(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.y9 y9Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12683x695b32b4.f170970g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12683x695b32b4 activityC12683x695b32b4 = this.f171040e;
        activityC12683x695b32b4.m78513xc2a54588().postDelayed(activityC12683x695b32b4.f170974d, 300L);
        return true;
    }
}
