package ae1;

/* loaded from: classes16.dex */
public final class c0 {
    public c0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static final byte[] a(ae1.c0 c0Var, java.lang.String str) {
        c0Var.getClass();
        if (str.length() % 2 != 0) {
            return null;
        }
        java.util.List x07 = r26.p0.x0(str, 2);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(x07, 10));
        java.util.Iterator it = ((java.util.ArrayList) x07).iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            r26.a.a(16);
            arrayList.add(java.lang.Byte.valueOf((byte) java.lang.Integer.parseInt(str2, 16)));
        }
        return kz5.n0.N0(arrayList);
    }

    public static final ae1.a0 b(ae1.c0 c0Var, ae1.t tVar) {
        ae1.a0 zVar;
        c0Var.getClass();
        jc1.d dVar = jc1.f.f380448d;
        try {
            ze.n t37 = tVar.f84942a.t3();
            if (t37 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "getSmStorage, runtime is null");
                zVar = new ae1.y(new ae1.u(dVar, null, 2, null));
            } else {
                ae1.d a17 = ae1.w1.f84954a.a(t37);
                zVar = a17 != null ? new ae1.z(a17) : new ae1.y(new ae1.u(dVar, null, 2, null));
            }
            return zVar;
        } catch (com.p3249xcbb51f6b.tsm.C28041x16492e41 e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.SmCryptoInvoker", e17, "getSmStorage failure", new java.lang.Object[0]);
            return new ae1.y(c0Var.h(e17));
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.SmCryptoInvoker", e18, "getSmStorage failure", new java.lang.Object[0]);
            return new ae1.y(new ae1.u(dVar, null, 2, null));
        }
    }

    public static final ae1.a0 c(ae1.c0 c0Var, ae1.t tVar, java.lang.String str) {
        ae1.k kVar;
        c0Var.getClass();
        jc1.d dVar = jc1.f.f380452h;
        try {
            ae1.j jVar = ae1.k.f84923g;
            int i17 = tVar.f84943b.getInt(str);
            jVar.getClass();
            ae1.k[] m1163xcee59d22 = ae1.k.m1163xcee59d22();
            int length = m1163xcee59d22.length;
            int i18 = 0;
            while (true) {
                if (i18 >= length) {
                    kVar = null;
                    break;
                }
                kVar = m1163xcee59d22[i18];
                if (kVar.f84925d == i17) {
                    break;
                }
                i18++;
            }
            if (kVar != null) {
                return new ae1.z(kVar);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "parseCipherMode, null");
            return new ae1.y(new ae1.u(dVar, null, 2, null));
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.SmCryptoInvoker", e17, "parseCipherMode failure", new java.lang.Object[0]);
            return new ae1.y(new ae1.u(dVar, null, 2, null));
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.SmCryptoInvoker", e18, "parseCipherMode failure", new java.lang.Object[0]);
            return new ae1.y(new ae1.u(jc1.f.f380448d, null, 2, null));
        }
    }

    public static final ae1.a0 d(ae1.c0 c0Var, ae1.t tVar, java.lang.String str) {
        c0Var.getClass();
        try {
            java.lang.Object obj = tVar.f84943b.get(str);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type java.nio.ByteBuffer");
            return new ae1.z(ik1.f.a((java.nio.ByteBuffer) obj));
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.SmCryptoInvoker", e17, "parseNativeBuffer failure", new java.lang.Object[0]);
            return new ae1.y(new ae1.u(jc1.f.f380452h, null, 2, null));
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.SmCryptoInvoker", e18, "parseNativeBuffer failure", new java.lang.Object[0]);
            return new ae1.y(new ae1.u(jc1.f.f380448d, null, 2, null));
        }
    }

    public static final ae1.a0 e(ae1.c0 c0Var, ae1.t tVar, java.lang.String str) {
        ae1.o oVar;
        c0Var.getClass();
        jc1.d dVar = jc1.f.f380452h;
        try {
            ae1.n nVar = ae1.o.f84932g;
            int i17 = tVar.f84943b.getInt(str);
            nVar.getClass();
            ae1.o[] m1169xcee59d22 = ae1.o.m1169xcee59d22();
            int length = m1169xcee59d22.length;
            int i18 = 0;
            while (true) {
                if (i18 >= length) {
                    oVar = null;
                    break;
                }
                oVar = m1169xcee59d22[i18];
                if (oVar.f84934d == i17) {
                    break;
                }
                i18++;
            }
            if (oVar != null) {
                return new ae1.z(oVar);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "parseSignMode, null");
            return new ae1.y(new ae1.u(dVar, null, 2, null));
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.SmCryptoInvoker", e17, "parseSignMode failure", new java.lang.Object[0]);
            return new ae1.y(new ae1.u(dVar, null, 2, null));
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.SmCryptoInvoker", e18, "parseSignMode failure", new java.lang.Object[0]);
            return new ae1.y(new ae1.u(jc1.f.f380448d, null, 2, null));
        }
    }

    public static final ae1.a0 f(ae1.c0 c0Var, ae1.t tVar, java.lang.String str) {
        ae1.m mVar;
        c0Var.getClass();
        jc1.d dVar = jc1.f.f380452h;
        try {
            ae1.l lVar = ae1.m.f84928f;
            int i17 = tVar.f84943b.getInt(str);
            lVar.getClass();
            ae1.m[] m1166xcee59d22 = ae1.m.m1166xcee59d22();
            int length = m1166xcee59d22.length;
            int i18 = 0;
            while (true) {
                if (i18 >= length) {
                    mVar = null;
                    break;
                }
                mVar = m1166xcee59d22[i18];
                if (mVar.f84930d == i17) {
                    break;
                }
                i18++;
            }
            if (mVar != null) {
                return new ae1.z(mVar);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "parseSm2KeyFormat, null");
            return new ae1.y(new ae1.u(dVar, null, 2, null));
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.SmCryptoInvoker", e17, "parseSm2KeyFormat failure", new java.lang.Object[0]);
            return new ae1.y(new ae1.u(dVar, null, 2, null));
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.SmCryptoInvoker", e18, "parseSm2KeyFormat failure", new java.lang.Object[0]);
            return new ae1.y(new ae1.u(jc1.f.f380448d, null, 2, null));
        }
    }

    public static final ae1.a0 g(ae1.c0 c0Var, ae1.t tVar, java.lang.String str) {
        c0Var.getClass();
        try {
            return new ae1.z(tVar.f84943b.getString(str));
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.SmCryptoInvoker", e17, "parseString failure", new java.lang.Object[0]);
            return new ae1.y(new ae1.u(jc1.f.f380452h, null, 2, null));
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.SmCryptoInvoker", e18, "parseString failure", new java.lang.Object[0]);
            return new ae1.y(new ae1.u(jc1.f.f380448d, null, 2, null));
        }
    }

    public final ae1.u h(com.p3249xcbb51f6b.tsm.C28041x16492e41 c28041x16492e41) {
        return new ae1.u(new jc1.d(8, "fail:" + c28041x16492e41.f65640xa7c470f2), null, 2, null);
    }
}
