package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566;

/* loaded from: classes7.dex */
public final class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.e1 f170005d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f170006e;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.e1 e1Var, java.lang.String str) {
        this.f170005d = e1Var;
        this.f170006e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f170005d.f170014d;
        java.lang.String str = this.f170006e;
        if (((java.lang.Long) concurrentHashMap.remove(str)) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PosterGeneratorRegistry", "poster generation timeout, posterTaskId=" + str);
        }
    }
}
