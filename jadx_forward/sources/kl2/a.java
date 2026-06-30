package kl2;

/* loaded from: classes3.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl2.g f390282d;

    public a(kl2.g gVar) {
        this.f390282d = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/quota/widget/FinderLiveCloseRestrictConsumePanel$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kl2.g gVar = this.f390282d;
        android.widget.CheckBox checkBox = gVar.f390309q;
        if (checkBox == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("lisenceCheck");
            throw null;
        }
        if (checkBox == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("lisenceCheck");
            throw null;
        }
        checkBox.setChecked(!checkBox.isChecked());
        android.widget.TextView textView = gVar.f390308p;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rightBtn");
            throw null;
        }
        android.widget.CheckBox checkBox2 = gVar.f390309q;
        if (checkBox2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("lisenceCheck");
            throw null;
        }
        textView.setEnabled(checkBox2.isChecked());
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/quota/widget/FinderLiveCloseRestrictConsumePanel$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
