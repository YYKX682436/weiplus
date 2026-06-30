package pu0;

/* loaded from: classes5.dex */
public final class b implements pu0.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f439942a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p479x4179489f.C4130xaff89a12 f439943b;

    public b(com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 mmkey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mmkey, "mmkey");
        this.f439942a = mmkey;
    }

    @Override // pu0.a
    public synchronized void a() {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4130xaff89a12 c4130xaff89a12 = this.f439943b;
        if (c4130xaff89a12 != null) {
            c4130xaff89a12.e();
        }
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4130xaff89a12 c4130xaff89a122 = this.f439943b;
        if (c4130xaff89a122 != null) {
            c4130xaff89a122.d();
        }
        this.f439943b = null;
    }

    public final java.util.HashMap b(com.p314xaae8f345.mm.vfs.r6 r6Var, java.util.List list) {
        com.p314xaae8f345.mm.vfs.r6[] G;
        java.lang.Object obj;
        java.util.HashMap hashMap = new java.util.HashMap();
        if (r6Var.m() && r6Var.y() && (G = r6Var.G()) != null) {
            for (com.p314xaae8f345.mm.vfs.r6 r6Var2 : G) {
                java.lang.String m82467xfb82e301 = r6Var2.m82467xfb82e301();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m82467xfb82e301, "getName(...)");
                if (!r26.n0.B(m82467xfb82e301, "__MACOSX", false)) {
                    if (r6Var2.y()) {
                        hashMap.putAll(b(r6Var2, list));
                    } else if (r6Var2.A()) {
                        java.util.Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            java.lang.String m82467xfb82e3012 = r6Var2.m82467xfb82e301();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m82467xfb82e3012, "getName(...)");
                            if (r26.i0.y(m82467xfb82e3012, (java.lang.String) obj, false)) {
                                break;
                            }
                        }
                        java.lang.String str = (java.lang.String) obj;
                        if (str != null) {
                            hashMap.put(str, r6Var2);
                        }
                        r6Var2.m82467xfb82e301();
                    }
                }
            }
        }
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.p314xaae8f345.p457x3304c6.p479x4179489f.C4130xaff89a12 c() {
        /*
            Method dump skipped, instructions count: 1173
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pu0.b.c():com.tencent.maas.moviecomposing.ASRProcessor");
    }

    public synchronized java.lang.Boolean d(java.nio.ByteBuffer t17) {
        java.lang.Object m143895xf1229813;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4131x387bddf0 c4131x387bddf0;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(t17, "t");
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4130xaff89a12 c4130xaff89a12 = this.f439943b;
        java.lang.Boolean valueOf = c4130xaff89a12 != null ? java.lang.Boolean.valueOf(c4130xaff89a12.b()) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SubtitleLocalARSApi", "process: isResourcesReady " + valueOf);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, java.lang.Boolean.TRUE)) {
            return java.lang.Boolean.FALSE;
        }
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            com.p314xaae8f345.p457x3304c6.p479x4179489f.C4130xaff89a12 c4130xaff89a122 = this.f439943b;
            boolean z17 = false;
            if (c4130xaff89a122 != null && (c4131x387bddf0 = (com.p314xaae8f345.p457x3304c6.p479x4179489f.C4131x387bddf0) kz5.z.O(c4130xaff89a122.c(t17))) != null && (c4129xdee64553 = c4131x387bddf0.f129894a) != null && c4129xdee64553.m34010x7b953cf2()) {
                z17 = true;
            }
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.valueOf(z17));
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SubtitleLocalARSApi", "SubtitleLocalARSApi process: ", m143898xd4a2fc34);
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
            m143895xf1229813 = bool;
        }
        return (java.lang.Boolean) m143895xf1229813;
    }
}
