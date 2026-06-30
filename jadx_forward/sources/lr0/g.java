package lr0;

/* loaded from: classes11.dex */
public final class g implements lr0.c {

    /* renamed from: d, reason: collision with root package name */
    public static final lr0.g f402168d = new lr0.g();

    @Override // lr0.c
    public boolean a(boolean z17, int i17, yz5.l lVar) {
        int i18;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("WebView Count = ");
        synchronized (com.p314xaae8f345.p3210x3857dc.j1.class) {
            i18 = com.p314xaae8f345.p3210x3857dc.j1.f301850a;
        }
        sb6.append(i18);
        sb6.append(" force:");
        sb6.append(z17);
        sb6.append(", type:");
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.triggers.WebView", sb6.toString());
        return true;
    }
}
