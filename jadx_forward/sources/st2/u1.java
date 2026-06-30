package st2;

/* loaded from: classes3.dex */
public final class u1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f493996a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ st2.v1 f493997b;

    public u1(boolean z17, st2.v1 v1Var) {
        this.f493996a = z17;
        this.f493997b = v1Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x22587864;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        boolean z17 = fVar != null && fVar.f152148a == 0;
        boolean z18 = this.f493996a;
        st2.v1 v1Var = this.f493997b;
        if (!z17 || fVar.f152149b != 0) {
            if (!z18 && (c22851x22587864 = v1Var.f494017d) != null) {
                c22851x22587864.e(false);
            }
            java.lang.String str = v1Var.f494015b;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("get pairingTab failed, errType = ");
            sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152148a) : null);
            sb6.append(", errCode = ");
            sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152149b) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, sb6.toString());
            return jz5.f0.f384359a;
        }
        r45.xt1 xt1Var = (r45.xt1) ke2.o0.f388509v.a(fVar, new r45.xt1());
        if (xt1Var == null) {
            return null;
        }
        v1Var.f494018e = xt1Var.m75933x41a8a7f2(0);
        v1Var.f494019f = xt1Var.m75945x2fec8307(1);
        tt2.i1 i1Var = v1Var.f494020g;
        if (z18) {
            java.util.LinkedList m75941xfb821914 = xt1Var.m75941xfb821914(2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getPairings(...)");
            i1Var.getClass();
            java.util.ArrayList arrayList = (java.util.ArrayList) i1Var.f503472h;
            arrayList.clear();
            arrayList.addAll(m75941xfb821914);
            i1Var.m8146xced61ae5();
        } else {
            java.util.LinkedList m75941xfb8219142 = xt1Var.m75941xfb821914(2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getPairings(...)");
            i1Var.getClass();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) i1Var.f503472h;
            int size = arrayList2.size();
            arrayList2.addAll(m75941xfb8219142);
            i1Var.m8153xd399a4d9(size, m75941xfb8219142.size());
        }
        boolean z19 = v1Var.f494018e;
        com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x225878642 = v1Var.f494017d;
        if (z19) {
            if (c22851x225878642 == null) {
                return null;
            }
            c22851x225878642.e(true);
        } else {
            if (c22851x225878642 == null) {
                return null;
            }
            c22851x225878642.f();
        }
        return c22851x225878642;
    }
}
