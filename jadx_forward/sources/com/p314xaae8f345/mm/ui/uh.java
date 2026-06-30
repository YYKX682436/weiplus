package com.p314xaae8f345.mm.ui;

/* loaded from: classes9.dex */
public class uh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f292624d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.xh f292625e;

    public uh(com.p314xaae8f345.mm.ui.xh xhVar, int i17) {
        this.f292625e = xhVar;
        this.f292624d = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/ServiceNotifySettingsUI$DefaultAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String str = (java.lang.String) view.getTag();
        if (android.text.TextUtils.isEmpty(str)) {
            yj0.a.h(this, "com/tencent/mm/ui/ServiceNotifySettingsUI$DefaultAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        android.content.Context context = view.getContext();
        int i17 = this.f292624d;
        db5.e1.l(context, i17 == 1 ? com.p314xaae8f345.mm.R.C30867xcad56011.f574187hd2 : com.p314xaae8f345.mm.R.C30867xcad56011.f574190hd5, 0, i17 == 1 ? com.p314xaae8f345.mm.R.C30867xcad56011.f574188hd3 : com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1, com.p314xaae8f345.mm.R.C30867xcad56011.aq7, false, new com.p314xaae8f345.mm.ui.sh(this, str), new com.p314xaae8f345.mm.ui.th(this), com.p314xaae8f345.mm.R.C30859x5a72f63.f560739su);
        yj0.a.h(this, "com/tencent/mm/ui/ServiceNotifySettingsUI$DefaultAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
