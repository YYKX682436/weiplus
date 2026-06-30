package com.p314xaae8f345.mm.ui;

/* loaded from: classes9.dex */
public class ph implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21435x7826ced5 f291044d;

    public ph(com.p314xaae8f345.mm.ui.ActivityC21435x7826ced5 activityC21435x7826ced5) {
        this.f291044d = activityC21435x7826ced5;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f291044d.finish();
    }
}
