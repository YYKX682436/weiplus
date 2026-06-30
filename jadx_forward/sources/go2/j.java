package go2;

/* loaded from: classes2.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go2.z f355520d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(go2.z zVar) {
        super(0);
        this.f355520d = zVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.h32 h32Var;
        int i17;
        r45.j32 j32Var;
        java.util.LinkedList m75941xfb821914;
        r45.j32 j32Var2;
        java.util.LinkedList m75941xfb8219142;
        r45.j32 j32Var3;
        java.util.LinkedList m75941xfb8219143;
        go2.z zVar = this.f355520d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2 l2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2) zVar.H.get(zVar.D);
        kk.l lVar = zVar.H;
        if (l2Var != null && (h32Var = l2Var.f205449e) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2 l2Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2) lVar.get(zVar.D);
            if (l2Var2 == null || (j32Var3 = l2Var2.f205456l) == null || (m75941xfb8219143 = j32Var3.m75941xfb821914(0)) == null) {
                i17 = -1;
            } else {
                i17 = -1;
                int i18 = 0;
                for (java.lang.Object obj : m75941xfb8219143) {
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(h32Var.m75945x2fec8307(4), ((r45.h32) obj).m75945x2fec8307(4))) {
                        i17 = i18;
                    }
                    i18 = i19;
                }
            }
            if (i17 != -1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2 l2Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2) lVar.get(zVar.D);
                if (l2Var3 != null && (j32Var2 = l2Var3.f205456l) != null && (m75941xfb8219142 = j32Var2.m75941xfb821914(0)) != null) {
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2 l2Var4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2) lVar.get(zVar.D);
                if (l2Var4 != null && (j32Var = l2Var4.f205456l) != null && (m75941xfb821914 = j32Var.m75941xfb821914(0)) != null) {
                    m75941xfb821914.add(i17, h32Var);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4 s4Var = zVar.C;
        if (s4Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("moreLiveListWidget");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2 l2Var5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2) lVar.get(zVar.D);
        zy2.ic.a(s4Var, l2Var5 != null ? l2Var5.f205456l : null, null, false, null, 0, 0, null, 126, null);
        return jz5.f0.f384359a;
    }
}
