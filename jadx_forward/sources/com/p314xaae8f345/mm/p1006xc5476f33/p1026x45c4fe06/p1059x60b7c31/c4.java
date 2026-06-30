package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public final class c4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f161688d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g4 f161689e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g4 g4Var) {
        super(1);
        this.f161688d = i17;
        this.f161689e = g4Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.FULL.JsApiBatchGetContact", "Loader(" + this.f161688d + ").onLoaded, list.size:" + list.size());
        this.f161689e.mo1850x58b836e(list);
        return jz5.f0.f384359a;
    }
}
