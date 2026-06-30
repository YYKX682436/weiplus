package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class rp implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zf4.e f287004d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.sp f287005e;

    public rp(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.sp spVar, zf4.e eVar) {
        this.f287005e = spVar;
        this.f287004d = eVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        c01.d9.e().d(this.f287004d);
        com.p314xaae8f345.mm.p944x882e457a.r1 e17 = c01.d9.e();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.sp spVar = this.f287005e;
        e17.q(331, spVar.f287070d.f287161f.f287257t);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.up upVar = spVar.f287070d.f287161f;
        upVar.f287257t = null;
        android.app.ProgressDialog progressDialog = upVar.f287258u;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }
}
