package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class v1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 f233017d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 c16668xffb9dd68) {
        super(1);
        this.f233017d = c16668xffb9dd68;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f it = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 c16668xffb9dd68 = this.f233017d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c16668xffb9dd68.f232507d, "ret delete mv finished");
        int i17 = c16668xffb9dd68.f232515o;
        java.util.ArrayList arrayList = c16668xffb9dd68.f232510g;
        if (i17 < arrayList.size()) {
            fm3.u mv6 = ((lm3.e) arrayList.get(c16668xffb9dd68.f232515o)).f401015d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mv6, "mv");
            mv6.f345671r = true;
            mv6.f345663j = null;
            mv6.f345662i = null;
            for (r45.jf2 jf2Var : mv6.f345660g) {
                jf2Var.set(3, "");
                jf2Var.set(2, 0L);
                jf2Var.set(5, 0);
                jf2Var.set(6, 0);
            }
            mv6.f345664k = 0;
            mv6.f345665l = 0;
            mv6.f345666m = 0;
            mv6.f345667n = false;
            mv6.f345670q = null;
            mv6.f345673t = null;
            mv6.f345674u.clear();
            ((lm3.e) arrayList.get(c16668xffb9dd68.f232515o)).f401015d.f345671r = true;
            kl3.t.g().a().c(0);
            c16668xffb9dd68.T6().m8152xc67946d3(c16668xffb9dd68.f232515o, 1, "NetSceneDeleteFinderObject");
        }
        return jz5.f0.f384359a;
    }
}
