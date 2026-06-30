package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class lo extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f194952d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap f194953e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo(android.view.ViewGroup viewGroup, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap apVar) {
        super(0);
        this.f194952d = viewGroup;
        this.f194953e = apVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        sj2.m mVar;
        boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap.V;
        android.view.ViewGroup viewGroup = this.f194952d;
        if (z17) {
            viewGroup.setVisibility(8);
        } else {
            viewGroup.setVisibility(4);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap apVar = this.f194953e;
        if (apVar.G.containsKey(viewGroup) && (mVar = (sj2.m) apVar.G.get(viewGroup)) != null) {
            mVar.h();
        }
        return jz5.f0.f384359a;
    }
}
