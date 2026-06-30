package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes5.dex */
public final class k80 {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f208588a = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.i80.f208468d);

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f208589b = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.j80.f208521d);

    /* renamed from: c, reason: collision with root package name */
    public boolean f208590c;

    public k80() {
        b();
    }

    public static final java.lang.String a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.k80 k80Var, java.lang.String str) {
        if (!((java.lang.Boolean) ((jz5.n) k80Var.f208588a).mo141623x754a37bb()).booleanValue()) {
            return str + " size=" + k80Var.c().size();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str);
        java.util.Iterator it = k80Var.c().entrySet().iterator();
        while (it.hasNext()) {
            sb6.append(((java.util.Map.Entry) it.next()).getValue());
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final synchronized void b() {
        if (!this.f208590c) {
            try {
                ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).wi(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.h80(this));
                this.f208590c = true;
            } catch (c01.c e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderConfigInitExptData", "addFinderInitCallback err, " + e17.getMessage());
            } catch (java.lang.IllegalStateException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderConfigInitExptData", "addFinderInitCallback err, " + e18.getMessage());
            }
        }
    }

    public final java.util.concurrent.ConcurrentHashMap c() {
        return (java.util.concurrent.ConcurrentHashMap) ((jz5.n) this.f208589b).mo141623x754a37bb();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        if (r0 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00af, code lost:
    
        if (r0 == null) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(int r9, java.lang.String r10, java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.k80.d(int, java.lang.String, java.lang.Object):java.lang.Object");
    }
}
