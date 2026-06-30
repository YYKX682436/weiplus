package sv2;

/* loaded from: classes10.dex */
public final class w extends qv2.e {

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 f494903v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f494904w;

    /* renamed from: x, reason: collision with root package name */
    public pv2.g f494905x;

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1646xce040e01.p1647x7817babe.p1648xafb425fd.C15157x268958f6 f494906y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStageNew$draftModifyListener$1] */
    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 draftItem) {
        super(draftItem.t0(), "draft_" + draftItem.f66236x88be67a1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(draftItem, "draftItem");
        this.f494903v = draftItem;
        this.f494904w = "LogPost.FinderDraftUploadStageNew";
        this.f494905x = n();
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f494906y = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5463x73bc5a05>(a0Var) { // from class: com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftUploadStageNew$draftModifyListener$1
            {
                this.f39173x3fe91575 = -881666027;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5463x73bc5a05 c5463x73bc5a05) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5463x73bc5a05 event = c5463x73bc5a05;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.za zaVar = event.f135802g;
                if (!(zaVar != null && zaVar.f90082a == 0)) {
                    sv2.w wVar = sv2.w.this;
                    if (zaVar != null && zaVar.f90082a == wVar.f494903v.f66236x88be67a1) {
                        java.lang.String str = wVar.f494904w;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("draftModifyListener cancel localId:");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 x80Var = wVar.f494903v;
                        sb6.append(x80Var.f66236x88be67a1);
                        sb6.append(", ");
                        sb6.append(x80Var.f66238x2327e25f);
                        sb6.append(" modifyType:");
                        sb6.append(zaVar != null ? java.lang.Integer.valueOf(zaVar.f90083b) : null);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
                        wVar.v();
                    }
                }
                return false;
            }
        };
    }

    @Override // qv2.e
    public void A(pv2.g gVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gVar, "<set-?>");
        this.f494905x = gVar;
    }

    @Override // qv2.e
    public void B() {
        this.f448471h.m59432x8c9240d6("upload");
    }

    @Override // qv2.e
    public pv2.g m() {
        return new sv2.c(this.f494903v, 3);
    }

    @Override // qv2.e
    public pv2.g n() {
        return new sv2.c(this.f494903v, 2);
    }

    @Override // qv2.e
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d o() {
        return this.f494906y;
    }

    @Override // qv2.e
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k5 p() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.f0.f206548a;
    }

    @Override // qv2.e
    public pv2.g q() {
        return new sv2.q(this.f494903v, this.f448479s);
    }

    @Override // qv2.e
    public pv2.g r() {
        return this.f494905x;
    }

    @Override // qv2.e
    public java.lang.String s() {
        return this.f494904w;
    }

    @Override // qv2.e
    public void y() {
        cu2.o.f303963a.b(this.f494903v);
    }
}
