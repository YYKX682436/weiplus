package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112;

/* JADX INFO: Access modifiers changed from: package-private */
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", dm.i4.f66875xa013b0d5, "Ljz5/f0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveWeCoinHotConstract$ViewCallback$initView$4$1 */
/* loaded from: classes3.dex */
public final class C14726x80a994f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14719xcc7f5507.ViewCallback f204351d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.hp f204352e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14726x80a994f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14719xcc7f5507.ViewCallback viewCallback, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.hp hpVar) {
        super(1);
        this.f204351d = viewCallback;
        this.f204352e = hpVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String finderUsername = (java.lang.String) obj;
        if (finderUsername == null || finderUsername.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f204352e.I, "gotoProfileCallback username:" + finderUsername);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14719xcc7f5507.ViewCallback viewCallback = this.f204351d;
            if (viewCallback.f204337e != null) {
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = viewCallback.f204336d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("report_scene", 0);
                intent.putExtra("finder_username", finderUsername);
                intent.putExtra("key_enter_profile_type", 11);
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                ya2.e1.f542005a.w(context, intent);
            }
        }
        return jz5.f0.f384359a;
    }
}
