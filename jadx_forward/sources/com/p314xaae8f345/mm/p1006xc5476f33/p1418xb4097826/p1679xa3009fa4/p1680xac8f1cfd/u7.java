package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class u7 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.e8 f217636d;

    public u7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.e8 e8Var) {
        this.f217636d = e8Var;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "onItemClick: position:" + i17);
        nr2.m mVar = (nr2.m) holder.f374658i;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_topic_type", 16);
        java.lang.String k17 = mVar.k();
        long l17 = mVar.l();
        mVar.g();
        intent.putExtra("key_topic_title", k17);
        intent.putExtra("KEY_TOPIC_ID", l17);
        intent.putExtra("KEY_FROM_PAID_COLLECTION", true);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa b17 = mVar.b();
        intent.putExtra("paid_collection_username", b17 != null ? b17.m76197x6c03c64c() : null);
        intent.putExtra("KEY_OPEN_PLAYLIST_DRAWER", true);
        intent.putExtra("key_ref_object_id", mVar.j());
        intent.putExtra("paid_collection_info", mVar.f420801d.mo14344x5f01b1f6());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.e8 e8Var = this.f217636d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(iyVar, e8Var.m80379x76847179(), intent, 0L, null, 0, 0, false, 0, null, 508, null);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).il(e8Var.m80379x76847179(), intent);
    }
}
