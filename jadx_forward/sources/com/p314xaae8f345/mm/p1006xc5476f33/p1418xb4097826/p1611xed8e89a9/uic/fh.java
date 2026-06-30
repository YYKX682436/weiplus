package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class fh implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f205252d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14905x694027ca f205253e;

    public fh(com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14905x694027ca c14905x694027ca) {
        this.f205252d = c22848x6ddd90cf;
        this.f205253e = c14905x694027ca;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj = holder.f374658i;
        ms2.c cVar = obj instanceof ms2.c ? (ms2.c) obj : null;
        if (cVar == null) {
            return;
        }
        int a07 = i17 - this.f205252d.a0();
        if (a07 < 0) {
            a07 = 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14905x694027ca c14905x694027ca = this.f205253e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13908xe0c1a676 c13908xe0c1a676 = c14905x694027ca.f205016o;
        if (c13908xe0c1a676 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedLoader");
            throw null;
        }
        java.util.ArrayList m56387xe6796cde = c13908xe0c1a676.m56387xe6796cde();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = m56387xe6796cde.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (next instanceof ms2.c) {
                arrayList.add(next);
            }
        }
        r45.ig4 ig4Var = cVar.f412502d;
        r45.gg4 gg4Var = ig4Var.B;
        int i18 = gg4Var != null ? gg4Var.f456765r : 0;
        if (i18 == 0) {
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            android.app.Activity context = c14905x694027ca.m80379x76847179();
            bw5.lp0 a17 = ms2.d.a(ig4Var);
            bw5.ar0 ar0Var = bw5.ar0.TingScene_FinderProfileAudio;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                arrayList2.add(ms2.d.a(((ms2.c) it6.next()).f412502d));
            }
            r45.dg4 dg4Var = cVar.f412503e;
            bw5.o50 a18 = dg4Var != null ? ms2.a.a(dg4Var) : null;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            boolean z17 = !arrayList2.isEmpty();
            bw5.ar0 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.cd0.f208113a.b(context, ar0Var);
            boolean h17 = il4.l.f373675a.h(context);
            android.content.Intent intent = context.getIntent();
            java.lang.String stringExtra = intent != null ? intent.getStringExtra("finder_username") : null;
            il4.e eVar = new il4.e(null, z17 ? a07 : 0, b17.f106955d, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554417, null);
            il4.f fVar = eVar.f373655s;
            fVar.f373664c = h17;
            if (stringExtra != null) {
                fVar.f373665d.put("finderusername", stringExtra);
            }
            ((rk4.k8) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj()).A(context, true, a17, z17 ? arrayList2 : null, eVar, a18, null, b17, null);
            ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).Ri(a17, b17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k0.f206625a.a(context, "Ting");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleClickTingAudio audio_status ");
        r45.gg4 gg4Var2 = ig4Var.B;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(gg4Var2);
        sb6.append(gg4Var2.f456765r);
        sb6.append(" can not play");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTingProfileFragmentUIC", sb6.toString());
        if (i18 == 2) {
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = c14905x694027ca.m158358x197d1fc6();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14904xe030efb5 c14904xe030efb5 = m158358x197d1fc6 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14904xe030efb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14904xe030efb5) m158358x197d1fc6 : null;
            db2.e6 e6Var = c14904xe030efb5 != null ? c14904xe030efb5.f205011t : null;
            if (e6Var == null || !e6Var.K() || !c14905x694027ca.m58719xb9a8ab96() || !c14905x694027ca.m58720x17be6422()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderTingProfileFragmentUIC", "handleClickTingAudio can not post isSelf " + c14905x694027ca.m58719xb9a8ab96() + ", isSelfFlag " + c14905x694027ca.m58720x17be6422());
                return;
            }
            r45.sd1 O = e6Var.O();
            if (O != null) {
                r45.gg4 gg4Var3 = ig4Var.B;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gg4Var3 != null ? gg4Var3.f456754d : null)) {
                    r45.gg4 gg4Var4 = ig4Var.B;
                    c14905x694027ca.P6(O, gg4Var4 != null ? gg4Var4.f456754d : null);
                    return;
                }
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("handleClickTingAudio liteApp null(");
            sb7.append(O);
            sb7.append(" !=  null) or tid null (");
            r45.gg4 gg4Var5 = ig4Var.B;
            sb7.append(gg4Var5 != null ? gg4Var5.f456754d : null);
            sb7.append(')');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTingProfileFragmentUIC", sb7.toString());
        }
    }
}
