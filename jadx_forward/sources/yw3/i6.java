package yw3;

/* loaded from: classes3.dex */
public final class i6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f548304d;

    public i6(android.widget.EditText editText) {
        this.f548304d = editText;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/RepairerSetTextStatusDemoUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.text.Editable text = this.f548304d.getText();
        if (text == null || (str = text.toString()) == null) {
            str = "";
        }
        yw3.h6 h6Var = yw3.h6.f548296a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UrlImageCacheService", "trydownload imgback start:".concat(str));
        ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).Ui(str, h6Var);
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerSetTextStatusDemoUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
