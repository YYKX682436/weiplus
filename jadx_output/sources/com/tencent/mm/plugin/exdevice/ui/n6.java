package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes8.dex */
public class n6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.za7 f99591d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI f99592e;

    public n6(com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI exdeviceRankInfoUI, r45.za7 za7Var) {
        this.f99592e = exdeviceRankInfoUI;
        this.f99591d = za7Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        a42.g gVar = a42.g.f1206a;
        androidx.appcompat.app.AppCompatActivity context = this.f99592e.getContext();
        r45.za7 za7Var = this.f99591d;
        gVar.b(context, za7Var.f391875d, za7Var.f391876e, za7Var.f391877f, za7Var.f391878g);
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
