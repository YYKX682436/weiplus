package com.p314xaae8f345.mm.p1006xc5476f33.p1335x38a0fd3f.uic;

/* renamed from: com.tencent.mm.plugin.combine.uic.CombineFooterBarUIC */
/* loaded from: classes16.dex */
public final class C13151x881fe376 extends u.n {
    public final jz5.g B6;
    public final jz5.g C6;
    public final jz5.g D6;
    public final jz5.g E6;
    public final jz5.g F6;
    public java.util.ArrayList G6;
    public java.util.ArrayList H6;
    public java.util.ArrayList I6;
    public int J6;
    public boolean K6;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1335x38a0fd3f.uic.C13152x518f4474 L6;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1335x38a0fd3f.uic.C13153x54d325c8 M6;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.tencent.mm.plugin.combine.uic.CombineFooterBarUIC$contactListChangeByInsideListener$1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.tencent.mm.plugin.combine.uic.CombineFooterBarUIC$labelListChangeByInsideListener$1] */
    public C13151x881fe376(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.B6 = jz5.h.b(new u.c(this));
        jz5.h.b(new u.a(this));
        this.C6 = jz5.h.b(new u.g(this));
        this.D6 = jz5.h.b(new u.i(this));
        this.E6 = jz5.h.b(new u.h(this));
        this.F6 = jz5.h.b(new u.b(this));
        this.G6 = new java.util.ArrayList();
        this.H6 = new java.util.ArrayList();
        this.I6 = new java.util.ArrayList();
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.L6 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5984x6d192cd2>(a0Var) { // from class: com.tencent.mm.plugin.combine.uic.CombineFooterBarUIC$contactListChangeByInsideListener$1
            {
                this.f39173x3fe91575 = -865632062;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5984x6d192cd2 c5984x6d192cd2) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5984x6d192cd2 event = c5984x6d192cd2;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                java.util.ArrayList arrayList = event.f136279m.f359303a;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("contactListChangeByInsideListener: ");
                sb6.append(arrayList != null ? java.lang.Integer.valueOf(arrayList.size()) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CombineFooterBarUIC", sb6.toString());
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(arrayList);
                com.p314xaae8f345.mm.p1006xc5476f33.p1335x38a0fd3f.uic.C13151x881fe376 c13151x881fe376 = com.p314xaae8f345.mm.p1006xc5476f33.p1335x38a0fd3f.uic.C13151x881fe376.this;
                c13151x881fe376.H6 = arrayList;
                c13151x881fe376.c();
                return true;
            }
        };
        this.M6 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5986x18099e21>(a0Var) { // from class: com.tencent.mm.plugin.combine.uic.CombineFooterBarUIC$labelListChangeByInsideListener$1
            {
                this.f39173x3fe91575 = 2002252305;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5986x18099e21 c5986x18099e21) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5986x18099e21 event = c5986x18099e21;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                java.util.ArrayList arrayList = event.f136281m.f359305a;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("labelListChangeByInsideListener: ");
                sb6.append(arrayList != null ? java.lang.Integer.valueOf(arrayList.size()) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CombineFooterBarUIC", sb6.toString());
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(arrayList);
                com.p314xaae8f345.mm.p1006xc5476f33.p1335x38a0fd3f.uic.C13151x881fe376 c13151x881fe376 = com.p314xaae8f345.mm.p1006xc5476f33.p1335x38a0fd3f.uic.C13151x881fe376.this;
                c13151x881fe376.G6 = arrayList;
                c13151x881fe376.c();
                return true;
            }
        };
    }

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1335x38a0fd3f.uic.C13151x881fe376 c13151x881fe376) {
        c13151x881fe376.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putStringArrayListExtra("visibility_result_select_label_list", c13151x881fe376.G6);
        intent.putStringArrayListExtra("visibility_result_select_contact_list", c13151x881fe376.H6);
        intent.putStringArrayListExtra("visibility_result_exclude_select_list", c13151x881fe376.I6);
        c13151x881fe376.m158354x19263085().setResult(-1, intent);
        c13151x881fe376.m158354x19263085().finish();
    }

    public final android.widget.LinearLayout b() {
        return (android.widget.LinearLayout) ((jz5.n) this.B6).mo141623x754a37bb();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x01ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1335x38a0fd3f.uic.C13151x881fe376.c():void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        mo48813x58998cd();
        mo48813x58998cd();
        this.J6 = m158359x1e885992().getIntExtra("visibility_scene_type", 1);
        java.util.ArrayList<java.lang.String> stringArrayListExtra = m158359x1e885992().getStringArrayListExtra("visibility_init_select_label_list");
        if (stringArrayListExtra != null) {
            this.G6 = new java.util.ArrayList(stringArrayListExtra);
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra2 = m158359x1e885992().getStringArrayListExtra("visibility_init_select_contact_list");
        if (stringArrayListExtra2 != null) {
            this.H6 = new java.util.ArrayList(stringArrayListExtra2);
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra3 = m158359x1e885992().getStringArrayListExtra("visibility_init_exclude_select_list");
        if (stringArrayListExtra3 != null) {
            this.I6 = new java.util.ArrayList(stringArrayListExtra3);
        }
        if ((!this.H6.isEmpty()) || (!this.G6.isEmpty())) {
            this.K6 = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CombineFooterBarUIC", "initData: initLabel=" + this.G6.size() + ", initContact=" + this.H6.size() + ", initExclude=" + this.I6.size());
        b().setOnClickListener(new u.e(this));
        ((android.widget.Button) ((jz5.n) this.F6).mo141623x754a37bb()).setOnClickListener(new u.f(this));
        c();
        b().setPadding(b().getPaddingLeft(), b().getPaddingTop(), b().getPaddingRight(), com.p314xaae8f345.mm.ui.bl.c(m80379x76847179()));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        mo48814x2efc64();
        mo48814x2efc64();
    }
}
