package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class e7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h7 f199764d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.t f199765e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h7 h7Var, bm2.t tVar) {
        super(3);
        this.f199764d = h7Var;
        this.f199765e = tVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean z17;
        android.view.View view = (android.view.View) obj;
        ((java.lang.Number) obj2).intValue();
        dk2.vg musicItem = (dk2.vg) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicItem, "musicItem");
        java.util.Iterator it = this.f199765e.f103831m.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            if (((dk2.vg) it.next()).f315791e) {
                z17 = true;
                break;
            }
        }
        this.f199764d.e0(z17);
        return jz5.f0.f384359a;
    }
}
