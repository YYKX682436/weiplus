package h93;

/* loaded from: classes11.dex */
public final class k extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: q, reason: collision with root package name */
    public static final java.util.List f361240q = kz5.c0.i(h93.t.class, h93.q.class, h93.r.class, h93.o.class);

    /* renamed from: d, reason: collision with root package name */
    public java.util.HashMap f361241d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f361242e;

    /* renamed from: f, reason: collision with root package name */
    public final no.a f361243f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f361244g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f361245h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f361246i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f361247m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f361248n;

    /* renamed from: o, reason: collision with root package name */
    public int f361249o;

    /* renamed from: p, reason: collision with root package name */
    public int f361250p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f361241d = new java.util.HashMap();
        this.f361242e = new java.util.ArrayList();
        this.f361243f = new no.a();
        this.f361244g = new java.util.ArrayList();
        this.f361245h = h93.j.f361239d;
        this.f361246i = jz5.h.b(new h93.d(this));
    }

    public final java.util.ArrayList O6() {
        return new java.util.ArrayList(this.f361241d.keySet());
    }

    public final void P6(boolean z17) {
        java.lang.String obj;
        java.lang.String obj2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LabelStateUIC", "startCreateNewLabel");
        android.content.Intent intent = new android.content.Intent();
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f361246i).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        android.text.Editable text = ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) mo141623x754a37bb).getText();
        if (text != null && (obj = text.toString()) != null && (obj2 = r26.n0.u0(obj).toString()) != null && (!r26.n0.N(obj2))) {
            intent.putExtra("create_label_from_search", obj2);
        }
        intent.putExtra("Contact_ReportSessionId", this.f361248n);
        intent.putExtra("label_username", this.f361247m);
        java.lang.String name = com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16167x7777ff84.class.getName();
        bh5.c cVar = new bh5.c();
        cVar.d(intent);
        cVar.f102455a.f102457a = m80379x76847179();
        cVar.a(name);
        cVar.h(z17 ? 1001 : 1000);
    }

    public final void Q6() {
        java.util.ArrayList<java.lang.String> O6 = O6();
        for (java.lang.Class cls : f361240q) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            h93.c cVar = (h93.c) pf5.z.f435481a.a(activity).a(cls);
            cVar.getClass();
            java.lang.Object O62 = cVar.O6();
            if (O62 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16180x2cdd3130) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16180x2cdd3130) O62).m79144xad8cef56(O6);
            }
        }
        this.f361245h.mo152xb9724478();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo2273x9d4787cb(i17, i18, intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LabelStateUIC", "onActivityResult: requestCode=" + i17 + ", resultCode=" + i18);
        if (i17 == 1000 || i17 == 1001) {
            if (i18 == -1) {
                java.lang.Integer valueOf = intent != null ? java.lang.Integer.valueOf(intent.getIntExtra("create_label_by_half_screen_create", -1)) : null;
                if ((valueOf != null) && (valueOf == null || valueOf.intValue() != -1)) {
                    if (i17 == 1000) {
                        this.f361249o++;
                    } else if (i17 == 1001) {
                        this.f361250p++;
                    }
                    this.f361242e.add(valueOf);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LabelStateUIC", "onActivityResult: create new label: " + valueOf);
                }
            }
            java.lang.Object mo141623x754a37bb = ((jz5.n) this.f361246i).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
            android.text.Editable text = ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) mo141623x754a37bb).getText();
            if (text != null) {
                text.clear();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        this.f361247m = m158359x1e885992().getStringExtra("label_username");
        m158359x1e885992().getBooleanExtra("is_stranger", false);
        this.f361248n = m158359x1e885992().getStringExtra("Contact_ReportSessionId");
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f361246i).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) mo141623x754a37bb).addTextChangedListener(new h93.i(this));
        p3325xe03a0797.p3326xc267989b.l.d(mo144225x95f74600(), null, null, new h93.h(this, null), 3, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        p3325xe03a0797.p3326xc267989b.l.d(mo144225x95f74600(), null, null, new h93.h(this, null), 3, null);
    }
}
