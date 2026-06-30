package r61;

/* loaded from: classes9.dex */
public class b2 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.p1011x633fb29.C11374x5be6abc6 f474357d;

    public b2(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.p1011x633fb29.C11374x5be6abc6 c11374x5be6abc6) {
        this.f474357d = c11374x5be6abc6;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/friend/model/RecoverFriendPresenter$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.p1011x633fb29.C11374x5be6abc6 c11374x5be6abc6 = this.f474357d;
        r61.x0 x0Var = ((r61.y1) ((fb5.n) c11374x5be6abc6.f154645i.get(i17)).f342431b).f474533a;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(x0Var.f67922xdd77ad16, true);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_ShowUserName", false);
        intent.putExtra("Contact_ShowFMessageList", true);
        intent.putExtra("AntispamTicket", x0Var.f67928x11bb99f1);
        intent.putExtra("User_From_Fmessage", true);
        intent.putExtra("Contact_ShowFMessageList", true);
        intent.putExtra("Contact_Nick", x0Var.f67923x21f9b213);
        intent.putExtra("Contact_Scene", 17);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 7);
        if (((int) n17.E2) <= 0 || !n17.r2()) {
            intent.putExtra("Contact_User", x0Var.f67922xdd77ad16);
        } else {
            intent.putExtra("Contact_User", n17.d1());
            intent.putExtra("force_get_contact", true);
        }
        j45.l.j(c11374x5be6abc6.f154640d, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7160xdeb98c4c c7160xdeb98c4c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7160xdeb98c4c();
        c7160xdeb98c4c.f144649d = 5;
        c7160xdeb98c4c.f144651f = c7160xdeb98c4c.b("newaccountusername", c01.z1.b(), true);
        c7160xdeb98c4c.f144650e = c7160xdeb98c4c.b("oldaccountusername", c11374x5be6abc6.f154643g, true);
        c7160xdeb98c4c.f144652g = c7160xdeb98c4c.b("friendusername", x0Var.f67922xdd77ad16, true);
        c7160xdeb98c4c.k();
        yj0.a.h(this, "com/tencent/mm/plugin/account/friend/model/RecoverFriendPresenter$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
