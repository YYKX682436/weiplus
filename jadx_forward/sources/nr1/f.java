package nr1;

/* loaded from: classes11.dex */
public final class f extends l75.n0 implements l75.q0, hr1.t {

    /* renamed from: e, reason: collision with root package name */
    public static final nr1.d f420673e = new nr1.d(null);

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f420674f;

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f420675g;

    /* renamed from: h, reason: collision with root package name */
    public static final p75.d f420676h;

    /* renamed from: i, reason: collision with root package name */
    public static final p75.d f420677i;

    /* renamed from: m, reason: collision with root package name */
    public static final p75.d f420678m;

    /* renamed from: n, reason: collision with root package name */
    public static final p75.d f420679n;

    /* renamed from: o, reason: collision with root package name */
    public static final nr1.c f420680o;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f420681d;

    static {
        l75.e0 e0Var = hr1.e.f364877y0;
        f420674f = new java.lang.String[]{l75.n0.m145250x3fdc6f77(hr1.e.f364877y0, "BizPhotoFansConversation")};
        f420675g = new p75.n0("BizPhotoFansConversation");
        f420676h = new p75.d("selfBiz", "string", "BizPhotoFansConversation", "");
        f420677i = new p75.d(dm.i4.f66874x4c6b1f55, "long", "BizPhotoFansConversation", "");
        f420678m = new p75.d("placedFlag", "long", "BizPhotoFansConversation", "");
        f420679n = new p75.d("isGreetSession", "int", "BizPhotoFansConversation", "");
        f420680o = new nr1.c();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l75.k0 db6) {
        super(db6, hr1.e.f364877y0, "BizPhotoFansConversation", dm.e1.D);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        l75.e0 e0Var = hr1.e.f364877y0;
        this.f420681d = db6;
    }

