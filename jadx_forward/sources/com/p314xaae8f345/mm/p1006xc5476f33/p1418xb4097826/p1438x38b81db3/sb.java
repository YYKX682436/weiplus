package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class sb extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe f186066d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar) {
        super(0);
        this.f186066d = qeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar = this.f186066d;
        in5.s0 s0Var = qeVar.f185908z;
        if (s0Var != null && (abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) s0Var.f374658i) != null) {
            android.content.Context context = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ed2.i iVar = (ed2.i) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(ed2.i.class);
            boolean z17 = false;
            if (iVar != null) {
                if ((iVar.f332802e == ed2.a.f332786e) == true) {
                    z17 = true;
                }
            }
            if (z17) {
                zy2.m7 feedTipsStatus = abstractC14490x69736cb5.getFeedTipsStatus();
                zy2.l7 l7Var = feedTipsStatus != null ? feedTipsStatus.f559009b : null;
                if (l7Var != null) {
                    l7Var.f558988a = true;
                }
            } else {
                zy2.m7 feedTipsStatus2 = abstractC14490x69736cb5.getFeedTipsStatus();
                zy2.k7 k7Var = feedTipsStatus2 != null ? feedTipsStatus2.f559008a : null;
                if (k7Var != null) {
                    k7Var.f558975b = true;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullConvert", "onClickToShare " + hc2.b0.f(abstractC14490x69736cb5, true) + ' ' + qeVar.P());
            android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.msw);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "getView(...)");
            qeVar.n0(s0Var, abstractC14490x69736cb5, p17, 3);
        }
        return jz5.f0.f384359a;
    }
}
