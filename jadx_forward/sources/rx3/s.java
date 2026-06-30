package rx3;

/* loaded from: classes10.dex */
public abstract class s implements rx3.i {

    /* renamed from: b, reason: collision with root package name */
    public static final rx3.k f482585b = new rx3.k(null);

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f482586c = new java.util.LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f482587d = new java.util.LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f482588a = new java.util.ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.List r9, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof rx3.m
            if (r0 == 0) goto L13
            r0 = r10
            rx3.m r0 = (rx3.m) r0
            int r1 = r0.f482575i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f482575i = r1
            goto L18
        L13:
            rx3.m r0 = new rx3.m
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f482573g
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f482575i
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L47
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r9 = r0.f482570d
            java.util.List r9 = (java.util.List) r9
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L9b
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            java.lang.Object r9 = r0.f482572f
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r2 = r0.f482571e
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r6 = r0.f482570d
            rx3.s r6 = (rx3.s) r6
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L75
        L47:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            kotlinx.coroutines.flow.n r2 = new kotlinx.coroutines.flow.n
            r2.<init>(r9)
            rx3.p r6 = new rx3.p
            r6.<init>(r5)
            r7 = 0
            kotlinx.coroutines.flow.j r2 = p3325xe03a0797.p3326xc267989b.p3328x30012e.l.m(r2, r7, r6, r4, r5)
            rx3.q r6 = new rx3.q
            r6.<init>(r10)
            r0.f482570d = r8
            r0.f482571e = r9
            r0.f482572f = r10
            r0.f482575i = r4
            java.lang.Object r2 = r2.a(r6, r0)
            if (r2 != r1) goto L72
            return r1
        L72:
            r6 = r8
            r2 = r9
            r9 = r10
        L75:
            int r10 = r9.size()
            if (r10 <= r4) goto L83
            rx3.l r10 = new rx3.l
            r10.<init>(r2)
            kz5.g0.t(r9, r10)
        L83:
            kotlinx.coroutines.p0 r10 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r10 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            rx3.r r2 = new rx3.r
            r2.<init>(r6, r9, r5)
            r0.f482570d = r9
            r0.f482571e = r5
            r0.f482572f = r5
            r0.f482575i = r3
            java.lang.Object r10 = p3325xe03a0797.p3326xc267989b.l.g(r10, r2, r0)
            if (r10 != r1) goto L9b
            return r1
        L9b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: rx3.s.c(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void d(int i17, java.lang.Object holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.util.Map map = f482587d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) map;
        java.lang.Object obj = linkedHashMap.get(valueOf);
        if (obj == null) {
            obj = new java.util.LinkedHashSet();
            linkedHashMap.put(valueOf, obj);
        }
        java.util.Set set = (java.util.Set) obj;
        set.remove(holder);
        if (set.isEmpty()) {
            f482586c.remove(java.lang.Integer.valueOf(i17));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtoneDataLoader", "release type:" + i17 + ", holder:" + holder + ", refCount:" + set.size());
    }
}
