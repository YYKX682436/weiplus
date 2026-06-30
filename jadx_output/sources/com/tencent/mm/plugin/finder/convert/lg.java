package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class lg extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderHomeTabRedDotTipsBubbleView f103925d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.a2 f103926e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qg f103927f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg(com.tencent.mm.plugin.finder.view.FinderHomeTabRedDotTipsBubbleView finderHomeTabRedDotTipsBubbleView, so2.a2 a2Var, com.tencent.mm.plugin.finder.convert.qg qgVar) {
        super(0);
        this.f103925d = finderHomeTabRedDotTipsBubbleView;
        this.f103926e = a2Var;
        this.f103927f = qgVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        java.lang.Object obj;
        java.lang.String string;
        r45.f03 f03Var;
        so2.a2 a2Var = this.f103926e;
        r45.px2 px2Var = a2Var.f410250g.f410347c;
        com.tencent.mm.plugin.finder.view.FinderHomeTabRedDotTipsBubbleView finderHomeTabRedDotTipsBubbleView = this.f103925d;
        finderHomeTabRedDotTipsBubbleView.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[show] show_reddot=");
        sb6.append(px2Var != null ? java.lang.Integer.valueOf(px2Var.getInteger(0)) : null);
        sb6.append(", show_type=");
        sb6.append((px2Var == null || (f03Var = (r45.f03) px2Var.getCustom(1)) == null) ? null : java.lang.Integer.valueOf(f03Var.f373887d));
        com.tencent.mars.xlog.Log.i("Finder.HomeTabRedDotTipsBubbleView", sb6.toString());
        finderHomeTabRedDotTipsBubbleView.f131146g = px2Var;
        if (finderHomeTabRedDotTipsBubbleView.getVisibility() != 0) {
            finderHomeTabRedDotTipsBubbleView.setVisibility(0);
            finderHomeTabRedDotTipsBubbleView.setAlpha(0.0f);
            android.view.ViewPropertyAnimator animate = finderHomeTabRedDotTipsBubbleView.animate();
            if (animate != null) {
                animate.cancel();
            }
            finderHomeTabRedDotTipsBubbleView.animate().alpha(1.0f).setDuration(250L).setListener(null).start();
            lx2.d dVar = finderHomeTabRedDotTipsBubbleView.f131143d;
            if (dVar != null) {
                dVar.f322056g = px2Var;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                r45.px2 px2Var2 = dVar.f322056g;
                r45.f03 f03Var2 = px2Var2 != null ? (r45.f03) px2Var2.getCustom(1) : null;
                java.lang.String str2 = "";
                if (f03Var2 == null || (str = f03Var2.f373889f) == null) {
                    str = "";
                }
                jSONObject.put("wording", str);
                r45.px2 px2Var3 = dVar.f322056g;
                if (px2Var3 != null && (string = px2Var3.getString(4)) != null) {
                    str2 = string;
                }
                jSONObject.put("tipsid", str2);
                r45.px2 px2Var4 = dVar.f322056g;
                jSONObject.put("feedid", pm0.v.u(px2Var4 != null ? px2Var4.getLong(3) : 0L));
                jSONObject.put("view_id", dVar.e());
                r45.qt2 c17 = dVar.c();
                jSONObject.put("commentScene", c17 != null ? c17.getInteger(5) : 0);
                if ((f03Var2 != null ? f03Var2.f373895o : null) != null && f03Var2.f373894n == 1) {
                    com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo finderTipsShowEntranceExtInfo = new com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo();
                    com.tencent.mm.protobuf.g gVar = f03Var2.f373895o;
                    finderTipsShowEntranceExtInfo.parseFrom(gVar != null ? gVar.g() : null);
                    java.lang.String string2 = finderTipsShowEntranceExtInfo.getString(3);
                    if (string2 == null || string2.length() == 0) {
                        java.util.LinkedList list = finderTipsShowEntranceExtInfo.getList(4);
                        kotlin.jvm.internal.o.f(list, "getMulti_username(...)");
                        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
                        java.util.Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((java.lang.String) it.next()) + '|');
                        }
                        if (!arrayList.isEmpty()) {
                            java.util.ListIterator listIterator = arrayList.listIterator(arrayList.size());
                            while (listIterator.hasPrevious()) {
                                if (!kotlin.jvm.internal.o.b((java.lang.String) listIterator.previous(), "|")) {
                                    obj = kz5.n0.K0(arrayList, listIterator.nextIndex() + 1);
                                    break;
                                }
                            }
                        }
                        obj = kz5.p0.f313996d;
                        jSONObject.put("friendusername", obj);
                    } else {
                        jSONObject.put("friendusername", java.lang.String.valueOf(finderTipsShowEntranceExtInfo.getString(3)));
                    }
                }
                dVar.f322057h = jSONObject;
                dVar.f322059j = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
                r45.qt2 c18 = dVar.c();
                com.tencent.mm.plugin.finder.report.b6.d(com.tencent.mm.plugin.finder.report.b6.f124969a, c18, dVar.e(), 0, dVar.f322057h, false, null, 48, null);
                java.lang.Object value = ((jz5.n) dVar.f322055f).getValue();
                kotlin.jvm.internal.o.f(value, "getValue(...)");
                ((cy1.a) ((dy1.r) value)).yj("view_exp", null, dVar.g(c18 != null ? java.lang.Integer.valueOf(c18.getInteger(5)) : null), 1, false);
            }
        }
        lx2.d dVar2 = finderHomeTabRedDotTipsBubbleView.f131143d;
        if (dVar2 != null) {
            dVar2.j(finderHomeTabRedDotTipsBubbleView.f131146g, null);
        }
        com.tencent.mm.plugin.finder.convert.qg qgVar = this.f103927f;
        java.lang.Runnable runnable = qgVar.f104386n;
        com.tencent.mm.sdk.platformtools.n3 n3Var = qgVar.f104387o;
        if (runnable != null) {
            n3Var.removeCallbacks(runnable);
        }
        qgVar.f104386n = new com.tencent.mm.plugin.finder.convert.kg(a2Var, qgVar);
        long integer = (a2Var.f410250g.f410347c != null ? r1.getInteger(2) : 0L) * 1000;
        if (integer <= 0) {
            integer = 5000;
        }
        com.tencent.mars.xlog.Log.i("Finder.FeedFullMergedHeaderConvert", "[handleTabTipsBubble] delayMs=" + integer);
        n3Var.postDelayed(qgVar.f104386n, integer);
        return jz5.f0.f302826a;
    }
}
