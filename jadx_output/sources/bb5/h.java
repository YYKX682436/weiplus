package bb5;

/* loaded from: classes14.dex */
public class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.applet.SecurityImage f19137d;

    public h(com.tencent.mm.ui.applet.SecurityImage securityImage) {
        this.f19137d = securityImage;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/applet/SecurityImage$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.ui.applet.SecurityImage.f197190p;
        com.tencent.mm.ui.applet.SecurityImage securityImage = this.f19137d;
        securityImage.a(false);
        bb5.k kVar = securityImage.f197199o;
        if (kVar != null) {
            kVar.a();
        }
        yj0.a.h(this, "com/tencent/mm/ui/applet/SecurityImage$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
