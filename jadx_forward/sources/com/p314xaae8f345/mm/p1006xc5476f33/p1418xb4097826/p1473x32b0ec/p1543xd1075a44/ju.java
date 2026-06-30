package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes.dex */
public final class ju extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f200308d;

    /* renamed from: e, reason: collision with root package name */
    public int f200309e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f200310f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pu f200311g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ju(android.content.Intent intent, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pu puVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f200310f = intent;
        this.f200311g = puVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ju(this.f200310f, this.f200311g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ju) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f200309e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            android.content.Intent intent = this.f200310f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046 = intent != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046) intent.getParcelableExtra("KSEGMENTMEDIAINFO") : null;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("REQUEST_CODE_CROP_FIX_IMAGE model: ");
            sb6.append(c16991x15ced046 != null ? c16991x15ced046.f237195f : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayGenWidget", sb6.toString());
            if ((c16991x15ced046 != null ? c16991x15ced046.f237195f : null) == null || !com.p314xaae8f345.mm.vfs.w6.j(c16991x15ced046.f237195f)) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("ERROR! filePath=");
                sb7.append(c16991x15ced046 != null ? c16991x15ced046.f237195f : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveReplayGenWidget", sb7.toString());
                return jz5.f0.f384359a;
            }
            java.lang.String str2 = c16991x15ced046.f237195f + "_normal_live_cover";
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.iu iuVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.iu(c16991x15ced046, str2, null);
            this.f200308d = str2;
            this.f200309e = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(p0Var, iuVar, this) == aVar) {
                return aVar;
            }
            str = str2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) this.f200308d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pu puVar = this.f200311g;
        puVar.B = str;
        android.widget.ImageView imageView = puVar.f200971t;
        if (imageView != null) {
            zl2.r4.f555483a.P(imageView, str, java.lang.Math.min(imageView.getWidth(), 500), java.lang.Math.min(imageView.getHeight(), 500));
        }
        return jz5.f0.f384359a;
    }
}
