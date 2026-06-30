package cw1;

/* loaded from: classes5.dex */
public final class c6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView[] f304385d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.C13121x39a05fa9 f304386e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long[] f304387f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f304388g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f304389h;

    public c6(android.widget.TextView[] textViewArr, com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.C13121x39a05fa9 c13121x39a05fa9, long[] jArr, android.widget.Button button, android.widget.TextView textView) {
        this.f304385d = textViewArr;
        this.f304386e = c13121x39a05fa9;
        this.f304387f = jArr;
        this.f304388g = button;
        this.f304389h = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View v17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanFilterDialog$showTimePickerDialog$popupDatePicker$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        int i17 = v17 == this.f304385d[0] ? 0 : 1;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.o oVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.o(this.f304386e.getContext());
        long[] jArr = this.f304387f;
        oVar.f293840n = new cw1.b6(calendar, jArr, i17, this.f304385d, this.f304386e, this.f304388g, this.f304389h);
        calendar.setTimeInMillis(jArr[i17]);
        oVar.d(calendar.get(1), calendar.get(2) + 1, calendar.get(5));
        calendar.setTimeInMillis(java.lang.System.currentTimeMillis());
        oVar.e(calendar.get(1), calendar.get(2) + 1, calendar.get(5));
        oVar.f(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46349x3142bb26, 1, 21);
        oVar.h();
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanFilterDialog$showTimePickerDialog$popupDatePicker$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
