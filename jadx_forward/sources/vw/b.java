package vw;

@j95.b
/* loaded from: classes9.dex */
public final class b extends i95.w implements rv.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f522123d = jz5.h.b(vw.a.f522115d);

    public void Ai(int i17, java.lang.String frameSetName, java.lang.String frameSetData) {
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b1 b17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetName, "frameSetName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetData, "frameSetData");
        if (yw.h1.f547865a.n() && (b17 = yw.q3.f547970a.b()) != null) {
            b17.c(i17, frameSetName, frameSetData);
        }
    }

    public java.util.List wi(int i17) {
        java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.mm.biz.q3> linkedList;
        if (!yw.h1.f547865a.n()) {
            return new java.util.LinkedList();
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b1 b17 = yw.q3.f547970a.b();
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.r3 b18 = b17 != null ? b17.b(i17) : null;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        if (b18 != null && (linkedList = b18.f300055d) != null) {
            for (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.q3 q3Var : linkedList) {
                long j17 = q3Var.f300019d;
                boolean[] zArr = q3Var.f300025m;
                java.lang.String str = zArr[2] ? q3Var.f300020e : "";
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getFrameSetName(...)");
                java.lang.String str2 = zArr[3] ? q3Var.f300021f : "";
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getFrameSetData(...)");
                int i18 = q3Var.f300022g;
                java.lang.String str3 = zArr[5] ? q3Var.f300023h : "";
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "getCardId(...)");
                linkedList2.add(new r01.l(j17, str, str2, i18, str3, q3Var.f300024i));
            }
        }
        return linkedList2;
    }
}
