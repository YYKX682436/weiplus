package yf4;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f543370a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Queue f543371b = new java.util.LinkedList();

    public f(java.lang.String str) {
        this.f543370a = str;
        java.util.ArrayList c17 = p35.b.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str);
        if (c17 == null || c17.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PushMessageExtension", "Parse Message Failed !");
            return;
        }
        for (int i17 = 0; i17 < c17.size(); i17++) {
            java.util.Map map = ((p35.b) c17.get(i17)).f433248i;
            if (map != null) {
                java.util.Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    this.f543371b.offer((java.lang.String) ((java.util.Map.Entry) it.next()).getValue());
                }
            }
        }
    }
}
