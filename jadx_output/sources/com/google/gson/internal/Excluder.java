package com.google.gson.internal;

/* loaded from: classes16.dex */
public final class Excluder implements com.google.gson.w, java.lang.Cloneable {

    /* renamed from: i, reason: collision with root package name */
    public static final com.google.gson.internal.Excluder f44685i = new com.google.gson.internal.Excluder();

    /* renamed from: d, reason: collision with root package name */
    public final double f44686d = -1.0d;

    /* renamed from: e, reason: collision with root package name */
    public final int f44687e = 136;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f44688f = true;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f44689g = java.util.Collections.emptyList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f44690h = java.util.Collections.emptyList();

    @Override // com.google.gson.w
    public com.google.gson.v a(final com.google.gson.i iVar, final ib.a aVar) {
        final boolean z17;
        final boolean z18;
        java.lang.Class cls = aVar.f290021a;
        boolean b17 = b(cls);
        if (b17) {
            z17 = true;
        } else {
            c(cls, true);
            z17 = false;
        }
        if (b17) {
            z18 = true;
        } else {
            c(cls, false);
            z18 = false;
        }
        if (z17 || z18) {
            return new com.google.gson.v() { // from class: com.google.gson.internal.Excluder.1

                /* renamed from: a, reason: collision with root package name */
                public com.google.gson.v f44691a;

                @Override // com.google.gson.v
                public java.lang.Object b(jb.b bVar) {
                    if (z18) {
                        bVar.Q();
                        return null;
                    }
                    com.google.gson.v vVar = this.f44691a;
                    if (vVar == null) {
                        vVar = iVar.e(com.google.gson.internal.Excluder.this, aVar);
                        this.f44691a = vVar;
                    }
                    return vVar.b(bVar);
                }

                @Override // com.google.gson.v
                public void c(jb.d dVar, java.lang.Object obj) {
                    if (z17) {
                        dVar.p();
                        return;
                    }
                    com.google.gson.v vVar = this.f44691a;
                    if (vVar == null) {
                        vVar = iVar.e(com.google.gson.internal.Excluder.this, aVar);
                        this.f44691a = vVar;
                    }
                    vVar.c(dVar, obj);
                }
            };
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(java.lang.Class r5) {
        /*
            r4 = this;
            double r0 = r4.f44686d
            r2 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L20
            java.lang.Class<fb.c> r0 = fb.c.class
            java.lang.annotation.Annotation r0 = r5.getAnnotation(r0)
            fb.c r0 = (fb.c) r0
            java.lang.Class<fb.d> r2 = fb.d.class
            java.lang.annotation.Annotation r2 = r5.getAnnotation(r2)
            fb.d r2 = (fb.d) r2
            boolean r0 = r4.d(r0, r2)
            if (r0 != 0) goto L20
            return r1
        L20:
            boolean r0 = r4.f44688f
            r2 = 0
            if (r0 != 0) goto L3e
            boolean r0 = r5.isMemberClass()
            if (r0 == 0) goto L3a
            int r0 = r5.getModifiers()
            r0 = r0 & 8
            if (r0 == 0) goto L35
            r0 = r1
            goto L36
        L35:
            r0 = r2
        L36:
            if (r0 != 0) goto L3a
            r0 = r1
            goto L3b
        L3a:
            r0 = r2
        L3b:
            if (r0 == 0) goto L3e
            return r1
        L3e:
            java.lang.Class<java.lang.Enum> r0 = java.lang.Enum.class
            boolean r0 = r0.isAssignableFrom(r5)
            if (r0 != 0) goto L54
            boolean r0 = r5.isAnonymousClass()
            if (r0 != 0) goto L52
            boolean r5 = r5.isLocalClass()
            if (r5 == 0) goto L54
        L52:
            r5 = r1
            goto L55
        L54:
            r5 = r2
        L55:
            if (r5 == 0) goto L58
            return r1
        L58:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.Excluder.b(java.lang.Class):boolean");
    }

    public final boolean c(java.lang.Class cls, boolean z17) {
        java.util.Iterator it = (z17 ? this.f44689g : this.f44690h).iterator();
        if (!it.hasNext()) {
            return false;
        }
        android.support.v4.media.f.a(it.next());
        throw null;
    }

    public java.lang.Object clone() {
        try {
            return (com.google.gson.internal.Excluder) super.clone();
        } catch (java.lang.CloneNotSupportedException e17) {
            throw new java.lang.AssertionError(e17);
        }
    }

    public final boolean d(fb.c cVar, fb.d dVar) {
        double d17 = this.f44686d;
        if (cVar == null || cVar.value() <= d17) {
            return dVar == null || (dVar.value() > d17 ? 1 : (dVar.value() == d17 ? 0 : -1)) > 0;
        }
        return false;
    }
}
