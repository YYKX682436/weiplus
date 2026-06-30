package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae;

/* loaded from: classes8.dex */
public class p0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.ResultReceiver f265094d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ActivityC19303x73e2248f f265095e;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ActivityC19303x73e2248f activityC19303x73e2248f, android.os.ResultReceiver resultReceiver) {
        this.f265095e = activityC19303x73e2248f;
        this.f265094d = resultReceiver;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f265094d.send(1, null);
        this.f265095e.finish();
    }
}
