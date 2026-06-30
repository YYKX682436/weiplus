package com.tencent.mm.plugin.account.ui;

/* loaded from: classes3.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f74309d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.ContactsSyncUI f74310e;

    public x0(com.tencent.mm.plugin.account.ui.ContactsSyncUI contactsSyncUI, java.lang.String str) {
        this.f74310e = contactsSyncUI;
        this.f74309d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactsSyncUI", "summerper checkPermission checkContacts [%b], oldPermission[%s], stack[%s]", bool, this.f74309d, new com.tencent.mm.sdk.platformtools.z3());
        this.f74310e.initView();
    }

    public java.lang.String toString() {
        return super.toString() + "|checkContacts";
    }
}
