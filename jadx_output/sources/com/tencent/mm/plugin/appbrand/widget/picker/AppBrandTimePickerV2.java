package com.tencent.mm.plugin.appbrand.widget.picker;

/* loaded from: classes15.dex */
public class AppBrandTimePickerV2 implements com.tencent.mm.plugin.appbrand.jsapi.picker.f {
    private android.content.Context context;
    private int currentHour;
    private int currentMinute;
    private android.view.View mView;
    private w51.g pvTime;
    private int mMinTimeHour = -1;
    private int mMinTimeMinute = -1;
    private int mMaxTimeHour = -1;
    private int mMaxTimeMinute = -1;

    public AppBrandTimePickerV2(android.content.Context context) {
        this.pvTime = new w51.g(context);
        this.context = context;
    }

    private void configPadding(java.util.List<com.tencent.mm.picker.base.view.WheelView> list) {
        if (list.size() == 1) {
            list.get(0).setPadding(0, this.context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn), 0, this.context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn));
            return;
        }
        if (list.size() == 2) {
            list.get(0).setPadding(0, this.context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn), this.context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn), this.context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn));
            list.get(1).setPadding(this.context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn), this.context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn), 0, this.context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn));
        } else if (list.size() == 3) {
            list.get(0).setPadding(0, this.context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn), this.context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479646bl), this.context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn));
            list.get(1).setPadding(this.context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479646bl), this.context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn), this.context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479646bl), this.context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn));
            list.get(2).setPadding(this.context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479646bl), this.context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn), 0, this.context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getTimeString(java.util.Date date) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(date);
        this.currentHour = calendar.get(11);
        this.currentMinute = calendar.get(12);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.f
    public android.view.View getView() {
        if (this.mView == null) {
            this.mView = this.pvTime.d();
        }
        return this.mView;
    }

    public void init(int i17, int i18) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(11, i17);
        calendar.set(12, i18);
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.set(11, this.mMinTimeHour);
        calendar2.set(12, this.mMinTimeMinute);
        java.util.Calendar calendar3 = java.util.Calendar.getInstance();
        calendar3.set(11, this.mMaxTimeHour);
        calendar3.set(12, this.mMaxTimeMinute);
        t51.b bVar = new t51.b(this.context, new tl1.y(this));
        u51.a aVar = bVar.f415708a;
        aVar.f424786g = new boolean[]{false, false, false, true, true, false};
        aVar.f424787h = calendar;
        bVar.b(calendar2, calendar3);
        aVar.f424785f = false;
        aVar.f424791l = b3.l.getColor(this.context, com.tencent.mm.R.color.BW_0_Alpha_0_1);
        bVar.a(this.pvTime);
        this.pvTime.g(this.context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480137pc));
        w51.g gVar = this.pvTime;
        this.context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a7c);
        gVar.f442975p.getClass();
        this.pvTime.h(0, this.context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn), 0, this.context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn));
        java.util.Iterator it = ((java.util.ArrayList) this.pvTime.e()).iterator();
        while (it.hasNext()) {
            com.tencent.mm.picker.base.view.WheelView wheelView = (com.tencent.mm.picker.base.view.WheelView) it.next();
            wheelView.e(b3.l.getColor(this.context, com.tencent.mm.R.color.BW_0_Alpha_0_9));
            wheelView.f72379d = this.context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
            wheelView.invalidate();
            wheelView.setBackgroundColor(b3.l.getColor(this.context, com.tencent.mm.R.color.f478494f));
        }
        configPadding(this.pvTime.e());
    }

    public boolean isNewPicker() {
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.f
    public void onAttach(tl1.v vVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.f
    public void onDetach(tl1.v vVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.f
    public void onHide(tl1.v vVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.f
    public void onShow(tl1.v vVar) {
    }

    public void setMaxTime(int i17, int i18) {
        this.mMaxTimeHour = i17;
        this.mMaxTimeMinute = i18;
    }

    public void setMinTime(int i17, int i18) {
        this.mMinTimeHour = i17;
        this.mMinTimeMinute = i18;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.f
    public /* bridge */ /* synthetic */ void stopSmoothScrollingAndCalibrateSelectedData() {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.f
    public java.lang.String currentValue() {
        this.pvTime.f();
        return java.lang.String.format(java.util.Locale.US, "%02d:%02d", java.lang.Integer.valueOf(this.currentHour), java.lang.Integer.valueOf(this.currentMinute));
    }
}
