package ms4;

/* loaded from: classes8.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ms4.t f412631d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19067xb53aa1de f412632e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ms4.t tVar, com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19067xb53aa1de activityC19067xb53aa1de) {
        super(1);
        this.f412631d = tVar;
        this.f412632e = activityC19067xb53aa1de;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.mw1 mw1Var;
        r45.v11 v11Var;
        java.util.LinkedList m75941xfb821914;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getIncomePageInfoRequest errorType: ");
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152148a) : null);
        sb6.append(", errorCode: ");
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152149b) : null);
        sb6.append(", errorMsg: ");
        sb6.append(fVar != null ? fVar.f152150c : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinIncomeDetailViewModel", sb6.toString());
        java.lang.Object[] objArr = fVar != null && fVar.f152148a == 0;
        ms4.t tVar = this.f412631d;
        if (objArr == true && fVar.f152149b == 0) {
            r45.j71 j71Var = (r45.j71) fVar.f152151d;
            if (j71Var == null || (m75941xfb821914 = j71Var.m75941xfb821914(1)) == null) {
                mw1Var = null;
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : m75941xfb821914) {
                    if ((((r45.mw1) obj2).m75939xb282bd08(0) == 4) != false) {
                        arrayList.add(obj2);
                    }
                }
                mw1Var = (r45.mw1) kz5.n0.Z(arrayList);
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("cgiBack item:");
            sb7.append(mw1Var);
            sb7.append(", pending_income_balance:");
            sb7.append((mw1Var == null || (v11Var = (r45.v11) mw1Var.m75936x14adae67(9)) == null) ? null : java.lang.Long.valueOf(v11Var.m75942xfb822ef2(2)));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinIncomeDetailViewModel", sb7.toString());
            r45.v11 v11Var2 = mw1Var != null ? (r45.v11) mw1Var.m75936x14adae67(9) : null;
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = fVar.f152151d;
            if (fVar2 == null || v11Var2 == null) {
                tVar.f412648m.mo7808x76db6cb1(new ms4.a(3, -1, "", null, 8, null));
                this.f412631d.Q6("", 9, 3, 3, "callback resp is null");
            } else {
                r45.j71 j71Var2 = (r45.j71) fVar2;
                os4.h.k("MicroMsg.WeCoinIncomeDetailViewModel", j71Var2);
                tVar.P6(j71Var2.m75933x41a8a7f2(5), v11Var2);
                r45.e8 e8Var = (r45.e8) j71Var2.m75936x14adae67(4);
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19067xb53aa1de activityC19067xb53aa1de = this.f412632e;
                activityC19067xb53aa1de.D = e8Var;
                activityC19067xb53aa1de.X6();
                tVar.Q6("", 9, 3, 0, "");
            }
        } else {
            p012xc85e97e9.p093xedfae76a.j0 j0Var = tVar.f412648m;
            int i17 = fVar != null ? fVar.f152148a : 0;
            int i18 = fVar != null ? fVar.f152149b : 0;
            java.lang.String str = fVar != null ? fVar.f152150c : null;
            j0Var.mo7808x76db6cb1(new ms4.a(i17, i18, str == null ? "" : str, null, 8, null));
            ms4.t tVar2 = this.f412631d;
            int i19 = fVar != null ? fVar.f152149b : 0;
            java.lang.String str2 = fVar != null ? fVar.f152150c : null;
            tVar2.Q6("", 9, 3, i19, str2 == null ? "" : str2);
        }
        return jz5.f0.f384359a;
    }
}
