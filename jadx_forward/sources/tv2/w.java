package tv2;

/* loaded from: classes10.dex */
public final class w extends qv2.e {

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f503879v;

    /* renamed from: w, reason: collision with root package name */
    public pv2.g f503880w;

    /* renamed from: x, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1646xce040e01.p1647x7817babe.p1649x76847298.C15163xf0f8eb05 f503881x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStageNew$feedDeleteListener$1] */
    public w(final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderObj) {
        super(finderObj, java.lang.String.valueOf(finderObj.m59260x51f8f5b0()));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObj, "finderObj");
        this.f503879v = "LogPost.FinderUploadStageNew";
        this.f503880w = n();
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f503881x = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5437xe8b43b11>(a0Var) { // from class: com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStageNew$feedDeleteListener$1
            {
                this.f39173x3fe91575 = -108499199;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5437xe8b43b11 c5437xe8b43b11) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5437xe8b43b11 event = c5437xe8b43b11;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.da daVar = event.f135780g;
                long j17 = daVar.f87971b;
                if (j17 != 0) {
                    tv2.w wVar = tv2.w.this;
                    if (j17 == wVar.f448471h.m59260x51f8f5b0()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(wVar.f503879v, "feedDeleteListener localId:" + daVar.f87971b);
                        if (!cu2.u.f303974a.k(finderObj.m59260x51f8f5b0())) {
                            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = wVar.f448471h.f66946x284ddcb8;
                            if (c19783xd9a946b7 != null) {
                                c19783xd9a946b7.m76447x75f6f6ad(100);
                            }
                            wVar.C(false, false);
                            wVar.v();
                        }
                    }
                }
                return false;
            }
        };
    }

    @Override // qv2.e
    public void A(pv2.g gVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gVar, "<set-?>");
        this.f503880w = gVar;
    }

    @Override // qv2.e
    public void B() {
        this.f448471h.m59433x2b7e608b("upload");
    }

    @Override // qv2.e
    public pv2.g m() {
        return new tv2.x(this.f448471h, 1);
    }

    @Override // qv2.e
    public pv2.g n() {
        return new tv2.x(this.f448471h, 2);
    }

    @Override // qv2.e
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d o() {
        return this.f503881x;
    }

    @Override // qv2.e
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k5 p() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.u4.f206917a;
    }

    @Override // qv2.e
    public pv2.g q() {
        return new tv2.m(this.f448471h, this.f448479s);
    }

    @Override // qv2.e
    public pv2.g r() {
        return this.f503880w;
    }

    @Override // qv2.e
    public java.lang.String s() {
        return this.f503879v;
    }

    @Override // qv2.e
    public void w() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderItem = this.f448471h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderItem, "finderItem");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.y(p2Var, finderItem, "CDNUpload", null, null, 0, 0L, 60, null);
        super.w();
    }

    @Override // qv2.e
    public void y() {
        cu2.u.f303974a.l(this.f448471h);
    }
}
