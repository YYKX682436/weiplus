package tv2;

/* loaded from: classes10.dex */
public final class g extends qv2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f503837m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1646xce040e01.p1647x7817babe.p1649x76847298.C15161x6ca18fdb f503838n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStageNew$feedDeleteListener$1] */
    public g(final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderObj) {
        super(finderObj, java.lang.String.valueOf(finderObj.m59260x51f8f5b0()));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObj, "finderObj");
        this.f503837m = "Finder.LogPost.FinderMediaProcessStageNew";
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f503838n = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5437xe8b43b11>(a0Var) { // from class: com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStageNew$feedDeleteListener$1
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
                if (j17 == 0) {
                    return false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.this;
                if (j17 != c14994x9b99c079.m59260x51f8f5b0()) {
                    return false;
                }
                tv2.g gVar = this;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(gVar.f503837m, "feedDeleteListener localId:" + daVar.f87971b);
                if (cu2.u.f303974a.k(c14994x9b99c079.m59260x51f8f5b0())) {
                    return false;
                }
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = gVar.f448468h.f66946x284ddcb8;
                if (c19783xd9a946b7 != null) {
                    c19783xd9a946b7.m76447x75f6f6ad(200);
                }
                gVar.f448469i = true;
                uv2.e.f512909a.c(gVar.f448468h.m59264x7efe73ec());
                return false;
            }
        };
    }

    @Override // qv2.b
    public void k(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.z result, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObj, "finderObj");
        mv2.f0.f413094a.d(result, finderObj);
    }

    @Override // qv2.b
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d l() {
        return this.f503838n;
    }

    @Override // qv2.b
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k5 m() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.u4.f206917a;
    }

    @Override // qv2.b
    public pv2.g o(boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderItem = this.f448468h;
        if (!z17) {
            return z18 ? new tv2.x(finderItem, 1) : new tv2.x(finderItem, 2);
        }
        uv2.i iVar = uv2.i.f512922a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderItem, "finderItem");
        return ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.B).mo141623x754a37bb()).r()).booleanValue() ? new tv2.w(finderItem) : new tv2.v(finderItem);
    }

    @Override // qv2.b
    public java.lang.String p() {
        return this.f503837m;
    }

    @Override // qv2.b
    public void r() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderItem = this.f448468h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderItem, "finderItem");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.y(p2Var, finderItem, "CompressVideo", null, null, 0, 0L, 60, null);
        super.r();
    }

    @Override // qv2.b
    public void s() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderItem = this.f448468h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderItem, "finderItem");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.v(p2Var, finderItem, "CompressVideo", null, null, 0, 0L, 60, null);
        super.s();
    }

    @Override // qv2.b
    public void t() {
        cu2.u.f303974a.l(this.f448468h);
    }

    @Override // qv2.b
    public void u() {
        this.f448468h.m59433x2b7e608b("mediaProcess");
    }
}
