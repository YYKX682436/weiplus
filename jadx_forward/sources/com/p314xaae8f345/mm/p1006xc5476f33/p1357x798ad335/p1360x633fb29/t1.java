package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29;

/* loaded from: classes8.dex */
public class t1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h02.a f178709d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f178710e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vz.z1 f178711f;

    public t1(h02.a aVar, boolean z17, vz.z1 z1Var) {
        this.f178709d = aVar;
        this.f178710e = z17;
        this.f178711f = z1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGameDownloadManager", "resume, new style, not wifi, but download straight");
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.j1.g(this.f178709d, false, this.f178710e, true, this.f178711f);
    }
}
