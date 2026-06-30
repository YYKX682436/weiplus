package mq2;

/* loaded from: classes2.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1592xc4e39b55.C14558x6dc32d60 f412286d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1592xc4e39b55.C14558x6dc32d60 c14558x6dc32d60) {
        this.f412286d = c14558x6dc32d60;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC$getSayHiLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1592xc4e39b55.C14558x6dc32d60 c14558x6dc32d60 = this.f412286d;
        android.widget.ListView listView = c14558x6dc32d60.f203626h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(listView);
        listView.removeHeaderView(c14558x6dc32d60.f203627i);
        c14558x6dc32d60.f203627i = null;
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(c14558x6dc32d60.m158354x19263085(), "com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI");
        intent.putExtra("k_say_hi_type", 2);
        intent.putExtra("show_clear_header", true);
        c14558x6dc32d60.m158354x19263085().startActivityForResult(intent, com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46348x908ed654);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ga gaVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ha.f187090a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = c14558x6dc32d60.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        gaVar.o(2, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6());
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N("NearbyPeopleBubble");
        rq2.u.f480422a.b(12L);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC$getSayHiLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
