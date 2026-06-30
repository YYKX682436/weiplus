package qt2;

/* loaded from: classes2.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qt2.m f448131d;

    public k(qt2.m mVar) {
        this.f448131d = mVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i17;
        int bl6;
        java.lang.String str;
        java.lang.String str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/share/FinderShareGuideEntranceUIC$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qt2.m mVar = this.f448131d;
        mVar.getClass();
        long j17 = c01.z1.j();
        if ((34359738368L & j17) != 0) {
            long j18 = j17 & (-34359738369L);
            gm0.j1.u().c().w(147457, java.lang.Long.valueOf(j18));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(mVar.f448120d, "openFinderEntrance extstatus:" + j18);
            r45.p53 p53Var = new r45.p53();
            p53Var.f464294d = 57;
            p53Var.f464295e = 1;
            ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209127a3).mo141623x754a37bb()).r()).intValue();
        if (intValue == 0) {
            i17 = 3;
            bl6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).bl(3);
            str = "KEY_FINDER_JUMP_FOLLOW_TAB";
        } else if (intValue != 2) {
            bl6 = 18;
            str = "KEY_FINDER_JUMP_FRIEND_TAB";
            i17 = 1;
        } else {
            bl6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).bl(4);
            str = "KEY_FINDER_JUMP_HOT_TAB";
            i17 = 4;
        }
        java.lang.String m158362x2fec8307 = mVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.cmp);
        pf5.u uVar = pf5.u.f435469a;
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) uVar.c(mVar.m158354x19263085()).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y3 y3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y3.f207005a;
        long c17 = c01.id.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m158362x2fec8307);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y3.a(y3Var, V6, 2, c17, 0, 2, m158362x2fec8307, 0, null, 128, null);
        mVar.m158354x19263085().finish();
        ((ey2.t0) uVar.e(c61.l7.class).a(ey2.t0.class)).N6(i17).a(ey2.q0.f339005e);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(str, true);
        intent.putExtra("KEY_FROM_SHARE_REL", true);
        intent.putExtra("KEY_TARGET_TAB_TYPE", 4);
        intent.putExtra("KEY_GUIDE_BAR_OBJ_ID", (java.io.Serializable) null);
        java.lang.String m75945x2fec8307 = V6.m75945x2fec8307(1);
        int parseInt = (m75945x2fec8307 == null || (str2 = (java.lang.String) r26.n0.e0(m75945x2fec8307, new char[]{'-'}, false, 0, 6, null).get(0)) == null) ? -1 : java.lang.Integer.parseInt(str2);
        if (parseInt > 0 && bl6 > 0) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(parseInt, 9, bl6, intent);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.f206926a.d();
        i95.m c18 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        c61.ub.L7((c61.ub) c18, mVar.m158354x19263085(), intent, 1, false, 8, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/share/FinderShareGuideEntranceUIC$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
