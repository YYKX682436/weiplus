package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes8.dex */
public class j1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19106xf6056514 f261886d;

    public j1(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19106xf6056514 activityC19106xf6056514) {
        this.f261886d = activityC19106xf6056514;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19106xf6056514.f261391r;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19106xf6056514 activityC19106xf6056514 = this.f261886d;
        android.view.View findFocus = activityC19106xf6056514.m78513xc2a54588() == null ? null : activityC19106xf6056514.m78513xc2a54588().findFocus();
        if (findFocus == null || !(findFocus instanceof android.widget.EditText)) {
            return;
        }
        activityC19106xf6056514.mo26063x7b383410();
    }
}
