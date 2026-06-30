package r35;

@j95.b
/* loaded from: classes9.dex */
public class k1 extends i95.w implements o25.q1 {
    public void Ai(com.p314xaae8f345.mm.ui.ga gaVar, java.lang.String str, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j jVar) {
        r35.i1 i1Var = new r35.i1(gaVar.x());
        i1Var.l(str);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = i1Var.f450668b.f293354b;
        aVar.A = true;
        aVar.B = true;
        i1Var.i(str2);
        i1Var.g(java.lang.Boolean.FALSE);
        i1Var.f450670d = str3;
        i1Var.a(jVar);
        i1Var.k();
    }

    public void Bi(android.content.Context context, final java.lang.String str, byte[] bArr, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j jVar, int i17, final long j17, byte[] bArr2, final o25.p1 p1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.ConfirmDialogSerirvce", "showEmojiTransmitDialogForTagSearch");
        r45.lw5 lw5Var = new r45.lw5();
        try {
            lw5Var.mo11468x92b714fd(bArr);
        } catch (java.lang.Exception unused) {
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.h2) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6.class))).getClass();
        java.lang.String p17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.p(n22.m.g(), "", lw5Var.f461422d);
        if (bArr2 != null) {
            com.p314xaae8f345.mm.vfs.w6.S(p17, bArr2, 0, bArr2.length);
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 u17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().u1(lw5Var.f461422d);
        if (u17 == null) {
            u17 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4();
            u17.f68671x4b6e68b9 = lw5Var.f461422d;
            u17.f68653x95b20dd4 = 65;
            u17.f68689x2262335f = com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.c(p17) ? 2 : 1;
            u17.f68663x861009b5 = lw5Var.f461424f;
            u17.f68679x22618426 = (int) com.p314xaae8f345.mm.vfs.w6.k(p17);
            u17.f68685x2261e7f9 = 1;
            u17.f68641x3342accf = lw5Var.f461427i;
            u17.f68657xb76d85ab = lw5Var.f461426h;
            u17.f68686x7b284d5e = lw5Var.f461425g;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(lw5Var.f461434s)) {
                u17.f68654xf47770e7 = lw5Var.f461433r;
            } else {
                u17.f68659x5efe714f = lw5Var.f461433r;
                u17.f68642xf11e6e15 = lw5Var.f461434s;
            }
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().J0(u17);
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(u17.f68663x861009b5) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(lw5Var.f461424f)) {
            u17.f68663x861009b5 = lw5Var.f461424f;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().G2(u17);
        }
        if (i17 == 0) {
            u17.K2 = qk.z6.SEND_FROM_SCENE_LONG_PRESS_SEARCH;
        } else {
            u17.K2 = qk.z6.SEND_FROM_SCENE_SEARCH;
        }
        if (bArr2 == null) {
            final com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = u17;
            zq.h.f556505a.e(u17, new dr.q() { // from class: r35.k1$$a
                @Override // dr.q
                public final void a(boolean z17) {
                    final com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f42 = c21053xdbf1e5f4;
                    final java.lang.String str2 = str;
                    final long j18 = j17;
                    final o25.p1 p1Var2 = o25.p1.this;
                    if (p1Var2 != null) {
                        new qr.x(c21053xdbf1e5f42, new qr.i() { // from class: r35.k1$$b
                            @Override // qr.i
                            /* renamed from: onResult */
                            public final void mo44657x57429edc(int i18, java.lang.String str3) {
                                o25.p1.this.a(str2, c21053xdbf1e5f42, i18 == 0, j18);
                            }
                        });
                    } else if (z17) {
                        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).Ni().Y(str2, c21053xdbf1e5f42, null, null, c21053xdbf1e5f42.K2.ordinal());
                    }
                }
            });
        } else if (p1Var != null) {
            p1Var.a(str, u17, true, j17);
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).Ni().Y(str, u17, null, null, u17.K2.ordinal());
        }
    }

    public void Di(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j jVar) {
        r35.i1 i1Var = new r35.i1(context);
        i1Var.l(str);
        i1Var.i(str2);
        i1Var.g(java.lang.Boolean.TRUE);
        i1Var.f450668b.f293354b.Q = 2;
        i1Var.f450670d = str3;
        i1Var.a(jVar);
        i1Var.k();
    }

    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 Ni(android.content.Context context, java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2, int i17, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j jVar) {
        r35.i1 i1Var = new r35.i1(context);
        i1Var.d(bitmap, i17);
        i1Var.l(str);
        i1Var.g(java.lang.Boolean.TRUE);
        i1Var.h(false);
        i1Var.f450670d = str2;
        i1Var.a(jVar);
        return i1Var.f450669c;
    }

    public void Ri(android.content.Context context, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j jVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i iVar, android.content.DialogInterface.OnDismissListener onDismissListener) {
        r35.i1 i1Var = new r35.i1(context);
        i1Var.l(str);
        i1Var.g(java.lang.Boolean.TRUE);
        i1Var.h(false);
        i1Var.i(str2);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = i1Var.f450668b.f293354b;
        aVar.A = false;
        aVar.B = false;
        i1Var.f450671e = onDismissListener;
        i1Var.b(iVar);
        i1Var.j(com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya);
        i1Var.a(new r35.l1(this, jVar));
        i1Var.k();
    }

    public db5.d5 wi(com.p314xaae8f345.mm.ui.ga gaVar, android.graphics.Bitmap bitmap, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j jVar) {
        android.widget.ImageView imageView;
        android.view.View inflate = ((android.view.LayoutInflater) gaVar.x().getSystemService("layout_inflater")).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570209a06, (android.view.ViewGroup) null);
        db5.d5 d5Var = new db5.d5(inflate, -1, -1);
        r35.j1.c(inflate, jVar, d5Var);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMConfirmDialog", "showDialogItem8 fail,title or  message is empty");
            return null;
        }
        r35.j1.f(inflate, com.p314xaae8f345.mm.R.id.c_o, str2, false, 0);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21526xca364659 c21526xca364659 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21526xca364659) inflate.findViewById(com.p314xaae8f345.mm.R.id.c_k);
        c21526xca364659.m79266x3b2de958(true);
        c21526xca364659.i(0, gaVar.x().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561101k) * i65.a.q(gaVar.x()));
        c21526xca364659.m79272x1c5c5ff4(i65.a.e(gaVar.x(), com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            k12.r rVar = (k12.r) i95.n0.c(k12.r.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 x17 = gaVar.x();
            ((h12.b) rVar).getClass();
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            c21526xca364659.m79270x765074af(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(x17, str3));
        } else {
            k12.r rVar2 = (k12.r) i95.n0.c(k12.r.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 x18 = gaVar.x();
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            java.lang.String e17 = c01.a2.e(str);
            ((h12.b) rVar2).getClass();
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            c21526xca364659.m79270x765074af(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(x18, e17));
        }
        r35.j1.f(inflate, com.p314xaae8f345.mm.R.id.c_g, str4, true, 8);
        android.widget.Button button = (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.c_6);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
            button.setText(str5);
        }
        button.setOnClickListener(new r35.f1(jVar, inflate, d5Var));
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai((android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.c_m), str, null);
        } else if (bitmap != null && (imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.c_m)) != null) {
            if (bitmap.isRecycled()) {
                imageView.setVisibility(8);
            } else {
                imageView.setImageBitmap(bitmap);
                d5Var.setOnDismissListener(new r35.v0(bitmap));
            }
        }
        r35.j1.h(gaVar, d5Var);
        return d5Var;
    }
}
