package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class kw extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az2.f f200393d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f200394e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f200395f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f200396g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nw f200397h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw(az2.f fVar, int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nw nwVar) {
        super(0);
        this.f200393d = fVar;
        this.f200394e = i17;
        this.f200395f = i18;
        this.f200396g = str;
        this.f200397h = nwVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        this.f200393d.b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switch role failed. errType ");
        sb6.append(this.f200394e);
        sb6.append(", errCode ");
        sb6.append(this.f200395f);
        sb6.append(", errMsg ");
        java.lang.String str = this.f200396g;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveSwitchRoleDialog", sb6.toString());
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eib);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        if (str == null || str.length() == 0) {
            str = string;
        }
        db5.t7.f(this.f200397h.f199914d, str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.jw.f200317a);
        return jz5.f0.f384359a;
    }
}
