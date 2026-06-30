package com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89;

/* loaded from: classes12.dex */
public class m0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz4.s f269774d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ iz4.k f269775e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 f269776f;

    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3, mz4.s sVar, iz4.k kVar) {
        this.f269776f = activityC19519x7af4daf3;
        this.f269774d = sVar;
        this.f269775e = kVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        mz4.s sVar = this.f269774d;
        sVar.f414881p = true;
        sVar.interrupt();
        this.f269775e.f377653w = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3 = this.f269776f;
        activityC19519x7af4daf3.z7(true, 100L);
        activityC19519x7af4daf3.y7(1, 0L);
    }
}
