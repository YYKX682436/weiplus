package ye3;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final ye3.j f542754a = new ye3.j();

    public final d95.b0 a(java.lang.String cacheDbPath, java.util.HashMap factories, boolean z17, boolean z18) {
        d95.b0 b0Var;
        ye3.i iVar;
        java.lang.Object m143895xf1229813;
        java.lang.Object m143895xf12298132;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cacheDbPath, "cacheDbPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(factories, "factories");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_DB", "tryReInit start: cacheDbPath=" + cacheDbPath + ", wal=" + z18);
        java.util.Iterator it = kz5.c0.i(ye3.h.f542751c, new ye3.g(cacheDbPath), new ye3.e(cacheDbPath)).iterator();
        do {
            b0Var = null;
            if (!it.hasNext()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MB_External_surface_DB", "tryReInit failed: all attempts failed, return null");
                return null;
            }
            iVar = (ye3.i) it.next();
            d95.b0 b0Var2 = new d95.b0();
            yz5.a aVar = iVar.f542753b;
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
            java.lang.String str = iVar.f542752a;
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                boolean S = b0Var2.S(cacheDbPath, factories, z17, z18);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_DB", "tryInit " + str + ": success=" + S);
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.valueOf(S));
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
            if (m143898xd4a2fc34 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MB_External_surface_DB", "tryInit " + str + " failed: " + m143898xd4a2fc34.getMessage(), m143898xd4a2fc34);
            }
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
                m143895xf1229813 = bool;
            }
            if (((java.lang.Boolean) m143895xf1229813).booleanValue()) {
                b0Var = b0Var2;
            } else {
                try {
                    b0Var2.mo70513x5a5ddf8();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_DB", "closeDb: success");
                    m143895xf12298132 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
                } catch (java.lang.Throwable th7) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    m143895xf12298132 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th7));
                }
                java.lang.Throwable m143898xd4a2fc342 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf12298132);
                if (m143898xd4a2fc342 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MB_External_surface_DB", "closeDb failed: " + m143898xd4a2fc342.getMessage(), m143898xd4a2fc342);
                }
            }
        } while (b0Var == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_DB", "tryReInit success: " + iVar.f542752a);
        return b0Var;
    }
}
