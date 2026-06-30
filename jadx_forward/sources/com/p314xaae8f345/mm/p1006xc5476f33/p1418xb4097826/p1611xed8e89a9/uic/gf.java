package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class gf extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14900x9bf524dd f205274d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14900x9bf524dd c14900x9bf524dd) {
        super(2);
        this.f205274d = c14900x9bf524dd;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String finderUsername = (java.lang.String) obj;
        r45.yz0 resp = (r45.yz0) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14900x9bf524dd c14900x9bf524dd = this.f205274d;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(finderUsername, c14900x9bf524dd.F7())) {
            java.util.LinkedList<r45.uz0> m75941xfb821914 = resp.m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getCourse_info(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
            for (r45.uz0 uz0Var : m75941xfb821914) {
                cu2.g0 g0Var = cu2.g0.f303937a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(uz0Var);
                arrayList.add(g0Var.d(uz0Var));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfileTabUIC", "checkCourseTab feedList size :" + arrayList.size() + '!');
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ff(arrayList, c14900x9bf524dd, resp));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfileTabUIC", "checkCourseTab targetUsername:" + c14900x9bf524dd.F7() + " but cgi's:" + finderUsername + '!');
        }
        return jz5.f0.f384359a;
    }
}
