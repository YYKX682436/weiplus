package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes11.dex */
public class z7 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22516x5499f079 f292478d;

    public z7(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22516x5499f079 activityC22516x5499f079) {
        this.f292478d = activityC22516x5499f079;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        if (com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22516x5499f079.f291666i != null) {
            com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22516x5499f079.f291666i = null;
            this.f292478d.finish();
        }
    }
}
