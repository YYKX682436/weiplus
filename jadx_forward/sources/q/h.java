package q;

/* loaded from: classes13.dex */
public class h implements java.lang.Iterable {

    /* renamed from: d, reason: collision with root package name */
    public q.d f440744d;

    /* renamed from: e, reason: collision with root package name */
    public q.d f440745e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.WeakHashMap f440746f = new java.util.WeakHashMap();

    /* renamed from: g, reason: collision with root package name */
    public int f440747g = 0;

    public q.d d(java.lang.Object obj) {
        q.d dVar = this.f440744d;
        while (dVar != null && !dVar.f440735d.equals(obj)) {
            dVar = dVar.f440737f;
        }
        return dVar;
    }

    public java.lang.Object e(java.lang.Object obj, java.lang.Object obj2) {
        q.d d17 = d(obj);
        if (d17 != null) {
            return d17.f440736e;
        }
        q.d dVar = new q.d(obj, obj2);
        this.f440747g++;
        q.d dVar2 = this.f440745e;
        if (dVar2 == null) {
            this.f440744d = dVar;
            this.f440745e = dVar;
            return null;
        }
        dVar2.f440737f = dVar;
        dVar.f440738g = dVar2;
        this.f440745e = dVar;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((q.f) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0054, code lost:
    
        return false;
     */
    /* renamed from: equals */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m159181xb2c87fbf(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof q.h
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            q.h r7 = (q.h) r7
            int r1 = r6.f440747g
            int r3 = r7.f440747g
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            q.f r3 = (q.f) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            q.f r4 = (q.f) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            q.f r7 = (q.f) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            goto L54
        L53:
            r0 = r2
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q.h.m159181xb2c87fbf(java.lang.Object):boolean");
    }

    public java.lang.Object g(java.lang.Object obj) {
        q.d d17 = d(obj);
        if (d17 == null) {
            return null;
        }
        this.f440747g--;
        java.util.WeakHashMap weakHashMap = this.f440746f;
        if (!weakHashMap.isEmpty()) {
            java.util.Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((q.g) it.next()).a(d17);
            }
        }
        q.d dVar = d17.f440738g;
        if (dVar != null) {
            dVar.f440737f = d17.f440737f;
        } else {
            this.f440744d = d17.f440737f;
        }
        q.d dVar2 = d17.f440737f;
        if (dVar2 != null) {
            dVar2.f440738g = dVar;
        } else {
            this.f440745e = dVar;
        }
        d17.f440737f = null;
        d17.f440738g = null;
        return d17.f440736e;
    }

    /* renamed from: hashCode */
    public int m159182x8cdac1b() {
        java.util.Iterator it = iterator();
        int i17 = 0;
        while (true) {
            q.f fVar = (q.f) it;
            if (!fVar.hasNext()) {
                return i17;
            }
            i17 += ((java.util.Map.Entry) fVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        q.b bVar = new q.b(this.f440744d, this.f440745e);
        this.f440746f.put(bVar, java.lang.Boolean.FALSE);
        return bVar;
    }

    /* renamed from: toString */
    public java.lang.String m159183x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        java.util.Iterator it = iterator();
        while (true) {
            q.f fVar = (q.f) it;
            if (!fVar.hasNext()) {
                sb6.append("]");
                return sb6.toString();
            }
            sb6.append(((java.util.Map.Entry) fVar.next()).toString());
            if (fVar.hasNext()) {
                sb6.append(", ");
            }
        }
    }
}
