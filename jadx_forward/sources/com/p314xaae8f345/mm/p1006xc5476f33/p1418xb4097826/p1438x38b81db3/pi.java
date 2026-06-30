package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class pi extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f185797d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.oj f185798e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185799f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.oj ojVar, java.lang.String str) {
        super(0);
        this.f185797d = i17;
        this.f185798e = ojVar;
        this.f185799f = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = this.f185797d;
        int a17 = hc2.d0.a(hc2.d0.d(i17));
        java.util.List a18 = hc2.v.a(this.f185797d, null, a17, false, false, false, 0, 120, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f185798e.f185719h, this.f185799f + " getTabLoaderDataList tabType=" + i17 + ",pageName=" + a17 + ",dataList size=" + ((java.util.ArrayList) a18).size());
        return a18;
    }
}
