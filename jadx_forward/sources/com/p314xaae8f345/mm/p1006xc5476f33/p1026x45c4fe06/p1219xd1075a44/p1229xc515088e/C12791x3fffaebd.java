package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.picker.AppBrandTimePickerV2 */
/* loaded from: classes15.dex */
public class C12791x3fffaebd implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f {

    /* renamed from: context */
    private android.content.Context f35328x38b735af;

    /* renamed from: currentHour */
    private int f35329x23d0c2fd;

    /* renamed from: currentMinute */
    private int f35330x7adc90ed;

    /* renamed from: mView */
    private android.view.View f35335x628b0b2;

    /* renamed from: pvTime */
    private w51.g f35336xc5c561f3;

    /* renamed from: mMinTimeHour */
    private int f35333x7ef73816 = -1;

    /* renamed from: mMinTimeMinute */
    private int f35334xa63a23c6 = -1;

    /* renamed from: mMaxTimeHour */
    private int f35331xa7580528 = -1;

    /* renamed from: mMaxTimeMinute */
    private int f35332x399bf458 = -1;

    public C12791x3fffaebd(android.content.Context context) {
        this.f35336xc5c561f3 = new w51.g(context);
        this.f35328x38b735af = context;
    }

    /* renamed from: configPadding */
    private void m53567xb10d826f(java.util.List<com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480> list) {
        if (list.size() == 1) {
            list.get(0).setPadding(0, this.f35328x38b735af.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), 0, this.f35328x38b735af.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
            return;
        }
        if (list.size() == 2) {
            list.get(0).setPadding(0, this.f35328x38b735af.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), this.f35328x38b735af.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), this.f35328x38b735af.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
            list.get(1).setPadding(this.f35328x38b735af.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), this.f35328x38b735af.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), 0, this.f35328x38b735af.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
        } else if (list.size() == 3) {
            list.get(0).setPadding(0, this.f35328x38b735af.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), this.f35328x38b735af.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl), this.f35328x38b735af.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
            list.get(1).setPadding(this.f35328x38b735af.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl), this.f35328x38b735af.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), this.f35328x38b735af.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl), this.f35328x38b735af.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
            list.get(2).setPadding(this.f35328x38b735af.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl), this.f35328x38b735af.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), 0, this.f35328x38b735af.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getTimeString */
    public void m53568x1d894934(java.util.Date date) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(date);
        this.f35329x23d0c2fd = calendar.get(11);
        this.f35330x7adc90ed = calendar.get(12);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f
    /* renamed from: getView */
    public android.view.View mo51207xfb86a31b() {
        if (this.f35335x628b0b2 == null) {
            this.f35335x628b0b2 = this.f35336xc5c561f3.d();
        }
        return this.f35335x628b0b2;
    }

    /* renamed from: init */
    public void m53569x316510(int i17, int i18) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(11, i17);
        calendar.set(12, i18);
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.set(11, this.f35333x7ef73816);
        calendar2.set(12, this.f35334xa63a23c6);
        java.util.Calendar calendar3 = java.util.Calendar.getInstance();
        calendar3.set(11, this.f35331xa7580528);
        calendar3.set(12, this.f35332x399bf458);
        t51.b bVar = new t51.b(this.f35328x38b735af, new tl1.y(this));
        u51.a aVar = bVar.f497241a;
        aVar.f506319g = new boolean[]{false, false, false, true, true, false};
        aVar.f506320h = calendar;
        bVar.b(calendar2, calendar3);
        aVar.f506318f = false;
        aVar.f506324l = b3.l.m9702x7444d5ad(this.f35328x38b735af, com.p314xaae8f345.mm.R.C30859x5a72f63.f77630xad7ef28);
        bVar.a(this.f35336xc5c561f3);
        this.f35336xc5c561f3.g(this.f35328x38b735af.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561670pc));
        w51.g gVar = this.f35336xc5c561f3;
        this.f35328x38b735af.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a7c);
        gVar.f524508p.getClass();
        this.f35336xc5c561f3.h(0, this.f35328x38b735af.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), 0, this.f35328x38b735af.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
        java.util.Iterator it = ((java.util.ArrayList) this.f35336xc5c561f3.e()).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480 c11323x28056480 = (com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480) it.next();
            c11323x28056480.e(b3.l.m9702x7444d5ad(this.f35328x38b735af, com.p314xaae8f345.mm.R.C30859x5a72f63.f77654xad7ef30));
            c11323x28056480.f153912d = this.f35328x38b735af.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
            c11323x28056480.invalidate();
            c11323x28056480.setBackgroundColor(b3.l.m9702x7444d5ad(this.f35328x38b735af, com.p314xaae8f345.mm.R.C30859x5a72f63.f560027f));
        }
        m53567xb10d826f(this.f35336xc5c561f3.e());
    }

    /* renamed from: isNewPicker */
    public boolean m53570x1cfb2844() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f
    /* renamed from: onAttach */
    public void mo51208x3b13c504(tl1.v vVar) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f
    /* renamed from: onDetach */
    public void mo51209x3f5eee52(tl1.v vVar) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f
    /* renamed from: onHide */
    public void mo51210xc39a57c1(tl1.v vVar) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f
    /* renamed from: onShow */
    public void mo51211xc39f557c(tl1.v vVar) {
    }

    /* renamed from: setMaxTime */
    public void m53571xe38ea38f(int i17, int i18) {
        this.f35331xa7580528 = i17;
        this.f35332x399bf458 = i18;
    }

    /* renamed from: setMinTime */
    public void m53572xf0a87d7d(int i17, int i18) {
        this.f35333x7ef73816 = i17;
        this.f35334xa63a23c6 = i18;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f
    /* renamed from: stopSmoothScrollingAndCalibrateSelectedData */
    public /* bridge */ /* synthetic */ void mo51212x4b31185a() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f
    /* renamed from: currentValue */
    public java.lang.String mo51206x57066778() {
        this.f35336xc5c561f3.f();
        return java.lang.String.format(java.util.Locale.US, "%02d:%02d", java.lang.Integer.valueOf(this.f35329x23d0c2fd), java.lang.Integer.valueOf(this.f35330x7adc90ed));
    }
}
