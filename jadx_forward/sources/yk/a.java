package yk;

/* loaded from: classes12.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab f544272d;

    public a(com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        this.f544272d = c26987xeef691ab;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab = this.f544272d;
        if (c26987xeef691ab.m108008xc9602be3()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DBDataClean.AppAttachDataCleanWorkManager", "do cancel query");
        c26987xeef691ab.m108007xae7a2e7a();
    }
}
