package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes12.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p642xad8b531f.k0 f145065a = new com.p314xaae8f345.mm.p642xad8b531f.k0(null);

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f145066b;

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f145067c;

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f145068d;

    static {
        jz5.i iVar = jz5.i.f384362d;
        f145066b = jz5.h.a(iVar, com.p314xaae8f345.mm.p642xad8b531f.i0.f144930d);
        f145067c = jz5.h.a(iVar, com.p314xaae8f345.mm.p642xad8b531f.h0.f144909d);
        f145068d = jz5.h.a(iVar, com.p314xaae8f345.mm.p642xad8b531f.j0.f144936d);
    }

    public final void a(android.content.Context context, java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        l85.n0 n0Var = (l85.n0) l85.h1.f398710a.get(str);
        if (n0Var != null) {
            synchronized (((com.p314xaae8f345.mm.p642xad8b531f.o0) f145066b.mo141623x754a37bb())) {
                java.util.List list = (java.util.List) ((java.util.Map) f145067c.mo141623x754a37bb()).get(str);
                if (list != null) {
                    kz5.h0.B(list, new com.p314xaae8f345.mm.p642xad8b531f.m0(n0Var, arrayList));
                }
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p642xad8b531f.l0 l0Var = (com.p314xaae8f345.mm.p642xad8b531f.l0) it.next();
            b(context, l0Var.f144945c, l0Var.f144944b, false, l0Var.f144947e);
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
    
        r0.mo40017xcdd95364();
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p642xad8b531f.o0.b(android.content.Context, android.content.Intent, java.lang.String, boolean, android.content.Intent):void");
    }
}
