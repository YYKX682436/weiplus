package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class c2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f199473d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f199474e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f199475f;

    /* renamed from: g, reason: collision with root package name */
    public int f199476g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f199477h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.i2 f199478i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(android.content.Intent intent, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.i2 i2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f199477h = intent;
        this.f199478i = i2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c2(this.f199477h, this.f199478i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.i2 i2Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f199476g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.i2 i2Var2 = this.f199478i;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            android.content.Intent intent = this.f199477h;
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046 = intent != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046) intent.getParcelableExtra("KSEGMENTMEDIAINFO") : null;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("REQUEST_CODE_CROP_FIX_IMAGE model: ");
            sb6.append(c16991x15ced046 != null ? c16991x15ced046.f237195f : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderGameLivePostCoverWidget", sb6.toString());
            if (c16991x15ced046 != null) {
                java.lang.Boolean bool = c16991x15ced046.f237197h;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bool, "getPhoto(...)");
                if (!bool.booleanValue() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16991x15ced046.f237195f)) {
                    db5.t7.m123882x26a183b(i2Var2.f200149d, com.p314xaae8f345.mm.R.C30867xcad56011.cih, 0).show();
                } else {
                    java.lang.String str2 = c16991x15ced046.f237195f + "_game_live_cover_" + i2Var2.f200158p;
                    p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.b2 b2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.b2(c16991x15ced046, str2, null);
                    this.f199473d = c16991x15ced046;
                    this.f199474e = i2Var2;
                    this.f199475f = str2;
                    this.f199476g = 1;
                    if (p3325xe03a0797.p3326xc267989b.l.g(p0Var, b2Var, this) == aVar) {
                        return aVar;
                    }
                    str = str2;
                    i2Var = i2Var2;
                }
            }
            i2Var2.f200152g.mo57852x3dcbea6f();
            return jz5.f0.f384359a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = (java.lang.String) this.f199475f;
        i2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.i2) this.f199474e;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        zl2.r4 r4Var = zl2.r4.f555483a;
        android.widget.ImageView imageView = i2Var.f200150e;
        r4Var.P(imageView, str, java.lang.Math.min(imageView.getWidth(), 500), java.lang.Math.min(i2Var.f200150e.getHeight(), 500));
        i2Var.f200154i = str;
        i2Var.f200155m = "";
        i2Var.f200156n = null;
        km2.g.f390633a.f(i2Var.f200154i, i2Var.f200158p);
        ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
        i2Var.a(ml2.j0.f409116i.P);
        i2Var2.f200152g.mo57852x3dcbea6f();
        return jz5.f0.f384359a;
    }
}
