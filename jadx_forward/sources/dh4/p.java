package dh4;

/* loaded from: classes11.dex */
public class p implements p21.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f314092d = "";

    /* renamed from: e, reason: collision with root package name */
    public boolean f314093e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f314094f = false;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f314095g = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    /* renamed from: h, reason: collision with root package name */
    public android.app.Notification f314096h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f314097i;

    @Override // p21.d
    public void J0(int i17, int i18, java.lang.String str) {
    }

    @Override // p21.d
    public void J1(java.lang.String str, int i17, int i18) {
        this.f314093e = false;
    }

    @Override // p21.d
    public void N4(int i17) {
    }

    @Override // p21.d
    public void P2(java.lang.String str, java.lang.String str2) {
        if (this.f314094f) {
            return;
        }
        c();
    }

    @Override // p21.d
    public void P3() {
        a();
    }

    @Override // p21.d
    public void R() {
    }

    @Override // p21.d
    public void T0(java.lang.String str) {
    }

    @Override // p21.d
    public void T1() {
    }

    @Override // p21.d
    public void U2() {
    }

    public void a() {
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).f(100);
    }

    public final void b(java.lang.String str) {
        boolean z17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(dh4.l.Di().f314049h)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TalkRoomDisplayMgr", "yy checkServer null");
            a();
            z17 = false;
        } else {
            z17 = true;
        }
        if (z17) {
            this.f314097i = str;
            z2.k0 k0Var = new z2.k0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "reminder_channel_id");
            k0Var.m(str);
            k0Var.D.when = 0L;
            android.app.Notification b17 = k0Var.b();
            this.f314096h = b17;
            b17.icon = com.p314xaae8f345.mm.R.C30861xcebc809e.bnx;
            b17.flags = 32;
            c();
        }
    }

    public final void c() {
        boolean z17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(dh4.l.Di().f314049h)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TalkRoomDisplayMgr", "yy checkServer null");
            a();
            z17 = false;
        } else {
            z17 = true;
        }
        if (z17) {
            if (this.f314096h == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TalkRoomDisplayMgr", "yy updateNotify error no notification");
                return;
            }
            java.lang.String a17 = dh4.g0.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, dh4.l.Di().f314049h);
            java.lang.String string = dh4.l.Di().f314064z ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jom) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.joj, java.lang.Integer.valueOf(dh4.l.Di().k().size()));
            ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
            android.content.Intent intent = new android.content.Intent(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.class);
            intent.putExtra("nofification_type", "talkroom_notification");
            intent.addFlags(67108864);
            intent.putExtra("enter_chat_usrname", dh4.l.Di().f314049h);
            android.app.PendingIntent activity = android.app.PendingIntent.getActivity(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 100, intent, fp.g0.a(268435456));
            z2.k0 k0Var = new z2.k0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "reminder_channel_id");
            k0Var.m(this.f314097i);
            k0Var.D.when = 0L;
            k0Var.f(a17);
            k0Var.e(string);
            k0Var.f550996g = activity;
            android.app.Notification b17 = k0Var.b();
            this.f314096h = b17;
            b17.icon = com.p314xaae8f345.mm.R.C30861xcebc809e.bnx;
            b17.flags = 32;
            ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).n(100, this.f314096h, false);
        }
    }

    @Override // p21.d
    public void m3() {
    }

    @Override // p21.d
    public void n1() {
        this.f314093e = false;
    }

    @Override // p21.d
    public void q5(java.lang.String str) {
        this.f314092d = str;
    }
}
