package com.tencent.mm.booter;

/* loaded from: classes12.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.booter.k0 f63532a = new com.tencent.mm.booter.k0(null);

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f63533b;

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f63534c;

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f63535d;

    static {
        jz5.i iVar = jz5.i.f302829d;
        f63533b = jz5.h.a(iVar, com.tencent.mm.booter.i0.f63397d);
        f63534c = jz5.h.a(iVar, com.tencent.mm.booter.h0.f63376d);
        f63535d = jz5.h.a(iVar, com.tencent.mm.booter.j0.f63403d);
    }

    public final void a(android.content.Context context, java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        l85.n0 n0Var = (l85.n0) l85.h1.f317177a.get(str);
        if (n0Var != null) {
            synchronized (((com.tencent.mm.booter.o0) f63533b.getValue())) {
                java.util.List list = (java.util.List) ((java.util.Map) f63534c.getValue()).get(str);
                if (list != null) {
                    kz5.h0.B(list, new com.tencent.mm.booter.m0(n0Var, arrayList));
                }
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.booter.l0 l0Var = (com.tencent.mm.booter.l0) it.next();
            b(context, l0Var.f63412c, l0Var.f63411b, false, l0Var.f63414e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0180, code lost:
    
        if (r0 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01d2, code lost:
    
        l85.l1.a(6, 1, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01da, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01cf, code lost:
    
        r0.unLock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01cd, code lost:
    
        if (r0 == null) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.content.Context r18, android.content.Intent r19, java.lang.String r20, boolean r21, android.content.Intent r22) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.booter.o0.b(android.content.Context, android.content.Intent, java.lang.String, boolean, android.content.Intent):void");
    }
}