    public final int D0(java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
        tk.s[] sVarArr = tk.s.f501403d;
        java.lang.String c17 = jr1.j.c(((ox.r) d0Var).Bi(2).c());
        android.database.Cursor B = this.f420681d.B("SELECT unReadCount \nFROM BizPhotoFansConversation \nWHERE sessionId = ?\nAND selfBiz = ?", new java.lang.String[]{sessionId, c17});
        if (B != null) {
            try {
                r2 = B.moveToFirst() ? B.getInt(0) : 0;
                vz5.b.a(B, null);
            } finally {
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizPhotoFans.ConversationStorage", "[getUnreadCount] sessionId=" + sessionId + " selfBiz=" + c17 + " count=" + r2);
        return r2;
    }

    public final java.util.List J0(java.lang.String selfBiz, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selfBiz, "selfBiz");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        p75.i0 i27 = f420675g.i();
        i27.f434190d = f420676h.j(selfBiz).c(f420679n.i(java.lang.Integer.valueOf(i17)));
        i27.f434192f = kz5.c0.i(f420678m.u(), f420677i.u());
        i27.c(i19, i18);
        i27.f434189c = "BizPhotoFans.ConversationStorage";
        p75.l0 a17 = i27.a();
        android.database.Cursor B = this.f420681d.B(a17.f434169a, a17.f434170b);
        while (B.moveToNext()) {
            try {
                hr1.e eVar = new hr1.e(f420680o);
                eVar.mo9015xbf5d97fd(B);
                eVar.u0();
                linkedList.add(eVar);
            } finally {
            }
        }
        vz5.b.a(B, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizPhotoFans.ConversationStorage", "[queryByGreet] biz=" + selfBiz + " isGreet=" + i17 + " size=" + linkedList.size());
        return linkedList;
    }

    public final void L0(hr1.e eVar) {
        if (eVar == null) {
            return;
        }
        java.lang.String str = eVar.f66328x114ef53e;
        if (str == null || str.length() == 0) {
            str = eVar.f66326xbed8694c;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "bizphotofansnofiticationholder@picfansmsg")) {
            return;
        }
        if (str == null || str.length() == 0) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizPhotoFans.ConversationStorage", "[updateUnreadByTalker] talker=" + str);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().Mb(str);
    }

    @Override // hr1.t
    public boolean m(java.lang.String sessionId, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        boolean z18 = false;
        if (sessionId.length() == 0) {
            return false;
        }
        hr1.e z07 = z0(sessionId);
        int i17 = z07.f66330xa35b5abb;
        z07.f66330xa35b5abb = 0;
        z07.f66324x9b4f418d = 1;
        if (i17 != 0) {
            z18 = m145258xce0038c9(z07.f72763xa3c65b86, z07, false);
            mo142179xf35bbb4(z07.f66326xbed8694c, 5, z07);
        }
        if (z17) {
            L0(z07);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizPhotoFans.ConversationStorage", "[clearUnreadCount] ret=" + z18 + ' ' + i17 + " => " + z07.f66330xa35b5abb + " sessionId=" + sessionId);
        return z18;
    }

    @Override // hr1.t
    public hr1.e n(java.lang.String selfBiz) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selfBiz, "selfBiz");
        android.database.Cursor B = this.f420681d.B("SELECT *, rowid FROM BizPhotoFansConversation WHERE selfBiz = ? AND isGreetSession = 1 ORDER BY updateTime DESC LIMIT 1", new java.lang.String[]{selfBiz});
        try {
            if (B.moveToFirst()) {
                hr1.e eVar = new hr1.e(f420680o);
                eVar.mo9015xbf5d97fd(B);
                eVar.u0();
                vz5.b.a(B, null);
                return eVar;
            }
            vz5.b.a(B, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizPhotoFans.ConversationStorage", "[getLatestGreetConv] biz=" + selfBiz + " found=null");
            return null;
        } finally {
        }
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        java.lang.Object obj = w0Var != null ? w0Var.f398509d : null;
        if (!(obj instanceof hr1.e)) {
            obj = null;
        }
        if (obj != null) {
            hr1.e eVar = (hr1.e) obj;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(eVar.f66326xbed8694c, "bizphotofansnofiticationholder@picfansmsg")) {
                return;
            }
            jr1.i iVar = jr1.i.f382893a;
            if (!iVar.a(eVar.f66325xea7a0fe2, 5)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizPhotoFans.ConversationStorage", "[onNotifyChange] msgBiz=" + eVar.f66325xea7a0fe2 + ", loginBiz=" + iVar.c(5));
                return;
            }
            if ((w0Var != null ? w0Var.f398509d : null) instanceof hr1.e) {
                int i17 = w0Var.f398507b;
                if (i17 == 1 || i17 == 2) {
                    rk.e.a(((gr1.n) ((rk.g) i95.n0.c(rk.g.class))).wi(), null, 5, true, 1, null);
                    return;
                }
                if (i17 == 5 || i17 == 6) {
                    rk.e.a(((gr1.n) ((rk.g) i95.n0.c(rk.g.class))).wi(), null, 5, false, 5, null);
                } else {
                    if (i17 != 8) {
                        return;
                    }
                    rk.e.a(((gr1.n) ((rk.g) i95.n0.c(rk.g.class))).wi(), java.lang.Boolean.TRUE, 5, false, 4, null);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r7.p(r2, r3, "sessionId = ? AND selfBiz = ?", r4) > 0) goto L26;
     */
    @Override // l75.n0
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo55864x413cb2b4(hr1.e r10, boolean r11) {
        /*
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[replace] "
            r0.<init>(r1)
            r1 = 0
            if (r10 == 0) goto Lf
            java.lang.String r2 = r10.m133926x9616526c()
            goto L10
        Lf:
            r2 = r1
        L10:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "BizPhotoFans.ConversationStorage"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
            r0 = 0
            if (r10 != 0) goto L20
            return r0
        L20:
            android.content.ContentValues r3 = r10.mo9763xeb27878e()
            java.lang.String r4 = r10.f66326xbed8694c
            java.lang.String r5 = "field_sessionId"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r5)
            android.os.SystemClock.uptimeMillis()
            java.lang.Class<rm.d0> r5 = rm.d0.class
            i95.m r5 = i95.n0.c(r5)
            rm.d0 r5 = (rm.d0) r5
            tk.s[] r6 = tk.s.f501403d
            ox.r r5 = (ox.r) r5
            r6 = 2
            com.tencent.wechat.iam.biz.z0 r5 = r5.Bi(r6)
            java.lang.String r5 = r5.c()
            java.lang.String r5 = jr1.j.c(r5)
            java.lang.String[] r4 = new java.lang.String[]{r4, r5}
            java.lang.String r5 = "select *, rowid from BizPhotoFansConversation where sessionId = ? AND selfBiz = ?"
            l75.k0 r7 = r9.f420681d
            android.database.Cursor r4 = r7.B(r5, r4)
            int r5 = r4.getCount()     // Catch: java.lang.Throwable -> Le4
            r8 = 1
            if (r5 <= 0) goto L5d
            r5 = r8
            goto L5e
        L5d:
            r5 = r0
        L5e:
            vz5.b.a(r4, r1)
            java.lang.String r1 = ""
            if (r5 == 0) goto L8d
            java.lang.String r2 = r9.mo145255x88e404c3()
            java.lang.String[] r4 = new java.lang.String[r6]
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r1)
            java.lang.String r6 = r10.f66326xbed8694c
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4[r0] = r5
            java.lang.String r5 = r10.f66325xea7a0fe2
            if (r5 != 0) goto L80
            goto L81
        L80:
            r1 = r5
        L81:
            r4[r8] = r1
            java.lang.String r1 = "sessionId = ? AND selfBiz = ?"
            int r1 = r7.p(r2, r3, r1, r4)
            if (r1 <= 0) goto Lda
            goto L93
        L8d:
            boolean r4 = super.mo51731x24249762(r10, r0)
            if (r4 == 0) goto L95
        L93:
            r0 = r8
            goto Lda
        L95:
            java.lang.String r4 = r9.mo145255x88e404c3()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r1)
            java.lang.String r1 = r10.f66326xbed8694c
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            java.lang.String[] r1 = new java.lang.String[]{r1}
            java.lang.String r5 = "sessionId = ?"
            int r1 = r7.p(r4, r3, r5, r1)
            if (r1 <= 0) goto Lb5
            r0 = r8
        Lb5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "[replace] insert failed, fallback update by sessionId, ret="
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r3 = " sessionId="
            r1.append(r3)
            java.lang.String r3 = r10.f66326xbed8694c
            r1.append(r3)
            java.lang.String r3 = " selfBiz="
            r1.append(r3)
            java.lang.String r3 = r10.f66325xea7a0fe2
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r1)
        Lda:
            if (r0 == 0) goto Le3
            if (r11 == 0) goto Le3
            java.lang.String r11 = r10.f66326xbed8694c
            r9.mo142179xf35bbb4(r11, r8, r10)
        Le3:
            return r0
        Le4:
            r10 = move-exception
            throw r10     // Catch: java.lang.Throwable -> Le6
        Le6:
            r11 = move-exception
            vz5.b.a(r4, r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: nr1.f.mo55864x413cb2b4(hr1.e, boolean):boolean");
    }

    @Override // hr1.t
    public int y(java.lang.String selfBiz) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selfBiz, "selfBiz");
        android.database.Cursor B = this.f420681d.B("SELECT SUM(unReadCount) FROM BizPhotoFansConversation WHERE selfBiz = ? AND isGreetSession = 1", new java.lang.String[]{selfBiz});
        try {
            int i17 = B.moveToFirst() ? B.getInt(0) : 0;
            vz5.b.a(B, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizPhotoFans.ConversationStorage", "[getGreetUnreadCount] biz=" + selfBiz + " count=" + i17);
            return i17;
        } finally {
        }
    }

    public final void y0(java.lang.String selfBiz) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selfBiz, "selfBiz");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizPhotoFans.ConversationStorage", "[clearAllUnreadCount] selfBiz=".concat(selfBiz));
        ((ku5.t0) ku5.t0.f394148d).q(new nr1.e(this, selfBiz));
    }

    public hr1.e z0(java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
        tk.s[] sVarArr = tk.s.f501403d;
        android.database.Cursor B = this.f420681d.B("select *, rowid from BizPhotoFansConversation where sessionId = ? AND selfBiz = ?", new java.lang.String[]{sessionId, jr1.j.c(((ox.r) d0Var).Bi(2).c())});
        hr1.e eVar = new hr1.e(f420680o);
        eVar.f66326xbed8694c = sessionId;
        if (B != null) {
            try {
                if (B.moveToFirst()) {
                    eVar.mo9015xbf5d97fd(B);
                    eVar.u0();
                }
                vz5.b.a(B, null);
            } finally {
            }
        }
        return eVar;
    }
}
