package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes10.dex */
public final class r0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f211288d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15010xb447a21d f211289e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.zi2 f211290f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wt3.h0 f211291g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f211292h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15010xb447a21d activityC15010xb447a21d, r45.zi2 zi2Var, wt3.h0 h0Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var) {
        super(2);
        this.f211288d = str;
        this.f211289e = activityC15010xb447a21d;
        this.f211290f = zi2Var;
        this.f211291g = h0Var;
        this.f211292h = u3Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AlbumUI", "success:" + booleanValue + " , filePath:" + ((java.lang.String) obj2) + ", fileExist:" + o35.a.b(this.f211288d));
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.q0(booleanValue, this.f211288d, this.f211289e, this.f211290f, this.f211291g, this.f211292h));
        return jz5.f0.f384359a;
    }
}
