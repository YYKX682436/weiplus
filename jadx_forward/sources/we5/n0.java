package we5;

/* loaded from: classes9.dex */
public class n0 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.nn implements we5.b {
    @Override // we5.b
    public rd5.d b(we5.a params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        return new we5.p0(params);
    }

    @Override // we5.b
    public boolean c() {
        return true;
    }

    @Override // we5.b
    public void e(yb5.d ui6, rd5.d msgData, java.lang.String str, we5.y0 uiBlock) {
        java.lang.Object obj;
        boolean z17;
        boolean z18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiBlock, "uiBlock");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = msgData.f475787d.f526833b;
        this.f286468s = ui6;
        int h17 = i65.a.h(ui6.g(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia);
        uiBlock.d(new we5.d0(f9Var, msgData, ui6));
        uiBlock.d(new we5.e0(this, f9Var));
        java.lang.String b17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.bo.b(f9Var);
        if (j65.e.b() && j65.e.f()) {
            uiBlock.d(new we5.f0(f9Var, ui6));
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemTextTo", "[carl] text to, content is null! why?? localid : %s, svrid : %s", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), java.lang.Long.valueOf(f9Var.I0()));
        }
        boolean z19 = f9Var.G != null && (f9Var.r2() || f9Var.y2());
        uiBlock.d(new we5.g0(f9Var, ui6, str));
        boolean D = ui6.D();
        int a17 = k01.d.a(f9Var.Q0());
        android.os.Bundle a18 = (D ? com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.l1.f272786g : com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.l1.f272785f).a(a17);
        a18.putInt("key_wxa_short_link_launch_chat_type", a17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.t.f262519a.a(a18, f9Var);
        android.os.Bundle c17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.bo.c(f9Var, ui6, str);
        c17.putAll(a18);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        boolean z27 = !c01.ia.D(f9Var);
        boolean z28 = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.h2) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6.class))).Ai() && c01.ia.d(f9Var);
        if (z19) {
            obj = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0.class;
            z17 = z27;
            if (z19) {
                c17.putInt("geta8key_scene", 31);
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.app.Activity g17 = ui6.g();
                java.lang.String i17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.bo.i(ui6.g(), b17, f9Var);
                java.lang.String d07 = d0(f9Var);
                le0.r rVar = le0.x.P0;
                ((ke0.e) xVar).getClass();
                h0Var.f391656d = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.t(g17, i17, h17, 4, c17, d07, 0, rVar, z17, z28);
            }
            z18 = true;
        } else {
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            android.app.Activity g18 = ui6.g();
            java.lang.String d08 = d0(f9Var);
            le0.r rVar2 = le0.x.P0;
            ((ke0.e) xVar2).getClass();
            z17 = z27;
            h0Var.f391656d = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.t(g18, b17, h17, 4, c17, d08, 0, rVar2, z17, z28);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jk jkVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jk) ((sb5.u1) ui6.f542241c.a(sb5.u1.class));
            if (jkVar.m0(f9Var.m124847x74d37ac6())) {
                java.util.ArrayList arrayList = jkVar.f280833n;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrayList, "getHighlightKeywordList(...)");
                java.lang.CharSequence charSequence = (java.lang.CharSequence) h0Var.f391656d;
                p13.g gVar = p13.g.Background;
                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.c.f219557b;
                p13.i a19 = p13.i.a(charSequence, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList, " "), false, false);
                a19.f432630e = gVar;
                a19.f432631f = i18;
                uiBlock.d(new we5.h0(o13.q.e(a19)));
                z18 = false;
            } else {
                z18 = true;
            }
            android.text.SpannableString spannableString = (android.text.SpannableString) h0Var.f391656d;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0[] z0VarArr = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0[]) spannableString.getSpans(0, spannableString.length(), com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(z0VarArr);
            int length = z0VarArr.length;
            int i19 = 0;
            while (true) {
                if (i19 >= length) {
                    break;
                }
                if (z0VarArr[i19].m75731xfb85f7b0() == 44) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12809, 6, "");
                    break;
                }
                i19++;
            }
            obj = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0.class;
        }
        java.lang.Object obj2 = h0Var.f391656d;
        if (obj2 != null) {
            android.text.SpannableString spannableString2 = (android.text.SpannableString) obj2;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0[] z0VarArr2 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0[]) spannableString2.getSpans(0, spannableString2.length(), obj);
            uiBlock.d(we5.i0.f526876d);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(z0VarArr2);
            for (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0 z0Var : z0VarArr2) {
                int[] iArr = {((android.text.SpannableString) h0Var.f391656d).getSpanStart(z0Var), ((android.text.SpannableString) h0Var.f391656d).getSpanEnd(z0Var), com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.y(z0Var)};
                if (iArr[1] - iArr[0] < b17.length()) {
                    uiBlock.d(new we5.j0(iArr));
                }
            }
        }
        if (z18) {
            uiBlock.d(new we5.k0(ui6, f9Var, h0Var));
        }
        if (x63.g.G(f9Var)) {
            uiBlock.d(new we5.m0(ui6));
        } else {
            uiBlock.d(we5.w.f526927d);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        if (f9Var.r2() || f9Var.y2()) {
            h0Var2.f391656d = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(f9Var.Q0(), true);
        }
        uiBlock.d(new we5.x(f9Var, h0Var2, ui6));
        uiBlock.d(we5.y.f526934d);
        uiBlock.d(new we5.z(this, f9Var));
        uiBlock.d(new we5.a0(ui6, c01.ia.j(f9Var), h0Var, z17));
        uiBlock.d(new we5.b0(this, f9Var, c01.ia.A(f9Var), c01.ia.y(f9Var), c01.ia.x(f9Var)));
        uiBlock.d(new we5.c0(f9Var, ui6, this, msgData, c17));
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 tag, yb5.d ui6, rd5.d msgData, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        e(ui6, msgData, str, new we5.y0(new we5.u0((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ao) tag)));
    }
}
