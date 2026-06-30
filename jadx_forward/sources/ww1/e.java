package ww1;

/* loaded from: classes5.dex */
public final class e implements com.p314xaae8f345.mm.p2802xd031a825.ui.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ww1.f f531705a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y63.a f531706b;

    public e(ww1.f fVar, y63.a aVar) {
        this.f531705a = fVar;
        this.f531706b = aVar;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z
    /* renamed from: onClick */
    public final void mo48650xaf6b9ae9(android.view.View view) {
        ww1.a aVar = this.f531705a.f531712f;
        if (aVar != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_group_solitatire_create", false);
            y63.a aVar2 = this.f531706b;
            intent.putExtra("key_group_solitatire_key", aVar2.f66138x4b6e619a);
            intent.putExtra("key_group_solitatire_chatroom_username", aVar2.f66142xdec927b);
            intent.putExtra("KEY_GROUP_SOLITATIRE_READ_ONLY", true);
            z60.k kVar = (z60.k) i95.n0.c(z60.k.class);
            com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.n5 n5Var = ((com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.m5) aVar).f154270a;
            java.lang.String str = n5Var.f154281d.f154040m;
            ((z60.i) kVar).getClass();
            ((t63.e) i95.n0.c(t63.e.class)).wi().k(str, aVar2);
            j45.l.j(n5Var.f154281d.mo55332x76847179(), "groupsolitaire", ".ui.GroupSolitatireEditUI", intent, null);
        }
    }
}
