package mz4;

/* loaded from: classes12.dex */
public class j0 implements lz4.d {

    /* renamed from: v, reason: collision with root package name */
    public static mz4.j0 f414823v;

    /* renamed from: w, reason: collision with root package name */
    public static int f414824w;

    /* renamed from: x, reason: collision with root package name */
    public static android.util.DisplayMetrics f414825x;

    /* renamed from: a, reason: collision with root package name */
    public boolean f414826a;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.g2 f414833h;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f414835j;

    /* renamed from: s, reason: collision with root package name */
    public mz4.n0 f414844s;

    /* renamed from: b, reason: collision with root package name */
    public long f414827b = -1;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f414828c = "";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f414829d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f414830e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f414831f = "";

    /* renamed from: i, reason: collision with root package name */
    public long f414834i = -1;

    /* renamed from: k, reason: collision with root package name */
    public long f414836k = -1;

    /* renamed from: l, reason: collision with root package name */
    public lz4.c f414837l = null;

    /* renamed from: m, reason: collision with root package name */
    public boolean f414838m = false;

    /* renamed from: n, reason: collision with root package name */
    public int f414839n = -1;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f414840o = null;

    /* renamed from: p, reason: collision with root package name */
    public long f414841p = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f414842q = 0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f414843r = false;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View.OnKeyListener f414845t = new mz4.k0(this);

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f414846u = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new mz4.l0(this), true);

    /* renamed from: g, reason: collision with root package name */
    public final transient java.util.ArrayList f414832g = new java.util.ArrayList();

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.g2 g2Var) {
        this.f414835j = "";
        this.f414833h = g2Var;
        f414823v = this;
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) g2Var;
        o25.n1.a(activityC19519x7af4daf3.mo55332x76847179());
        com.p314xaae8f345.mm.ui.bk.q(activityC19519x7af4daf3.mo55332x76847179());
        f414824w = com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.f(activityC19519x7af4daf3.mo55332x76847179())[0];
        android.util.DisplayMetrics displayMetrics = activityC19519x7af4daf3.mo55332x76847179().getResources().getDisplayMetrics();
        f414825x = displayMetrics;
        android.util.TypedValue.applyDimension(1, 8.0f, displayMetrics);
        this.f414835j = activityC19519x7af4daf3.J1.p(false);
        oz4.n.f431821h = 0.0f;
    }

    public void a() {
        ((ku5.t0) ku5.t0.f394148d).h(new mz4.m0(this), "AddFavNoteSync");
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a b() {
        mz4.d dVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) this.f414833h).J1;
        java.util.ArrayList arrayList = this.f414832g;
        dVar.getClass();
        if (arrayList != null) {
            arrayList.clear();
            synchronized (dVar) {
                java.util.List<iz4.c> list = dVar.f414762a;
                if (list != null) {
                    for (iz4.c cVar : list) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a = cVar.f377641f;
                        if (c19515x154ec45a != null) {
                            arrayList.add(c19515x154ec45a);
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a2 = cVar.f377639d;
                            if (c19515x154ec45a2 != null && cVar.f377640e != null) {
                                arrayList.add(c19515x154ec45a2);
                                arrayList.add(cVar.f377640e);
                            }
                            if (((java.util.LinkedList) cVar.f377642g).size() > 0) {
                                arrayList.addAll(cVar.f377642g);
                            }
                        }
                    }
                }
            }
        }
        java.util.ArrayList arrayList2 = this.f414832g;
        if (arrayList2 == null) {
            return null;
        }
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a) it.next();
            if (c19515x154ec45a3.hasFocus()) {
                return c19515x154ec45a3;
            }
        }
        return null;
    }

    public boolean c(com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a, java.lang.Class cls) {
        if (c19515x154ec45a != null && c19515x154ec45a.m74966xbc88a4a7() == 0) {
            java.util.Iterator it = oz4.w.f431854g.iterator();
            while (it.hasNext()) {
                if (cls.isInstance((oz4.v) it.next())) {
                    return !r2.d(c19515x154ec45a.getText(), r2.c(c19515x154ec45a), oz4.u.SPAN_FLAGS).isEmpty();
                }
            }
        }
        return false;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a b17 = b();
        if (b17 != null) {
            return b17;
        }
        java.util.ArrayList arrayList = this.f414832g;
        return arrayList.size() >= 1 ? (com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a) arrayList.get(arrayList.size() - 1) : b17;
    }

    public final boolean e(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.g2 g2Var = this.f414833h;
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) g2Var;
        activityC19519x7af4daf3.getClass();
        java.lang.String str2 = activityC19519x7af4daf3.I;
        java.lang.String p17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) g2Var).J1.p(false);
        boolean equals = p17.equals(str2);
        boolean equals2 = p17.equals(this.f414835j);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.WXRTManager", "isSameHtmlContent() called isSameWithLastUICommit:%b isSameWithLastUpdate:%b, source=%s", java.lang.Boolean.valueOf(equals), java.lang.Boolean.valueOf(equals2), str);
        return equals || equals2;
    }

    public void f() {
        this.f414846u.d();
        this.f414834i = -1L;
        if (f414823v == this) {
            f414823v = null;
        }
    }

    public void g(oz4.v vVar, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a b17 = b();
        if (b17 != null) {
            if (b17.m74966xbc88a4a7() == 0) {
                int i17 = b17.m74973x9925e2d6().f414883d;
                int length = b17.getText().length();
                if ((obj instanceof java.lang.Boolean) && ((java.lang.Boolean) obj).booleanValue() && i17 == length) {
                    b17.x();
                    b17.getText().append("\n");
                    b17.C();
                    b17.setSelection(i17);
                }
                b17.u(vVar, obj);
            } else {
                b17.M = true;
                b17.L = vVar.b();
                b17.getText().append("\n");
            }
        }
        n(b17);
    }

    public void h(com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a, android.text.Spannable spannable, android.text.Spannable spannable2, int i17, int i18, int i19, int i27) {
        android.view.View findViewById;
        java.lang.String w17 = c19515x154ec45a.w(mz4.h0.f414816b);
        int m74966xbc88a4a7 = c19515x154ec45a.m74966xbc88a4a7();
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.g2 g2Var = this.f414833h;
        if (m74966xbc88a4a7 == 0) {
            iz4.c l17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) g2Var).J1.l(c19515x154ec45a.m74971xef703fb1());
            if (l17 != null && l17.d() == 1) {
                int i28 = (spannable2 == null ? 0 : qz4.c.i(spannable2.toString())) - (spannable == null ? 0 : qz4.c.i(spannable.toString()));
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) g2Var).J1.f(i28, 0)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) g2Var;
                    activityC19519x7af4daf3.getClass();
                    activityC19519x7af4daf3.v7();
                    com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf32 = (com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) g2Var;
                    activityC19519x7af4daf32.getClass();
                    activityC19519x7af4daf32.j3(c19515x154ec45a.m74971xef703fb1(), 0L);
                } else {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) g2Var).J1.h();
                    iz4.i iVar = (iz4.i) l17;
                    iVar.f377638c = i27;
                    iVar.f377688t = w17;
                    iVar.f377637b = true;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteDataManager", "[onTextChanged] content = " + iVar.f377688t);
                    l17.f377643h = false;
                    mz4.d dVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) g2Var).J1;
                    dVar.f414766e += i28;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteDataManager", "[updateTextItemLength] mMaxTextLength = " + dVar.f414766e);
                }
            }
        } else {
            c19515x154ec45a.m74980x765074af("");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w17)) {
                return;
            }
            iz4.i iVar2 = new iz4.i();
            iVar2.f377688t = w17.equals("<br/>") ? "" : w17;
            mz4.j jVar = mz4.j.f414822a;
            mz4.d dataManager = ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) g2Var).J1;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataManager, "dataManager");
            if (!jVar.a(dataManager, c19515x154ec45a, w17, kz5.b0.c(iVar2))) {
                int t17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) g2Var).J1.t(iVar2, c19515x154ec45a, true, true, true, false, false);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) g2Var).J1.e(t17 - 1, t17 + 1, true);
            }
        }
        c19515x154ec45a.setContentDescription(qz4.c.l(w17, c19515x154ec45a.getContext()));
        mz4.n0 n0Var = this.f414844s;
        if (n0Var == null || (findViewById = ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.a0) n0Var).f269710a.findViewById(com.p314xaae8f345.mm.R.id.f564015fq)) == null) {
            return;
        }
        if (c19515x154ec45a.length() > 0) {
            findViewById.setTag(com.p314xaae8f345.mm.R.id.nwn, "0");
        } else {
            findViewById.setTag(com.p314xaae8f345.mm.R.id.nwn, "1");
        }
    }

    public void i(int i17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) this.f414833h;
        activityC19519x7af4daf3.getClass();
        activityC19519x7af4daf3.y7(i17, j17);
    }

    public void j(boolean z17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) this.f414833h;
        activityC19519x7af4daf3.getClass();
        activityC19519x7af4daf3.z7(z17, j17);
    }

    public void k(com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a) {
        if (c19515x154ec45a.C == 0) {
            c19515x154ec45a.setTextSize(0, i65.a.h(c19515x154ec45a.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia));
        }
        mz4.b.f414759d = c19515x154ec45a.getTextSize();
        c19515x154ec45a.f269649r = this;
        c19515x154ec45a.m74978xe08d546d(null);
        c19515x154ec45a.setOnKeyListener(this.f414845t);
    }

    public final void l() {
        if (this.f414834i >= 0 || this.f414836k <= 0) {
            return;
        }
        this.f414846u.c(60000L, 60000L);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f414834i = android.os.SystemClock.elapsedRealtime();
        this.f414835j = ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) this.f414833h).J1.p(false);
    }

    public final synchronized void m(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f c5432x35bb364f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f();
        am.z9 z9Var = c5432x35bb364f.f135776g;
        z9Var.f90061a = 19;
        z9Var.f90064d = ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) this.f414833h).J1.n(str);
        am.z9 z9Var2 = c5432x35bb364f.f135776g;
        if (z9Var2.f90064d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Note.WXRTManager", "updateNoteInfoStorage error, favProtoItem is null");
            return;
        }
        z9Var2.f90062b = str;
        z9Var2.f90065e = this.f414836k;
        z9Var2.f90073m = z17 ? 1 : 0;
        z9Var2.f90063c = "fav_update_note_storage";
        c5432x35bb364f.e();
        if (z17) {
            this.f414839n = c5432x35bb364f.f135776g.f90067g.getIntExtra("fav_note_item_status", -1);
            this.f414840o = c5432x35bb364f.f135776g.f90067g.getStringExtra("fav_note_xml");
            this.f414841p = c5432x35bb364f.f135776g.f90067g.getLongExtra("fav_note_item_updatetime", -1L);
        }
    }

    public void n(com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a) {
        ((tz4.l) this.f414837l).b(tz4.u.Bold, c(c19515x154ec45a, oz4.b.class) && c19515x154ec45a.hasFocus());
        ((tz4.l) this.f414837l).b(tz4.u.Highlight, c(c19515x154ec45a, oz4.f.class) && c19515x154ec45a.hasFocus());
        ((tz4.l) this.f414837l).b(tz4.u.Paragraph_UL, c(c19515x154ec45a, oz4.c.class) && c19515x154ec45a.hasFocus());
        ((tz4.l) this.f414837l).b(tz4.u.Paragraph_OL, c(c19515x154ec45a, oz4.m.class) && c19515x154ec45a.hasFocus());
        ((tz4.l) this.f414837l).b(tz4.u.Paragraph_Todo, c(c19515x154ec45a, oz4.k.class) && c19515x154ec45a.hasFocus());
    }
}
