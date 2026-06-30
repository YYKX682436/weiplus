package hr3;

/* loaded from: classes11.dex */
public class gb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.hb f365118d;

    public gb(hr3.hb hbVar) {
        this.f365118d = hbVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$QrcodeHandler$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        fo3.s.INSTANCE.O6(1, 1, 5);
        android.content.Intent intent = new android.content.Intent();
        hr3.hb hbVar = this.f365118d;
        intent.putExtra("Contact_User", hbVar.f365144f.L.d1());
        intent.putExtra("Contact_Scene", hbVar.f365144f.N);
        intent.putExtra("AntispamTicket", hbVar.f365144f.L.F1);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.z(intent, hbVar.f365144f.f279303d);
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$QrcodeHandler$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
