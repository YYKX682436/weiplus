package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5;

/* loaded from: classes10.dex */
public final class j1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.c6 f207618d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(zy2.c6 c6Var) {
        super(1);
        this.f207618d = c6Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        zy2.dc it = (zy2.dc) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getFinderMsgAliasContact] completed! result=");
        ya2.b2 b2Var = (ya2.b2) it;
        sb6.append(b2Var.D0());
        sb6.append('=');
        sb6.append(b2Var.w0());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ContactService", sb6.toString());
        zy2.c6 c6Var = this.f207618d;
        if (c6Var != null) {
            c6Var.a(it);
        }
        return jz5.f0.f384359a;
    }
}
