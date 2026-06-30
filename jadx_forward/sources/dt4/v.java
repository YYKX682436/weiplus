package dt4;

/* loaded from: classes9.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab f324831d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f324832e;

    public v(dt4.w wVar, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab, java.lang.String str) {
        this.f324831d = c26987xeef691ab;
        this.f324832e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab = this.f324831d;
        if (c26987xeef691ab == null || c26987xeef691ab.m108008xc9602be3()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLuckyMoneyStg", "do cancel query: %s", this.f324832e);
        c26987xeef691ab.m108007xae7a2e7a();
    }
}
