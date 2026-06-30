package sv2;

/* loaded from: classes10.dex */
public final class h extends qv2.e {

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 f494814v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f494815w;

    /* renamed from: x, reason: collision with root package name */
    public pv2.g f494816x;

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1646xce040e01.p1647x7817babe.p1648xafb425fd.C15153x14dd7b3d f494817y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderAdDraftUploadStage$draftModifyListener$1] */
    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 draftItem) {
        super(draftItem.t0(), "draft_" + draftItem.f66236x88be67a1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(draftItem, "draftItem");
        this.f494814v = draftItem;
        this.f494815w = "LogPost.FinderAdDraftUploadStage";
        this.f494816x = n();
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f494817y = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5463x73bc5a05>(a0Var) { // from class: com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderAdDraftUploadStage$draftModifyListener$1
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
                    sv2.h hVar = sv2.h.this;
                    if (zaVar != null && zaVar.f90082a == hVar.f494814v.f66236x88be67a1) {
                        java.lang.String str = hVar.f494815w;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("draftModifyListener cancel localId:");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 x80Var = hVar.f494814v;
                        sb6.append(x80Var.f66236x88be67a1);
                        sb6.append(", ");
                        sb6.append(x80Var.f66238x2327e25f);
                        sb6.append(" modifyType:");
                        sb6.append(zaVar != null ? java.lang.Integer.valueOf(zaVar.f90083b) : null);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
                        hVar.v();
                    }
                }
                return false;
            }
        };
    }

    @Override // qv2.e
    public void A(pv2.g gVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gVar, "<set-?>");
        this.f494816x = gVar;
    }

    @Override // qv2.e
    public void B() {
        this.f448471h.m59432x8c9240d6("doAdDraftUpload");
    }

    @Override // qv2.e
    public void E(java.lang.String str, dn.g gVar) {
        if (str == null || str.length() == 0) {
            return;
        }
        java.util.Map map = this.f448474n;
        if (!map.containsKey(str) || gVar == null) {
            return;
        }
        float f17 = (((float) gVar.f69496x83ec3dd) * 1.0f) / ((float) gVar.f69500x8ab84c59);
        java.lang.Float f18 = (java.lang.Float) ((java.util.LinkedHashMap) map).get(str);
        if (f17 > (f18 != null ? f18.floatValue() : 0.0f)) {
            map.put(str, java.lang.Float.valueOf(f17));
        }
        float H0 = kz5.n0.H0(((java.util.LinkedHashMap) map).values()) / map.size();
        int i17 = ((int) (45 * H0)) + 45;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feed ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f448471h;
        sb6.append(c14994x9b99c079.m59260x51f8f5b0());
        sb6.append(" updateProgress  ");
        sb6.append(H0);
        sb6.append(", ");
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f494815w, sb6.toString());
        if (c14994x9b99c079.m59277xa8f45ee4().m75939xb282bd08(4) < i17) {
            c14994x9b99c079.m59277xa8f45ee4().set(4, java.lang.Integer.valueOf(i17));
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f c5442xd807898f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f();
        long m59260x51f8f5b0 = c14994x9b99c079.m59260x51f8f5b0();
        am.ga gaVar = c5442xd807898f.f135783g;
        gaVar.f88282a = m59260x51f8f5b0;
        gaVar.f88283b = c14994x9b99c079.m59277xa8f45ee4().m75939xb282bd08(4);
        gaVar.f88284c = 4;
        c5442xd807898f.e();
    }

    @Override // qv2.e
    public pv2.g m() {
        return new sv2.c(this.f494814v, 3);
    }

    @Override // qv2.e
    public pv2.g n() {
        return new sv2.c(this.f494814v, 2);
    }

    @Override // qv2.e
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d o() {
        return this.f494817y;
    }

    @Override // qv2.e
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k5 p() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.f0.f206548a;
    }

    @Override // qv2.e
    public pv2.g q() {
        return new sv2.f(this.f494814v, this.f448479s);
    }

    @Override // qv2.e
    public pv2.g r() {
        return this.f494816x;
    }

    @Override // qv2.e
    public java.lang.String s() {
        return this.f494815w;
    }

    @Override // qv2.e
    public void y() {
    }
}
