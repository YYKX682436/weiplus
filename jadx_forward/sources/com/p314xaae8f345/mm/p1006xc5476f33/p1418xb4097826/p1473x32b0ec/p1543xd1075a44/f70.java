package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class f70 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f199853d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f199854e;

    /* renamed from: f, reason: collision with root package name */
    public int f199855f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f199856g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.u70 f199857h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f70(android.content.Intent intent, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.u70 u70Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f199856g = intent;
        this.f199857h = u70Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.f70(this.f199856g, this.f199857h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.f70) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [boolean, int] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        int i17;
        java.lang.String str;
        r45.yg7 yg7Var;
        r45.z53 z53Var;
        java.lang.String m75945x2fec8307;
        pz5.a aVar = pz5.a.f440719d;
        int i18 = this.f199855f;
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.u70 u70Var = this.f199857h;
        if (i18 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            android.content.Intent intent = this.f199856g;
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046 = intent != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046) intent.getParcelableExtra("KSEGMENTMEDIAINFO") : null;
            java.lang.String str2 = c16991x15ced046 != null ? c16991x15ced046.f237195f : null;
            android.os.Bundle bundleExtra = intent != null ? intent.getBundleExtra("key_extra_data") : null;
            ?? r132 = bundleExtra != null ? bundleExtra.getBoolean("has_apply_hd", false) : 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLivePostCoverWidget", "REQUEST_CODE_CROP_FIX_IMAGE thumbPath: " + str2 + ", isHD=" + ((boolean) r132));
            if ((str2 == null || str2.length() == 0) || !com.p314xaae8f345.mm.vfs.w6.j(str2)) {
                ((ml2.j0) i95.n0.c(ml2.j0.class)).bk(ml2.x3.f409755e);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderStartLivePostCoverWidget", "ERROR! filePath=" + str2);
                return f0Var;
            }
            java.lang.String str3 = str2 + "_normal_live_cover_" + java.lang.System.currentTimeMillis();
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e70 e70Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e70(u70Var, str2, str3, null);
            this.f199854e = str3;
            this.f199853d = r132;
            this.f199855f = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(p0Var, e70Var, this) == aVar) {
                return aVar;
            }
            i17 = r132;
            str = str3;
        } else {
            if (i18 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i17 = this.f199853d;
            str = (java.lang.String) this.f199854e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        if (i17 != 0) {
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) u70Var.m56788xbba4bfc0(mm2.g1.class)).f410618z).k(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLivePostCoverWidget", "set hdCoverPath=" + str);
        } else {
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) u70Var.m56788xbba4bfc0(mm2.g1.class)).f410618z).k(null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLivePostCoverWidget", "cleared hdCoverPath");
        }
        android.widget.ImageView imageView = u70Var.f201487m;
        if (imageView != null) {
            zl2.r4.f555483a.P(imageView, str, java.lang.Math.min(imageView.getWidth(), 500), java.lang.Math.min(imageView.getHeight(), 500));
        }
        ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
        ml2.x3 x3Var = ml2.j0.f409116i.P;
        switch (x3Var.ordinal()) {
            case 6:
            case 7:
                yg7Var = r45.yg7.FinderLiveImgSource_PhoneShooting;
                break;
            case 8:
                yg7Var = r45.yg7.FinderLiveImgSource_PhotoAlbum;
                break;
            case 9:
                yg7Var = r45.yg7.FinderLiveImgSource_FinderAvatar;
                break;
            default:
                yg7Var = r45.yg7.FinderLiveImgSource_Unknown;
                break;
        }
        u70Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLivePostCoverWidget", "setCoverUrl url:" + str + ", urlSrc:" + yg7Var);
        u70Var.f201492r = yg7Var;
        df2.od odVar = (df2.od) u70Var.m56789x25fe639c(df2.od.class);
        if (odVar != null) {
            odVar.e7(r45.n72.kActionType_SetLiveRoomCoverImg);
        }
        java.lang.String str4 = "";
        if (zl2.r4.f555483a.T1((r45.q12) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) u70Var.m56788xbba4bfc0(mm2.g1.class)).f410601f).mo144003x754a37bb())) {
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) u70Var.m56788xbba4bfc0(mm2.g1.class)).f410612t).k(str);
            km2.g gVar = km2.g.f390633a;
            r45.n73 n73Var = (r45.n73) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) u70Var.m56788xbba4bfc0(mm2.g1.class)).f410604i).mo144003x754a37bb();
            if (n73Var != null && (z53Var = (r45.z53) n73Var.m75936x14adae67(1)) != null && (m75945x2fec8307 = z53Var.m75945x2fec8307(0)) != null) {
                str4 = m75945x2fec8307;
            }
            gVar.f(str, str4);
        } else {
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) u70Var.m56788xbba4bfc0(mm2.g1.class)).f410608p).k(str);
            km2.g.f390633a.f(str, "");
        }
        u70Var.g7(x3Var);
        return f0Var;
    }
}
