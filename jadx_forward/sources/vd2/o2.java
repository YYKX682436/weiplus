package vd2;

/* loaded from: classes7.dex */
public final class o2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vd2.p2 f517366d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f517367e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.nw1 f517368f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f517369g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(vd2.p2 p2Var, java.lang.String str, r45.nw1 nw1Var, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f517366d = p2Var;
        this.f517367e = str;
        this.f517368f = nw1Var;
        this.f517369g = str2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vd2.o2(this.f517366d, this.f517367e, this.f517368f, this.f517369g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vd2.o2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        jz5.f0 f0Var = jz5.f0.f384359a;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        vd2.p2 p2Var = this.f517366d;
        java.lang.String str = p2Var.f517384d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start preload key:");
        java.lang.String str2 = this.f517367e;
        sb6.append(str2);
        sb6.append(", liveId:");
        sb6.append(pm0.v.u(this.f517368f.m75942xfb822ef2(0)));
        sb6.append(", streamUrl:");
        java.lang.String str3 = this.f517369g;
        sb6.append(str3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        try {
            java.net.URLConnection openConnection = new java.net.URL(str3).openConnection();
            r4 = openConnection instanceof java.net.HttpURLConnection ? (java.net.HttpURLConnection) openConnection : null;
        } catch (java.lang.Throwable th6) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(p2Var.f517384d, th6, "Preload Exception", new java.lang.Object[0]);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(p2Var.f517384d, "preload disconnect, key:" + str2);
                if (r4 != null) {
                    try {
                        r4.disconnect();
                    } catch (java.lang.Throwable th7) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(p2Var.f517384d, th7, "Disconnect Exception", new java.lang.Object[0]);
                    }
                }
            } catch (java.lang.Throwable th8) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(p2Var.f517384d, "preload disconnect, key:" + str2);
                if (r4 != null) {
                    try {
                        r4.disconnect();
                    } catch (java.lang.Throwable th9) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(p2Var.f517384d, th9, "Disconnect Exception", new java.lang.Object[0]);
                    }
                }
                p2Var.f517386f.remove(str2);
                throw th8;
            }
        }
        if (r4 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(p2Var.f517384d, "preload disconnect, key:" + str2);
            p2Var.f517386f.remove(str2);
            return f0Var;
        }
        r4.setRequestMethod("GET");
        r4.setConnectTimeout(3000);
        r4.setReadTimeout(3000);
        int responseCode = r4.getResponseCode();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(p2Var.f517384d, "preload connected, key:" + str2 + ", respCode:" + responseCode);
        if (responseCode == 200) {
            p2Var.f517385e.add(str2);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(p2Var.f517384d, "preload disconnect, key:" + str2);
        try {
            r4.disconnect();
        } catch (java.lang.Throwable th10) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(p2Var.f517384d, th10, "Disconnect Exception", new java.lang.Object[0]);
        }
        p2Var.f517386f.remove(str2);
        return f0Var;
    }
}
