package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316;

/* loaded from: classes11.dex */
public final class o0 extends kr3.j {

    /* renamed from: r, reason: collision with root package name */
    public java.util.List f235492r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.List f235493s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f235494t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f235495u;

    /* renamed from: v, reason: collision with root package name */
    public int f235496v;

    /* renamed from: w, reason: collision with root package name */
    public int f235497w;

    /* renamed from: x, reason: collision with root package name */
    public java.util.ArrayList f235498x;

    /* renamed from: y, reason: collision with root package name */
    public java.util.ArrayList f235499y;

    /* renamed from: z, reason: collision with root package name */
    public int f235500z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        kz5.p0 p0Var = kz5.p0.f395529d;
        this.f235492r = p0Var;
        this.f235493s = p0Var;
        this.f235494t = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.l0(activity));
        this.f235498x = new java.util.ArrayList();
        this.f235499y = new java.util.ArrayList();
    }

    @Override // kr3.j
    public java.lang.Object R6(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return ((j93.n) ((jz5.n) this.f235494t).mo141623x754a37bb()).P6(interfaceC29045xdcb5ca57);
    }

    @Override // kr3.j
    public java.lang.String V6() {
        return "ModLabelUIC";
    }

    @Override // kr3.j
    public lr3.a Z6() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.k0(this);
    }

    @Override // kr3.j
    public boolean a7() {
        if (this.f235492r.size() != this.f235493s.size()) {
            return true;
        }
        return !this.f235493s.containsAll(this.f235492r);
    }

    @Override // kr3.j
    public android.view.View c7(java.lang.String username, com.p314xaae8f345.mm.p2621x8fb0427b.z3 contact) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        j93.n nVar = (j93.n) ((jz5.n) this.f235494t).mo141623x754a37bb();
        jz5.g gVar = this.f392931p;
        nVar.S6(username, ((java.lang.Boolean) ((jz5.n) gVar).mo141623x754a37bb()).booleanValue(), this.f392923e, new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.m0(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1968xd1075a44.C16924x6da766a4 c16924x6da766a4 = new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1968xd1075a44.C16924x6da766a4(m158354x19263085());
        c16924x6da766a4.m67736x5db1c8a().a().setPadding(0, 0, 0, 0);
        c16924x6da766a4.m67738x764b0e09(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.gxs));
        java.util.List i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.n2.f235073a.i(contact);
        this.f235492r = i17;
        this.f235493s = i17;
        if (!i17.isEmpty()) {
            c16924x6da766a4.m67737xe9f5bdb7(kz5.n0.g0(this.f235492r, m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572457ba0), null, null, 0, null, null, 62, null));
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("is_stranger", ((java.lang.Boolean) ((jz5.n) gVar).mo141623x754a37bb()).booleanValue());
        intent.putExtra("selected_labels", this.f235498x);
        intent.putExtra("selected_source", this.f235499y);
        c16924x6da766a4.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.n0(this, intent));
        return c16924x6da766a4;
    }

    @Override // kr3.j
    public void e7() {
        java.util.List W6 = ((j93.n) ((jz5.n) this.f235494t).mo141623x754a37bb()).W6(this.f235492r);
        this.f235492r = W6;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1968xd1075a44.C16924x6da766a4 c16924x6da766a4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1968xd1075a44.C16924x6da766a4) this.f392926h;
        if (c16924x6da766a4 != null) {
            c16924x6da766a4.m67737xe9f5bdb7(kz5.n0.g0(W6, m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572457ba0), null, null, 0, null, null, 62, null));
        }
        super.e7();
    }

    @Override // kr3.j
    public void g7(com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6829x19be670f struct) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(struct, "struct");
        long j17 = 0;
        struct.f141499e = this.f235495u ? 1L : 0L;
        struct.f141504j = this.f235493s.size();
        struct.f141508n = ((java.util.ArrayList) ((b93.b) c93.a.a()).c()).size();
        int size = this.f235493s.size();
        java.util.Iterator it = this.f235499y.iterator();
        long j18 = 0;
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            if (intValue == 0) {
                size--;
            } else if (intValue == 1) {
                j17++;
            } else if (intValue == 2) {
                j18++;
            }
        }
        struct.f141506l = j17 + j18 + this.f235500z;
        struct.f141505k = size;
        struct.f141502h = j17;
        struct.f141503i = j18;
        struct.f141501g = this.f235496v;
        struct.f141500f = this.f235497w;
    }

    @Override // kr3.j
    public int k7() {
        return 39;
    }

    @Override // kr3.j
    public int l7() {
        return com.p314xaae8f345.mm.R.C30867xcad56011.gxu;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        java.util.ArrayList<java.lang.String> stringArrayListExtra;
        super.mo2273x9d4787cb(i17, i18, intent);
        if (i17 != 600 || intent == null || (stringArrayListExtra = intent.getStringArrayListExtra("result_label_id_list")) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.n0.V(stringArrayListExtra));
        int intExtra = intent.getIntExtra("recommend_label_adopt_count", 0);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((j93.n) pf5.z.f435481a.a(activity).a(j93.n.class)).O6(arrayList, intExtra);
        java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent.getStringArrayListExtra("selected_labels");
        if (stringArrayListExtra2 != null) {
            this.f235498x = stringArrayListExtra2;
        }
        java.util.ArrayList<java.lang.Integer> integerArrayListExtra = intent.getIntegerArrayListExtra("selected_source");
        if (integerArrayListExtra != null) {
            this.f235499y = integerArrayListExtra;
        }
        this.f235496v += intent.getIntExtra("search_add_new_label_cnt", 0);
        this.f235497w += intent.getIntExtra("button_add_new_label_cnt", 0);
        e7();
    }
}
