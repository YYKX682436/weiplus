package jn4;

/* loaded from: classes11.dex */
public class h extends java.util.concurrent.ConcurrentHashMap {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn4.m f382336d;

    public h(jn4.m mVar, jn4.a aVar) {
        this.f382336d = mVar;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyt);
    }

    public void a() {
        java.util.Map map;
        java.lang.String str;
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(jn4.m.f382347i);
        boolean m17 = r6Var.m();
        jn4.m mVar = this.f382336d;
        if (!m17) {
            try {
                r6Var.k();
                com.p314xaae8f345.mm.vfs.w6.a(jn4.m.f382347i, (mVar.f382352d + "\n").getBytes());
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMTraceRoute", "create log file err " + e17.getMessage());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMTraceRoute", e17, "", new java.lang.Object[0]);
                jn4.m.a(mVar);
                return;
            }
        }
        java.util.Iterator it = mVar.f382350b.entrySet().iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) ((java.util.Map.Entry) it.next()).getKey();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && mVar.f382350b.containsKey(str2) && (map = (java.util.Map) mVar.f382350b.get(str2)) != null) {
                if (map.size() != 1 || map.get(1) == null) {
                    java.lang.String str3 = "";
                    boolean z17 = false;
                    for (int i17 = 0; i17 < map.size() && !z17; i17++) {
                        if (map.get(java.lang.Integer.valueOf(i17)) != null) {
                            java.lang.String sb6 = ((java.lang.StringBuilder) map.get(java.lang.Integer.valueOf(i17))).toString();
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(sb6)) {
                                str3 = str3 + sb6;
                                if (sb6.contains("FIN")) {
                                    z17 = true;
                                }
                            }
                        }
                    }
                    str = str3;
                } else {
                    str = "" + ((java.lang.StringBuilder) map.get(1)).toString();
                }
                if (str.length() > 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMTraceRoute", str2 + str);
                    com.p314xaae8f345.mm.vfs.w6.a(jn4.m.f382347i, str.getBytes());
                }
            }
        }
        byte[] N = com.p314xaae8f345.mm.vfs.w6.N(jn4.m.f382347i, 0, -1);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(N)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMTraceRoute", "read log failed");
            jn4.m.a(mVar);
            return;
        }
        int length = N.length;
        java.lang.String lowerCase = kk.k.g(java.lang.String.format("weixin#$()%d%d", java.lang.Integer.valueOf(o45.wf.f424562g), java.lang.Integer.valueOf(length)).getBytes()).toLowerCase();
        byte[] a17 = kk.y.a(N);
        com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1 c19764x527bffc1 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1();
        kk.d.b(c19764x527bffc1, a17, lowerCase.getBytes());
        s75.d.b(new jn4.g(this, length, lowerCase, c19764x527bffc1), "MMTraceRoute_uploadLog");
    }
}
