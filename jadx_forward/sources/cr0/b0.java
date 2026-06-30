package cr0;

/* loaded from: classes12.dex */
public final class b0 {
    public b0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(cr0.h0 snapshot, com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10870x6e1f7212 accStats) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshot, "snapshot");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(accStats, "accStats");
        for (java.util.Map.Entry entry : kz5.c1.q(kz5.n0.x0(kz5.n0.F0(kz5.e1.v(accStats.m46636xc3ec362e()), new cr0.x()))).entrySet()) {
            snapshot.b().add(new cr0.d0((java.lang.String) entry.getKey(), kz5.n0.J0(((java.util.Map) entry.getValue()).values())));
        }
        for (java.util.Map.Entry entry2 : kz5.c1.q(kz5.n0.x0(kz5.n0.F0(kz5.e1.v(accStats.m46637x2db8acb0()), new cr0.y()))).entrySet()) {
            snapshot.c().add(new cr0.d0((java.lang.String) entry2.getKey(), kz5.n0.J0(((java.util.Map) entry2.getValue()).values())));
        }
        snapshot.d();
        long currentTimeMillis = java.lang.System.currentTimeMillis() - accStats.getAccBeginTime();
        if (currentTimeMillis < 0) {
            currentTimeMillis = 0;
        }
        snapshot.f303167d = rh.x2.b(java.lang.Long.valueOf(currentTimeMillis));
    }

    public final void b(cr0.h0 bgn, cr0.h0 end, cr0.h0 dlt) {
        java.lang.Object obj;
        java.lang.Object obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bgn, "bgn");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(end, "end");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dlt, "dlt");
        long j17 = 0;
        if (!end.b().isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (cr0.d0 d0Var : end.b()) {
                java.util.Iterator it = bgn.b().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((cr0.d0) obj2).f303137d, d0Var.f303137d)) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                cr0.d0 d0Var2 = (cr0.d0) obj2;
                if (d0Var2 == null) {
                    d0Var2 = new cr0.d0(d0Var.f303137d, 0L);
                }
                d0Var.getClass();
                rh.d3 dlt2 = new cr0.c0(d0Var2, d0Var).f477019c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(dlt2, "dlt");
                arrayList.add(dlt2);
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                java.lang.Object next = it6.next();
                java.lang.Number number = ((cr0.d0) next).f303138e.f477085a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number, "get(...)");
                if (number.longValue() > 0) {
                    arrayList2.add(next);
                }
            }
            dlt.b().addAll(kz5.n0.F0(arrayList2, new cr0.z()));
        }
        if (!end.c().isEmpty()) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (cr0.d0 d0Var3 : end.c()) {
                java.util.Iterator it7 = bgn.c().iterator();
                while (true) {
                    if (it7.hasNext()) {
                        obj = it7.next();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((cr0.d0) obj).f303137d, d0Var3.f303137d)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                cr0.d0 d0Var4 = (cr0.d0) obj;
                if (d0Var4 == null) {
                    d0Var4 = new cr0.d0(d0Var3.f303137d, 0L);
                }
                d0Var3.getClass();
                rh.d3 dlt3 = new cr0.c0(d0Var4, d0Var3).f477019c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(dlt3, "dlt");
                arrayList3.add(dlt3);
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.util.Iterator it8 = arrayList3.iterator();
            while (it8.hasNext()) {
                java.lang.Object next2 = it8.next();
                java.lang.Number number2 = ((cr0.d0) next2).f303138e.f477085a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number2, "get(...)");
                if (number2.longValue() > 0) {
                    arrayList4.add(next2);
                }
            }
            dlt.c().addAll(kz5.n0.F0(arrayList4, new cr0.a0()));
        }
        dlt.d();
        java.lang.Number number3 = bgn.f303167d.f477085a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number3, "get(...)");
        if (number3.longValue() > 0) {
            java.lang.Number number4 = end.f303167d.f477085a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number4, "get(...)");
            if (number4.longValue() > 0) {
                long longValue = end.f303167d.f477085a.longValue();
                java.lang.Number number5 = bgn.f303167d.f477085a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number5, "get(...)");
                j17 = longValue - number5.longValue();
            }
        }
        dlt.f303167d = rh.x2.b(java.lang.Long.valueOf(j17));
    }

    public final float c(long j17, long j18) {
        float f17 = ((float) j17) / 1048576.0f;
        long j19 = j18 / com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8;
        if (j19 < 1) {
            j19 = 1;
        }
        return ri.b0.e(f17 / ((float) j19), 2);
    }
}
