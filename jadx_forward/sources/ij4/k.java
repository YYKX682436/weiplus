package ij4;

/* loaded from: classes11.dex */
public final class k implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f373268d;

    public k(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f373268d = h0Var;
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        ai4.e eVar = (ai4.e) obj;
        ai4.e eVar2 = (ai4.e) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f373268d;
        if (r26.i0.q((java.lang.String) h0Var.f391656d, eVar.f86667a, false, 2, null)) {
            if (eVar.f86668b.size() <= 1) {
                return p3321xbce91901.jvm.p3324x21ffc6bd.o.i(((mj4.k) ((mj4.h) eVar2.f86668b.get(0))).f408600b.f76512x81959a6e, ((mj4.k) ((mj4.h) eVar.f86668b.get(0))).f408600b.f76512x81959a6e);
            }
            int i17 = ((mj4.k) ((mj4.h) eVar.f86668b.get(1))).f408600b.f76512x81959a6e;
            int i18 = ((mj4.k) ((mj4.h) eVar.f86668b.get(0))).f408600b.f76512x81959a6e;
            if (i17 < i18) {
                i17 = i18;
            }
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.i(((mj4.k) ((mj4.h) eVar2.f86668b.get(0))).f408600b.f76512x81959a6e, i17);
        }
        if (r26.i0.q((java.lang.String) h0Var.f391656d, eVar2.f86667a, false, 2, null) && eVar2.f86668b.size() > 1) {
            int i19 = ((mj4.k) ((mj4.h) eVar2.f86668b.get(1))).f408600b.f76512x81959a6e;
            int i27 = ((mj4.k) ((mj4.h) eVar2.f86668b.get(0))).f408600b.f76512x81959a6e;
            if (i19 < i27) {
                i19 = i27;
            }
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.i(i19, ((mj4.k) ((mj4.h) eVar.f86668b.get(0))).f408600b.f76512x81959a6e);
        }
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.i(((mj4.k) ((mj4.h) eVar2.f86668b.get(0))).f408600b.f76512x81959a6e, ((mj4.k) ((mj4.h) eVar.f86668b.get(0))).f408600b.f76512x81959a6e);
    }
}
