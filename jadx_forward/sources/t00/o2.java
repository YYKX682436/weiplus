package t00;

/* loaded from: classes9.dex */
public final class o2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f495881d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(java.util.LinkedList linkedList) {
        super(1);
        this.f495881d = linkedList;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        org.json.JSONObject it = (org.json.JSONObject) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        bw5.l7 l7Var = new bw5.l7();
        if (it.has("key")) {
            l7Var.f111203d = it.get("key").toString();
            boolean[] zArr = l7Var.f111206g;
            zArr[1] = true;
            int i17 = 0;
            if (it.has("bypass")) {
                java.lang.Object obj2 = it.get("bypass");
                if (obj2 instanceof java.lang.String) {
                    if (((java.lang.CharSequence) obj2).length() > 0) {
                        byte[] bytes = ((java.lang.String) obj2).getBytes(r26.c.f450398a);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                        l7Var.f111204e = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bytes, 0, bytes.length);
                        zArr[2] = true;
                    }
                } else if (obj2 instanceof org.json.JSONObject) {
                    byte[] bytes2 = obj2.toString().getBytes(r26.c.f450398a);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes2, "getBytes(...)");
                    l7Var.f111204e = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bytes2, 0, bytes2.length);
                    zArr[2] = true;
                }
            }
            try {
                if (it.has(ya.b.f77487x44fa364)) {
                    i17 = it.getInt(ya.b.f77487x44fa364);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeGetInt", "", e17);
            }
            l7Var.f111205f = i17;
            zArr[3] = true;
            this.f495881d.add(l7Var);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TryPreloadDataActionHandler", "invalid itemListItem, key is null");
        }
        return jz5.f0.f384359a;
    }
}
