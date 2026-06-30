package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class lg extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15298x95ee76f1 f185458d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.a2 f185459e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qg f185460f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15298x95ee76f1 c15298x95ee76f1, so2.a2 a2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qg qgVar) {
        super(0);
        this.f185458d = c15298x95ee76f1;
        this.f185459e = a2Var;
        this.f185460f = qgVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        java.lang.Object obj;
        java.lang.String m75945x2fec8307;
        r45.f03 f03Var;
        so2.a2 a2Var = this.f185459e;
        r45.px2 px2Var = a2Var.f491783g.f491880c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15298x95ee76f1 c15298x95ee76f1 = this.f185458d;
        c15298x95ee76f1.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[show] show_reddot=");
        sb6.append(px2Var != null ? java.lang.Integer.valueOf(px2Var.m75939xb282bd08(0)) : null);
        sb6.append(", show_type=");
        sb6.append((px2Var == null || (f03Var = (r45.f03) px2Var.m75936x14adae67(1)) == null) ? null : java.lang.Integer.valueOf(f03Var.f455420d));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.HomeTabRedDotTipsBubbleView", sb6.toString());
        c15298x95ee76f1.f212679g = px2Var;
        if (c15298x95ee76f1.getVisibility() != 0) {
            c15298x95ee76f1.setVisibility(0);
            c15298x95ee76f1.setAlpha(0.0f);
            android.view.ViewPropertyAnimator animate = c15298x95ee76f1.animate();
            if (animate != null) {
                animate.cancel();
            }
            c15298x95ee76f1.animate().alpha(1.0f).setDuration(250L).setListener(null).start();
            lx2.d dVar = c15298x95ee76f1.f212676d;
            if (dVar != null) {
                dVar.f403589g = px2Var;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                r45.px2 px2Var2 = dVar.f403589g;
                r45.f03 f03Var2 = px2Var2 != null ? (r45.f03) px2Var2.m75936x14adae67(1) : null;
                java.lang.String str2 = "";
                if (f03Var2 == null || (str = f03Var2.f455422f) == null) {
                    str = "";
                }
                jSONObject.put("wording", str);
                r45.px2 px2Var3 = dVar.f403589g;
                if (px2Var3 != null && (m75945x2fec8307 = px2Var3.m75945x2fec8307(4)) != null) {
                    str2 = m75945x2fec8307;
                }
                jSONObject.put("tipsid", str2);
                r45.px2 px2Var4 = dVar.f403589g;
                jSONObject.put("feedid", pm0.v.u(px2Var4 != null ? px2Var4.m75942xfb822ef2(3) : 0L));
                jSONObject.put("view_id", dVar.e());
                r45.qt2 c17 = dVar.c();
                jSONObject.put("commentScene", c17 != null ? c17.m75939xb282bd08(5) : 0);
                if ((f03Var2 != null ? f03Var2.f455428o : null) != null && f03Var2.f455427n == 1) {
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19795xce8b809e c19795xce8b809e = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19795xce8b809e();
                    com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = f03Var2.f455428o;
                    c19795xce8b809e.mo11468x92b714fd(gVar != null ? gVar.g() : null);
                    java.lang.String m75945x2fec83072 = c19795xce8b809e.m75945x2fec8307(3);
                    if (m75945x2fec83072 == null || m75945x2fec83072.length() == 0) {
                        java.util.LinkedList m75941xfb821914 = c19795xce8b809e.m75941xfb821914(4);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getMulti_username(...)");
                        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
                        java.util.Iterator it = m75941xfb821914.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((java.lang.String) it.next()) + '|');
                        }
                        if (!arrayList.isEmpty()) {
                            java.util.ListIterator listIterator = arrayList.listIterator(arrayList.size());
                            while (listIterator.hasPrevious()) {
                                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b((java.lang.String) listIterator.previous(), "|")) {
                                    obj = kz5.n0.K0(arrayList, listIterator.nextIndex() + 1);
                                    break;
                                }
                            }
                        }
                        obj = kz5.p0.f395529d;
                        jSONObject.put("friendusername", obj);
                    } else {
                        jSONObject.put("friendusername", java.lang.String.valueOf(c19795xce8b809e.m75945x2fec8307(3)));
                    }
                }
                dVar.f403590h = jSONObject;
                dVar.f403592j = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
                r45.qt2 c18 = dVar.c();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.f206502a, c18, dVar.e(), 0, dVar.f403590h, false, null, 48, null);
                java.lang.Object mo141623x754a37bb = ((jz5.n) dVar.f403588f).mo141623x754a37bb();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
                ((cy1.a) ((dy1.r) mo141623x754a37bb)).yj("view_exp", null, dVar.g(c18 != null ? java.lang.Integer.valueOf(c18.m75939xb282bd08(5)) : null), 1, false);
            }
        }
        lx2.d dVar2 = c15298x95ee76f1.f212676d;
        if (dVar2 != null) {
            dVar2.j(c15298x95ee76f1.f212679g, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qg qgVar = this.f185460f;
        java.lang.Runnable runnable = qgVar.f185919n;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = qgVar.f185920o;
        if (runnable != null) {
            n3Var.mo50300x3fa464aa(runnable);
        }
        qgVar.f185919n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.kg(a2Var, qgVar);
        long m75939xb282bd08 = (a2Var.f491783g.f491880c != null ? r1.m75939xb282bd08(2) : 0L) * 1000;
        if (m75939xb282bd08 <= 0) {
            m75939xb282bd08 = 5000;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullMergedHeaderConvert", "[handleTabTipsBubble] delayMs=" + m75939xb282bd08);
        n3Var.mo50297x7c4d7ca2(qgVar.f185919n, m75939xb282bd08);
        return jz5.f0.f384359a;
    }
}
