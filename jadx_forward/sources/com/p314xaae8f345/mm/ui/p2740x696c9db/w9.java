package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes3.dex */
public class w9 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22523xb066d18 f292418d;

    public w9(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22523xb066d18 activityC22523xb066d18) {
        this.f292418d = activityC22523xb066d18;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22523xb066d18 activityC22523xb066d18 = this.f292418d;
        java.util.Iterator it = activityC22523xb066d18.f291688g.iterator();
        while (it.hasNext()) {
            gm0.j1.d().d((com.p314xaae8f345.mm.p944x882e457a.m1) it.next());
        }
        activityC22523xb066d18.finish();
    }
}
