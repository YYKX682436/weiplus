package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class qi extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.oj f185929d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.oj ojVar) {
        super(0);
        this.f185929d = ojVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.oj ojVar = this.f185929d;
        ojVar.getClass();
        r45.mo2 mo2Var = new r45.mo2();
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            java.lang.String str = (java.lang.String) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.He.r();
            if (str == null) {
                str = "";
            }
            if (str.length() > 0) {
                byte[] bytes = str.getBytes(r26.c.f450398a);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                mo2Var.mo11468x92b714fd(bytes);
            }
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ojVar.f185719h, "FINDER_TL_CARD_NEED_SKIP_ENTER is " + mo2Var.m75939xb282bd08(0));
        return java.lang.Boolean.valueOf(mo2Var.m75939xb282bd08(0) == 1);
    }
}
