package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes12.dex */
public final class w2 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13467x6324ae0d f181244d;

    public w2(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13467x6324ae0d activityC13467x6324ae0d) {
        this.f181244d = activityC13467x6324ae0d;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        p32.j jVar = this.f181244d.f180808e;
        if (jVar != null) {
            gm0.j1.d().d(jVar);
        }
        dialogInterface.dismiss();
    }
}
