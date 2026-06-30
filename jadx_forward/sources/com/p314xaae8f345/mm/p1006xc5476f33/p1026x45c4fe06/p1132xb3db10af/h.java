package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af;

/* loaded from: classes7.dex */
public class h implements android.app.DatePickerDialog.OnDateSetListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.ActivityC12308x8b10b259 f165687a;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.ActivityC12308x8b10b259 activityC12308x8b10b259) {
        this.f165687a = activityC12308x8b10b259;
    }

    @Override // android.app.DatePickerDialog.OnDateSetListener
    public void onDateSet(android.widget.DatePicker datePicker, int i17, int i18, int i19) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.ActivityC12308x8b10b259 activityC12308x8b10b259 = this.f165687a;
        activityC12308x8b10b259.f165635m = i17;
        activityC12308x8b10b259.f165636n = i18;
        activityC12308x8b10b259.f165637o = i19;
        calendar.set(i17, i18, i19);
        activityC12308x8b10b259.K6(calendar.getTimeInMillis());
    }
}
