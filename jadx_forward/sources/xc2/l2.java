package xc2;

/* loaded from: classes2.dex */
public final class l2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f534733d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f534734e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(boolean z17, android.content.Context context) {
        super(4);
        this.f534733d = z17;
        this.f534734e = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = (com.p314xaae8f345.mm.p944x882e457a.m1) obj4;
        if (intValue == 0 && intValue2 == 0) {
            if (m1Var != 0 && m1Var.mo808xfb85f7b0() == 372) {
                ab0.v vVar = m1Var instanceof ab0.v ? (ab0.v) m1Var : null;
                r45.cx5 cx5Var = vVar != null ? ((l41.e0) vVar).f397336g : null;
                java.lang.String str = cx5Var != null ? cx5Var.f453433d : null;
                if (str == null) {
                    str = "";
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("jumpToWeComProfile username=");
                sb6.append(str);
                sb6.append(" nickname=");
                sb6.append(cx5Var != null ? cx5Var.f453434e : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.JumperUtils", sb6.toString());
                boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
                android.content.Context context = this.f534734e;
                if (K0) {
                    dp.a.m125853x26a183b(context, com.p314xaae8f345.mm.R.C30867xcad56011.icr, 0).show();
                } else {
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
                    android.content.Intent intent = new android.content.Intent();
                    qk.p.b(intent, cx5Var, 30);
                    if (n17 != null && !n17.r2()) {
                        intent.putExtra("Contact_IsLBSFriend", true);
                    }
                    boolean z17 = this.f534733d;
                    intent.putExtra("Contact_IsHalfScreen", z17);
                    if (z17) {
                        pf5.j0.a(intent, wm3.j.class);
                        pf5.j0.a(intent, wm3.l.class);
                        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                        pf5.z zVar = pf5.z.f435481a;
                        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ai.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ai aiVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ai) a17;
                        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 b17 = lk5.q0.b("com.tencent.mm.plugin.profile.ui.ContactInfoUI", intent, false, 4, null);
                        gx2.q R6 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ai.R6(aiVar, b17, null, null, 6, null);
                        if (R6 != null) {
                            R6.m132474x77f391b9(new xc2.j2(R6));
                        }
                        xc2.k2 k2Var = new xc2.k2(b17, aiVar);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                        p012xc85e97e9.p093xedfae76a.c1 a18 = zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ha.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "get(...)");
                        aiVar.O6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ha.P6((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ha) a18, 10, k2Var, null, 4, null));
                    } else {
                        j45.l.j(context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
