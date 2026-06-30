package com.p176xb6135e39.p280x308fcb.p281x21ffc6bd;

/* renamed from: com.google.gson.internal.Excluder */
/* loaded from: classes16.dex */
public final class C2760x7ab541f8 implements com.p176xb6135e39.p280x308fcb.w, java.lang.Cloneable {

    /* renamed from: i, reason: collision with root package name */
    public static final com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.C2760x7ab541f8 f126218i = new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.C2760x7ab541f8();

    /* renamed from: d, reason: collision with root package name */
    public final double f126219d = -1.0d;

    /* renamed from: e, reason: collision with root package name */
    public final int f126220e = 136;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f126221f = true;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f126222g = java.util.Collections.emptyList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f126223h = java.util.Collections.emptyList();

    @Override // com.p176xb6135e39.p280x308fcb.w
    public com.p176xb6135e39.p280x308fcb.v a(final com.p176xb6135e39.p280x308fcb.i iVar, final ib.a aVar) {
        final boolean z17;
        final boolean z18;
        java.lang.Class cls = aVar.f371554a;
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
            return new com.p176xb6135e39.p280x308fcb.v() { // from class: com.google.gson.internal.Excluder.1

                /* renamed from: a, reason: collision with root package name */
                public com.p176xb6135e39.p280x308fcb.v f126224a;

                @Override // com.p176xb6135e39.p280x308fcb.v
                public java.lang.Object b(jb.b bVar) {
                    if (z18) {
                        bVar.Q();
                        return null;
                    }
                    com.p176xb6135e39.p280x308fcb.v vVar = this.f126224a;
                    if (vVar == null) {
                        vVar = iVar.e(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.C2760x7ab541f8.this, aVar);
                        this.f126224a = vVar;
                    }
                    return vVar.b(bVar);
                }

                @Override // com.p176xb6135e39.p280x308fcb.v
                public void c(jb.d dVar, java.lang.Object obj) {
                    if (z17) {
                        dVar.p();
                        return;
                    }
                    com.p176xb6135e39.p280x308fcb.v vVar = this.f126224a;
                    if (vVar == null) {
                        vVar = iVar.e(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.C2760x7ab541f8.this, aVar);
                        this.f126224a = vVar;
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
            double r0 = r4.f126219d
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
            boolean r0 = r4.f126221f
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
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.C2760x7ab541f8.b(java.lang.Class):boolean");
    }

    public final boolean c(java.lang.Class cls, boolean z17) {
        java.util.Iterator it = (z17 ? this.f126222g : this.f126223h).iterator();
        if (!it.hasNext()) {
            return false;
        }
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
        throw null;
    }

    /* renamed from: clone */
    public java.lang.Object m20475x5a5dd5d() {
        try {
            return (com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.C2760x7ab541f8) super.clone();
        } catch (java.lang.CloneNotSupportedException e17) {
            throw new java.lang.AssertionError(e17);
        }
    }

    public final boolean d(fb.c cVar, fb.d dVar) {
        double d17 = this.f126219d;
        if (cVar == null || cVar.m129292x6ac9171() <= d17) {
            return dVar == null || (dVar.m129293x6ac9171() > d17 ? 1 : (dVar.m129293x6ac9171() == d17 ? 0 : -1)) > 0;
        }
        return false;
    }
}
