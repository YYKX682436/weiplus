package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes2.dex */
public final class y4 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d5 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activity, r45.qt2 contextObj) {
        super(activity, contextObj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        this.f206822p = false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d5, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r0, fc2.d
    public void G0(fc2.a event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        super.G0(event);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d5, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r0, fc2.d
    public void H0() {
        super.H0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderTemplateTwoFeedFlowReporter", "onRelease");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d5, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r0
    public void O0() {
        if (this.f206822p) {
            super.O0();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderTemplateTwoFeedFlowReporter", "onInvisible");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d5
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.f5 S0(fc2.y event, fc2.r data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        so2.j5 j5Var = data.f342510a;
        return j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? super.S0(event, data) : new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.f5(j5Var.mo2128x1ed62e84(), event.f342468b, data.f342510a);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d5
    public org.json.JSONObject T0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.f5 record) {
        java.lang.String m58743x6c03c64c;
        r45.rz6 rz6Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(record, "record");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        so2.j5 j5Var = record.f206559d;
        if (j5Var instanceof so2.d5) {
            try {
                jSONObject.put("page_type", "profile_mj_template");
                r45.r23 r23Var = (r45.r23) ((so2.d5) j5Var).f491847d.m75936x14adae67(23);
                java.lang.String str = (r23Var == null || (rz6Var = (r45.rz6) r23Var.m75936x14adae67(1)) == null) ? null : rz6Var.f466853d;
                java.lang.String str2 = "";
                if (str == null) {
                    str = "";
                }
                jSONObject.put("templateid", str);
                com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activity = this.f206816g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2 p2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2) pf5.z.f435481a.a(activity).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.class);
                if (p2Var != null && (m58743x6c03c64c = p2Var.m58743x6c03c64c()) != null) {
                    str2 = m58743x6c03c64c;
                }
                jSONObject.put("finderusername", str2);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderTemplateTwoFeedFlowReporter", e17.getMessage());
            }
        }
        return jSONObject;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d5
    public void U0(java.lang.String invokeSource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeSource, "invokeSource");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(invokeSource, "onRelease")) {
            return;
        }
        super.U0(invokeSource);
    }
}
