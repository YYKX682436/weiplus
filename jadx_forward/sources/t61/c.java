package t61;

/* loaded from: classes9.dex */
public class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t61.e f497518d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t61.d f497519e;

    public c(t61.d dVar, t61.e eVar) {
        this.f497519e = dVar;
        this.f497518d = eVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/friend/widget/RecoverFriendSortView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7160xdeb98c4c c7160xdeb98c4c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7160xdeb98c4c();
        c7160xdeb98c4c.f144649d = 4;
        c7160xdeb98c4c.f144651f = c7160xdeb98c4c.b("newaccountusername", c01.z1.b(), true);
        t61.d dVar = this.f497519e;
        c7160xdeb98c4c.f144650e = c7160xdeb98c4c.b("oldaccountusername", dVar.f497520a.f154707s, true);
        t61.e eVar = this.f497518d;
        c7160xdeb98c4c.f144652g = c7160xdeb98c4c.b("friendusername", eVar.f497527g.f474533a.f67922xdd77ad16, true);
        c7160xdeb98c4c.k();
        ns.k kVar = (ns.k) i95.n0.c(ns.k.class);
        android.content.Context context = dVar.f497520a.getContext();
        t61.a aVar = new t61.a(this);
        ((ms.a) kVar).getClass();
        r35.a aVar2 = new r35.a(context, aVar);
        aVar2.m(eVar.f497527g.f474533a.f67928x11bb99f1);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(17);
        aVar2.f450540e = new t61.b(this);
        aVar2.b(eVar.f497527g.f474533a.f67922xdd77ad16, linkedList, false, "");
        yj0.a.h(this, "com/tencent/mm/plugin/account/friend/widget/RecoverFriendSortView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
