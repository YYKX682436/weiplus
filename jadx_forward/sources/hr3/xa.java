package hr3;

/* loaded from: classes11.dex */
public class xa implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.ya f365711d;

    public xa(hr3.ya yaVar) {
        this.f365711d = yaVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$NearByFriendHandler$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hr3.ya yaVar = this.f365711d;
        if (yaVar.f365742g.Z && m25.a.c()) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Chat_User", yaVar.f365742g.L.J0());
            intent.putExtra("lbs_mode", true);
            intent.putExtra("lbs_ticket", yaVar.f365742g.L1);
            intent.putExtra("add_scene", yaVar.f365742g.N);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.j(intent, yaVar.f365742g.K1);
        } else {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Contact_User", yaVar.f365742g.L.d1());
            intent2.putExtra("Contact_Scene", yaVar.f365742g.N);
            intent2.putExtra("AntispamTicket", yaVar.f365742g.L.F1);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.z(intent2, yaVar.f365742g.f279303d);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$NearByFriendHandler$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
