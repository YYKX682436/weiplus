package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public final class d4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f162268d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g4 f162269e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f162270f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162271g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g4 g4Var, java.lang.ref.WeakReference weakReference, java.lang.String str) {
        super(1);
        this.f162268d = i17;
        this.f162269e = g4Var;
        this.f162270f = weakReference;
        this.f162271g = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.FULL.JsApiBatchGetContact", "Loader(" + this.f162268d + ").onUpdated, list.size:" + list.size());
        if (!this.f162269e.mo1850x58b836e(list).booleanValue()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w3.f165235i.a((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) this.f162270f.get(), list, this.f162271g);
        }
        return jz5.f0.f384359a;
    }
}
