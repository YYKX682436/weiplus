package mq2;

/* loaded from: classes15.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1592xc4e39b55.C14558x6dc32d60 f412263d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.b64 f412264e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mq2.h f412265f;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1592xc4e39b55.C14558x6dc32d60 c14558x6dc32d60, r45.b64 b64Var, mq2.h hVar) {
        this.f412263d = c14558x6dc32d60;
        this.f412264e = b64Var;
        this.f412265f = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC$NearbyFriendAdapter$getView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1592xc4e39b55.C14558x6dc32d60 c14558x6dc32d60 = this.f412263d;
        mq2.a aVar = (mq2.a) ((java.util.HashMap) c14558x6dc32d60.f412257f).get(this.f412264e.f452083d);
        if (aVar != null) {
            aVar.f412246j++;
            aVar.f412249m = true;
            aVar.f412248l |= 2;
        }
        c14558x6dc32d60.T6();
        this.f412265f.notifyDataSetChanged();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC$NearbyFriendAdapter$getView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
