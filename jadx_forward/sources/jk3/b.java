package jk3;

/* loaded from: classes8.dex */
public abstract class b implements jk3.e {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c f381610a;

    /* renamed from: b, reason: collision with root package name */
    public r45.w60 f381611b;

    /* renamed from: c, reason: collision with root package name */
    public r45.kr4 f381612c;

    public void A() {
        r45.gr4 gr4Var;
        java.lang.Object[] objArr = new java.lang.Object[1];
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = this.f381610a;
        objArr[0] = c16601x7ed0e40c != null ? c16601x7ed0e40c.f66791xc8a07680 : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbsMultiTaskHelper", "onExitPage, type:", objArr);
        r45.kr4 kr4Var = this.f381612c;
        if (kr4Var != null && (gr4Var = (r45.gr4) kr4Var.m75936x14adae67(5)) != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).getClass();
            long c17 = c01.id.c();
            if (c17 >= gr4Var.m75942xfb822ef2(0)) {
                gr4Var.set(1, java.lang.Long.valueOf(gr4Var.m75942xfb822ef2(1) + (c17 - gr4Var.m75942xfb822ef2(0))));
            }
        }
        if (a() && s()) {
            ((ku5.t0) ku5.t0.f394148d).b(new jk3.a(this), "MultiTasklLoopTag");
        }
    }

    public void B(boolean z17) {
        C(z17, 8);
    }

    public void C(boolean z17, int i17) {
    }

    public void D() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c o17;
        if (t() || (o17 = o()) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.n0 n0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.n0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.n0.class);
        java.lang.String str = o17.f66791xc8a07680;
        ((gh4.h0) n0Var).getClass();
        ((gh4.e0) ((gh4.s) i95.n0.c(gh4.s.class))).Ui(str, true, 2);
    }

    public boolean E() {
        return true;
    }

    public boolean F(int i17) {
        return !(this instanceof cl4.l);
    }

    public boolean G() {
        return !(this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.o7);
    }

    public void H(android.graphics.Bitmap bitmap, boolean z17) {
        if (t()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbsMultiTaskHelper", "updateCurrentHistoryTaskInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c o17 = o();
        if (o17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.n0 n0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.n0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.n0.class);
            java.lang.String str = o17.f66791xc8a07680;
            int i17 = o17.f66793x2262335f;
            r45.lr4 v07 = o17.v0();
            byte[] bArr = o17.f66790x225a93cf;
            ((gh4.h0) n0Var).getClass();
            gh4.e0 e0Var = (gh4.e0) ((gh4.s) i95.n0.c(gh4.s.class));
            e0Var.getClass();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateTaskInfoByBitmap id:");
            sb6.append(str);
            sb6.append(" type:");
            sb6.append(i17);
            sb6.append(" bitmap:");
            sb6.append(bitmap != null ? java.lang.Integer.valueOf(bitmap.getByteCount()) : null);
            sb6.append(" updateBitmapOnly:");
            sb6.append(z17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBar.PluginTaskBar", sb6.toString());
            if (str == null) {
                return;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                if (gm0.j1.a()) {
                    if (bitmap != null) {
                        gh4.l0 l0Var = gh4.l0.f353471a;
                        java.lang.String c17 = l0Var.c(str);
                        e0Var.Ri(str);
                        e0Var.Vi(bitmap, c17, gh4.a0.f353446d);
                        if (lh4.n.f400252e.b(i17)) {
                            o11.g SNAPSHOT_LOADER_OPTION = gh4.j0.f353467b;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(SNAPSHOT_LOADER_OPTION, "SNAPSHOT_LOADER_OPTION");
                            n11.a.b().o(l0Var.b(c17, SNAPSHOT_LOADER_OPTION), bitmap);
                        }
                    }
                    e0Var.Zi(str, i17, v07, bArr, z17);
                    return;
                }
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("addType", 2);
            bundle.putString(dm.i4.f66865x76d1ec5a, str);
            bundle.putInt("type", i17);
            bundle.putByteArray("showData", v07 != null ? v07.mo14344x5f01b1f6() : null);
            bundle.putByteArray(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, bArr);
            bundle.putBoolean("updateBitmapOnly", z17);
            if (bitmap == null) {
                com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, gh4.a.class, gh4.d0.f353451d);
                return;
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
            sb7.append(lp0.b.h0("taskbar").o());
            sb7.append('/');
            sb7.append(str);
            java.lang.String sb8 = sb7.toString();
            if (com.p314xaae8f345.mm.vfs.w6.j(sb8)) {
                com.p314xaae8f345.mm.vfs.w6.h(sb8);
            }
            e0Var.Vi(bitmap, sb8, new gh4.c0(bundle, sb8));
        }
    }

    public void I() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c;
        if (!s() || (c16601x7ed0e40c = this.f381610a) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0 l0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class);
        java.lang.String field_id = c16601x7ed0e40c.f66791xc8a07680;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_id, "field_id");
        int i17 = c16601x7ed0e40c.f66793x2262335f;
        r45.lr4 v07 = c16601x7ed0e40c.v0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(v07, "getShowData(...)");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) l0Var).aj(field_id, i17, v07, c16601x7ed0e40c.f66790x225a93cf);
    }

    public void J() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c;
        if (!s() || (c16601x7ed0e40c = this.f381610a) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0 l0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class);
        java.lang.String field_id = c16601x7ed0e40c.f66791xc8a07680;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_id, "field_id");
        int i17 = c16601x7ed0e40c.f66793x2262335f;
        r45.lr4 v07 = c16601x7ed0e40c.v0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(v07, "getShowData(...)");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) l0Var).Zi(field_id, i17, v07, null, c16601x7ed0e40c.f66790x225a93cf);
    }

    public void K(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = this.f381610a;
        r45.lr4 v07 = c16601x7ed0e40c != null ? c16601x7ed0e40c.v0() : null;
        if (v07 != null) {
            v07.set(5, str);
        }
        I();
    }

    public void L(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = this.f381610a;
        r45.lr4 v07 = c16601x7ed0e40c != null ? c16601x7ed0e40c.v0() : null;
        if (v07 != null) {
            v07.set(1, str);
        }
        I();
    }

    @Override // jk3.e
    public boolean a() {
        return false;
    }

    @Override // jk3.e
    public android.graphics.Bitmap b() {
        return null;
    }

    @Override // jk3.e
    public boolean c(int i17) {
        return !(this instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.p3);
    }

    @Override // jk3.e
    public boolean d() {
        return false;
    }

    @Override // jk3.e
    public java.lang.String e() {
        return null;
    }

    @Override // jk3.e
    public boolean f() {
        return false;
    }

    @Override // jk3.e
    public void g(android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = this.f381610a;
        if (c16601x7ed0e40c != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0 l0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class);
            java.lang.String field_id = c16601x7ed0e40c.f66791xc8a07680;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_id, "field_id");
            int i17 = c16601x7ed0e40c.f66793x2262335f;
            r45.lr4 v07 = c16601x7ed0e40c.v0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(v07, "getShowData(...)");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) l0Var).Zi(field_id, i17, v07, bitmap, c16601x7ed0e40c.f66790x225a93cf);
        }
    }

    @Override // jk3.e
    /* renamed from: getPosition */
    public java.lang.String mo141063xa86cd69f() {
        return null;
    }

    @Override // jk3.e
    public android.graphics.Bitmap h(android.graphics.Bitmap bitmap) {
        return null;
    }

    @Override // jk3.e
    public java.lang.Boolean i() {
        return java.lang.Boolean.FALSE;
    }

    @Override // jk3.e
    public void j() {
    }

    @Override // jk3.e
    public void k() {
    }

    public void l(android.graphics.Bitmap bitmap, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbsMultiTaskHelper", "addCurrentMultiTaskInfoWithBlt, forceUpdate:" + z17);
        if (!s()) {
            r45.kr4 kr4Var = this.f381612c;
            r45.er4 er4Var = kr4Var != null ? (r45.er4) kr4Var.m75936x14adae67(6) : null;
            if (er4Var != null) {
                er4Var.set(1, 2L);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = this.f381610a;
            if (c16601x7ed0e40c != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0 l0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class);
                java.lang.String field_id = c16601x7ed0e40c.f66791xc8a07680;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_id, "field_id");
                int i17 = c16601x7ed0e40c.f66793x2262335f;
                r45.lr4 v07 = c16601x7ed0e40c.v0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(v07, "getShowData(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c2 = this.f381610a;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) l0Var).wi(field_id, i17, v07, bitmap, c16601x7ed0e40c2 != null ? c16601x7ed0e40c2.f66790x225a93cf : null, this.f381612c);
                return;
            }
            return;
        }
        if (!z17) {
            r45.kr4 kr4Var2 = this.f381612c;
            r45.er4 er4Var2 = kr4Var2 != null ? (r45.er4) kr4Var2.m75936x14adae67(6) : null;
            if (er4Var2 != null) {
                er4Var2.set(1, 1L);
            }
            g(bitmap);
            return;
        }
        r45.kr4 kr4Var3 = this.f381612c;
        r45.er4 er4Var3 = kr4Var3 != null ? (r45.er4) kr4Var3.m75936x14adae67(6) : null;
        if (er4Var3 != null) {
            er4Var3.set(1, 1L);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c3 = this.f381610a;
        if (c16601x7ed0e40c3 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0 l0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class);
            java.lang.String field_id2 = c16601x7ed0e40c3.f66791xc8a07680;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_id2, "field_id");
            int i18 = c16601x7ed0e40c3.f66793x2262335f;
            r45.lr4 v08 = c16601x7ed0e40c3.v0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(v08, "getShowData(...)");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) l0Var2).wi(field_id2, i18, v08, bitmap, c16601x7ed0e40c3.f66790x225a93cf, this.f381612c);
        }
    }

    public void m(android.graphics.Bitmap bitmap) {
        if (t()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbsMultiTaskHelper", "add or update taskInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c o17 = o();
        if (o17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.n0 n0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.n0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.n0.class);
            java.lang.String str = o17.f66791xc8a07680;
            int i17 = o17.f66793x2262335f;
            r45.lr4 v07 = o17.v0();
            byte[] bArr = o17.f66790x225a93cf;
            ((gh4.h0) n0Var).getClass();
            gh4.e0 e0Var = (gh4.e0) ((gh4.s) i95.n0.c(gh4.s.class));
            e0Var.getClass();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addTaskInfoByBitmap id:");
            sb6.append(str);
            sb6.append(" type:");
            sb6.append(i17);
            sb6.append(" bitmap:");
            sb6.append(bitmap != null ? java.lang.Integer.valueOf(bitmap.getByteCount()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBar.PluginTaskBar", sb6.toString());
            if (str == null) {
                return;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                if (gm0.j1.a()) {
                    if (bitmap != null) {
                        gh4.l0 l0Var = gh4.l0.f353471a;
                        java.lang.String c17 = l0Var.c(str);
                        e0Var.Ri(str);
                        e0Var.Vi(bitmap, c17, gh4.u.f353492d);
                        if (lh4.n.f400252e.b(i17)) {
                            o11.g SNAPSHOT_LOADER_OPTION = gh4.j0.f353467b;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(SNAPSHOT_LOADER_OPTION, "SNAPSHOT_LOADER_OPTION");
                            java.lang.String b17 = l0Var.b(c17, SNAPSHOT_LOADER_OPTION);
                            n11.a.b().p(b17);
                            n11.a.b().o(b17, bitmap);
                        }
                    }
                    e0Var.wi(str, i17, v07, bArr);
                    return;
                }
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("addType", 1);
            bundle.putString(dm.i4.f66865x76d1ec5a, str);
            bundle.putInt("type", i17);
            bundle.putByteArray("showData", v07 != null ? v07.mo14344x5f01b1f6() : null);
            bundle.putByteArray(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, bArr);
            if (bitmap == null) {
                com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, gh4.a.class, gh4.x.f353500d);
                return;
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
            sb7.append(lp0.b.h0("taskbar").o());
            sb7.append('/');
            sb7.append(str);
            java.lang.String sb8 = sb7.toString();
            if (com.p314xaae8f345.mm.vfs.w6.j(sb8)) {
                com.p314xaae8f345.mm.vfs.w6.h(sb8);
            }
            e0Var.Vi(bitmap, sb8, new gh4.w(bundle, sb8));
        }
    }

    public long n() {
        return 500L;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c o() {
        return this.f381610a;
    }

    public int p() {
        return -1;
    }

    public java.lang.String q(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = this.f381610a;
        if (c16601x7ed0e40c == null) {
            return "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0 l0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class);
        java.lang.String field_id = c16601x7ed0e40c.f66791xc8a07680;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_id, "field_id");
        int i18 = c16601x7ed0e40c.f66793x2262335f;
        int p17 = p();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) l0Var).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1 i1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0.class));
        i1Var.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            return i1Var.Ri(field_id, i18, p17, i17);
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(dm.i4.f66865x76d1ec5a, field_id);
        bundle.putInt("type", i18);
        bundle.putInt("curPos", p17);
        bundle.putInt("way", i17);
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.r0.class);
        if (c10756x2a5d7b2d != null) {
            return c10756x2a5d7b2d.f149939d;
        }
        return null;
    }

    public void r(android.graphics.Bitmap bitmap, boolean z17) {
        if (t()) {
            return;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbsMultiTaskHelper", "ended, remove historyTaskInfo");
            D();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbsMultiTaskHelper", "not ended update historyTaskInfo");
            H(bitmap, false);
        }
    }

    public boolean s() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = this.f381610a;
        if (c16601x7ed0e40c != null) {
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Ri(c16601x7ed0e40c);
        }
        return false;
    }

    public boolean t() {
        return this instanceof rh1.c;
    }

    public boolean u() {
        return true;
    }

    public boolean v() {
        return !(this instanceof rh1.a);
    }

    public boolean w() {
        return this instanceof an4.a;
    }

    public boolean x() {
        return this instanceof rh1.a;
    }

    public void y(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c();
        this.f381610a = c16601x7ed0e40c;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).getClass();
        c16601x7ed0e40c.f66794xa783a79b = c01.id.c();
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c2 = this.f381610a;
        if (c16601x7ed0e40c2 != null) {
            c16601x7ed0e40c2.f66791xc8a07680 = str;
        }
        if (c16601x7ed0e40c2 != null) {
            c16601x7ed0e40c2.f66793x2262335f = i17;
        }
        r45.kr4 kr4Var = new r45.kr4();
        this.f381612c = kr4Var;
        kr4Var.set(6, new r45.er4());
        r45.kr4 kr4Var2 = this.f381612c;
        if (kr4Var2 != null) {
            kr4Var2.set(5, new r45.gr4());
        }
        r45.kr4 kr4Var3 = this.f381612c;
        if (kr4Var3 != null) {
            kr4Var3.set(7, new r45.ir4());
        }
        r45.kr4 kr4Var4 = this.f381612c;
        if (kr4Var4 != null) {
            kr4Var4.set(8, new r45.jr4());
        }
        r45.kr4 kr4Var5 = this.f381612c;
        r45.jr4 jr4Var = kr4Var5 != null ? (r45.jr4) kr4Var5.m75936x14adae67(8) : null;
        if (jr4Var == null) {
            return;
        }
        jr4Var.set(1, java.lang.Boolean.TRUE);
    }

    public void z() {
        r45.gr4 gr4Var;
        java.lang.Object[] objArr = new java.lang.Object[1];
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = this.f381610a;
        objArr[0] = c16601x7ed0e40c != null ? c16601x7ed0e40c.f66791xc8a07680 : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbsMultiTaskHelper", "onEnterPage, type:", objArr);
        r45.kr4 kr4Var = this.f381612c;
        if (kr4Var == null || (gr4Var = (r45.gr4) kr4Var.m75936x14adae67(5)) == null) {
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).getClass();
        gr4Var.set(0, java.lang.Long.valueOf(c01.id.c()));
    }
}
