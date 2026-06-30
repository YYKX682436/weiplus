package tv2;

/* loaded from: classes2.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db2.p2 f503839d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ab4 f503840e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tv2.m f503841f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(db2.p2 p2Var, r45.ab4 ab4Var, tv2.m mVar) {
        super(1);
        this.f503839d = p2Var;
        this.f503840e = ab4Var;
        this.f503841f = mVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.q23 q23Var;
        java.lang.String str;
        java.lang.Object m143895xf1229813;
        r45.vx2 it = (r45.vx2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = it.m75934xbce7f2f(2);
        java.lang.String m75945x2fec8307 = it.m75945x2fec8307(1);
        db2.p2 p2Var = this.f503839d;
        p2Var.getClass();
        r45.ab4 createTemplateInfo = this.f503840e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(createTemplateInfo, "createTemplateInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LogPost.CgiFinderPost", "setEffectCreateData ecContext:" + m75934xbce7f2f + ", templateId:" + m75945x2fec8307);
        r45.hq2 hq2Var = p2Var.f309647w;
        hq2Var.set(38, m75934xbce7f2f);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 c19793xceab7f56 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56) hq2Var.m75936x14adae67(2);
        if (c19793xceab7f56 == null || (q23Var = c19793xceab7f56.m76980xaa7f977e()) == null) {
            q23Var = new r45.q23();
        }
        q23Var.f465118d = m75945x2fec8307;
        q23Var.f465119e = createTemplateInfo.m75939xb282bd08(6);
        q23Var.C = createTemplateInfo.m75945x2fec8307(4);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 c19793xceab7f562 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56) hq2Var.m75936x14adae67(2);
        if (c19793xceab7f562 != null) {
            c19793xceab7f562.m77018xe15630f2(q23Var);
        }
        java.lang.String m75945x2fec83072 = it.m75945x2fec8307(1);
        tv2.m mVar = this.f503841f;
        mVar.getClass();
        boolean z17 = m75945x2fec83072 == null || m75945x2fec83072.length() == 0;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = mVar.f503848h;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = c14994x9b99c079.f66946x284ddcb8;
            if (c19783xd9a946b7 == null || (str = c19783xd9a946b7.m76335x1cf886d6()) == null) {
                str = "";
            }
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                org.json.JSONObject jSONObject = str.length() > 0 ? new org.json.JSONObject(r26.i0.t(str, ";", ",", false)) : new org.json.JSONObject();
                jSONObject.put("child_effect_id", m75945x2fec83072);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b72 = c14994x9b99c079.f66946x284ddcb8;
                if (c19783xd9a946b72 != null) {
                    java.lang.String jSONObject2 = jSONObject.toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                    c19783xd9a946b72.m76442xb35dfa4a(r26.i0.t(jSONObject2, ",", ";", false));
                }
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
            if (m143898xd4a2fc34 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(mVar.f503850m, "updateTemplateChildIdInfo failed, localId:" + c14994x9b99c079.m59260x51f8f5b0() + ", childTemplateId:" + m75945x2fec83072 + ", reportTemplateInfoLength:" + str.length(), m143898xd4a2fc34);
            }
        }
        mVar.m(p2Var);
        java.lang.String m75945x2fec83073 = it.m75945x2fec8307(1);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5541xf0fa9cb c5541xf0fa9cb = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5541xf0fa9cb();
        am.ld ldVar = c5541xf0fa9cb.f135865g;
        ldVar.f88774a = m75945x2fec83073;
        ldVar.f88775b = 2;
        c5541xf0fa9cb.e();
        return f0Var;
    }
}
