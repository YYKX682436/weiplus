package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class r3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 f195608d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 v3Var) {
        super(2);
        this.f195608d = v3Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((com.p314xaae8f345.mm.p944x882e457a.i) obj, "<anonymous parameter 0>");
        if (this.f195608d.f194863o.f93138c != p012xc85e97e9.p093xedfae76a.n.DESTROYED) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSceneEnd errType:");
            sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152148a) : null);
            sb6.append(", errCode:");
            sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152149b) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveAnchorAfterPlugin", sb6.toString());
        }
        return jz5.f0.f384359a;
    }
}
