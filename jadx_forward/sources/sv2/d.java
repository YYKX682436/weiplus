package sv2;

/* loaded from: classes10.dex */
public final class d extends qv2.b {

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 f494798m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f494799n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1646xce040e01.p1647x7817babe.p1648xafb425fd.C15152xbfb44c69 f494800o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderAdDraftMediaPocessStage$draftModifyListener$1] */
    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 draftItem) {
        super(draftItem.t0(), "draft_" + draftItem.f66236x88be67a1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(draftItem, "draftItem");
        this.f494798m = draftItem;
        this.f494799n = "LogPost.FinderAdDraftMediaPocessStage";
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f494800o = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5463x73bc5a05>(a0Var) { // from class: com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderAdDraftMediaPocessStage$draftModifyListener$1
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
                    sv2.d dVar = sv2.d.this;
                    if (j17 == dVar.f494798m.f66236x88be67a1) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("canceled ");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 x80Var = dVar.f494798m;
                        sb6.append(x80Var.f66236x88be67a1);
                        sb6.append(", ");
                        sb6.append(x80Var.f66238x2327e25f);
                        sb6.append(", modifyType:");
                        sb6.append(java.lang.Integer.valueOf(zaVar.f90083b));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(dVar.f494799n, sb6.toString());
                        dVar.f448469i = true;
                        uv2.e.f512909a.c(dVar.f448468h.m59264x7efe73ec());
                        return true;
                    }
                }
                return false;
            }
        };
    }

    @Override // qv2.b
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d l() {
        return this.f494800o;
    }

    @Override // qv2.b
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k5 m() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.f0.f206548a;
    }

    @Override // qv2.b
    public long n() {
        return this.f494798m.f66236x88be67a1;
    }

    @Override // qv2.b
    public pv2.g o(boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 x80Var = this.f494798m;
        return z17 ? new sv2.h(x80Var) : z18 ? new sv2.c(x80Var, 3) : new sv2.c(x80Var, 2);
    }

    @Override // qv2.b
    public java.lang.String p() {
        return this.f494799n;
    }

    @Override // qv2.b
    public void t() {
    }

    @Override // qv2.b
    public void u() {
        this.f448468h.m59432x8c9240d6("adDraftMediaProcess");
    }

    @Override // qv2.b
    public void v(float f17) {
        if (f17 > 1.0f) {
            f17 = 1.0f;
        }
        int i17 = (int) (45 * f17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feed ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 x80Var = this.f494798m;
        sb6.append(x80Var.f66236x88be67a1);
        sb6.append(" updateProgress  ");
        sb6.append(f17);
        sb6.append(", ");
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f494799n, sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f448468h;
        if (c14994x9b99c079.m59277xa8f45ee4().m75939xb282bd08(4) < i17) {
            c14994x9b99c079.m59277xa8f45ee4().set(4, java.lang.Integer.valueOf(i17));
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f c5442xd807898f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f();
        long j17 = x80Var.f66236x88be67a1;
        am.ga gaVar = c5442xd807898f.f135783g;
        gaVar.f88282a = j17;
        gaVar.f88283b = c14994x9b99c079.m59277xa8f45ee4().m75939xb282bd08(4);
        gaVar.f88284c = 4;
        c5442xd807898f.e();
    }
}
