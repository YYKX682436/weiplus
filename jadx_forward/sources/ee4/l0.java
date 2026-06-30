package ee4;

/* loaded from: classes4.dex */
public final class l0 extends ee4.t {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f333257n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f333258o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(ce4.b pcContext) {
        super(pcContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pcContext, "pcContext");
        this.f333257n = je4.c.f380850a.a();
        this.f333258o = new java.util.ArrayList();
    }

    @Override // ce4.a
    public java.lang.String d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTag", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicFileManagerPc");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTag", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicFileManagerPc");
        return "SnsPublish.PicFileManagerPc";
    }

    @Override // ce4.a
    public void i() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicFileManagerPc");
        super.i();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("markToDeleteDirLivePhotoItemSize: ");
        java.util.ArrayList arrayList = this.f333258o;
        sb6.append(arrayList.size());
        f(sb6.toString());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            pm0.v.w(new ee4.j0((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.C18437xfbc5d82) it.next()));
        }
        arrayList.clear();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicFileManagerPc");
    }

    public final void p(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.AbstractC18435x78de886c item) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String sb6;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addPublishItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicFileManagerPc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        f("addPublishItem >> picType: " + item.d() + " source: " + item.c());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("saveCameraEditorDataForReport", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicFileManagerPc");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1999xc84c5534.C17030x7c2c6071 c17030x7c2c6071 = item.f252742g;
        if (c17030x7c2c6071.f237400d == 0) {
            c17030x7c2c6071.f237401e = 2;
            c17030x7c2c6071.f237402f = item.c() == 1 ? 1 : 0;
            c17030x7c2c6071.f237403g = nu3.e.f421733c ? 1 : 0;
            c17030x7c2c6071.f237404h = item.c() == 1 ? 1 : 2;
            c17030x7c2c6071.f237405i = 1;
            c17030x7c2c6071.f237406m = 0;
            c17030x7c2c6071.f237407n = nu3.f.f421746d;
            c17030x7c2c6071.f237408o = nu3.f.f421745c;
            if (nu3.e.f421733c) {
                c17030x7c2c6071.f237409p = java.lang.String.valueOf(nu3.i.f421751a.l().b("KEY_EDIT_SESSION_ID", 0L));
            }
            c17030x7c2c6071.f237410q = item.b();
        }
        c17030x7c2c6071.f237400d++;
        f(java.lang.String.valueOf(c17030x7c2c6071));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("saveCameraEditorDataForReport", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicFileManagerPc");
        if (item.d() == 1) {
            if (item.c() == 1) {
                ie4.a aVar = ie4.a.f372535a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCaptureImageCopyPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicFileHelper");
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(ie4.a.f372536b);
                sb7.append("pre_temp_sns_pic");
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                java.lang.String b17 = item.b();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
                sb8.append(b17);
                sb8.append(java.lang.System.currentTimeMillis());
                byte[] bytes = sb8.toString().getBytes(r26.c.f450398a);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                sb7.append(kk.k.g(bytes));
                sb6 = sb7.toString();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCaptureImageCopyPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicFileHelper");
            } else {
                ie4.a aVar2 = ie4.a.f372535a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAlbumImageCopyPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicFileHelper");
                java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                sb9.append(ie4.a.f372536b);
                sb9.append("pre_temp_sns_photo");
                java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
                java.lang.String b18 = item.b();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b18);
                sb10.append(b18);
                sb10.append(java.lang.System.currentTimeMillis());
                byte[] bytes2 = sb10.toString().getBytes(r26.c.f450398a);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes2, "getBytes(...)");
                sb9.append(kk.k.g(bytes2));
                sb6 = sb9.toString();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAlbumImageCopyPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicFileHelper");
            }
            ie4.a aVar3 = ie4.a.f372535a;
            java.lang.String b19 = item.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b19);
            long d17 = aVar3.d(b19, sb6);
            f("copy img path ret: " + d17);
            if (d17 <= 0) {
                str3 = "addPublishItem";
                str2 = "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicFileManagerPc";
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str3, str2);
            }
            fe4.b v17 = m().v();
            java.lang.String b27 = item.b();
            v17.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateMediaPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b27)) {
                str = "addPublishItem";
            } else {
                java.util.HashMap hashMap = v17.f343099e;
                r45.h96 h96Var = (r45.h96) hashMap.get(b27);
                if (h96Var != null) {
                    str = "addPublishItem";
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsPublish.MultiPicItem", "addMedia snsMediaEcsInfo:pathFrom:" + b27 + " pathTo:" + sb6);
                    hashMap.put(sb6, h96Var);
                } else {
                    str = "addPublishItem";
                }
                java.util.HashMap hashMap2 = v17.f343100f;
                r45.vb1 vb1Var = (r45.vb1) hashMap2.get(b27);
                if (vb1Var != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsPublish.MultiPicItem", "addMedia finderInfo:pathFrom:" + b27 + " pathTo:" + sb6);
                    hashMap2.put(sb6, vb1Var);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateMediaPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setImagePath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishBaseMultiPicItem");
            item.f252739d = sb6;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImagePath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishBaseMultiPicItem");
        } else {
            str = "addPublishItem";
            if (item.d() == 6) {
                ie4.a aVar4 = ie4.a.f372535a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLivePhotoImgCopyPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicFileHelper");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.C18437xfbc5d82 c18437xfbc5d82 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.C18437xfbc5d82) item;
                java.lang.String b28 = aVar4.b(c18437xfbc5d82);
                java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
                sb11.append(b28);
                sb11.append("pre_temp_sns_live_photo");
                java.lang.StringBuilder sb12 = new java.lang.StringBuilder();
                java.lang.String b29 = item.b();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b29);
                sb12.append(b29);
                sb12.append(java.lang.System.currentTimeMillis());
                java.lang.String sb13 = sb12.toString();
                java.nio.charset.Charset charset = r26.c.f450398a;
                byte[] bytes3 = sb13.getBytes(charset);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes3, "getBytes(...)");
                sb11.append(kk.k.g(bytes3));
                java.lang.String sb14 = sb11.toString();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLivePhotoImgCopyPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicFileHelper");
                java.lang.String b37 = item.b();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b37);
                str2 = "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicFileManagerPc";
                long d18 = aVar4.d(b37, sb14);
                f("copy img path ret: " + d18);
                if (d18 > 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setImagePath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishBaseMultiPicItem");
                    item.f252739d = sb14;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImagePath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishBaseMultiPicItem");
                }
                boolean m17 = c18437xfbc5d82.m();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isRemuxFinish", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
                boolean z17 = c18437xfbc5d82.f252751r == 1 && com.p314xaae8f345.mm.vfs.w6.j(c18437xfbc5d82.f252748o);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isRemuxFinish", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
                f("mediaId: " + c18437xfbc5d82.g() + " isParseFinish: " + m17 + " isRemuxFinish: " + z17);
                if (m17) {
                    java.lang.String c17 = aVar4.c(c18437xfbc5d82);
                    java.lang.String i17 = c18437xfbc5d82.i();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i17);
                    long d19 = aVar4.d(i17, c17);
                    f("copy parse video path ret: " + d19);
                    if (d19 > 0) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setVideoPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
                        c18437xfbc5d82.f252747n = c17;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setVideoPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
                    }
                } else {
                    java.lang.String c18 = aVar4.c(c18437xfbc5d82);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setVideoPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
                    c18437xfbc5d82.f252747n = c18;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setVideoPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLivePhotoTempParsePath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicFileHelper");
                    java.lang.String wi6 = ((hs.x) ((qk.s7) i95.n0.c(qk.s7.class))).wi(qk.k9.f445741e, java.lang.String.valueOf(c18437xfbc5d82.g()));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLivePhotoTempParsePath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicFileHelper");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTempVideoPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
                    c18437xfbc5d82.f252753t = wi6;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTempVideoPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
                }
                if (!z17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLivePhotoRemuxPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicFileHelper");
                    java.lang.String b38 = aVar4.b(c18437xfbc5d82);
                    java.lang.StringBuilder sb15 = new java.lang.StringBuilder();
                    sb15.append(b38);
                    sb15.append("pre_temp_sns_live_photo_remux_");
                    java.lang.StringBuilder sb16 = new java.lang.StringBuilder();
                    java.lang.String b39 = c18437xfbc5d82.b();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b39);
                    sb16.append(b39);
                    sb16.append(java.lang.System.currentTimeMillis());
                    byte[] bytes4 = sb16.toString().getBytes(charset);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes4, "getBytes(...)");
                    sb15.append(kk.k.g(bytes4));
                    java.lang.String sb17 = sb15.toString();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLivePhotoRemuxPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicFileHelper");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setRemuxPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
                    c18437xfbc5d82.f252748o = sb17;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setRemuxPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLivePhotoRemuxThumbPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicFileHelper");
                    java.lang.String b47 = aVar4.b(c18437xfbc5d82);
                    java.lang.StringBuilder sb18 = new java.lang.StringBuilder();
                    sb18.append(b47);
                    sb18.append("pre_temp_sns_live_photo_remux_thumb_");
                    java.lang.StringBuilder sb19 = new java.lang.StringBuilder();
                    java.lang.String b48 = c18437xfbc5d82.b();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b48);
                    sb19.append(b48);
                    sb19.append(java.lang.System.currentTimeMillis());
                    byte[] bytes5 = sb19.toString().getBytes(charset);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes5, "getBytes(...)");
                    sb18.append(kk.k.g(bytes5));
                    java.lang.String sb20 = sb18.toString();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLivePhotoRemuxThumbPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicFileHelper");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setRemuxThumbPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
                    c18437xfbc5d82.f252749p = sb20;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setRemuxThumbPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
                }
                str3 = str;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str3, str2);
            }
        }
        str2 = "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicFileManagerPc";
        str3 = str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str3, str2);
    }

    public final void q(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.AbstractC18435x78de886c item) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removePublishItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicFileManagerPc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        f("removePublishItem >> " + item.d());
        pm0.v.w(new ee4.k0(item));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removePublishItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicFileManagerPc");
    }
}
