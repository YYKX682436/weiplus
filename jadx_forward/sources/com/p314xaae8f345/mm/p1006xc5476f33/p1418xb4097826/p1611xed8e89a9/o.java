package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9;

/* loaded from: classes2.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f204933d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.w f204934e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.w wVar) {
        super(0);
        this.f204933d = str;
        this.f204934e = wVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.f0 f0Var;
        r45.ro2 ro2Var;
        java.util.List<so2.j5> h17 = bu2.e0.f106031a.h(20, this.f204933d);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (so2.j5 j5Var : h17) {
            if ((j5Var instanceof so2.k) && (f0Var = ((so2.k) j5Var).f491984d.f208529e) != null && (ro2Var = f0Var.f204872a) != null) {
                linkedList.add(ro2Var);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.UserPoiHandler", "[loadLocalData] infoList.size=" + linkedList.size());
        if (linkedList.size() > 0) {
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.n(this.f204934e, linkedList));
        }
        return jz5.f0.f384359a;
    }
}
