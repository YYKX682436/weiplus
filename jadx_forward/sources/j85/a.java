package j85;

/* loaded from: classes15.dex */
public final class a implements com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 {

    /* renamed from: d, reason: collision with root package name */
    public static final j85.a f379773d = new j85.a();

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = j85.g.f379786c;
        if (copyOnWriteArrayList.size() > 100) {
            java.util.ArrayList arrayList = j85.g.f379788e;
            arrayList.add(java.lang.Long.valueOf(android.os.SystemClock.uptimeMillis()));
            if (arrayList.size() == 5) {
                if (((java.lang.Number) kz5.n0.i0(arrayList)).longValue() - ((java.lang.Number) kz5.n0.X(arrayList)).longValue() < j85.g.f379789f) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6952x82e688b0 c6952x82e688b0 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6952x82e688b0();
                    c6952x82e688b0.f142561d = 0;
                    c6952x82e688b0.f142568k = c6952x82e688b0.b("ProcessName", bm5.f1.a(), true);
                    c6952x82e688b0.f142569l = c6952x82e688b0.b("ErrStack", "too freq!; report 5 times in 2 seconds", true);
                    c6952x82e688b0.f142564g = c6952x82e688b0.b("CurrentActivity", com.p314xaae8f345.mm.app.w.INSTANCE.h(), true);
                    c6952x82e688b0.k();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j85.g.f379785b, "reportTooFrequency");
                }
                arrayList.clear();
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.addAll(copyOnWriteArrayList);
            copyOnWriteArrayList.clear();
            java.util.Iterator it = arrayList2.iterator();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6952x82e688b0 c6952x82e688b02 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6952x82e688b0) next;
                int i17 = c6952x82e688b02.f142561d;
                java.lang.String a17 = i17 == 0 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(c6952x82e688b02.f142569l) : i17 == 1 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(c6952x82e688b02.f142565h) : null;
                if (a17 != null) {
                    java.util.HashMap hashMap = j85.g.f379787d;
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6952x82e688b0 c6952x82e688b03 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6952x82e688b0) hashMap.get(a17);
                    if (c6952x82e688b03 == null) {
                        hashMap.put(a17, c6952x82e688b02);
                    } else {
                        c6952x82e688b03.f142567j = c6952x82e688b03.b("MethodOffsetTime", c6952x82e688b03.f142567j + ';' + c6952x82e688b02.f142567j, true);
                        it.remove();
                    }
                }
            }
            j85.g.f379787d.clear();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j85.g.f379785b, "report，size = " + arrayList2.size());
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                ((com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6952x82e688b0) it6.next()).k();
            }
            arrayList2.clear();
        }
        return false;
    }
}
