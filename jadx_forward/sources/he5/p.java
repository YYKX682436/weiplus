package he5;

/* loaded from: classes9.dex */
public final class p implements he5.t {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f362501a;

    /* renamed from: b, reason: collision with root package name */
    public final int f362502b;

    /* renamed from: c, reason: collision with root package name */
    public final int f362503c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f362504d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f362505e;

    /* renamed from: f, reason: collision with root package name */
    public android.database.Cursor f362506f;

    /* renamed from: g, reason: collision with root package name */
    public final long f362507g;

    public p(java.lang.String talker, int i17, int i18, java.lang.String templateId, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        this.f362501a = talker;
        this.f362502b = i17;
        this.f362503c = i18;
        this.f362504d = templateId;
        this.f362505e = z17;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f362507g = java.lang.System.currentTimeMillis() - 31536000000L;
    }

    @Override // he5.t
    public int a() {
        return this.f362503c;
    }

    @Override // he5.t
    public void b(java.util.List list, he5.s success) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(success, "success");
        android.database.Cursor cursor = this.f362506f;
        if (cursor == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cursor");
            throw null;
        }
        try {
            if (cursor == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cursor");
                throw null;
            }
            cursor.moveToFirst();
            while (true) {
                android.database.Cursor cursor2 = this.f362506f;
                if (cursor2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cursor");
                    throw null;
                }
                if (cursor2.isAfterLast()) {
                    vz5.b.a(cursor, null);
                    ((hd5.f) success).a();
                    return;
                }
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                android.database.Cursor cursor3 = this.f362506f;
                if (cursor3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cursor");
                    throw null;
                }
                f9Var.mo9015xbf5d97fd(cursor3);
                if (e(f9Var) && list != null) {
                    list.add(f9Var);
                }
                android.database.Cursor cursor4 = this.f362506f;
                if (cursor4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cursor");
                    throw null;
                }
                cursor4.moveToNext();
            }
        } finally {
        }
    }

    @Override // he5.t
    public void c(hd5.o oVar) {
        xg3.m0 u17 = c01.d9.b().u();
        android.database.Cursor M4 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) u17).M4(this.f362501a, this.f362502b, this.f362507g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(M4, "getInitCursor(...)");
        this.f362506f = M4;
        if (oVar != null) {
            oVar.mo133232x338af3();
        }
    }

    @Override // he5.t
    /* renamed from: close */
    public void mo133462x5a5ddf8() {
        android.database.Cursor cursor = this.f362506f;
        if (cursor != null) {
            cursor.close();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cursor");
            throw null;
        }
    }

    @Override // he5.t
    public long d() {
        return 0L;
    }

    public final boolean e(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.util.Map d17;
        int i17;
        if (!f9Var.a3()) {
            return false;
        }
        ot0.q v17 = ot0.q.v(f9Var.j());
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(v17 != null ? v17.H0 : null, this.f362504d)) {
            return true;
        }
        if (this.f362505e && (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(f9Var.j(), "msg", null)) != null && d17.size() != 0) {
            java.lang.String str = (java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.new_tmpl_type");
            if (str == null) {
                str = "-1";
            }
            try {
                i17 = java.lang.Integer.parseInt(str);
            } catch (java.lang.NumberFormatException unused) {
                i17 = -1;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.o1(java.lang.Integer.valueOf(i17), -1) == 7) {
                return true;
            }
            java.lang.String str2 = (java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.template_ext.voip_call_info.im_room_id");
            if (str2 == null) {
                str2 = "";
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                return true;
            }
        }
        return false;
    }
}
