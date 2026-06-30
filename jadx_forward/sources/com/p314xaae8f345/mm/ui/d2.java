package com.p314xaae8f345.mm.ui;

/* loaded from: classes12.dex */
public class d2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f289856d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21353x2892d6a9 f289857e;

    public d2(com.p314xaae8f345.mm.ui.ActivityC21353x2892d6a9 activityC21353x2892d6a9, long j17) {
        this.f289857e = activityC21353x2892d6a9;
        this.f289856d = j17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18 = com.p314xaae8f345.mm.ui.ActivityC21353x2892d6a9.f278164e;
        com.p314xaae8f345.mm.ui.ActivityC21353x2892d6a9 activityC21353x2892d6a9 = this.f289857e;
        activityC21353x2892d6a9.getClass();
        s75.d.b(new com.p314xaae8f345.mm.ui.g2(activityC21353x2892d6a9, this.f289856d), "CleanCacheUIThread");
        activityC21353x2892d6a9.finish();
    }
}
