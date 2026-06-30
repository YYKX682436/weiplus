package xr;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final xr.g f537678a;

    /* renamed from: b, reason: collision with root package name */
    public final xr.d f537679b;

    public f(xr.g callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f537678a = callback;
        this.f537679b = new xr.d(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007d, code lost:
    
        if (r5.f537676b.f66779x8987ca93 < r7.f66779x8987ca93) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0084 A[Catch: all -> 0x00e6, TryCatch #0 {, blocks: (B:4:0x003a, B:6:0x0046, B:9:0x0056, B:14:0x0084, B:15:0x00a4, B:17:0x00b2, B:19:0x00b8, B:25:0x0060, B:27:0x0064, B:33:0x0075, B:36:0x0097), top: B:3:0x003a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r10, qk.h6 r11, as.a r12) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xr.f.a(int, qk.h6, as.a):void");
    }

    public final void b() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        xr.d dVar = this.f537679b;
        synchronized (dVar.f537674d) {
            boolean z17 = false;
            try {
                if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2517x2c0e0b6f.C19978x203ef773()) == 1) {
                    z17 = true;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FunctionMsg.FunctionMsgQueue", e17, "[isSerializeEnabled] config read failed", new java.lang.Object[0]);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.FunctionMsgQueue", "[loop] size:" + dVar.f537671a.size() + " serialize:" + z17);
            java.util.ListIterator listIterator = dVar.f537671a.listIterator();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(listIterator, "listIterator(...)");
            if (!z17) {
                while (listIterator.hasNext()) {
                    java.lang.Object next = listIterator.next();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
                    xr.e eVar = (xr.e) next;
                    if (eVar.f537676b.f66758x27886e88 <= c01.id.a() / 1000) {
                        listIterator.remove();
                        dVar.f537672b.remove(eVar.f537676b.f66769xf47740ff);
                        dVar.f537673c.c(eVar);
                    }
                }
            } else if (listIterator.hasNext()) {
                java.lang.Object next2 = listIterator.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next2, "next(...)");
                xr.e eVar2 = (xr.e) next2;
                if (eVar2.f537676b.f66758x27886e88 <= c01.id.a() / 1000) {
                    listIterator.remove();
                    dVar.f537672b.remove(eVar2.f537676b.f66769xf47740ff);
                    dVar.f537673c.c(eVar2);
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.FunctionMsgTimer", "[check] Cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    public final void c(xr.e task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        ((xr.a) this.f537678a).getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onTaskExpired] id:");
        qk.h6 h6Var = task.f537676b;
        sb6.append(h6Var.f66769xf47740ff);
        sb6.append(" op:");
        sb6.append(task.f537675a);
        sb6.append(" status:");
        sb6.append(h6Var.f66777x10a0fed7);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.FunctionMsgEngine", sb6.toString());
        task.f537677c.b(xr.a.f537664e, xr.a.f537667h, task);
    }

    public final void d(xr.e task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        qk.h6 h6Var = task.f537676b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.FunctionMsgTimer", "[onTaskComplete] id:%s", h6Var.f66769xf47740ff);
        ((xr.a) this.f537678a).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.FunctionMsgEngine", "[onTaskComplete] id:" + h6Var.f66769xf47740ff + " status:" + h6Var.f66777x10a0fed7);
        boolean z17 = false;
        try {
            if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2517x2c0e0b6f.C19978x203ef773()) == 1) {
                z17 = true;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FunctionMsg.FunctionMsgQueue", e17, "[isSerializeEnabled] config read failed", new java.lang.Object[0]);
        }
        if (z17) {
            b();
        }
    }
}
