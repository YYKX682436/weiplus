package al5;

/* loaded from: classes9.dex */
public class j1 extends android.app.DatePickerDialog {

    /* renamed from: d, reason: collision with root package name */
    public boolean f5933d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5934e;

    public j1(android.content.Context context, int i17, android.app.DatePickerDialog.OnDateSetListener onDateSetListener, int i18, int i19, int i27, long j17) {
        super(context, i17, onDateSetListener, i18, i19, i27);
        this.f5933d = true;
        this.f5934e = 1;
    }

    public final void b(int i17, int i18, int i19) {
        if (this.f5934e > 1) {
            setTitle(getContext().getString(com.tencent.mm.R.string.fe6, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18 + 1)));
        }
    }

    @Override // android.app.DatePickerDialog, android.widget.DatePicker.OnDateChangedListener
    public void onDateChanged(android.widget.DatePicker datePicker, int i17, int i18, int i19) {
        super.onDateChanged(datePicker, i17, i18, i19);
        b(i17, i18, i19);
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        if (this.f5933d) {
            android.widget.NumberPicker a17 = new al5.i1(this).a((android.view.ViewGroup) getWindow().getDecorView());
            if (a17 != null && this.f5934e > 1) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(a17, arrayList.toArray(), "com/tencent/mm/ui/widget/MMDatePickerDialog", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                a17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(a17, "com/tencent/mm/ui/widget/MMDatePickerDialog", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            b(getDatePicker().getYear(), getDatePicker().getMonth(), getDatePicker().getDayOfMonth());
        }
        this.f5933d = false;
    }
}
