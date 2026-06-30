package o73;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f425078a = new java.util.LinkedList();

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if (r2 == (-1)) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if (r3 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        r8.f425078a.remove(r2);
        r8.f425078a.addLast(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o73.b a(yz5.l r9) {
        /*
            r8 = this;
            java.util.LinkedList r0 = r8.f425078a
            monitor-enter(r0)
            java.util.LinkedList r1 = r8.f425078a     // Catch: java.lang.Throwable -> L43
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L43
            r2 = 0
        La:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L43
            r4 = -1
            r5 = 0
            if (r3 == 0) goto L2f
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L43
            int r6 = r2 + 1
            if (r2 < 0) goto L2b
            o73.b r3 = (o73.b) r3     // Catch: java.lang.Throwable -> L43
            java.lang.Object r7 = r9.mo146xb9724478(r3)     // Catch: java.lang.Throwable -> L43
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L43
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L43
            if (r7 == 0) goto L29
            goto L31
        L29:
            r2 = r6
            goto La
        L2b:
            kz5.c0.p()     // Catch: java.lang.Throwable -> L43
            throw r5     // Catch: java.lang.Throwable -> L43
        L2f:
            r2 = r4
            r3 = r5
        L31:
            if (r2 == r4) goto L41
            if (r3 == 0) goto L41
            java.util.LinkedList r9 = r8.f425078a     // Catch: java.lang.Throwable -> L43
            r9.remove(r2)     // Catch: java.lang.Throwable -> L43
            java.util.LinkedList r9 = r8.f425078a     // Catch: java.lang.Throwable -> L43
            r9.addLast(r3)     // Catch: java.lang.Throwable -> L43
            monitor-exit(r0)
            return r3
        L41:
            monitor-exit(r0)
            return r5
        L43:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o73.f.a(yz5.l):o73.b");
    }

    public final void b(o73.b map) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(map, "map");
        synchronized (this.f425078a) {
            this.f425078a.addLast(map);
        }
    }

    /* renamed from: toString */
    public java.lang.String m150809x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cache:");
        java.util.LinkedList linkedList = this.f425078a;
        sb6.append(linkedList.size());
        sb6.append(" - ");
        sb6.append(linkedList);
        return sb6.toString();
    }
}
