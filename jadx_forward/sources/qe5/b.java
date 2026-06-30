package qe5;

/* loaded from: classes12.dex */
public final class b extends wm3.a implements xg3.h0, l75.q0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public final kd5.e T6() {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            return (kd5.e) Q6.mo140437x75286adb();
        }
        return null;
    }

    public final jz5.l U6(java.lang.String str, long j17, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1879xb47f1f9b.p1880x633fb29.C16565x9bc03d4e c16565x9bc03d4e;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = pt0.f0.f439742b1.n(str, j17);
        if (n17 == null) {
            return null;
        }
        kd5.e T6 = T6();
        if (T6 != null) {
            T6.f388410e = n17;
        }
        oi3.e qj6 = ((ez.e) ((pt.j0) i95.n0.c(pt.j0.class))).qj(n17);
        if (qj6.m75942xfb822ef2(qj6.f427150d + 0) != 0) {
            return new jz5.l(qj6, java.lang.Boolean.FALSE);
        }
        if (i17 != 1 || (c16565x9bc03d4e = (com.p314xaae8f345.mm.p1006xc5476f33.p1879xb47f1f9b.p1880x633fb29.C16565x9bc03d4e) m158359x1e885992().getParcelableExtra("key_quoted_msg")) == null) {
            return null;
        }
        oi3.g gVar = new oi3.g();
        int i18 = c16565x9bc03d4e.f231015d;
        int i19 = gVar.f427150d;
        gVar.set(i19 + 4, java.lang.Integer.valueOf(i18));
        gVar.set(i19 + 1, java.lang.Long.valueOf(c16565x9bc03d4e.f231016e));
        java.lang.String fromusr = c16565x9bc03d4e.f231017f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(fromusr, "fromusr");
        gVar.set(i19 + 3, fromusr);
        java.lang.String msgsource = c16565x9bc03d4e.f231020i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(msgsource, "msgsource");
        gVar.set(i19 + 12, msgsource);
        java.lang.String content = c16565x9bc03d4e.f231021m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(content, "content");
        gVar.set(i19 + 13, content);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(c16565x9bc03d4e.f231018g, c01.z1.r())) {
            gVar.set(i19 + 9, 1);
        }
        return new jz5.l(gVar, java.lang.Boolean.TRUE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0172, code lost:
    
        if (r11 != false) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:207:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0230  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V6(boolean r20) {
        /*
            Method dump skipped, instructions count: 1355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qe5.b.V6(boolean):void");
    }

    public final java.lang.String W6(java.lang.String str) {
        int i17 = x51.t1.f533619a;
        return str == null ? "" : str;
    }

    @Override // xg3.h0
    public void c0(xg3.m0 m0Var, xg3.l0 l0Var) {
        jz5.f0 f0Var;
        if (m0Var == null || l0Var == null) {
            return;
        }
        kd5.e T6 = T6();
        if (T6 == null) {
            f0Var = null;
        } else if (T6.f388413h == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.File.AppAttachDataUIC", "talker is null");
            return;
        } else {
            if (T6.f388424v == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.File.AppAttachDataUIC", "mediaId is null");
                V6(false);
                return;
            }
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.File.AppAttachDataUIC", "initParams is null");
            return;
        }
        kd5.e T62 = T6();
        java.lang.Integer valueOf = T62 != null ? java.lang.Integer.valueOf(T62.f388422t) : null;
        if ((valueOf != null && valueOf.intValue() == 74) || (valueOf != null && valueOf.intValue() == 131)) {
            j75.f Q6 = Q6();
            if (Q6 != null) {
                Q6.B3(new kd5.p(l0Var));
                return;
            }
            return;
        }
        if ((valueOf != null && valueOf.intValue() == 6) || (valueOf != null && valueOf.intValue() == 130)) {
            int intExtra = m158359x1e885992().getIntExtra("msg_type", 0);
            java.util.ArrayList msgList = l0Var.f535945c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(msgList, "msgList");
            java.util.ArrayList<com.p314xaae8f345.mm.p2621x8fb0427b.f9> arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : msgList) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) obj;
                kd5.e T63 = T6();
                if ((T63 != null && (T63.f388412g > f9Var.m124847x74d37ac6() ? 1 : (T63.f388412g == f9Var.m124847x74d37ac6() ? 0 : -1)) == 0) && f9Var.j() != null) {
                    arrayList.add(obj);
                }
            }
            for (com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 : arrayList) {
                kd5.e T64 = T6();
                if (T64 != null) {
                    T64.f388410e = f9Var2;
                    oi3.g gVar = T64.f388414i;
                    if (gVar != null) {
                        java.lang.String j17 = f9Var2.j();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(j17, "getContent(...)");
                        gVar.set(gVar.f427150d + 13, j17);
                    }
                    jz5.l U6 = U6(f9Var2.Q0(), f9Var2.m124847x74d37ac6(), intExtra);
                    T64.f388414i = U6 != null ? (oi3.g) U6.f384366d : null;
                }
                j75.f Q62 = Q6();
                if (Q62 != null) {
                    Q62.B3(new kd5.v(false));
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(m158354x19263085(), new qe5.a(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        V6(true);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().mo49775xc84af884(this);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().za(this);
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.B3(new kd5.r(w0Var != null ? w0Var.f398507b : -1));
        }
    }
}
