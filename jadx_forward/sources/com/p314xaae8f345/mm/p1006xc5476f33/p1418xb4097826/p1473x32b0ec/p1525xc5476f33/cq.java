package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class cq extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f193722d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f193723e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f193724f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq f193725g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f193726h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f193727i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq(java.lang.String str, java.lang.String str2, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq dqVar, java.lang.String str3, java.lang.String str4) {
        super(0);
        this.f193722d = str;
        this.f193723e = str2;
        this.f193724f = i17;
        this.f193725g = dqVar;
        this.f193726h = str3;
        this.f193727i = str4;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        java.lang.String str2;
        r45.kv1 kv1Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateValidRewardMap: giftId:");
        java.lang.String str3 = this.f193722d;
        sb6.append(str3);
        sb6.append(", comboId:");
        java.lang.String str4 = this.f193723e;
        sb6.append(str4);
        sb6.append(", cnt:");
        int i17 = this.f193724f;
        sb6.append(i17);
        sb6.append(", previousCnt:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq dqVar = this.f193725g;
        sb6.append(((java.util.HashMap) dqVar.f193852J).get(str4 == null ? "" : str4));
        sb6.append(", comboIdStatus:");
        java.util.Map map = dqVar.K;
        sb6.append(((java.util.HashMap) map).get(str4 == null ? "" : str4));
        sb6.append(", songName: ");
        java.lang.String str5 = this.f193726h;
        sb6.append(str5);
        sb6.append(", uniqueAddId: ");
        java.lang.String str6 = this.f193727i;
        sb6.append(str6);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftSendPlugin", sb6.toString());
        java.util.Map map2 = dqVar.f193852J;
        java.lang.String str7 = str4 == null ? "" : str4;
        java.util.HashMap hashMap = (java.util.HashMap) map2;
        java.lang.Object obj = hashMap.get(str4 == null ? "" : str4);
        if (obj == null) {
            obj = 0;
        }
        hashMap.put(str7, java.lang.Integer.valueOf(((java.lang.Number) obj).intValue() + i17));
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((java.util.HashMap) map).get(str4 == null ? "" : str4), java.lang.Boolean.TRUE)) {
            java.lang.Integer num = (java.lang.Integer) ((java.util.HashMap) map2).get(str4 == null ? "" : str4);
            if ((num != null ? num.intValue() : 0) > 0) {
                java.lang.Integer num2 = (java.lang.Integer) ((java.util.HashMap) map2).get(str4 == null ? "" : str4);
                int intValue = num2 != null ? num2.intValue() : 0;
                if (dqVar.W) {
                    if (intValue > 0) {
                        if (!(str4 == null || str4.length() == 0)) {
                            r45.ch1 ch1Var = new r45.ch1();
                            r45.xn1 xn1Var = new r45.xn1();
                            zl2.r4 r4Var = zl2.r4.f555483a;
                            str = "";
                            xn1Var.set(0, r4Var.m0(dqVar.S0()));
                            xn1Var.set(11, ((mm2.c1) dqVar.P0(mm2.c1.class)).f410345h);
                            xn1Var.set(7, java.lang.Integer.valueOf(r4Var.g0()));
                            ch1Var.set(13, xn1Var);
                            ch1Var.set(1, 20013);
                            dk2.j5 j5Var = new dk2.j5(ch1Var);
                            j5Var.f315174d = true;
                            r45.yh1 yh1Var = new r45.yh1();
                            yh1Var.set(0, str3);
                            yh1Var.set(4, str4);
                            yh1Var.set(3, java.lang.Integer.valueOf(intValue));
                            ce2.i e17 = dk2.u7.f315714a.e(str3);
                            yh1Var.set(1, e17 != null ? e17.c1() : null);
                            if (str5 == null || str5.length() == 0) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftSendPlugin", "addSelfGiftToComment songName is empty,username:" + j5Var.a());
                            } else {
                                if (((mm2.m6) dqVar.P0(mm2.m6.class)).f410781p) {
                                    yh1Var.set(5, 2);
                                    r45.a32 a32Var = new r45.a32();
                                    a32Var.set(0, str5);
                                    if (str6 != null) {
                                        a32Var.set(2, str6);
                                    }
                                    yh1Var.set(6, hc2.b.a(a32Var));
                                } else {
                                    yh1Var.set(5, 1);
                                    r45.p92 p92Var = new r45.p92();
                                    p92Var.set(0, str5);
                                    if (str6 != null) {
                                        p92Var.set(2, str6);
                                    }
                                    yh1Var.set(6, hc2.b.a(p92Var));
                                }
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftSendPlugin", "addSelfGiftToComment songName: " + str5 + ", uniqueAddId: " + str6 + ", username:" + j5Var.a());
                            }
                            j5Var.f315173c = yh1Var;
                            ((mm2.x4) dqVar.P0(mm2.x4.class)).f411061f.add(j5Var);
                            ((mm2.j2) dqVar.P0(mm2.j2.class)).N6(j5Var);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftSendPlugin", "addSelfGiftToComment comboCount:" + intValue + ",comboId:" + str4 + ",username:" + j5Var.a());
                            no0.h.f420253a.a();
                            android.view.ViewGroup viewGroup = dqVar.f446856d;
                            android.content.Context context = viewGroup.getContext();
                            java.lang.Object[] objArr = new java.lang.Object[3];
                            objArr[0] = j5Var.k();
                            r45.yh1 yh1Var2 = j5Var.f315173c;
                            if (yh1Var2 == null || (kv1Var = (r45.kv1) yh1Var2.m75936x14adae67(1)) == null || (str2 = kv1Var.m75945x2fec8307(8)) == null) {
                                str2 = str;
                            }
                            objArr[1] = str2;
                            objArr[2] = java.lang.String.valueOf(intValue);
                            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d_w, objArr);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                            viewGroup.announceForAccessibility(string);
                        }
                    }
                    str = "";
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftSendPlugin", "addSelfGiftToComment comboCount:" + intValue + ",comboId:" + str4);
                } else {
                    str = "";
                }
                if (str4 == null) {
                    str4 = str;
                }
                ((java.util.HashMap) map2).put(str4, 0);
            }
        }
        return jz5.f0.f384359a;
    }
}
