package t00;

/* loaded from: classes9.dex */
public final class p2 implements t00.r0 {
    @Override // t00.r0
    public t00.m a() {
        t00.m mVar = t00.n.f495853a;
        return t00.n.f495871s;
    }

    @Override // t00.r0
    public void c(int i17, android.content.Context context, org.json.JSONObject data, c00.n3 callback, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TryPreloadDataActionHandler", "handleAction: " + data);
        y02.p0 a17 = y02.r0.f540159d.a();
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TryPreloadDataActionHandler", "preloadMgr is null");
            callback.a();
            return;
        }
        org.json.JSONArray optJSONArray = data.optJSONArray("itemList");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TryPreloadDataActionHandler", "itemList is null");
            callback.a();
            return;
        }
        bw5.d6 d6Var = new bw5.d6();
        d6Var.f107870d = data.optInt("preloadScene", 0);
        boolean[] zArr = d6Var.f107872f;
        zArr[1] = true;
        if (data.has(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099)) {
            java.lang.Object obj = data.get(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099);
            if (obj instanceof java.lang.String) {
                if (((java.lang.CharSequence) obj).length() > 0) {
                    byte[] bytes = ((java.lang.String) obj).getBytes(r26.c.f450398a);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                    d6Var.f107871e = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bytes, 0, bytes.length);
                    zArr[2] = true;
                }
            } else if (obj instanceof org.json.JSONObject) {
                byte[] bytes2 = obj.toString().getBytes(r26.c.f450398a);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes2, "getBytes(...)");
                d6Var.f107871e = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bytes2, 0, bytes2.length);
                zArr[2] = true;
            }
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        c75.c.d(optJSONArray, new t00.o2(linkedList));
        bw5.m7 m7Var = new bw5.m7();
        m7Var.f111630d = linkedList;
        m7Var.f111631e[1] = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TryPreloadDataActionHandler", "tryStartPreload, count: " + linkedList.size() + ", scene: " + d6Var.f107870d);
        ((y02.r0) a17).e(m7Var, d6Var);
        callback.b(null);
    }

    @Override // t00.r0
    public boolean g() {
        return true;
    }
}
