package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5;

/* loaded from: classes10.dex */
public final class f1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f207580d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.s1 f207581e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.s1 s1Var) {
        super(1);
        this.f207580d = str;
        this.f207581e = s1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        zy2.dc it = (zy2.dc) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[checkContactExpired#result] talker=");
        java.lang.String str = this.f207580d;
        sb6.append(str);
        sb6.append(" nick=");
        sb6.append(((ya2.b2) it).w0());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ContactService", sb6.toString());
        this.f207581e.f207734i.remove(str);
        return jz5.f0.f384359a;
    }
}
