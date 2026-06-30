package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b;

/* loaded from: classes11.dex */
public final class n0 extends kr3.t {

    /* renamed from: r, reason: collision with root package name */
    public java.util.List f235633r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.List f235634s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f235635t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f235636u;

    /* renamed from: v, reason: collision with root package name */
    public int f235637v;

    /* renamed from: w, reason: collision with root package name */
    public int f235638w;

    /* renamed from: x, reason: collision with root package name */
    public java.util.ArrayList f235639x;

    /* renamed from: y, reason: collision with root package name */
    public java.util.ArrayList f235640y;

    /* renamed from: z, reason: collision with root package name */
    public int f235641z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        kz5.p0 p0Var = kz5.p0.f395529d;
        this.f235633r = p0Var;
        this.f235634s = p0Var;
        this.f235635t = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.k0(activity));
        this.f235639x = new java.util.ArrayList();
        this.f235640y = new java.util.ArrayList();
    }

    @Override // kr3.t
    public java.lang.Object R6(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return ((j93.n) ((jz5.n) this.f235635t).mo141623x754a37bb()).P6(interfaceC29045xdcb5ca57);
    }

    @Override // kr3.t
    public java.lang.String V6() {
        return "ModLabelUIC";
    }

    @Override // kr3.t
    public lr3.a Y6() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.j0(this);
    }

    @Override // kr3.t
    public boolean Z6() {
        if (this.f235633r.size() != this.f235634s.size()) {
            return true;
        }
        return !this.f235634s.containsAll(this.f235633r);
    }

    @Override // kr3.t
    public android.view.View b7(java.lang.String username, com.p314xaae8f345.mm.p670x38b72420.o contact) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        j93.n nVar = (j93.n) ((jz5.n) this.f235635t).mo141623x754a37bb();
        jz5.g gVar = this.f393018p;
        nVar.S6(username, ((java.lang.Boolean) ((jz5.n) gVar).mo141623x754a37bb()).booleanValue(), this.f393010e, new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.l0(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1968xd1075a44.C16924x6da766a4 c16924x6da766a4 = new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1968xd1075a44.C16924x6da766a4(m158354x19263085());
        c16924x6da766a4.m67736x5db1c8a().a().setPadding(0, 0, 0, 0);
        c16924x6da766a4.m67738x764b0e09(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.gxs));
        java.util.List h17 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.n2.f235073a.h(contact);
        this.f235633r = h17;
        this.f235634s = h17;
        if (!h17.isEmpty()) {
            c16924x6da766a4.m67737xe9f5bdb7(kz5.n0.g0(this.f235633r, m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572457ba0), null, null, 0, null, null, 62, null));
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("is_stranger", ((java.lang.Boolean) ((jz5.n) gVar).mo141623x754a37bb()).booleanValue());
        intent.putExtra("selected_labels", this.f235639x);
        intent.putExtra("selected_source", this.f235640y);
        c16924x6da766a4.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.m0(this, intent));
        return c16924x6da766a4;
    }

    @Override // kr3.t
    public void d7() {
        java.util.List W6 = ((j93.n) ((jz5.n) this.f235635t).mo141623x754a37bb()).W6(this.f235633r);
        this.f235633r = W6;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1968xd1075a44.C16924x6da766a4 c16924x6da766a4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1968xd1075a44.C16924x6da766a4) this.f393013h;
        if (c16924x6da766a4 != null) {
            c16924x6da766a4.m67737xe9f5bdb7(kz5.n0.g0(W6, m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572457ba0), null, null, 0, null, null, 62, null));
        }
        super.d7();
    }

    @Override // kr3.t
    public void f7(com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6829x19be670f struct) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(struct, "struct");
        long j17 = 0;
        struct.f141499e = this.f235636u ? 1L : 0L;
        struct.f141504j = this.f235634s.size();
        struct.f141508n = ((java.util.ArrayList) ((b93.b) c93.a.a()).c()).size();
        int size = this.f235634s.size();
        java.util.Iterator it = this.f235640y.iterator();
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
        struct.f141506l = j17 + j18 + this.f235641z;
        struct.f141505k = size;
        struct.f141502h = j17;
        struct.f141503i = j18;
        struct.f141501g = this.f235637v;
        struct.f141500f = this.f235638w;
    }

    @Override // kr3.t
    public int i7() {
        return 39;
    }

    @Override // kr3.t
    public int k7() {
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
            this.f235639x = stringArrayListExtra2;
        }
        java.util.ArrayList<java.lang.Integer> integerArrayListExtra = intent.getIntegerArrayListExtra("selected_source");
        if (integerArrayListExtra != null) {
            this.f235640y = integerArrayListExtra;
        }
        this.f235637v += intent.getIntExtra("search_add_new_label_cnt", 0);
        this.f235638w += intent.getIntExtra("button_add_new_label_cnt", 0);
        d7();
    }
}
