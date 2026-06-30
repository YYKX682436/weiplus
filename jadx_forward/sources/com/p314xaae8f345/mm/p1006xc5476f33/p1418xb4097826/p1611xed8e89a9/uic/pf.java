package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class pf extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14900x9bf524dd f205663d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pf(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14900x9bf524dd c14900x9bf524dd) {
        super(2);
        this.f205663d = c14900x9bf524dd;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.util.ArrayList arrayList;
        java.lang.String finderUsername = (java.lang.String) obj;
        r45.go2 resp = (r45.go2) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14900x9bf524dd c14900x9bf524dd = this.f205663d;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(finderUsername, c14900x9bf524dd.F7())) {
            java.util.LinkedList<r45.do2> m75941xfb821914 = resp.m75941xfb821914(1);
            if (m75941xfb821914 != null) {
                arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
                for (r45.do2 do2Var : m75941xfb821914) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(do2Var);
                    arrayList.add(new nr2.m(do2Var));
                }
            } else {
                arrayList = null;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkPaidCollectionTab feedList size :");
            sb6.append(arrayList != null ? java.lang.Integer.valueOf(arrayList.size()) : null);
            sb6.append('!');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfileTabUIC", sb6.toString());
            if (arrayList != null && (arrayList.isEmpty() ^ true)) {
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.nf(c14900x9bf524dd, arrayList, resp));
            } else {
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.of(c14900x9bf524dd));
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfileTabUIC", "checkPaidCollectionTab targetUsername:" + c14900x9bf524dd.F7() + " but cgi's:" + finderUsername + '!');
        }
        return jz5.f0.f384359a;
    }
}
