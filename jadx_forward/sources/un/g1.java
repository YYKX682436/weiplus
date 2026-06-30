package un;

/* loaded from: classes11.dex */
public final class g1 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f510789d;

    /* renamed from: e, reason: collision with root package name */
    public int f510790e;

    /* renamed from: f, reason: collision with root package name */
    public int f510791f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f510792g;

    /* renamed from: h, reason: collision with root package name */
    public long f510793h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f510794i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f510795m;

    /* renamed from: n, reason: collision with root package name */
    public android.util.Pair f510796n;

    /* renamed from: o, reason: collision with root package name */
    public dn.h f510797o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f510798p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f510799q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.List f510800r;

    /* renamed from: s, reason: collision with root package name */
    public dn.h f510801s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f510802t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.HashMap f510803u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.HashMap f510804v;

    /* renamed from: w, reason: collision with root package name */
    public final dn.k f510805w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f510789d = jz5.h.b(new un.e1(this));
        this.f510793h = -1L;
        this.f510796n = new android.util.Pair(new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(-1L, ""), java.lang.Boolean.FALSE);
        this.f510800r = new java.util.ArrayList();
        this.f510802t = jz5.h.b(new un.b1(activity, this));
        this.f510803u = new java.util.HashMap();
        this.f510804v = new java.util.HashMap();
        this.f510805w = new un.a1(this);
    }

    public final java.lang.String T6() {
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("chatroomName");
        return stringExtra == null ? "" : stringExtra;
    }

    public final dn.m U6(java.lang.String str, boolean z17) {
        dn.m mVar = new dn.m();
        mVar.f323319e = true;
        mVar.f323320f = this.f510805w;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(android.os.SystemClock.elapsedRealtime());
        sb6.append(", ");
        sb6.append(str);
        byte[] bytes = sb6.toString().getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        java.lang.String field_mediaId = kk.k.g(bytes);
        mVar.f69601xaca5bdda = field_mediaId;
        mVar.f69595x6d25b0d9 = str;
        mVar.f69619xe9ed65f6 = "";
        mVar.f69592xf1ebe47b = 5;
        mVar.f69618x114ef53e = "";
        mVar.f69609xd84b8349 = 2;
        mVar.f69606xccdbf540 = false;
        mVar.f69597x853bb235 = false;
        mVar.f69580x454032b6 = 0;
        mVar.f69584x89a4c0cf = 0;
        java.util.HashMap hashMap = this.f510803u;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_mediaId, "field_mediaId");
        java.lang.String field_fullpath = mVar.f69595x6d25b0d9;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_fullpath, "field_fullpath");
        hashMap.put(field_mediaId, field_fullpath);
        java.util.HashMap hashMap2 = this.f510804v;
        java.lang.String field_mediaId2 = mVar.f69601xaca5bdda;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_mediaId2, "field_mediaId");
        java.lang.String field_mediaId3 = mVar.f69601xaca5bdda;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_mediaId3, "field_mediaId");
        java.lang.String field_fullpath2 = mVar.f69595x6d25b0d9;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_fullpath2, "field_fullpath");
        hashMap2.put(field_mediaId2, new un.t0(field_mediaId3, field_fullpath2, z17));
        return mVar;
    }

    public final em.l2 V6() {
        return (em.l2) ((jz5.n) this.f510789d).mo141623x754a37bb();
    }

    public final void W6(int i17, java.lang.String str, java.lang.String str2) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(i17);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        objArr[1] = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectWxChatRoomAddMemberUIC", "triggerErrorCallback errCode:%s errMsg:%s", objArr);
        this.f510795m = true;
        this.f510799q = true;
        this.f510794i = false;
        this.f510798p = false;
        X6();
        ((ku5.t0) ku5.t0.f394148d).B(new un.d1(this, str2));
        a14.a a17 = a14.a.a();
        long a18 = c01.id.a();
        long j17 = a17.f82120f;
        if (a18 > j17) {
            a17.f82115a.f141905s = a18 - j17;
        }
        a14.a.a().f82123i++;
    }

    public final void X6() {
        d75.b.g(new un.f1(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y6() {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: un.g1.Y6():void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo2273x9d4787cb(i17, i18, intent);
        if (intent == null || i17 != 10001) {
            return;
        }
        boolean z17 = false;
        int intExtra = intent.getIntExtra("select_record_msg_num", 0);
        this.f510790e = intExtra;
        this.f510791f = intExtra;
        this.f510792g = intent.getStringArrayListExtra("key_selected_record_msg_list");
        this.f510797o = null;
        this.f510801s = null;
        this.f510795m = false;
        this.f510799q = false;
        if (this.f510790e == 0) {
            this.f510794i = false;
            this.f510798p = false;
            X6();
        } else {
            this.f510794i = true;
            this.f510798p = true;
            this.f510793h = intent.getLongExtra("select_record_min_msg_id", -1L);
            rd0.v0 v0Var = (rd0.v0) i95.n0.c(rd0.v0.class);
            int i19 = this.f510790e;
            ((qg5.p0) v0Var).getClass();
            int g17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.x3.g();
            if (1 <= g17 && g17 < i19) {
                z17 = true;
            }
            if (z17) {
                this.f510791f = com.p314xaae8f345.mm.ui.p2650x55bb7a46.x3.g();
            }
            X6();
            a14.a.a().f82120f = c01.id.a();
            this.f510800r = new java.util.ArrayList(com.p314xaae8f345.mm.ui.p2650x55bb7a46.x3.f287761a.f287734a);
            android.util.Pair i27 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.x3.i(m158354x19263085(), "msginfo@fakeuser", true, T6());
            this.f510796n = i27;
            if (((java.lang.Boolean) i27.second).booleanValue()) {
                Y6();
            } else {
                ((com.p314xaae8f345.mm.p648x55baa833.ui.uic.C10386x9087a77d) ((jz5.n) this.f510802t).mo141623x754a37bb()).mo48813x58998cd();
            }
        }
        a14.a.a().f82115a.f141895i = this.f510791f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectWxChatRoomAddMemberUIC", "GET_SELECT_RECORD_MSG selectMsgNum:%s actualSelectMsgNum:%s msgId:%s direct:%s", java.lang.Integer.valueOf(this.f510790e), java.lang.Integer.valueOf(this.f510791f), java.lang.Long.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5) this.f510796n.first).f231013d), this.f510796n.second);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f m67437x4bd5310;
        j75.f m67437x4bd53102;
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 != null && (m67437x4bd53102 = P6.m67437x4bd5310()) != null) {
            m67437x4bd53102.z3(m158354x19263085(), new un.u0(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P62 = P6();
        if (P62 == null || (m67437x4bd5310 = P62.m67437x4bd5310()) == null) {
            return;
        }
        m67437x4bd5310.L2(m158354x19263085(), new un.z0(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        if (((rd0.v0) i95.n0.c(rd0.v0.class)) != null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.x3.a();
        }
    }
}
