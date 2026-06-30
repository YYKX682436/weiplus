package hb2;

/* loaded from: classes2.dex */
public abstract class w0 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedHashMap f361643d = new java.util.LinkedHashMap();

    public static void a(hb2.w0 w0Var, java.lang.String username, java.lang.Object obj, zy2.gc gcVar, boolean z17, boolean z18, java.lang.String str, int i17, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: _tryDoNext");
        }
        boolean z19 = (i17 & 8) != 0 ? false : z17;
        boolean z27 = (i17 & 16) != 0 ? false : z18;
        java.lang.String str2 = (i17 & 32) != 0 ? null : str;
        w0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        synchronized (w0Var.f361643d) {
            r45.hx0 hx0Var = new r45.hx0();
            hx0Var.set(0, java.lang.Integer.valueOf(w0Var.i()));
            hx0Var.set(1, w0Var.c(obj));
            w0Var.f361643d.put(obj, new java.lang.ref.WeakReference(gcVar));
            com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
            db2.v5 v5Var = new db2.v5(username, kz5.b0.c(hx0Var), z19, 0, str2, null, null, 104, null);
            v5Var.f309735o = z27;
            d17.g(v5Var);
        }
    }

    public static void f(hb2.w0 w0Var, zy2.gc gcVar, java.lang.Object obj, r45.ix0 ix0Var, int i17, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doCallback");
        }
        if ((i17 & 4) != 0) {
            ix0Var = new r45.ix0();
            ix0Var.set(0, java.lang.Integer.valueOf(w0Var.i()));
            ix0Var.set(1, -1);
        }
        w0Var.getClass();
        if (gcVar != null) {
            gcVar.r5(obj, ix0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void h(hb2.w0 w0Var, p012xc85e97e9.p093xedfae76a.y owner, java.lang.Object obj, zy2.gc gcVar, boolean z17, boolean z18, int i17, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doRequest");
        }
        boolean z19 = (i17 & 8) != 0 ? false : z17;
        w0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        r45.hx0 hx0Var = new r45.hx0();
        hx0Var.set(0, java.lang.Integer.valueOf(w0Var.i()));
        hx0Var.set(1, w0Var.c(obj));
        android.content.Context context = owner instanceof android.content.Context ? (android.content.Context) owner : null;
        java.lang.String f17 = xy2.c.f(context != null ? xy2.c.d(context) : null);
        pq5.g l17 = new hb2.a(f17, kz5.b0.c(hx0Var), z19, 0, null, 24, null).l();
        l17.I(owner);
        l17.K(new hb2.v0(w0Var, f17, obj, gcVar));
    }

    public static void m(hb2.w0 w0Var, java.lang.Object obj, zy2.gc gcVar, boolean z17, boolean z18, java.lang.Long l17, java.lang.String str, int i17, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryDoNext");
        }
        boolean z19 = (i17 & 4) != 0 ? false : z17;
        boolean z27 = (i17 & 8) != 0 ? false : z18;
        java.lang.Long l18 = (i17 & 16) != 0 ? null : l17;
        java.lang.String str2 = (i17 & 32) != 0 ? null : str;
        synchronized (w0Var.f361643d) {
            r45.hx0 hx0Var = new r45.hx0();
            hx0Var.set(0, java.lang.Integer.valueOf(w0Var.i()));
            hx0Var.set(1, w0Var.c(obj));
            w0Var.f361643d.put(obj, new java.lang.ref.WeakReference(gcVar));
            com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
            db2.v5 v5Var = new db2.v5(g92.b.f351302e.U(), kz5.b0.c(hx0Var), z19, 0, null, l18, str2, 24, null);
            v5Var.f309735o = z27;
            d17.g(v5Var);
        }
    }

    public abstract com.p314xaae8f345.mm.p2495xc50a8b8b.g c(java.lang.Object obj);

    public abstract int i();

    public abstract java.lang.String k();

    public abstract void l(java.lang.String str, java.lang.Object obj, r45.ix0 ix0Var);

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.Object obj;
        zy2.gc gcVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k(), "errType " + i17 + " errCode " + i18 + " errMsg " + str);
        if (m1Var instanceof db2.v5) {
            db2.v5 v5Var = (db2.v5) m1Var;
            java.util.List K = v5Var.K();
            com.p314xaae8f345.mm.p944x882e457a.o oVar = v5Var.f309731h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oVar);
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152243a.f152217a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderOplogRequest");
            java.util.LinkedList m75941xfb821914 = ((r45.rn2) fVar).m75941xfb821914(2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getCmdList(...)");
            java.util.Iterator it = m75941xfb821914.iterator();
            int i19 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i19 = -1;
                    break;
                } else {
                    if (((r45.hx0) it.next()).m75939xb282bd08(0) == i()) {
                        break;
                    } else {
                        i19++;
                    }
                }
            }
            if (i19 < 0) {
                java.lang.String k17 = k();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("not cares cmdId: ");
                r45.hx0 hx0Var = (r45.hx0) kz5.n0.Z(m75941xfb821914);
                sb6.append(hx0Var != null ? java.lang.Integer.valueOf(hx0Var.m75939xb282bd08(0)) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k17, sb6.toString());
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k(), "retList " + K.size());
            synchronized (this.f361643d) {
                if (!this.f361643d.isEmpty()) {
                    java.util.Iterator it6 = this.f361643d.entrySet().iterator();
                    java.util.Map.Entry entry = (java.util.Map.Entry) it6.next();
                    obj = entry.getKey();
                    java.lang.Object obj2 = ((java.lang.ref.WeakReference) entry.getValue()).get();
                    it6.remove();
                    r1 = obj2;
                } else {
                    obj = null;
                }
            }
            if (r1 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetSceneFinderOplog", "callback is null");
            }
            if (i17 == 0 && i18 == 0) {
                java.util.Iterator it7 = K.iterator();
                int i27 = 0;
                while (true) {
                    if (!it7.hasNext()) {
                        i27 = -1;
                        break;
                    } else {
                        if (((r45.ix0) it7.next()).m75939xb282bd08(0) == i()) {
                            break;
                        } else {
                            i27++;
                        }
                    }
                }
                if (i27 != -1 && obj != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetSceneFinderOplog", "handleUpdateResult " + ((r45.ix0) K.get(i27)).m75939xb282bd08(1));
                    l(v5Var.f309736p, obj, (r45.ix0) K.get(i27));
                    zy2.gc gcVar2 = (zy2.gc) r1;
                    if (gcVar2 != null) {
                        gcVar2.r5(obj, (r45.ix0) K.get(i27));
                    }
                }
            } else if (obj != null && (gcVar = (zy2.gc) r1) != null) {
                r45.ix0 ix0Var = new r45.ix0();
                ix0Var.set(0, java.lang.Integer.valueOf(ix0Var.m75939xb282bd08(0)));
                ix0Var.set(1, -1);
                gcVar.r5(obj, ix0Var);
            }
            synchronized (this.f361643d) {
                if (!this.f361643d.isEmpty()) {
                    java.util.Map.Entry entry2 = (java.util.Map.Entry) this.f361643d.entrySet().iterator().next();
                    m(this, entry2.getKey(), (zy2.gc) ((java.lang.ref.WeakReference) entry2.getValue()).get(), false, false, null, null, 60, null);
                }
            }
        }
    }
}
