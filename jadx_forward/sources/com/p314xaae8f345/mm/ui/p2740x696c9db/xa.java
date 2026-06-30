package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes3.dex */
public class xa implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f292444d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22534xec824752 f292445e;

    public xa(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22534xec824752 activityC22534xec824752, android.view.View view) {
        this.f292445e = activityC22534xec824752;
        this.f292444d = view;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.MotionEvent motionEvent = (android.view.MotionEvent) obj;
        if (motionEvent.getAction() == 0) {
            ym5.v6.a(this.f292444d, (int) motionEvent.getRawX(), (int) motionEvent.getRawY());
            int i17 = com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22534xec824752.f291723u;
            this.f292445e.getClass();
        }
        return java.lang.Boolean.TRUE;
    }
}
