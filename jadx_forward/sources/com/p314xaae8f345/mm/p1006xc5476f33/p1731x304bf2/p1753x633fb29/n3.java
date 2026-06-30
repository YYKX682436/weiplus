package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

/* loaded from: classes8.dex */
public class n3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221920d;

    public n3(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15925xf475065d c15925xf475065d, java.lang.String str) {
        this.f221920d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Set set = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15925xf475065d.f221717m;
        java.lang.String str = this.f221920d;
        if (((java.util.HashSet) set).contains(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "preload webcore, time out");
            ((java.util.HashSet) set).remove(str);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(939L, 3L, 1L);
        }
    }
}
