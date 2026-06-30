package com.tencent.mm.plugin.appbrand.keylogger;

/* loaded from: classes7.dex */
public class h implements android.app.DatePickerDialog.OnDateSetListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.keylogger.KeyStepAnalyserActivity f84154a;

    public h(com.tencent.mm.plugin.appbrand.keylogger.KeyStepAnalyserActivity keyStepAnalyserActivity) {
        this.f84154a = keyStepAnalyserActivity;
    }

    @Override // android.app.DatePickerDialog.OnDateSetListener
    public void onDateSet(android.widget.DatePicker datePicker, int i17, int i18, int i19) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        com.tencent.mm.plugin.appbrand.keylogger.KeyStepAnalyserActivity keyStepAnalyserActivity = this.f84154a;
        keyStepAnalyserActivity.f84102m = i17;
        keyStepAnalyserActivity.f84103n = i18;
        keyStepAnalyserActivity.f84104o = i19;
        calendar.set(i17, i18, i19);
        keyStepAnalyserActivity.K6(calendar.getTimeInMillis());
    }
}
