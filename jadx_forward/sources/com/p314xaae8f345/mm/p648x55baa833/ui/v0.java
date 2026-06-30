package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes.dex */
public class v0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 f146120d;

    public v0(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 activityC10332x8a1129f5) {
        this.f146120d = activityC10332x8a1129f5;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 activityC10332x8a1129f5 = this.f146120d;
        android.content.Intent intent = new android.content.Intent(activityC10332x8a1129f5, (java.lang.Class<?>) com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10340xcbcfa629.class);
        intent.putExtra("chatroomName", activityC10332x8a1129f5.A);
        intent.putExtra("KEY_NEED_SEAR_HEADER", true);
        intent.putExtra("MMActivity.OverrideEnterAnimation", com.p314xaae8f345.mm.R.C30854x2dc211.f559337bx);
        intent.putExtra("MMActivity.OverrideExitAnimation", com.p314xaae8f345.mm.R.C30854x2dc211.by);
        pf5.j0.a(intent, cj5.s.class);
        pf5.j0.a(intent, cj5.k4.class);
        pf5.j0.a(intent, cj5.n3.class);
        pf5.j0.a(intent, dj5.m.class);
        pf5.j0.a(intent, cj5.w2.class);
        pf5.j0.a(intent, cj5.l2.class);
        pf5.j0.a(intent, cj5.h3.class);
        pf5.j0.a(intent, un.k0.class);
        activityC10332x8a1129f5.startActivityForResult(intent, 5);
        activityC10332x8a1129f5.getClass();
        return false;
    }
}
