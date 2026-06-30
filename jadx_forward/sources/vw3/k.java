package vw3;

/* loaded from: classes.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f522539d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.CDNGroupKeyConfigUI f522540e;

    public k(android.widget.EditText editText, com.tencent.mm.plugin.repairer.ui.CDNGroupKeyConfigUI cDNGroupKeyConfigUI) {
        this.f522539d = editText;
        this.f522540e = cDNGroupKeyConfigUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/CDNGroupKeyConfigUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.text.Editable text = this.f522539d.getText();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(text, "getText(...)");
        com.p314xaae8f345.mm.p1004x2137b148.C11327xbf69711b.f33352xb32777b2 = r26.n0.u0(text).toString();
        com.tencent.mm.plugin.repairer.ui.CDNGroupKeyConfigUI cDNGroupKeyConfigUI = this.f522540e;
        cDNGroupKeyConfigUI.d.edit().putString("cdnSingleSignGroupKey", com.p314xaae8f345.mm.p1004x2137b148.C11327xbf69711b.f33352xb32777b2).apply();
        dp.a.m125853x26a183b((android.content.Context) cDNGroupKeyConfigUI, com.p314xaae8f345.mm.R.C30867xcad56011.f572013w9, 0).show();
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/CDNGroupKeyConfigUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
