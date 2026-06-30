package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class ab extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob f205065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f205066e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob obVar, ya2.b2 b2Var) {
        super(1);
        this.f205065d = obVar;
        this.f205066e = b2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String nickname = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickname, "nickname");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfileHeaderUIC", "jumpAtProfileUIOfAtContact nickname:".concat(nickname));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob obVar = this.f205065d;
        if (!obVar.B7()) {
            ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).uj(obVar.m80379x76847179(), nickname, this.f205066e.D0(), false, null, null);
        }
        return jz5.f0.f384359a;
    }
}
