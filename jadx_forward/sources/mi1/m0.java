package mi1;

/* loaded from: classes7.dex */
public final class m0 implements p3325xe03a0797.p3326xc267989b.y0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f408151d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final android.util.SparseArray f408152e = new android.util.SparseArray();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f408153f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public mi1.j0 f408154g;

    /* renamed from: h, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f408155h;

    public void a(mi1.g2 consume) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(consume, "consume");
        java.util.Iterator it = consume.c().iterator();
        while (it.hasNext()) {
            this.f408152e.put(((java.lang.Number) it.next()).intValue(), consume);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mi1.m0.b():void");
    }

    public void c(mi1.j0 event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("enqueue eventType ");
        int i17 = event.f408118a;
        sb6.append(i17);
        sb6.append(" priority ");
        sb6.append(event.f408120c);
        sb6.append(" type ");
        sb6.append(event.f408122e);
        sb6.append("  targetState ");
        sb6.append(event.f408119b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CapsuleAnimatorEventDispatcher", sb6.toString());
        if (this.f408152e.get(i17) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CapsuleAnimatorEventDispatcher", "enqueue but no consumer,ignore");
        } else {
            ik1.h0.b(new mi1.l0(event, this));
        }
    }

    public final boolean d(java.util.LinkedList linkedList, mi1.j0 j0Var) {
        if (!mi1.p0.a(j0Var, (mi1.j0) linkedList.peekFirst())) {
            return false;
        }
        if (!linkedList.isEmpty()) {
            java.util.Iterator it = linkedList.iterator();
            java.util.LinkedList linkedList2 = null;
            while (it.hasNext()) {
                mi1.j0 j0Var2 = (mi1.j0) it.next();
                if (j0Var2.f408120c != j0Var.f408120c) {
                    if (linkedList2 == null) {
                        linkedList2 = new java.util.LinkedList();
                    }
                    linkedList2.add(j0Var2);
                }
            }
            if (linkedList2 != null) {
                linkedList.removeAll(linkedList2);
            }
        }
        linkedList.addLast(j0Var);
        return true;
    }

    public final void e(mi1.j0 j0Var, mi1.j0 j0Var2) {
        this.f408154g = null;
        if (j0Var.f408118a != 1) {
            this.f408151d.remove(j0Var);
        }
        j0Var.f408125h = 4;
        android.util.SparseArray sparseArray = this.f408152e;
        mi1.g2 g2Var = (mi1.g2) sparseArray.get(j0Var.f408118a);
        if (g2Var != null && g2Var.d(j0Var) && g2Var.mo147328xb9a8b747()) {
            this.f408154g = j0Var;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CapsuleAnimatorEventDispatcher", "adjustCurrentEvent currentEvent " + this.f408154g);
        }
        if (j0Var2 != null) {
            j0Var2.f408125h = 4;
            mi1.g2 g2Var2 = (mi1.g2) sparseArray.get(j0Var2.f408118a);
            if (g2Var2 != null && g2Var2.d(j0Var2) && g2Var2.mo147328xb9a8b747()) {
                this.f408154g = j0Var2;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CapsuleAnimatorEventDispatcher", "adjustCurrentEvent stay last currentEvent " + this.f408154g);
            }
        }
        b();
    }

    @Override // p3325xe03a0797.p3326xc267989b.y0
    /* renamed from: getCoroutineContext */
    public oz5.l mo7786x54170f2d() {
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f408155h;
        if (r2Var == null) {
            r2Var = p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null);
        }
        this.f408155h = r2Var;
        return g3Var.mo7096x348d9a(r2Var);
    }
}
