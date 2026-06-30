package t02;

@j95.b
/* loaded from: classes12.dex */
public final class e extends jm0.o implements a00.i {
    @Override // jm0.o
    public void Di(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        set.add(u02.b.class);
    }

    public zz.b Zi(java.lang.String str, int i17, java.lang.String str2, byte[] bArr) {
        i95.m c17 = i95.n0.c(t02.e.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        jm0.o oVar = (jm0.o) c17;
        if (!jm0.g.class.isAssignableFrom(u02.b.class)) {
            throw new java.lang.IllegalArgumentException(oVar.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(oVar.getViewModel(), new jm0.e(oVar)).a(u02.b.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        u02.b bVar = (u02.b) ((jm0.g) a17);
        if (str == null) {
            str = "";
        }
        return bVar.T6(str, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d + i17, str2, bArr);
    }

    public boolean aj(java.lang.String md52, long j17, java.lang.String savePath, int i17) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(md52, "md5");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(savePath, "savePath");
        i95.m c17 = i95.n0.c(t02.e.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        jm0.o oVar = (jm0.o) c17;
        if (!jm0.g.class.isAssignableFrom(u02.b.class)) {
            throw new java.lang.IllegalArgumentException(oVar.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(oVar.getViewModel(), new jm0.e(oVar)).a(u02.b.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        p75.l0 A0 = dm.n2.A0(md52, j17);
        w02.a aVar = w02.b.f523407m;
        zz.a aVar2 = (zz.a) A0.o(aVar.a().Q4(), zz.a.class);
        v02.m0 m0Var = v02.m0.f513803a;
        if (aVar2 == null) {
            f0Var = null;
        } else {
            if (com.p314xaae8f345.mm.vfs.w6.j(aVar2.m125330xfb83cc9b()) && com.p314xaae8f345.mm.vfs.w6.k(aVar2.m125330xfb83cc9b()) > 0 && com.p314xaae8f345.mm.vfs.w6.k(aVar2.m125330xfb83cc9b()) == aVar2.y0()) {
                java.lang.String m125330xfb83cc9b = aVar2.m125330xfb83cc9b();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m125330xfb83cc9b, "getPath(...)");
                java.lang.String w07 = aVar2.w0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(w07, "getId(...)");
                long u07 = aVar2.u0();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m125330xfb83cc9b, savePath)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.DupCheck.DupCheckStoragePLC", "get hit cache id:" + w07 + ", but same path!!!");
                    m0Var.a(5, j17, u07);
                    r10 = true;
                } else {
                    r10 = com.p314xaae8f345.mm.vfs.w6.d(m125330xfb83cc9b, savePath, true) >= 0;
                    if (r10) {
                        m0Var.a(3, j17, u07);
                    } else {
                        m0Var.a(4, j17, u07);
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DupCheck.DupCheckStoragePLC", "get hit cache id:" + aVar2.w0() + ", copy link to " + savePath + ", result: " + r10);
                return r10;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DupCheck.DupCheckStoragePLC", "get hit cache id:" + aVar2.w0() + ", but origin file deleted!!!");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DupCheck.DupCheckStoragePLC", "remove the empty line, res:" + dm.n2.t0(aVar2, false).a(aVar.a().Q4()));
            m0Var.a(2, j17, aVar2.u0());
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            m0Var.a(1, j17, i17);
        }
        return r10;
    }

    public zz.b bj(java.lang.String str, int i17, java.lang.String str2, byte[] bArr) {
        boolean z17;
        i95.m c17 = i95.n0.c(t02.e.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        jm0.o oVar = (jm0.o) c17;
        if (!jm0.g.class.isAssignableFrom(u02.b.class)) {
            throw new java.lang.IllegalArgumentException(oVar.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(oVar.getViewModel(), new jm0.e(oVar)).a(u02.b.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        zz.b T6 = ((u02.b) ((jm0.g) a17)).T6(str == null ? "" : str, 0 + i17, str2, bArr);
        if (T6.f559225b) {
            return T6;
        }
        yv1.b1 b1Var = (yv1.b1) ((c01.f8) i95.n0.c(c01.f8.class));
        if (!b1Var.Ui()) {
            return T6;
        }
        if (str != null) {
            try {
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DupCheckFeatureService", "linkDuplicatedFileByWxFileIndex err: " + e17.getMessage());
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c) {
                    throw e17;
                }
            }
            if (str.length() != 0) {
                z17 = false;
                if (!z17 && b1Var.Zi(str, i17)) {
                    zz.b bVar = new zz.b();
                    bVar.f559224a = T6.f559224a;
                    bVar.f559225b = true;
                    bVar.f559226c = T6.f559226c;
                    bVar.f559227d = true;
                    bVar.f559228e = T6.f559228e;
                    return bVar;
                }
                return T6;
            }
        }
        z17 = true;
        if (!z17) {
            zz.b bVar2 = new zz.b();
            bVar2.f559224a = T6.f559224a;
            bVar2.f559225b = true;
            bVar2.f559226c = T6.f559226c;
            bVar2.f559227d = true;
            bVar2.f559228e = T6.f559228e;
            return bVar2;
        }
        return T6;
    }

    public void cj(java.lang.String str, int i17, java.lang.String str2, byte[] bArr, yz5.l lVar) {
        final t02.c cVar = new t02.c(this, str, i17, str2, bArr, lVar);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            cVar.mo152xb9724478();
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).i(new java.util.concurrent.Callable(cVar) { // from class: t02.d

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.a f495952d;

            {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cVar, "function");
                this.f495952d = cVar;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return this.f495952d.mo152xb9724478();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zz.b fj(java.lang.String r19, int r20, java.lang.String r21, long r22, byte[] r24) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t02.e.fj(java.lang.String, int, java.lang.String, long, byte[]):zz.b");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007d, code lost:
    
        if (r2 == null) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x026a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zz.b hj(java.lang.String r31, java.lang.String r32, java.lang.String r33, int r34, int r35, java.lang.String r36) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t02.e.hj(java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String):zz.b");
    }

    public boolean ij() {
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2529x2ff57c.C20153x41e6d084()) != 1) {
            return false;
        }
        int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
        if (!((i17 == 788529167 || i17 == 788529166) || z65.c.a())) {
            if (!(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() ? ((yv1.b1) ((c01.f8) i95.n0.c(c01.f8.class))).Ui() : ((com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c) com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0(), t02.b.class)).f149933d)) {
                return false;
            }
        }
        return j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20013x97ba6766()) == 1;
    }

    public void mj(java.lang.Long l17, java.lang.String str) {
        if (l17 == null || str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DupCheckFeatureService", "[triggerC2CIncrementalClean] null param, msgId = " + l17 + ", talker = " + str);
            return;
        }
        if (!(j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2529x2ff57c.C20153x41e6d084()) == 1) || l17.longValue() <= 0) {
            return;
        }
        if (str.length() > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DupCheckFeatureService", "[triggerC2CIncrementalClean] triggered msgId = " + l17 + ", talker = " + str);
            long longValue = l17.longValue();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                ((yv1.b1) ((c01.f8) i95.n0.c(c01.f8.class))).hj(longValue, str, true);
                return;
            }
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong("msgId", longValue);
            bundle.putString("talker", str);
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(str2, bundle, t02.a.class, null);
        }
    }
}
