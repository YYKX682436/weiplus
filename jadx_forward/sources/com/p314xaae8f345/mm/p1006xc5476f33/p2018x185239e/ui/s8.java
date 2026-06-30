package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public class s8 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f239470d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17153xbe9612d2 f239471e;

    public s8(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17153xbe9612d2 activityC17153xbe9612d2, boolean z17) {
        this.f239471e = activityC17153xbe9612d2;
        this.f239470d = z17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        if (this.f239470d) {
            this.f239471e.finish();
        }
    }
}
