package cp5;

/* loaded from: classes14.dex */
public final class j implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p0 f302692d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f302693e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f302694f;

    /* renamed from: g, reason: collision with root package name */
    public final android.util.SparseArray f302695g;

    public j(p3325xe03a0797.p3326xc267989b.p0 coroutineDispatcher) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coroutineDispatcher, "coroutineDispatcher");
        this.f302692d = coroutineDispatcher;
        this.f302693e = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f302694f = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f302695g = new android.util.SparseArray();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r11, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof cp5.i
            if (r0 == 0) goto L13
            r0 = r12
            cp5.i r0 = (cp5.i) r0
            int r1 = r0.f302691h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f302691h = r1
            goto L18
        L13:
            cp5.i r0 = new cp5.i
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.f302689f
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f302691h
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            int r11 = r0.f302688e
            java.lang.Object r0 = r0.f302687d
            cp5.j r0 = (cp5.j) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            goto L59
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            android.util.SparseArray r12 = r10.f302695g
            java.lang.Object r12 = r12.get(r11)
            cp5.e r12 = (cp5.e) r12
            if (r12 != 0) goto L80
            r0.f302687d = r10
            r0.f302688e = r11
            r0.f302691h = r3
            cp5.h r12 = new cp5.h
            r2 = 0
            r4 = 3
            r12.<init>(r4, r10, r2)
            kotlinx.coroutines.p0 r2 = r10.f302692d
            java.lang.Object r12 = p3325xe03a0797.p3326xc267989b.l.g(r2, r12, r0)
            if (r12 != r1) goto L58
            return r1
        L58:
            r0 = r10
        L59:
            java.util.List r12 = (java.util.List) r12
            cp5.e r1 = new cp5.e
            r2 = 0
            java.lang.Object r2 = r12.get(r2)
            r7 = r2
            cp5.f r7 = (cp5.f) r7
            java.lang.Object r2 = r12.get(r3)
            r8 = r2
            cp5.f r8 = (cp5.f) r8
            r2 = 2
            java.lang.Object r12 = r12.get(r2)
            r9 = r12
            cp5.f r9 = (cp5.f) r9
            r4 = r1
            r5 = r0
            r6 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            android.util.SparseArray r12 = r0.f302695g
            r12.put(r11, r1)
            r12 = r1
        L80:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: cp5.j.a(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.IGLTextureManager", "close");
        android.util.SparseArray sparseArray = this.f302695g;
        int size = sparseArray.size();
        for (int i17 = 0; i17 < size; i17++) {
            sparseArray.keyAt(i17);
            cp5.e eVar = (cp5.e) sparseArray.valueAt(i17);
            eVar.f302670d = false;
            cp5.f fVar = eVar.f302667a;
            fVar.f302673b = false;
            fVar.f302674c.f302693e.add(fVar.f302672a);
            cp5.f fVar2 = eVar.f302668b;
            fVar2.f302673b = false;
            fVar2.f302674c.f302693e.add(fVar2.f302672a);
            cp5.f fVar3 = eVar.f302669c;
            fVar3.f302673b = false;
            fVar3.f302674c.f302693e.add(fVar3.f302672a);
        }
        java.util.Iterator it = this.f302694f.iterator();
        while (it.hasNext()) {
            ((dp5.a) ((dp5.f) it.next())).close();
        }
        this.f302695g.clear();
        this.f302693e.clear();
        this.f302694f.clear();
    }
}
