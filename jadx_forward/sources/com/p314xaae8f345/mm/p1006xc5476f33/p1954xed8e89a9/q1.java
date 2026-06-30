package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9;

/* loaded from: classes5.dex */
public class q1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f235123d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f235124e;

    public q1(java.lang.String str, java.lang.String str2) {
        this.f235123d = str;
        this.f235124e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean k17 = r21.w.wi().k1(this.f235123d, 1);
        if (!k17) {
            k17 = r21.w.wi().k1(this.f235124e, 1);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfileUtils", "processModContact, update state(ADDED) FMessageConversation, ret = " + k17);
    }
}
