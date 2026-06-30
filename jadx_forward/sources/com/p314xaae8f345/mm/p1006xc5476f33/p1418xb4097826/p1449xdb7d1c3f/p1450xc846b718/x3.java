package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes8.dex */
public final class x3 {

    /* renamed from: a, reason: collision with root package name */
    public final zy2.fa f187518a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f187519b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f187520c;

    /* renamed from: d, reason: collision with root package name */
    public r45.ws2 f187521d;

    public x3(zy2.fa redDotManager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(redDotManager, "redDotManager");
        this.f187518a = redDotManager;
        this.f187519b = "Finder.RedDotExposeBufferHandler";
    }

    public final java.util.LinkedList a(java.lang.String source) {
        java.util.LinkedList<java.lang.String> m75941xfb821914;
        jz5.f0 f0Var;
        boolean z17;
        boolean z18;
        boolean z19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        r45.ws2 ws2Var = this.f187521d;
        java.lang.String str = this.f187519b;
        if (ws2Var == null || this.f187520c) {
            this.f187520c = false;
            r45.ws2 ws2Var2 = new r45.ws2();
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                p3321xbce91901.C29043x91b2b43d.m143895xf1229813(ws2Var2.mo11468x92b714fd(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(gm0.j1.u().c().v(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_REDDOT_EXPOSE_INFO_CONFIG_STRING_SYNC, ""))));
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "init redDotExposeInfo " + pm0.b0.g(ws2Var2));
            this.f187521d = ws2Var2;
        }
        r45.ws2 ws2Var3 = this.f187521d;
        if (ws2Var3 == null || (m75941xfb821914 = ws2Var3.m75941xfb821914(0)) == null) {
            return null;
        }
        java.util.LinkedList linkedList = null;
        for (java.lang.String str2 : m75941xfb821914) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = this.f187518a.L0(str2);
            boolean z27 = true;
            if (L0 != null) {
                com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = L0.f65874xb5f7102a.B;
                if ((gVar != null ? gVar.f273689a.length : 0) > 0) {
                    if (linkedList == null) {
                        linkedList = new java.util.LinkedList();
                    }
                    r45.zs2 zs2Var = new r45.zs2();
                    zs2Var.set(2, gVar);
                    linkedList.add(zs2Var);
                }
                if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
                    z18 = true;
                } else {
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    z18 = false;
                }
                if (z18 || z65.c.a()) {
                    z19 = true;
                } else {
                    kb2.b bVar = kb2.b.f387758a;
                    z19 = false;
                }
                if (z19) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(source);
                    sb6.append(" getRedDotExposeListInfo redDotExposeInfo ");
                    sb6.append(str2);
                    sb6.append(" exposeBuff size=");
                    sb6.append(gVar != null ? java.lang.Integer.valueOf(gVar.f273689a.length) : null);
                    sb6.append(" content=");
                    sb6.append(gVar != null ? gVar.g() : null);
                    sb6.append('!');
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
                }
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
                    z17 = true;
                } else {
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    z17 = false;
                }
                if (!z17 && !z65.c.a()) {
                    kb2.b bVar2 = kb2.b.f387758a;
                    z27 = false;
                }
                if (z27) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, source + " getRedDotExposeListInfo redDotExposeInfo " + str2 + " have not ctrl info!");
                }
            }
        }
        return linkedList;
    }

    public final void b(r45.xb1 resp) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.util.LinkedList m75941xfb821914 = resp.m75941xfb821914(30);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getFinder_config_item(...)");
        java.util.Iterator it = m75941xfb821914.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.yy0) obj).m75945x2fec8307(0), "reddot_expose_info_config")) {
                    break;
                }
            }
        }
        r45.yy0 yy0Var = (r45.yy0) obj;
        if (yy0Var != null) {
            r45.ws2 ws2Var = new r45.ws2();
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = yy0Var.m75934xbce7f2f(1);
                ws2Var.mo11468x92b714fd(m75934xbce7f2f != null ? m75934xbce7f2f.g() : null);
                r45.ws2 ws2Var2 = this.f187521d;
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(ws2Var2 != null ? ws2Var2.m75941xfb821914(0) : null, ws2Var.m75941xfb821914(0))) {
                    this.f187520c = true;
                }
                p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_REDDOT_EXPOSE_INFO_CONFIG_STRING_SYNC, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(ws2Var.mo14344x5f01b1f6()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f187519b, "reddot_expose_info_config " + yy0Var.m75934xbce7f2f(1) + ",needUpdateConfig=" + this.f187520c + ", redDotExposeInfo=" + pm0.b0.g(ws2Var));
        }
    }
}
