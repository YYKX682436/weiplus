package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public class wr extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final r45.qt2 f186431e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f186432f;

    public wr(r45.qt2 qt2Var, int i17, java.util.List list) {
        this.f186431e = qt2Var;
        this.f186432f = list;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b4m;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        so2.j item = (so2.j) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.kiz);
        if (linearLayout.getTag() == null) {
            linearLayout.setTag(java.lang.Integer.valueOf(i17));
        }
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        java.util.LinkedList linkedList;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var3 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var3.f391656d = "";
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        boolean z17 = true;
        f0Var.f391649d = 1;
        java.util.List list = this.f186432f;
        if (list == null || list.isEmpty()) {
            gVar = null;
            linkedList = null;
        } else {
            r45.ww2 ww2Var = (r45.ww2) list.get(0);
            java.lang.String m75945x2fec8307 = ww2Var.m75945x2fec8307(1);
            h0Var3.f391656d = m75945x2fec8307 != null ? m75945x2fec8307 : "";
            h0Var2.f391656d = ww2Var.m75941xfb821914(4);
            java.util.LinkedList m75941xfb821914 = ww2Var.m75941xfb821914(5);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = ww2Var.m75934xbce7f2f(6);
            java.util.List list2 = (java.util.List) h0Var2.f391656d;
            if ((list2 == null || list2.isEmpty()) ? false : true) {
                f0Var.f391649d = 3;
            }
            linkedList = m75941xfb821914;
            gVar = m75934xbce7f2f;
        }
        java.lang.CharSequence charSequence = (java.lang.CharSequence) h0Var3.f391656d;
        if (charSequence == null || charSequence.length() == 0) {
            java.lang.String string = recyclerView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cuy);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            h0Var3.f391656d = string;
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.kiz);
        android.widget.TextView textView = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f567723kj1);
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        textView.setText((java.lang.CharSequence) h0Var3.f391656d);
        java.lang.Object tag = linearLayout.getTag();
        java.lang.String str = (java.lang.String) h0Var3.f391656d;
        java.util.List list3 = (java.util.List) h0Var2.f391656d;
        if (list3 != null && !list3.isEmpty()) {
            z17 = false;
        }
        if (z17) {
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.kiy)).setVisibility(0);
        }
        if (list3 == null || linkedList == null) {
            h0Var = h0Var3;
        } else {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f567722kj0);
            c1163xf1deaba4.setVisibility(0);
            c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(recyclerView.getContext(), 0, false));
            int dimensionPixelSize = recyclerView.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
            int dimensionPixelSize2 = recyclerView.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
            android.content.Context context = recyclerView.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            h0Var = h0Var3;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qr qrVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qr(this, context, dimensionPixelSize, dimensionPixelSize2, tag, str, gVar);
            c1163xf1deaba4.mo7960x6cab2c8d(qrVar);
            c1163xf1deaba4.N(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.rr(this, dimensionPixelSize, dimensionPixelSize2));
            java.util.ArrayList arrayList = (java.util.ArrayList) qrVar.f185954h;
            arrayList.clear();
            arrayList.addAll(list3);
            java.util.ArrayList arrayList2 = (java.util.ArrayList) qrVar.f185955i;
            arrayList2.clear();
            arrayList2.addAll(linkedList);
            qrVar.m8146xced61ae5();
        }
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var4 = h0Var;
        ym5.a1.h(itemView, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ur(this, linearLayout, h0Var2, f0Var, h0Var4));
        linearLayout.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.vr(this, f0Var, recyclerView, linearLayout, h0Var4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void n(int i17, int i18, android.content.Context context, java.lang.Object obj, java.lang.String wording, java.lang.String feedIds) {
        int bl6;
        java.lang.String str;
        java.lang.String str2;
        int i19;
        ?? r37;
        int i27;
        java.lang.String m75945x2fec8307;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wording, "wording");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedIds, "feedIds");
        n30.r rVar = (n30.r) i95.n0.c(n30.r.class);
        r45.qt2 qt2Var = this.f186431e;
        java.lang.String str3 = null;
        ((m30.m) rVar).Bi(qt2Var != null ? qt2Var.m75945x2fec8307(1) : null);
        long j17 = c01.z1.j();
        if ((34359738368L & j17) != 0) {
            long j18 = j17 & (-34359738369L);
            gm0.j1.u().c().w(147457, java.lang.Long.valueOf(j18));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderOpenEntranceTipConvert", "openFinderEntrance extstatus:" + j18);
            r45.p53 p53Var = new r45.p53();
            p53Var.f464294d = 57;
            p53Var.f464295e = 1;
            ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
        }
        int intValue = (obj == null || !(obj instanceof java.lang.Integer)) ? -1 : ((java.lang.Number) obj).intValue();
        if (i17 == 0) {
            bl6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).bl(3);
            str = "KEY_FINDER_JUMP_FOLLOW_TAB";
        } else if (i17 != 2) {
            bl6 = 18;
            str = "KEY_FINDER_JUMP_FRIEND_TAB";
        } else {
            bl6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).bl(4);
            str = "KEY_FINDER_JUMP_HOT_TAB";
        }
        java.lang.String str4 = str;
        if (intValue > 0) {
            str2 = str4;
            i19 = 2;
            r37 = 0;
            i27 = 1;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y3.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y3.f207005a, this.f186431e, 2, c01.id.c(), intValue, i18, wording, null, feedIds, 64, null);
        } else {
            str2 = str4;
            i19 = 2;
            r37 = 0;
            i27 = 1;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15185, 11, java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i19));
        if (context instanceof android.app.Activity) {
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.g1 g1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.g1) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.g1.class);
            if (g1Var != null) {
                g1Var.f215989e = r37;
            }
            ku5.u0 u0Var = ku5.t0.f394148d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.tr trVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.tr(context);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(trVar, 280L, r37);
        }
        android.content.Intent intent = new android.content.Intent();
        int i28 = i27;
        intent.putExtra(str2, (boolean) i28);
        intent.putExtra("KEY_FROM_SHARE_REL", (boolean) i28);
        intent.putExtra("key_auto_trigger_type", 3);
        r45.qt2 qt2Var2 = this.f186431e;
        if (qt2Var2 != null && (m75945x2fec8307 = qt2Var2.m75945x2fec8307(i28)) != null) {
            char[] cArr = new char[i28];
            cArr[r37] = '-';
            str3 = (java.lang.String) r26.n0.e0(m75945x2fec8307, cArr, false, 0, 6, null).get(r37);
        }
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str3, -1);
        if (P > 0 && bl6 > 0) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(P, 9, bl6, intent);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.f206926a.d();
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c61.ub.L7((c61.ub) c17, context, intent, 1, false, 8, null);
    }
}
