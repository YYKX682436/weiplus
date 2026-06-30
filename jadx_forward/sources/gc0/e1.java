package gc0;

/* loaded from: classes5.dex */
public final class e1 {

    /* renamed from: o, reason: collision with root package name */
    public static final gc0.z0 f351674o = new gc0.z0(null);

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f351675a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f351676b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f351677c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f351678d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f351679e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f351680f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f351681g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f351682h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f351683i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f351684j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f351685k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f351686l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f351687m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f351688n;

    public e1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f351675a = activity;
        this.f351676b = jz5.h.b(new gc0.c1(this));
        this.f351677c = jz5.h.b(new gc0.d1(this));
        this.f351679e = new java.util.LinkedHashMap();
        this.f351680f = new java.util.ArrayList();
        this.f351681g = new java.util.ArrayList();
        this.f351682h = "";
        this.f351685k = "";
        this.f351686l = "";
        this.f351687m = new java.util.ArrayList();
        this.f351688n = new java.util.ArrayList();
    }

    public final void a(r45.kl5 kl5Var, android.view.View view, int i17, java.lang.String talker) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        if (kl5Var == null) {
            return;
        }
        gc0.z0 z0Var = f351674o;
        z0Var.a(this.f351679e, i17, kl5Var);
        long m75942xfb822ef2 = kl5Var.m75942xfb822ef2(3);
        int b17 = z0Var.b(kl5Var);
        r45.ll5 ll5Var = (r45.ll5) kl5Var.m75936x14adae67(5);
        java.lang.Integer valueOf = ll5Var != null ? java.lang.Integer.valueOf(ll5Var.m75939xb282bd08(1)) : null;
        int i18 = (!((valueOf != null && valueOf.intValue() == 2) || (valueOf != null && valueOf.intValue() == 4)) && (valueOf == null || valueOf.intValue() != 3)) ? 0 : 1;
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(view, "notes_candidate");
        aVar.ik(view, 40, 33926);
        jz5.l[] lVarArr = new jz5.l[6];
        lVarArr[0] = new jz5.l("note_type", java.lang.Integer.valueOf(i17));
        lVarArr[1] = new jz5.l("add_username", talker);
        lVarArr[2] = new jz5.l("note_sid", (java.lang.String) ((jz5.n) this.f351676b).mo141623x754a37bb());
        lVarArr[3] = new jz5.l("candidate_source_type", java.lang.Integer.valueOf(b17));
        lVarArr[4] = new jz5.l("candidate_output_type", java.lang.Integer.valueOf(i18));
        lVarArr[5] = new jz5.l("default_note_type", java.lang.Integer.valueOf(j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2562xc84ac380.C20630xe35b63ae()) == 1 ? 1 : 0));
        java.util.Map l17 = kz5.c1.l(lVarArr);
        if (i17 == 1) {
            l17.put("candidate_type", java.lang.Long.valueOf(m75942xfb822ef2));
        }
        aVar.gk(view, l17);
    }

    public final void b(java.lang.String str, java.util.List list, java.util.List list2, com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a) {
        java.lang.CharSequence m79028xfb85ada3;
        boolean z17 = false;
        this.f351683i = c21503x6e5a020a != null && c21503x6e5a020a.getHasFocused();
        if (!r26.n0.N(this.f351685k)) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((c21503x6e5a020a == null || (m79028xfb85ada3 = c21503x6e5a020a.m79028xfb85ada3()) == null) ? null : r26.n0.u0(m79028xfb85ada3), r26.n0.u0(this.f351685k).toString())) {
                z17 = true;
            }
        }
        this.f351684j = z17;
        this.f351686l = str == null ? "" : str;
        if (list != null) {
            ((java.util.ArrayList) this.f351687m).addAll(list);
        }
        if (list2 != null) {
            ((java.util.ArrayList) this.f351688n).addAll(list2);
        }
        boolean m40539x7a994349 = com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f351675a;
        if (!m40539x7a994349) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecommendRemarkReport", "onFinishClick() called page:".concat(activityC0065xcd7aa112.getClass().getSimpleName()));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecommendRemarkReport", "onFinishClick() called page:" + activityC0065xcd7aa112.getClass().getSimpleName() + " remark:" + str + " phoneList:" + list + " img:" + list2);
    }
}
