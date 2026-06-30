package com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui;

/* renamed from: com.tencent.mm.plugin.collect.ui.DatePickerDialogView */
/* loaded from: classes9.dex */
public class ViewOnClickListenerC13147x36fa1f29 extends android.widget.LinearLayout implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.C13146xb837d0d0 f177953d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.C13146xb837d0d0 f177954e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.C13146xb837d0d0 f177955f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22630x1f521715 f177956g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f177957h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f177958i;

    /* renamed from: m, reason: collision with root package name */
    public int f177959m;

    public ViewOnClickListenerC13147x36fa1f29(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f177959m = 0;
        a(context);
    }

    public final void a(android.content.Context context) {
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570162yz, this);
        this.f177953d = (com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.C13146xb837d0d0) inflate.findViewById(com.p314xaae8f345.mm.R.id.ptb);
        this.f177954e = (com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.C13146xb837d0d0) inflate.findViewById(com.p314xaae8f345.mm.R.id.jqe);
        this.f177955f = (com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.C13146xb837d0d0) inflate.findViewById(com.p314xaae8f345.mm.R.id.cqv);
        this.f177957h = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.c9z);
        this.f177958i = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.b5i);
        this.f177953d.setOnClickListener(this);
        this.f177954e.setOnClickListener(this);
        this.f177955f.setOnClickListener(this);
        this.f177953d.m54565xdc742163("年");
        this.f177954e.m54565xdc742163("月");
        this.f177955f.m54565xdc742163("日");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22630x1f521715 c22630x1f521715 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22630x1f521715) inflate.findViewById(com.p314xaae8f345.mm.R.id.cqt);
        this.f177956g = c22630x1f521715;
        c22630x1f521715.getClass();
        try {
            java.lang.reflect.Field declaredField = android.widget.NumberPicker.class.getDeclaredField("mSelectionDivider");
            declaredField.setAccessible(true);
            android.graphics.drawable.ColorDrawable colorDrawable = new android.graphics.drawable.ColorDrawable();
            colorDrawable.setColor(c22630x1f521715.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
            declaredField.set(c22630x1f521715.f292874d, colorDrawable);
            declaredField.set(c22630x1f521715.f292875e, colorDrawable);
            declaredField.set(c22630x1f521715.f292876f, colorDrawable);
            c22630x1f521715.invalidate();
        } catch (java.lang.IllegalAccessException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMSpinnerDatePicker", e17, "", new java.lang.Object[0]);
        } catch (java.lang.NoSuchFieldException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMSpinnerDatePicker", e18, "", new java.lang.Object[0]);
        }
        this.f177956g.m81391x3abfd950(com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia);
    }

    public final void b() {
        int i17 = this.f177959m;
        if (i17 == 2) {
            this.f177953d.m54564x74b50a6b(com.p314xaae8f345.mm.R.raw.f80939xfe2298a3);
            this.f177954e.m54564x74b50a6b(com.p314xaae8f345.mm.R.raw.f80936xc6307b2b);
            this.f177955f.m54564x74b50a6b(com.p314xaae8f345.mm.R.raw.f80936xc6307b2b);
        } else if (i17 == 1) {
            this.f177953d.m54564x74b50a6b(com.p314xaae8f345.mm.R.raw.f80936xc6307b2b);
            this.f177954e.m54564x74b50a6b(com.p314xaae8f345.mm.R.raw.f80939xfe2298a3);
            this.f177955f.m54564x74b50a6b(com.p314xaae8f345.mm.R.raw.f80936xc6307b2b);
        } else {
            this.f177953d.m54564x74b50a6b(com.p314xaae8f345.mm.R.raw.f80936xc6307b2b);
            this.f177954e.m54564x74b50a6b(com.p314xaae8f345.mm.R.raw.f80936xc6307b2b);
            this.f177955f.m54564x74b50a6b(com.p314xaae8f345.mm.R.raw.f80939xfe2298a3);
        }
        this.f177956g.m81390xc7abc553(this.f177959m);
    }

    /* renamed from: getDatePickerMode */
    public int m54566xe5b21695() {
        return this.f177956g.m81388x99877747();
    }

    /* renamed from: getDayOfMonth */
    public int m54567xa7d8f7a3() {
        return this.f177956g.getDayOfMonth();
    }

    /* renamed from: getMonth */
    public int m54568x74d1c8ca() {
        return this.f177956g.getMonth();
    }

    /* renamed from: getYear */
    public int m54569xfb87f0b3() {
        return this.f177956g.getYear();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/collect/ui/DatePickerDialogView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int id6 = view.getId();
        if (id6 == com.p314xaae8f345.mm.R.id.ptb) {
            this.f177959m = 2;
        } else if (id6 == com.p314xaae8f345.mm.R.id.jqe) {
            this.f177959m = 1;
        } else if (id6 == com.p314xaae8f345.mm.R.id.cqv) {
            this.f177959m = 0;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DatePickerDialogView", "unhandled click view: %s", view.getClass().toString());
        }
        b();
        yj0.a.h(this, "com/tencent/mm/plugin/collect/ui/DatePickerDialogView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    /* renamed from: setDatePickerMode */
    public void m54570xada87ea1(int i17) {
        this.f177959m = i17;
        b();
    }

    /* renamed from: setOnCancelBtnClickListener */
    public void m54571x14e6df3b(android.view.View.OnClickListener onClickListener) {
        this.f177958i.setOnClickListener(onClickListener);
    }

    /* renamed from: setOnOkBtnClickListener */
    public void m54572xc4fb831d(android.view.View.OnClickListener onClickListener) {
        this.f177957h.setOnClickListener(onClickListener);
    }

    public ViewOnClickListenerC13147x36fa1f29(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f177959m = 0;
        a(context);
    }
}
