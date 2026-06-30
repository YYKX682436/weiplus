package ku1;

/* loaded from: classes15.dex */
public class h0 extends ku1.m {

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f393623b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f393624c;

    /* renamed from: d, reason: collision with root package name */
    public tt1.j f393625d;

    @Override // ku1.m
    public void c() {
        this.f393624c = ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) this.f393665a).f176469e;
    }

    @Override // ku1.m
    public void d(int i17) {
        android.view.View view = this.f393623b;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardStatusView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/card/ui/view/CardStatusView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // ku1.m
    public void e() {
        this.f393625d = ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) this.f393665a).E;
        if (this.f393623b == null) {
            this.f393623b = ((android.view.ViewStub) b(com.p314xaae8f345.mm.R.id.f565121bc5)).inflate();
        }
        if (this.f393625d.X()) {
            android.view.View view = this.f393623b;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f393624c;
            view.setBackgroundDrawable(lu1.a0.m(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560315h2)));
        }
        android.widget.TextView textView = (android.widget.TextView) this.f393623b.findViewById(com.p314xaae8f345.mm.R.id.bc6);
        if (this.f393625d.i0() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardStatusView", "updateState() mCardInfo.getDataInfo() == null");
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setTextColor(this.f393624c.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560744sz));
        if (android.text.TextUtils.isEmpty(this.f393625d.s0().T)) {
            lu1.g0.e(textView, this.f393625d.i0().f466714d);
        } else {
            textView.setText(this.f393625d.s0().T);
        }
    }
}
