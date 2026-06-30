package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.ipc;

/* renamed from: com.tencent.mm.plugin.webview.luggage.ipc.ActiveMainProcessTask */
/* loaded from: classes8.dex */
public class C19267xf1e5d915 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.ipc.C19267xf1e5d915> f38718x681a0c0c = new sw4.a();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Runnable f263761f;

    public /* synthetic */ C19267xf1e5d915(android.os.Parcel parcel, sw4.a aVar) {
        this(parcel);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActiveMainProcessTask", "runInClientProcess");
        java.lang.Runnable runnable = this.f263761f;
        if (runnable != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.c0) runnable).run();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActiveMainProcessTask", "active");
        c();
    }

    public C19267xf1e5d915() {
    }

    private C19267xf1e5d915(android.os.Parcel parcel) {
    }
}
