package mq2;

/* loaded from: classes15.dex */
public final class d0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1592xc4e39b55.C14558x6dc32d60 f412260d;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1592xc4e39b55.C14558x6dc32d60 c14558x6dc32d60) {
        this.f412260d = c14558x6dc32d60;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1592xc4e39b55.C14558x6dc32d60 c14558x6dc32d60 = this.f412260d;
        c14558x6dc32d60.f203639x = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.f0.e(11);
        if (c14558x6dc32d60.f412255d != null) {
            com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
            java.lang.Object obj = c14558x6dc32d60.f412255d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.modelbase.NetSceneBase");
            d17.d((com.p314xaae8f345.mm.p944x882e457a.m1) obj);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyPersonUIC", "showLoadingDialog  [loading cancel] cancel in loading");
        if (c14558x6dc32d60.f203634s) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyPersonUIC", "showLoadingDialog [loading cancel] cancel in first loading");
    }
}
