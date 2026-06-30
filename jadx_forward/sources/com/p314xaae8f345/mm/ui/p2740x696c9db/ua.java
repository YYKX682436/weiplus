package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes3.dex */
public class ua implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f292354d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22534xec824752 f292355e;

    public ua(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22534xec824752 activityC22534xec824752, android.view.View view) {
        this.f292355e = activityC22534xec824752;
        this.f292354d = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f292354d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22534xec824752.T6(this.f292355e);
    }
}
