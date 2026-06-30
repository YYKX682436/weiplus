package com.tencent.mm.plugin.combine.uic;

/* loaded from: classes16.dex */
public final class CombineFooterBarUIC extends u.n {
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
    public final com.tencent.mm.plugin.combine.uic.CombineFooterBarUIC$contactListChangeByInsideListener$1 L6;
    public final com.tencent.mm.plugin.combine.uic.CombineFooterBarUIC$labelListChangeByInsideListener$1 M6;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.tencent.mm.plugin.combine.uic.CombineFooterBarUIC$contactListChangeByInsideListener$1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.tencent.mm.plugin.combine.uic.CombineFooterBarUIC$labelListChangeByInsideListener$1] */
    public CombineFooterBarUIC(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.B6 = jz5.h.b(new u.c(this));
        jz5.h.b(new u.a(this));
        this.C6 = jz5.h.b(new u.g(this));
        this.D6 = jz5.h.b(new u.i(this));
        this.E6 = jz5.h.b(new u.h(this));
        this.F6 = jz5.h.b(new u.b(this));
        this.G6 = new java.util.ArrayList();
        this.H6 = new java.util.ArrayList();
        this.I6 = new java.util.ArrayList();
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.L6 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SelectContactListToOutsideEvent>(a0Var) { // from class: com.tencent.mm.plugin.combine.uic.CombineFooterBarUIC$contactListChangeByInsideListener$1
            {
                this.__eventId = -865632062;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SelectContactListToOutsideEvent selectContactListToOutsideEvent) {
                com.tencent.mm.autogen.events.SelectContactListToOutsideEvent event = selectContactListToOutsideEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.util.ArrayList arrayList = event.f54746m.f277770a;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("contactListChangeByInsideListener: ");
                sb6.append(arrayList != null ? java.lang.Integer.valueOf(arrayList.size()) : null);
                com.tencent.mars.xlog.Log.i("MicroMsg.CombineFooterBarUIC", sb6.toString());
                kotlin.jvm.internal.o.d(arrayList);
                com.tencent.mm.plugin.combine.uic.CombineFooterBarUIC combineFooterBarUIC = com.tencent.mm.plugin.combine.uic.CombineFooterBarUIC.this;
                combineFooterBarUIC.H6 = arrayList;
                combineFooterBarUIC.c();
                return true;
            }
        };
        this.M6 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SelectLabelIdListToOutsideEvent>(a0Var) { // from class: com.tencent.mm.plugin.combine.uic.CombineFooterBarUIC$labelListChangeByInsideListener$1
            {
                this.__eventId = 2002252305;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SelectLabelIdListToOutsideEvent selectLabelIdListToOutsideEvent) {
                com.tencent.mm.autogen.events.SelectLabelIdListToOutsideEvent event = selectLabelIdListToOutsideEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.util.ArrayList arrayList = event.f54748m.f277772a;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("labelListChangeByInsideListener: ");
                sb6.append(arrayList != null ? java.lang.Integer.valueOf(arrayList.size()) : null);
                com.tencent.mars.xlog.Log.i("MicroMsg.CombineFooterBarUIC", sb6.toString());
                kotlin.jvm.internal.o.d(arrayList);
                com.tencent.mm.plugin.combine.uic.CombineFooterBarUIC combineFooterBarUIC = com.tencent.mm.plugin.combine.uic.CombineFooterBarUIC.this;
                combineFooterBarUIC.G6 = arrayList;
                combineFooterBarUIC.c();
                return true;
            }
        };
    }

    public static final void a(com.tencent.mm.plugin.combine.uic.CombineFooterBarUIC combineFooterBarUIC) {
        combineFooterBarUIC.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putStringArrayListExtra("visibility_result_select_label_list", combineFooterBarUIC.G6);
        intent.putStringArrayListExtra("visibility_result_select_contact_list", combineFooterBarUIC.H6);
        intent.putStringArrayListExtra("visibility_result_exclude_select_list", combineFooterBarUIC.I6);
        combineFooterBarUIC.getActivity().setResult(-1, intent);
        combineFooterBarUIC.getActivity().finish();
    }

    public final android.widget.LinearLayout b() {
        return (android.widget.LinearLayout) ((jz5.n) this.B6).getValue();
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.combine.uic.CombineFooterBarUIC.c():void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        alive();
        alive();
        this.J6 = getIntent().getIntExtra("visibility_scene_type", 1);
        java.util.ArrayList<java.lang.String> stringArrayListExtra = getIntent().getStringArrayListExtra("visibility_init_select_label_list");
        if (stringArrayListExtra != null) {
            this.G6 = new java.util.ArrayList(stringArrayListExtra);
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra2 = getIntent().getStringArrayListExtra("visibility_init_select_contact_list");
        if (stringArrayListExtra2 != null) {
            this.H6 = new java.util.ArrayList(stringArrayListExtra2);
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra3 = getIntent().getStringArrayListExtra("visibility_init_exclude_select_list");
        if (stringArrayListExtra3 != null) {
            this.I6 = new java.util.ArrayList(stringArrayListExtra3);
        }
        if ((!this.H6.isEmpty()) || (!this.G6.isEmpty())) {
            this.K6 = true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CombineFooterBarUIC", "initData: initLabel=" + this.G6.size() + ", initContact=" + this.H6.size() + ", initExclude=" + this.I6.size());
        b().setOnClickListener(new u.e(this));
        ((android.widget.Button) ((jz5.n) this.F6).getValue()).setOnClickListener(new u.f(this));
        c();
        b().setPadding(b().getPaddingLeft(), b().getPaddingTop(), b().getPaddingRight(), com.tencent.mm.ui.bl.c(getContext()));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        dead();
        dead();
    }
}
