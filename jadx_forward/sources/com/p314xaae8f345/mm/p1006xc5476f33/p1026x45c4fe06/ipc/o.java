package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc;

/* loaded from: classes14.dex */
public class o implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11885x29239176 f159955a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f159956b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11884x35a49c3e f159957c;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11884x35a49c3e activityC11884x35a49c3e, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11885x29239176 abstractC11885x29239176, java.lang.String str) {
        this.f159957c = activityC11884x35a49c3e;
        this.f159955a = abstractC11885x29239176;
        this.f159956b = str;
    }

    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProxyTransparentUI", "onResult");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("task_object", this.f159955a);
        intent.putExtra("task_id", this.f159956b);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11884x35a49c3e activityC11884x35a49c3e = this.f159957c;
        activityC11884x35a49c3e.setResult(-1, intent);
        activityC11884x35a49c3e.finish();
    }
}
