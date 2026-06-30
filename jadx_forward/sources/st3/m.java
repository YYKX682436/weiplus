package st3;

/* loaded from: classes10.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final st3.m f494087d = new st3.m();

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Map e17 = wo.w0.e();
        st3.n nVar = st3.n.f494088a;
        java.lang.String str = (java.lang.String) ((java.util.HashMap) e17).get("hardware");
        if (str == null) {
            str = "";
        }
        st3.n.f494089b = str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("get cpu name:");
        st3.n nVar2 = st3.n.f494088a;
        sb6.append(st3.n.f494089b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HevcEncodeChecker", sb6.toString());
    }
}
