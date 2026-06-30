package al5;

/* loaded from: classes4.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.CheckBoxTextLayout f5941d;

    public l(com.tencent.mm.ui.widget.CheckBoxTextLayout checkBoxTextLayout) {
        this.f5941d = checkBoxTextLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        android.widget.CheckBox checkBox;
        com.tencent.mm.ui.widget.CheckBoxTextLayout checkBoxTextLayout = this.f5941d;
        e06.k m17 = e06.p.m(0, checkBoxTextLayout.getChildCount());
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m17, 10));
        java.util.Iterator it = m17.iterator();
        while (((e06.j) it).hasNext()) {
            arrayList.add(checkBoxTextLayout.getChildAt(((kz5.x0) it).b()));
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (true) {
            if (!it6.hasNext()) {
                checkBox = 0;
                break;
            } else {
                checkBox = it6.next();
                if (((android.view.View) checkBox) instanceof android.widget.CheckBox) {
                    break;
                }
            }
        }
        android.widget.CheckBox checkBox2 = checkBox instanceof android.widget.CheckBox ? checkBox : null;
        if (checkBox2 != null) {
            checkBoxTextLayout.setOnClickListener(new al5.k(checkBox2));
        }
    }
}
