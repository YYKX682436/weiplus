package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e;

/* loaded from: classes15.dex */
public class w0 implements android.widget.CalendarView.OnDateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.x0 f293872a;

    public w0(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.x0 x0Var) {
        this.f293872a = x0Var;
    }

    @Override // android.widget.CalendarView.OnDateChangeListener
    public void onSelectedDayChange(android.widget.CalendarView calendarView, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.x0 x0Var = this.f293872a;
        x0Var.d(i17, i18, i19);
        x0Var.i();
        x0Var.f293865a.sendAccessibilityEvent(4);
    }
}
