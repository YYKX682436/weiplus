package p05;

/* loaded from: classes5.dex */
public final class s3 implements rh0.y {

    /* renamed from: a, reason: collision with root package name */
    public static final p05.s3 f432221a = new p05.s3();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f432222b = kz5.c1.k(new jz5.l("MODEL_OCR_DET", 3), new jz5.l("MODEL_OCR_REC_MODEL", 3), new jz5.l("MODEL_OCR_REC_MAP", 2));

    public boolean a(java.util.ArrayList keys) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keys, "keys");
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = keys.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            hashMap.put(str, f432222b.get(str));
        }
        p05.t3 t3Var = p05.u3.f432232d;
        java.util.Iterator it6 = hashMap.entrySet().iterator();
        do {
            z17 = true;
            if (!it6.hasNext()) {
                return true;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it6.next();
            java.lang.String a17 = t3Var.a((java.lang.String) entry.getKey(), (java.lang.Integer) entry.getValue());
            if (a17 != null && a17.length() != 0) {
                z17 = false;
            }
        } while (!z17);
        return false;
    }

    public java.lang.String b(java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.lang.String a17 = p05.u3.f432232d.a(key, (java.lang.Integer) f432222b.get(key));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeVisResourceManager", "Resource : " + key + ", path: " + a17);
        return a17;
    }

    public void c(java.util.ArrayList keys) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keys, "keys");
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q qVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q();
        qVar.c("ilinkres_c42c04f5");
        qVar.f299081e.addAll(keys);
        java.util.LinkedList linkedList = qVar.f299082f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.v vVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.udr.v();
        vVar.d("wevision_version");
        if (tq5.i.f502802a == 0) {
            tq5.i.f502802a = 2014500;
        }
        vVar.c(tq5.i.f502802a);
        vVar.e(1);
        arrayList.add(vVar);
        linkedList.addAll(arrayList);
        ((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).Di(qVar, null);
    }
}
