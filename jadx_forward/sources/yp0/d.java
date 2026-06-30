package yp0;

/* loaded from: classes7.dex */
public final class d extends lc3.d0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "getVisibleMsgMetas";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.d0
    public lc3.a0 r(lc3.a0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        lc3.e eVar = this.f399423a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MEGetVisibleMsgMetas", "[ME] getVisibleMsgMetas data = " + data);
        boolean optBoolean = data.optBoolean("needFrame", false);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((wp0.c) eVar).N0(optBoolean).entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(((wp0.b) ((java.util.Map.Entry) it.next()).getValue()).b());
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("msgMetas", arrayList);
        return l(hashMap);
    }
}
