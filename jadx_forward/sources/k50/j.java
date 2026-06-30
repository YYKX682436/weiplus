package k50;

/* loaded from: classes9.dex */
public final class j extends m50.x {

    /* renamed from: s, reason: collision with root package name */
    public final v05.b f385762s;

    /* renamed from: t, reason: collision with root package name */
    public long f385763t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f385762s = new v05.b();
    }

    @Override // m50.x
    public co.a V6() {
        return new ec5.a();
    }

    @Override // m50.x
    public java.lang.String W6() {
        java.lang.String m126747x696739c;
        l15.c j17 = ((ec5.a) c7()).j();
        return (j17 == null || (m126747x696739c = j17.m126747x696739c()) == null) ? "" : m126747x696739c;
    }

    @Override // m50.x
    public int b7() {
        return 49;
    }

    @Override // m50.x
    public boolean k7(xi5.e action) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        if (this.f385763t > 0) {
            rd0.k1 k1Var = (rd0.k1) i95.n0.c(rd0.k1.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = m158354x19263085();
            com.p314xaae8f345.mm.p2610xe8058ca2.C21010xd7fb9f66 c21010xd7fb9f66 = new com.p314xaae8f345.mm.p2610xe8058ca2.C21010xd7fb9f66(((ec5.a) c7()).m127285x5000ed37(), java.lang.Long.valueOf(this.f385763t), ((bf5.o) ((e40.u) i95.n0.c(e40.u.class))).wi(this.f385762s));
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.fd) ((rd0.k1) i95.n0.c(rd0.k1.class))).getClass();
            com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType d17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.hd.d(action.f536274b);
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.fd) k1Var).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            try {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.hd.m(context, c21010xd7fb9f66, d17);
                z17 = true;
            } catch (com.p314xaae8f345.mm.ui.p2650x55bb7a46.nd unused) {
                z17 = false;
            }
            if (z17) {
                return true;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(m158354x19263085());
            u1Var.g(m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ncc));
            u1Var.a(true);
            u1Var.l(null);
            u1Var.q(false);
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(m158354x19263085());
            u1Var2.g(m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ncd));
            u1Var2.a(true);
            u1Var2.l(null);
            u1Var2.q(false);
        }
        return false;
    }

    @Override // m50.x
    public void o7(java.lang.String toUser) {
        c01.h7 h7Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 e76 = e7();
        if (e76 != null) {
            h7Var = new c01.h7();
            h7Var.f118760b = e76.m124847x74d37ac6();
            h7Var.f118762d = e76.Q0();
        } else {
            h7Var = null;
        }
        ut.s0 s0Var = new ut.s0(toUser, ((ec5.a) c7()).m127285x5000ed37());
        s0Var.f512256g = h7Var;
        java.lang.String wi6 = ((bf5.o) ((e40.u) i95.n0.c(e40.u.class))).wi(this.f385762s);
        if (wi6 == null) {
            wi6 = "";
        }
        s0Var.f512252c = wi6;
        if (h7Var != null) {
            s0Var.f512254e = "forward_file_msg";
        } else {
            s0Var.f512254e = "forward_file_path";
        }
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j tj6 = ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).tj(((ot.i) ((pt.h0) i95.n0.c(pt.h0.class))).Zi(s0Var));
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
        if (c20976x6ba6452a != null) {
            v65.i.b(c20976x6ba6452a, null, new k50.i(tj6, null), 1, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0063, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r5, r7 != null ? r7.m75945x2fec8307(r7.f449897d + 1) : null) == false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b8  */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo739xfd763ae1(android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k50.j.mo739xfd763ae1(android.os.Bundle):void");
    }

    @Override // m50.x
    public java.lang.String p7() {
        java.lang.String m127285x5000ed37 = ((ec5.a) c7()).m127285x5000ed37();
        if ((m127285x5000ed37 == null || r26.n0.N(m127285x5000ed37)) || !com.p314xaae8f345.mm.vfs.w6.j(m127285x5000ed37)) {
            return null;
        }
        return m127285x5000ed37;
    }
}
