package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes8.dex */
public class p implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19725xad6fc40e f273353d;

    public p(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19725xad6fc40e activityC19725xad6fc40e) {
        this.f273353d = activityC19725xad6fc40e;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.pm.ResolveInfo resolveInfo;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19725xad6fc40e activityC19725xad6fc40e = this.f273353d;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.x xVar = activityC19725xad6fc40e.A;
        if (xVar == null || (resolveInfo = xVar.f272561d) == null) {
            return;
        }
        activityC19725xad6fc40e.X6(-1, resolveInfo.activityInfo.packageName, false);
    }
}
