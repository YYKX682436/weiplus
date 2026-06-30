package nr2;

/* loaded from: classes2.dex */
public final class w0 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nr2.i1 f420859d;

    public w0(nr2.i1 i1Var) {
        this.f420859d = i1Var;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        r45.do2 do2Var;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPaidCollectionPresenter", "onItemClick: position:" + i17);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_topic_type", 16);
        so2.j5 j5Var = (so2.j5) holder.f374658i;
        boolean z17 = j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1;
        byte[] bArr = null;
        nr2.i1 i1Var = this.f420859d;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1 z1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1) j5Var;
            if (z1Var.getFeedObject().getMediaType() != 15) {
                intent.putExtra("key_ref_object_id", z1Var.getFeedObject().m59251x5db1b11());
                nr2.m mVar = i1Var.f420748f;
                intent.putExtra("key_topic_title", mVar != null ? mVar.k() : null);
                nr2.m mVar2 = i1Var.f420748f;
                intent.putExtra("KEY_TOPIC_ID", mVar2 != null ? java.lang.Long.valueOf(mVar2.l()) : null);
                intent.putExtra("KEY_FROM_PAID_COLLECTION", true);
                nr2.m mVar3 = i1Var.f420748f;
                intent.putExtra("paid_collection_username", mVar3 != null ? mVar3.o() : null);
                nr2.m mVar4 = i1Var.f420748f;
                if (mVar4 != null && (do2Var = mVar4.f420801d) != null) {
                    bArr = do2Var.mo14344x5f01b1f6();
                }
                intent.putExtra("paid_collection_info", bArr);
                nr2.m mVar5 = i1Var.f420748f;
                boolean z18 = mVar5 != null && mVar5.p();
                android.app.Activity activity = i1Var.f420743a;
                if (z18) {
                    intent.putExtra("KEY_COLLECTION_PREVIEW_WORDING", activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lq_));
                } else {
                    intent.putExtra("KEY_COLLECTION_PREVIEW_WORDING", activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572875mh0));
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1, i1Var.f420743a, intent, 0L, null, 0, 0, false, 0, null, 508, null);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).il(activity, intent);
                return;
            }
        }
        nr2.m mVar6 = i1Var.f420748f;
        java.lang.String o17 = mVar6 != null ? mVar6.o() : null;
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(o17, xy2.c.e(context))) {
            return;
        }
        android.app.Activity context2 = i1Var.f420743a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        nr2.u0 u0Var = (nr2.u0) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).e(nr2.u0.class);
        if (u0Var != null) {
            u0Var.O6(view, null);
        }
    }
}
