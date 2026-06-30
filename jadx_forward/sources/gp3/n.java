package gp3;

/* loaded from: classes9.dex */
public class n implements dp3.f {
    @Override // dp3.f
    public java.util.List a(android.content.Context context, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16774xbacd37e9 c16774xbacd37e9) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z18 = c16774xbacd37e9.f234316f == 2;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.E) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.F)) {
            gp3.p pVar = new gp3.p(context);
            pVar.P = c16774xbacd37e9.F;
            pVar.N = c16774xbacd37e9.E;
            pVar.M = new gp3.l(this, c16774xbacd37e9, context);
            arrayList.add(pVar);
            arrayList.add(new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21567x4b9b05ea(context, null));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FetchOrderPrefFactory", "getOrderPrefList() chargeFee is " + c16774xbacd37e9.V + " and fetchTotalFee is " + c16774xbacd37e9.f234336x1);
        boolean isEmpty = android.text.TextUtils.isEmpty(c16774xbacd37e9.V);
        int i17 = com.p314xaae8f345.mm.R.C30867xcad56011.ksb;
        if (isEmpty) {
            gp3.w wVar = new gp3.w(context);
            wVar.N = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.n(c16774xbacd37e9.f234327q, c16774xbacd37e9.B);
            if (z18) {
                i17 = com.p314xaae8f345.mm.R.C30867xcad56011.krx;
            }
            wVar.L(context.getString(i17));
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.f234328r)) {
                try {
                    wVar.M = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.b(c16774xbacd37e9.f234328r, true);
                } catch (java.lang.Exception unused) {
                    wVar.M = -1;
                }
            }
            arrayList.add(wVar);
            double d17 = c16774xbacd37e9.f234327q;
            double d18 = c16774xbacd37e9.f234313J;
            if (d17 == d18 || d18 <= 0.0d) {
                z17 = false;
            } else {
                gp3.v vVar = new gp3.v(context);
                vVar.M = false;
                vVar.N = true;
                arrayList.add(vVar);
                gp3.s sVar = new gp3.s(context);
                sVar.M(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.n(c16774xbacd37e9.f234313J, c16774xbacd37e9.B));
                sVar.J(com.p314xaae8f345.mm.R.C30867xcad56011.ksl);
                arrayList.add(sVar);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.I)) {
                    gp3.u uVar = new gp3.u(context);
                    uVar.J(com.p314xaae8f345.mm.R.C30867xcad56011.ks7);
                    uVar.M = rVar;
                    java.lang.String[] split = c16774xbacd37e9.I.split("\n");
                    if (split.length == 1) {
                        uVar.N = split[0];
                    } else {
                        uVar.N = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ks9, java.lang.Integer.valueOf(split.length), com.p314xaae8f345.mm.p2802xd031a825.ui.r1.n(c16774xbacd37e9.f234313J - c16774xbacd37e9.f234327q, c16774xbacd37e9.B));
                        android.text.TextUtils.TruncateAt truncateAt = android.text.TextUtils.TruncateAt.MIDDLE;
                        uVar.P = split;
                        uVar.Q = truncateAt;
                        uVar.R = true;
                    }
                    arrayList.add(uVar);
                }
                z17 = true;
            }
            gp3.v vVar2 = new gp3.v(context);
            vVar2.M = z17;
            vVar2.N = true;
            arrayList.add(vVar2);
        } else {
            gp3.w wVar2 = new gp3.w(context);
            wVar2.N = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.n(c16774xbacd37e9.f234336x1, c16774xbacd37e9.B);
            wVar2.L(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kry));
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.f234339y1)) {
                try {
                    wVar2.M = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.b(c16774xbacd37e9.f234339y1, true);
                } catch (java.lang.Exception unused2) {
                    wVar2.M = -1;
                }
            }
            arrayList.add(wVar2);
            gp3.v vVar3 = new gp3.v(context);
            vVar3.M = false;
            vVar3.N = true;
            arrayList.add(vVar3);
            gp3.s sVar2 = new gp3.s(context);
            sVar2.J(com.p314xaae8f345.mm.R.C30867xcad56011.ksb);
            sVar2.M(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.n(c16774xbacd37e9.f234327q, c16774xbacd37e9.B));
            arrayList.add(sVar2);
            gp3.s sVar3 = new gp3.s(context);
            sVar3.J(com.p314xaae8f345.mm.R.C30867xcad56011.krz);
            sVar3.M(c16774xbacd37e9.V);
            arrayList.add(sVar3);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.f234322n)) {
            if (z18) {
                gp3.s sVar4 = new gp3.s(context);
                sVar4.J(com.p314xaae8f345.mm.R.C30867xcad56011.ksh);
                sVar4.M(c16774xbacd37e9.f234322n);
                arrayList.add(sVar4);
            } else {
                gp3.s sVar5 = new gp3.s(context);
                sVar5.J(com.p314xaae8f345.mm.R.C30867xcad56011.f575108ks5);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.f234323o)) {
                    sVar5.M(c16774xbacd37e9.f234322n);
                } else {
                    java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575103ks0);
                    java.lang.String str = c16774xbacd37e9.f234322n + " " + string;
                    int length = c16774xbacd37e9.f234322n.length() + 1;
                    int length2 = c16774xbacd37e9.f234322n.length() + 1 + string.length();
                    gp3.m mVar = new gp3.m(this, c16774xbacd37e9, sVar5, rVar);
                    sVar5.M = str;
                    sVar5.P = true;
                    sVar5.Q = length;
                    sVar5.R = length2;
                    sVar5.S = mVar;
                }
                arrayList.add(sVar5);
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.f234321m)) {
            gp3.s sVar6 = new gp3.s(context);
            sVar6.J(com.p314xaae8f345.mm.R.C30867xcad56011.ksk);
            sVar6.M(c16774xbacd37e9.f234321m);
            arrayList.add(sVar6);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.f234330t)) {
            gp3.s sVar7 = new gp3.s(context);
            sVar7.J(com.p314xaae8f345.mm.R.C30867xcad56011.f575109kt0);
            sVar7.M(c16774xbacd37e9.f234330t);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.f234331u)) {
                try {
                    sVar7.N = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.b(c16774xbacd37e9.f234331u, true);
                } catch (java.lang.Exception unused3) {
                    sVar7.N = Integer.MAX_VALUE;
                }
            }
            arrayList.add(sVar7);
        }
        gp3.s sVar8 = new gp3.s(context);
        sVar8.J(com.p314xaae8f345.mm.R.C30867xcad56011.kse);
        sVar8.M(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.p(c16774xbacd37e9.f234332v));
        arrayList.add(sVar8);
        if (c16774xbacd37e9.R > 0) {
            gp3.s sVar9 = new gp3.s(context);
            sVar9.J(com.p314xaae8f345.mm.R.C30867xcad56011.ksc);
            sVar9.M(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.p(c16774xbacd37e9.R));
            arrayList.add(sVar9);
        } else if (c16774xbacd37e9.Q > 0) {
            gp3.s sVar10 = new gp3.s(context);
            sVar10.J(com.p314xaae8f345.mm.R.C30867xcad56011.ksf);
            sVar10.M(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.p(c16774xbacd37e9.Q));
            arrayList.add(sVar10);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FetchOrderPrefFactory", "hy: is fetch but no arrive time or fetch time");
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.f234340z)) {
            gp3.s sVar11 = new gp3.s(context);
            sVar11.J(com.p314xaae8f345.mm.R.C30867xcad56011.ksd);
            java.lang.String str2 = c16774xbacd37e9.f234340z;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.A)) {
                str2 = str2 + "(" + c16774xbacd37e9.A + ")";
            }
            sVar11.M(str2);
            arrayList.add(sVar11);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.f234337y)) {
            gp3.s sVar12 = new gp3.s(context);
            sVar12.J(com.p314xaae8f345.mm.R.C30867xcad56011.ksg);
            sVar12.M(c16774xbacd37e9.f234337y);
            arrayList.add(sVar12);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.N) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.C) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16774xbacd37e9.D)) {
            gp3.v vVar4 = new gp3.v(context);
            vVar4.M = true;
            vVar4.P = false;
            arrayList.add(vVar4);
        } else {
            gp3.v vVar5 = new gp3.v(context);
            vVar5.M = true;
            arrayList.add(vVar5);
            arrayList.add(dp3.g.a(context, c16774xbacd37e9));
        }
        return arrayList;
    }
}
