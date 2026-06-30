package u31;

/* loaded from: classes8.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.net.InetAddress f505788a;

    /* renamed from: b, reason: collision with root package name */
    public final int f505789b;

    /* renamed from: c, reason: collision with root package name */
    public final int f505790c;

    public d(java.net.InetAddress inetAddress, int i17, int i18) {
        this.f505788a = inetAddress;
        this.f505789b = i17;
        this.f505790c = i18;
    }

    public static u31.d a(java.lang.String str) {
        java.lang.String[] split;
        java.net.InetAddress byName;
        if (str != null && (split = str.split(":")) != null && split.length == 3) {
            try {
                java.lang.String str2 = split[0];
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.a2.a(str2)) {
                    byName = java.net.InetAddress.getByName(str2);
                } else {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.a2.b(str2)) {
                        throw new java.net.UnknownHostException("invalid ipv4 or ipv6 dotted string");
                    }
                    byName = java.net.InetAddress.getByName(str2);
                }
                return new u31.d(byName, java.lang.Integer.parseInt(split[1]), java.lang.Integer.parseInt(split[2]));
            } catch (java.lang.Exception e17) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.InAddress", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            }
        }
        return null;
    }

    /* renamed from: toString */
    public java.lang.String m167497x9616526c() {
        int i17 = this.f505790c;
        return this.f505788a.getHostAddress() + ":" + this.f505789b + "(" + (i17 == 2 ? "dns" : i17 == 3 ? "svrdns" : i17 == 4 ? "waphc" : i17 == 5 ? "newdns" : i17 == 6 ? "auth" : i17 == 7 ? "debug" : "hc") + ")";
    }
}
