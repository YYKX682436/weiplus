package mm2;

/* loaded from: classes3.dex */
public final class y2 extends mm2.e {
    public final java.util.Map A;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 B;
    public boolean C;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f411089f;

    /* renamed from: g, reason: collision with root package name */
    public final zg2.d f411090g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f411091h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f411092i;

    /* renamed from: m, reason: collision with root package name */
    public pm2.a f411093m;

    /* renamed from: n, reason: collision with root package name */
    public r45.xz1 f411094n;

    /* renamed from: o, reason: collision with root package name */
    public r45.kl4 f411095o;

    /* renamed from: p, reason: collision with root package name */
    public r45.wz1 f411096p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashMap f411097q;

    /* renamed from: r, reason: collision with root package name */
    public xh2.b f411098r;

    /* renamed from: s, reason: collision with root package name */
    public dk2.pf f411099s;

    /* renamed from: t, reason: collision with root package name */
    public int f411100t;

    /* renamed from: u, reason: collision with root package name */
    public dk2.m f411101u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.List f411102v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.List f411103w;

    /* renamed from: x, reason: collision with root package name */
    public org.json.JSONObject f411104x;

    /* renamed from: y, reason: collision with root package name */
    public org.json.JSONObject f411105y;

    /* renamed from: z, reason: collision with root package name */
    public org.json.JSONObject f411106z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        java.util.HashMap hashMap = new java.util.HashMap();
        for (int i17 = 1; i17 < 10; i17++) {
            hashMap.put(java.lang.Integer.valueOf(i17), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lzi, java.lang.Integer.valueOf(i17)));
        }
        this.f411089f = hashMap;
        zg2.d dVar = new zg2.d(null, 1, null);
        dVar.f554355d = new mm2.u2(this);
        this.f411090g = dVar;
        this.f411091h = new java.util.HashMap();
        this.f411092i = new java.util.LinkedList();
        this.f411093m = pm2.a.f438386f;
        this.f411097q = new java.util.HashMap();
        this.f411102v = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f411103w = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f411104x = new org.json.JSONObject();
        this.f411105y = new org.json.JSONObject();
        this.f411106z = new org.json.JSONObject();
        this.A = java.util.Collections.synchronizedMap(new java.util.HashMap());
        this.B = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44();
    }

    public final boolean N6(boolean z17, int i17, boolean z18) {
        int o76 = ((mm2.o4) m147920xbba4bfc0(mm2.o4.class)).o7() + 1;
        int q76 = ((mm2.o4) m147920xbba4bfc0(mm2.o4.class)).q7();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveLinkMicLogicSlice", "anchorAcceptAnchorValidCheck isNeedToast: " + z17 + ", acceptAnchorCarryAnchorSize:" + i17 + ", currentAnchorSize: " + o76 + ", currentVisitorSize: " + q76 + ", fromAccept: " + z18);
        if (Z6()) {
            if (z17) {
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                db5.t7.m123883x26a183b(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lqz), 0).show();
            }
            return false;
        }
        if (q76 > 0) {
            if (o76 == 1 && q76 >= 3) {
                if (z17) {
                    android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    db5.t7.m123883x26a183b(context2, context2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dnz), 0).show();
                }
                return false;
            }
            if (o76 >= 2) {
                if (z17) {
                    android.content.Context context3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    db5.t7.m123883x26a183b(context3, context3.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dnu), 0).show();
                }
                return false;
            }
            if (o76 == 1 && i17 >= 2) {
                if (z17) {
                    android.content.Context context4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    db5.t7.m123883x26a183b(context4, context4.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dnw, java.lang.Integer.valueOf(i17)), 0).show();
                }
                return false;
            }
        } else {
            if (o76 >= 4) {
                if (z17) {
                    android.content.Context context5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    db5.t7.m123883x26a183b(context5, context5.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dnx, 3), 0).show();
                }
                return false;
            }
            if (o76 + i17 > 4) {
                if (z17) {
                    android.content.Context context6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    db5.t7.m123883x26a183b(context6, context6.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dnv, 4, java.lang.Integer.valueOf(i17)), 0).show();
                }
                return false;
            }
        }
        return true;
    }

    public final boolean O6(boolean z17) {
        int i17;
        int i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveLinkMicLogicSlice", "anchorAcceptVisitorValidCheck mode: " + ((mm2.o4) m147920xbba4bfc0(mm2.o4.class)).A.mo3195x754a37bb());
        if (((mm2.c1) m147920xbba4bfc0(mm2.c1.class)).f410425u3 && ((java.lang.Boolean) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.o4) m147920xbba4bfc0(mm2.o4.class)).H).mo144003x754a37bb()).booleanValue() && ((mm2.o4) m147920xbba4bfc0(mm2.o4.class)).p7() >= 1) {
            if (z17) {
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                db5.t7.m123883x26a183b(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mkh), 0).show();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveLinkMicLogicSlice", "anchorAcceptVisitorValidCheck pay link disable");
            return false;
        }
        dk2.u4 u4Var = ((mm2.o4) m147920xbba4bfc0(mm2.o4.class)).Z;
        if (!(u4Var == null || u4Var.k() || u4Var.g())) {
            if (z17) {
                android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                db5.t7.m123883x26a183b(context2, context2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573146cm5), 0).show();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveLinkMicLogicSlice", "anchorAcceptVisitorValidCheck battle disable");
            return false;
        }
        mm2.o4 o4Var = (mm2.o4) m147920xbba4bfc0(mm2.o4.class);
        xh2.c cVar = (xh2.c) o4Var.A.mo3195x754a37bb();
        if (cVar != null && ((i18 = cVar.f536066c) == 0 || i18 == 8) && o4Var.p7() >= o4Var.r7()) {
            if (z17) {
                android.content.Context context3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                db5.t7.m123883x26a183b(context3, context3.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573125dm3, java.lang.Integer.valueOf(((mm2.o4) m147920xbba4bfc0(mm2.o4.class)).r7())), 0).show();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveLinkMicLogicSlice", "anchorAcceptVisitorValidCheck normal mode over size");
            return false;
        }
        mm2.o4 o4Var2 = (mm2.o4) m147920xbba4bfc0(mm2.o4.class);
        xh2.c cVar2 = (xh2.c) o4Var2.A.mo3195x754a37bb();
        if (cVar2 != null && ((i17 = cVar2.f536066c) == 2 || i17 == 3) && o4Var2.p7() >= 8) {
            if (z17) {
                android.content.Context context4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                db5.t7.m123883x26a183b(context4, context4.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573125dm3, 8), 0).show();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveLinkMicLogicSlice", "anchorAcceptVisitorValidCheck grab mode over size");
            return false;
        }
        if (Z6()) {
            if (!((mm2.c1) m147920xbba4bfc0(mm2.c1.class)).A3) {
                if (z17) {
                    android.content.Context context5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    db5.t7.m123883x26a183b(context5, context5.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dvu), 0).show();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveLinkMicLogicSlice", "anchorAcceptVisitorValidCheck enableMicWithShareScreen = false");
                return false;
            }
            if (((mm2.o4) m147920xbba4bfc0(mm2.o4.class)).p7() >= 3) {
                if (z17) {
                    android.content.Context context6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    db5.t7.m123883x26a183b(context6, context6.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lqy), 0).show();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveLinkMicLogicSlice", "anchorAcceptVisitorValidCheck linkingAndWaitingAudienceSize over");
                return false;
            }
        }
        mm2.o4 o4Var3 = (mm2.o4) m147920xbba4bfc0(mm2.o4.class);
        xh2.c cVar3 = (xh2.c) o4Var3.A.mo3195x754a37bb();
        if (cVar3 != null && cVar3.f536066c == 1 && o4Var3.p7() >= 3) {
            if (z17) {
                android.content.Context context7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                db5.t7.m123883x26a183b(context7, context7.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573127dm5), 0).show();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveLinkMicLogicSlice", "anchorAcceptVisitorValidCheck focus mode over size");
            return false;
        }
        if (((mm2.y2) m147920xbba4bfc0(mm2.y2.class)).Y6()) {
            if (((mm2.o4) m147920xbba4bfc0(mm2.o4.class)).o7() + 1 > 2) {
                if (z17) {
                    android.content.Context context8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    db5.t7.m123883x26a183b(context8, context8.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dnu), 0).show();
                }
                return false;
            }
            dk2.u4 u4Var2 = ((mm2.o4) m147920xbba4bfc0(mm2.o4.class)).Z;
            if (u4Var2 != null && !u4Var2.k() && !u4Var2.g()) {
                return false;
            }
            dk2.u4 u4Var3 = ((mm2.o4) m147920xbba4bfc0(mm2.o4.class)).Z;
            if (u4Var3 != null && u4Var3.g()) {
                if (((mm2.o4) m147920xbba4bfc0(mm2.o4.class)).p7() >= 4) {
                    if (z17) {
                        android.content.Context context9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                        db5.t7.m123883x26a183b(context9, context9.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m8h), 0).show();
                    }
                    return false;
                }
            } else if (((mm2.o4) m147920xbba4bfc0(mm2.o4.class)).p7() >= 2) {
                if (z17) {
                    android.content.Context context10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    db5.t7.m123883x26a183b(context10, context10.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dnz), 0).show();
                }
                return false;
            }
        }
        return true;
    }

    public final pm2.a P6(int i17, int i18, int i19, int i27, int i28) {
        boolean z17 = false;
        if (i17 == 2 && i18 == 8) {
            return pm2.a.f438397t;
        }
        if ((i17 == 0 && i19 == 1) || (i17 == 2 && i18 == 1)) {
            return pm2.a.f438396s;
        }
        if ((i17 == 0 && i19 == 2) || (i17 == 2 && i18 == 2)) {
            return pm2.a.f438395r;
        }
        if ((i17 == 0 && i19 == 4) || (i17 == 2 && i18 == 16)) {
            z17 = true;
        }
        if (z17) {
            return pm2.a.f438398u;
        }
        switch (i27) {
            case 1:
                return pm2.a.f438388h;
            case 2:
                return pm2.a.f438390m;
            case 3:
                return pm2.a.f438394q;
            case 4:
                return pm2.a.f438391n;
            case 5:
                return pm2.a.f438392o;
            case 6:
                return pm2.a.f438393p;
            case 7:
            default:
                return ((mm2.o4) m147920xbba4bfc0(mm2.o4.class)).f410857s.size() == 1 ? pm2.a.f438384d : ((mm2.o4) m147920xbba4bfc0(mm2.o4.class)).f410857s.size() > 1 ? pm2.a.f438385e : i28 <= 4 ? pm2.a.f438386f : pm2.a.f438387g;
            case 8:
                return pm2.a.f438399v;
        }
    }

    public final xh2.g Q6(java.lang.String sdkUserId, boolean z17) {
        java.lang.Object obj;
        java.lang.Object obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sdkUserId, "sdkUserId");
        java.util.List list = ((mm2.o4) m147920xbba4bfc0(mm2.o4.class)).f410860v;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-audienceLinkMicUserList>(...)");
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(((km2.q) obj).f390703a, sdkUserId)) {
                    break;
                }
            }
        }
        km2.q qVar = (km2.q) obj;
        boolean z18 = true;
        if (qVar != null) {
            boolean z19 = pm0.v.z(qVar.f390724v, 16);
            if (((mm2.o4) m147920xbba4bfc0(mm2.o4.class)).f410846h != z19) {
                java.lang.String str = qVar.f390703a;
                if (str == null) {
                    str = "";
                }
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((mm2.c1) m147920xbba4bfc0(mm2.c1.class)).m8(), str) && !z17) {
                    ((mm2.o4) m147920xbba4bfc0(mm2.o4.class)).f410846h = z19;
                    return new xh2.g(qVar.f390716n, qVar.f390724v, z18);
                }
            }
            z18 = false;
            return new xh2.g(qVar.f390716n, qVar.f390724v, z18);
        }
        java.util.List list2 = ((mm2.o4) m147920xbba4bfc0(mm2.o4.class)).f410857s;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list2, "<get-anchorPkMicUserList>(...)");
        synchronized (list2) {
            java.util.Iterator it6 = list2.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it6.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((km2.q) obj2).f390703a, sdkUserId)) {
                    break;
                }
            }
        }
        km2.q qVar2 = (km2.q) obj2;
        if (qVar2 == null) {
            return null;
        }
        boolean z27 = pm0.v.z(qVar2.f390724v, 16);
        java.lang.Boolean bool = (java.lang.Boolean) ((mm2.y2) m147920xbba4bfc0(mm2.y2.class)).f411097q.get(qVar2.f390703a + '_' + qVar2.f390708f);
        if ((bool == null ? false : bool.booleanValue()) == z27 || z17) {
            z18 = false;
        } else {
            ((mm2.y2) m147920xbba4bfc0(mm2.y2.class)).f411097q.put(qVar2.f390703a + '_' + qVar2.f390708f, java.lang.Boolean.valueOf(z27));
        }
        return new xh2.g(qVar2.f390716n, qVar2.f390724v, z18);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if (r0 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String R6(int r4) {
        /*
            r3 = this;
            java.lang.Class<mm2.e1> r0 = mm2.e1.class
            androidx.lifecycle.c1 r0 = r3.m147920xbba4bfc0(r0)
            mm2.e1 r0 = (mm2.e1) r0
            int r0 = r0.R6()
            java.util.HashMap r1 = r3.f411089f
            java.util.HashMap r2 = r3.f411091h
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r2.get(r0)
            java.util.HashMap r0 = (java.util.HashMap) r0
            if (r0 == 0) goto L37
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L37
            int r2 = r0.length()
            if (r2 <= 0) goto L30
            r2 = 1
            goto L31
        L30:
            r2 = 0
        L31:
            if (r2 == 0) goto L34
            goto L35
        L34:
            r0 = 0
        L35:
            if (r0 != 0) goto L42
        L37:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r1.get(r4)
            r0 = r4
            java.lang.String r0 = (java.lang.String) r0
        L42:
            if (r0 != 0) goto L46
            java.lang.String r0 = ""
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mm2.y2.R6(int):java.lang.String");
    }

    public final java.util.HashMap S6() {
        java.util.HashMap hashMap = (java.util.HashMap) this.f411091h.get(java.lang.Integer.valueOf(((mm2.e1) m147920xbba4bfc0(mm2.e1.class)).R6()));
        return hashMap == null ? this.f411089f : hashMap;
    }

    public final fj2.k U6(java.lang.String sdkUserId) {
        java.util.ArrayList arrayList;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.util.ArrayList arrayList2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sdkUserId, "sdkUserId");
        dk2.u4 u4Var = ((mm2.o4) m147920xbba4bfc0(mm2.o4.class)).Z;
        if (u4Var == null) {
            return null;
        }
        mm2.o4 o4Var = (mm2.o4) m147920xbba4bfc0(mm2.o4.class);
        java.util.List list = o4Var.f410857s;
        java.util.List list2 = o4Var.f410860v;
        if (u4Var.f315693g == 2 && !u4Var.g()) {
            r45.r22 r22Var = (r45.r22) kz5.n0.a0(u4Var.f315696j, 0);
            java.lang.Iterable m75941xfb821914 = r22Var != null ? r22Var.m75941xfb821914(0) : null;
            if (m75941xfb821914 == null) {
                m75941xfb821914 = kz5.p0.f395529d;
            }
            r45.r22 r22Var2 = (r45.r22) kz5.n0.a0(u4Var.f315696j, 1);
            java.lang.Iterable m75941xfb8219142 = r22Var2 != null ? r22Var2.m75941xfb821914(0) : null;
            if (m75941xfb8219142 == null) {
                m75941xfb8219142 = kz5.p0.f395529d;
            }
            synchronized (m75941xfb821914) {
                java.util.Iterator it = m75941xfb821914.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj4 = null;
                        break;
                    }
                    obj4 = it.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.wk6) obj4).m75945x2fec8307(1), sdkUserId)) {
                        break;
                    }
                }
            }
            if (obj4 != null) {
                return fj2.k.f344708d;
            }
            synchronized (m75941xfb8219142) {
                java.util.Iterator it6 = m75941xfb8219142.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj5 = null;
                        break;
                    }
                    obj5 = it6.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.wk6) obj5).m75945x2fec8307(1), sdkUserId)) {
                        break;
                    }
                }
            }
            if (obj5 != null) {
                return fj2.k.f344709e;
            }
            return null;
        }
        if (list.size() != 1) {
            return null;
        }
        fj2.k kVar = fj2.k.f344708d;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(o4Var.a7().f390703a, sdkUserId)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list2);
            synchronized (list2) {
                arrayList = new java.util.ArrayList();
                for (java.lang.Object obj6 : list2) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((km2.q) obj6).f390722t, java.lang.Boolean.FALSE)) {
                        arrayList.add(obj6);
                    }
                }
            }
            java.util.Iterator it7 = arrayList.iterator();
            while (true) {
                if (!it7.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it7.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((km2.q) obj).f390703a, sdkUserId)) {
                    break;
                }
            }
            if (obj == null) {
                synchronized (list) {
                    java.util.Iterator it8 = list.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it8.next();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((km2.q) obj2).f390703a, sdkUserId)) {
                            break;
                        }
                    }
                }
                if (obj2 == null) {
                    synchronized (list2) {
                        arrayList2 = new java.util.ArrayList();
                        for (java.lang.Object obj7 : list2) {
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((km2.q) obj7).f390722t, java.lang.Boolean.TRUE)) {
                                arrayList2.add(obj7);
                            }
                        }
                    }
                    java.util.Iterator it9 = arrayList2.iterator();
                    while (true) {
                        if (!it9.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = it9.next();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((km2.q) obj3).f390703a, sdkUserId)) {
                            break;
                        }
                    }
                    if (obj3 == null) {
                        return null;
                    }
                }
                return fj2.k.f344709e;
            }
        }
        return kVar;
    }

    public final jz5.l V6() {
        java.util.LinkedList linkedList;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        jz5.l lVar = new jz5.l(arrayList, arrayList2);
        xh2.b bVar = ((mm2.y2) m147920xbba4bfc0(mm2.y2.class)).f411098r;
        if (bVar != null && (linkedList = bVar.f536063i) != null) {
            java.util.ArrayList<xh2.a> arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj : linkedList) {
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((xh2.a) obj).b(), ((mm2.e1) m147920xbba4bfc0(mm2.e1.class)).f410520q.f461834n)) {
                    arrayList3.add(obj);
                }
            }
            synchronized (arrayList3) {
                for (xh2.a aVar : arrayList3) {
                    km2.q qVar = aVar.f536053a;
                    if (qVar != null) {
                        if (b7(aVar.f536054b.f536086e)) {
                            arrayList.add(qVar);
                        } else {
                            arrayList2.add(qVar);
                        }
                    }
                }
            }
        }
        return lVar;
    }

    public final boolean W6(boolean z17) {
        java.lang.Object obj;
        dk2.u4 u4Var = ((mm2.o4) m147920xbba4bfc0(mm2.o4.class)).Z;
        if (u4Var == null || u4Var.f315691e == 3) {
            return true;
        }
        km2.k a17 = u4Var.a();
        if (a17 != null) {
            java.util.List list = ((mm2.o4) m147920xbba4bfc0(mm2.o4.class)).f410857s;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-anchorPkMicUserList>(...)");
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((km2.q) obj).f390705c, a17.f390647a)) {
                        break;
                    }
                }
            }
            km2.q qVar = (km2.q) obj;
            if (qVar != null && z17) {
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                db5.t7.m123883x26a183b(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d6w, qVar.f390706d), 0).show();
            }
        }
        return false;
    }

    public final boolean X6() {
        return ((mm2.c1) m147920xbba4bfc0(mm2.c1.class)).f410453y3;
    }

    public final boolean Y6() {
        mm2.o4 o4Var = (mm2.o4) m147920xbba4bfc0(mm2.o4.class);
        return o4Var.f410857s.size() > 0 || o4Var.D;
    }

    public final boolean Z6() {
        kn0.p pVar;
        ((b92.g1) ((c61.ac) i95.n0.c(c61.ac.class))).getClass();
        tn0.w0 w0Var = dk2.ef.f314911d;
        return (w0Var == null || (pVar = w0Var.D) == null || !pVar.f391122i) ? false : true;
    }

    public final boolean a7() {
        switch (this.f411093m.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return true;
            case 4:
            case 5:
            default:
                return false;
        }
    }

    public final boolean b7(int i17) {
        return i17 == 2 || i17 == 3 || i17 == 6 || i17 == 7;
    }

    public final void c7() {
        dk2.m mVar = this.f411101u;
        if (mVar != null) {
            this.f411100t = mVar.f315274d;
        }
        this.f411101u = null;
    }

    public final void d7(r45.vz1 micConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micConfig, "micConfig");
        if (micConfig.m75941xfb821914(0).size() > 0) {
            java.util.HashMap hashMap = this.f411091h;
            hashMap.clear();
            java.util.LinkedList<r45.hp4> m75941xfb821914 = micConfig.m75941xfb821914(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getMode_config_list(...)");
            for (r45.hp4 hp4Var : m75941xfb821914) {
                java.util.HashMap hashMap2 = new java.util.HashMap();
                java.util.LinkedList<r45.b02> m75941xfb8219142 = hp4Var.m75941xfb821914(1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getSeat_info_list(...)");
                for (r45.b02 b02Var : m75941xfb8219142) {
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(b02Var.m75939xb282bd08(0));
                    java.lang.String m75945x2fec8307 = b02Var.m75945x2fec8307(1);
                    if (m75945x2fec8307 == null) {
                        m75945x2fec8307 = "";
                    }
                    hashMap2.put(valueOf, m75945x2fec8307);
                }
                hashMap.put(java.lang.Integer.valueOf(hp4Var.m75939xb282bd08(0)), hashMap2);
            }
            this.f411090g.mo7808x76db6cb1(hashMap.get(java.lang.Integer.valueOf(((mm2.e1) m147920xbba4bfc0(mm2.e1.class)).R6())));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveLinkMicLogicSlice", "updateMicConfig micConfigMap: " + hashMap);
        }
    }

    @Override // p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        super.mo528x82b764cd();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveLinkMicLogicSlice", "onClear");
        this.f411104x = new org.json.JSONObject();
        this.f411106z = new org.json.JSONObject();
        this.f411105y = new org.json.JSONObject();
    }
}
