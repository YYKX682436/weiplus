package sv2;

/* loaded from: classes10.dex */
public final class n extends qv2.b {

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 f494870m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f494871n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1646xce040e01.p1647x7817babe.p1648xafb425fd.C15155xaac31320 f494872o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftMediaProcessStageNew$draftModifyListener$1] */
    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 draftItem) {
        super(draftItem.t0(), "draft_" + draftItem.f66236x88be67a1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(draftItem, "draftItem");
        this.f494870m = draftItem;
        this.f494871n = "LogPost.FinderDraftMediaProcessStageNew";
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f494872o = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5463x73bc5a05>(a0Var) { // from class: com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftMediaProcessStageNew$draftModifyListener$1
            {
                this.f39173x3fe91575 = -881666027;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5463x73bc5a05 c5463x73bc5a05) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5463x73bc5a05 event = c5463x73bc5a05;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.za zaVar = event.f135802g;
                long j17 = zaVar.f90082a;
                if (j17 != 0) {
                    sv2.n nVar = sv2.n.this;
                    if (j17 == nVar.f494870m.f66236x88be67a1) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("canceled ");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 x80Var = nVar.f494870m;
                        sb6.append(x80Var.f66236x88be67a1);
                        sb6.append(", ");
                        sb6.append(x80Var.f66238x2327e25f);
                        sb6.append(", modifyType:");
                        sb6.append(java.lang.Integer.valueOf(zaVar.f90083b));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(nVar.f494871n, sb6.toString());
                        nVar.f448469i = true;
                        uv2.e.f512909a.c(nVar.f448468h.m59264x7efe73ec());
                        return true;
                    }
                }
                return false;
            }
        };
    }

    @Override // qv2.b
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d l() {
        return this.f494872o;
    }

    @Override // qv2.b
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k5 m() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.f0.f206548a;
    }

    @Override // qv2.b
    public long n() {
        return this.f494870m.f66236x88be67a1;
    }

    @Override // qv2.b
    public pv2.g o(boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 draftItem = this.f494870m;
        if (!z17) {
            return z18 ? new sv2.c(draftItem, 3) : new sv2.c(draftItem, 2);
        }
        uv2.i iVar = uv2.i.f512922a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(draftItem, "draftItem");
        return ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.B).mo141623x754a37bb()).r()).booleanValue() ? new sv2.w(draftItem) : new sv2.v(draftItem);
    }

    @Override // qv2.b
    public java.lang.String p() {
        return this.f494871n;
    }

    @Override // qv2.b
    public void t() {
        cu2.o.f303963a.b(this.f494870m);
    }

    @Override // qv2.b
    public void u() {
        this.f448468h.m59432x8c9240d6("mediaProcess");
    }
}
