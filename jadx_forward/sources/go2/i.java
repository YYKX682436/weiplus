package go2;

/* loaded from: classes2.dex */
public final class i implements zy2.hc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4 f355517a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ go2.z f355518b;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4 s4Var, go2.z zVar) {
        this.f355517a = s4Var;
        this.f355518b = zVar;
    }

    @Override // zy2.hc
    public void a(java.util.List noticeList, int i17, r45.c32 c32Var, boolean z17) {
        java.lang.String str;
        r45.j32 j32Var;
        r45.h32 h32Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2 l2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(noticeList, "noticeList");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4 s4Var = this.f355517a;
        kk.l lVar = s4Var.f206287h;
        go2.z zVar = this.f355518b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2 l2Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2) lVar.get(zVar.D);
        kk.l lVar2 = s4Var.f206287h;
        if (l2Var2 != null && (h32Var = l2Var2.f205449e) != null) {
            java.util.Iterator it = noticeList.iterator();
            while (it.hasNext()) {
                r45.h32 h32Var2 = (r45.h32) it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(h32Var.m75945x2fec8307(4), h32Var2.m75945x2fec8307(4)) && (l2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2) lVar2.get(zVar.D)) != null) {
                    l2Var.f205449e = h32Var2;
                }
            }
        }
        r45.tr0 tr0Var = (r45.tr0) zVar.f534252d;
        boolean z18 = tr0Var != null && tr0Var.f468259g == 2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1 s1Var = zVar.B;
        if (s1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerLiveWidget");
            throw null;
        }
        java.lang.String str2 = zVar.D;
        ya2.b2 b17 = ya2.h.f542017a.b(str2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2 l2Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2) lVar2.get(zVar.D);
        if (l2Var3 == null || (j32Var = l2Var3.f205456l) == null || (str = j32Var.m75945x2fec8307(5)) == null) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = zVar.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            str = ((go2.c0) pf5.z.f435481a.a(activity).a(go2.c0.class)).f355492z;
        }
        java.lang.String str3 = str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
        s1Var.a("moreLiveListWidget-onDismiss", str2, false, z18, z18, b17, str3);
        android.view.View view = zVar.f355632v;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("curLiveLayout");
            throw null;
        }
        if (view.getVisibility() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1 s1Var2 = zVar.B;
            if (s1Var2 != null) {
                s1Var2.j(zVar.D);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerLiveWidget");
                throw null;
            }
        }
    }
}
