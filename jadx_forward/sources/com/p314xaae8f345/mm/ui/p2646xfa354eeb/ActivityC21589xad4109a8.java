package com.p314xaae8f345.mm.ui.p2646xfa354eeb;

/* renamed from: com.tencent.mm.ui.bizchat.BizChatroomInfoUI */
/* loaded from: classes11.dex */
public class ActivityC21589xad4109a8 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b implements com.p314xaae8f345.mm.p944x882e457a.u0, r01.w2 {
    public static final /* synthetic */ int H = 0;
    public int B;
    public r01.m C;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f279470e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p648x55baa833.ui.p652xa8fcbcdb.C10383x60c27393 f279471f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 f279472g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe f279473h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe f279474i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe f279475m;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f279477o;

    /* renamed from: p, reason: collision with root package name */
    public long f279478p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f279479q;

    /* renamed from: s, reason: collision with root package name */
    public int f279481s;

    /* renamed from: u, reason: collision with root package name */
    public boolean f279483u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f279484v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f279485w;

    /* renamed from: x, reason: collision with root package name */
    public int f279486x;

    /* renamed from: d, reason: collision with root package name */
    public android.app.ProgressDialog f279469d = null;

    /* renamed from: n, reason: collision with root package name */
    public android.content.SharedPreferences f279476n = null;

    /* renamed from: r, reason: collision with root package name */
    public boolean f279480r = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f279482t = false;

    /* renamed from: y, reason: collision with root package name */
    public s01.h f279487y = null;

    /* renamed from: z, reason: collision with root package name */
    public s01.a0 f279488z = null;
    public s01.a0 A = null;
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.b0 D = new com.p314xaae8f345.mm.p2470x93e71c27.ui.b0(new hb5.t0(this));
    public boolean E = false;
    public boolean F = false;
    public final s01.l G = new hb5.s0(this);

    @Override // r01.w2
    public void K1(int i17, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.j53 j53Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        android.app.ProgressDialog progressDialog = this.f279469d;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f279469d = null;
        }
        if (m1Var.mo808xfb85f7b0() != 1355) {
            if (m1Var.mo808xfb85f7b0() == 1356) {
                if (i17 != 0) {
                    V6();
                    return;
                }
                return;
            } else {
                if (m1Var.mo808xfb85f7b0() != 1353 || i17 < 0 || this.f279488z == null) {
                    return;
                }
                this.f279488z = r01.q3.Vi().y0(this.f279488z.f65840x13fe5d2b);
                m79365xf050804b();
                return;
            }
        }
        s01.g0 g0Var = (s01.g0) m1Var;
        r45.v90 H2 = g0Var.H();
        com.p314xaae8f345.mm.p944x882e457a.o oVar = g0Var.f483407e;
        r45.u90 u90Var = (oVar == null || (fVar = oVar.f152243a.f152217a) == null) ? null : (r45.u90) fVar;
        if (i17 < 0 || H2 == null || (j53Var = H2.f469533e) == null || j53Var.f459125d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizChatroomInfoUI", "onBizChatSceneEnd createBizChatInfo failed, resCode=%d", java.lang.Integer.valueOf(i17));
            dp.a.m125854x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, getString(com.p314xaae8f345.mm.R.C30867xcad56011.i3x), 0).show();
            return;
        }
        s01.h D0 = r01.q3.Ui().D0(H2.f469533e.f459125d.f464618d);
        if (D0 == null) {
            dp.a.m125854x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, getString(com.p314xaae8f345.mm.R.C30867xcad56011.i3x), 0).show();
            return;
        }
        if (this.B == 2) {
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(67108864);
            intent.putExtra("biz_chat_need_to_jump_to_chatting_ui", true);
            intent.putExtra("Contact_User", u90Var.f468684d);
            intent.putExtra("biz_chat_chat_id", D0.f69168x92559640);
            j45.l.u(this, ".ui.bizchat.BizChatConversationUI", intent, null);
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.addFlags(67108864);
        intent2.putExtra("Chat_User", u90Var.f468684d);
        intent2.putExtra("key_biz_chat_id", D0.f69168x92559640);
        intent2.putExtra("finish_direct", true);
        intent2.putExtra("key_need_send_video", false);
        intent2.putExtra("key_is_biz_chat", true);
        intent2.setClass(this, com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/bizchat/BizChatroomInfoUI", "onBizChatSceneEnd", "(ILcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/ui/bizchat/BizChatroomInfoUI", "onBizChatSceneEnd", "(ILcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void V6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizChatroomInfoUI", "dealModChatNameFail reset bizChatName");
        s01.h hVar = this.f279487y;
        hVar.f69171x736d1fa8 = this.f279479q;
        hVar.f69167x6e664fd4 = this.f279486x;
        this.f279483u = hVar.t0(1);
        this.f279484v = this.f279487y.t0(8);
        this.f279485w = this.f279487y.t0(16);
        r01.q3.Ui().P0(this.f279487y);
        boolean z17 = this.f279485w;
        if (z17) {
            r01.q3.aj().i1(this.f279487y.f69168x92559640);
        } else if (!z17) {
            r01.q3.aj().k1(this.f279487y.f69168x92559640);
        }
        android.content.SharedPreferences.Editor edit = this.f279476n.edit();
        s01.g aj6 = r01.q3.aj();
        edit.putBoolean("room_placed_to_the_top", aj6.f1(aj6.J0(this.f279487y.f69168x92559640))).commit();
        a7();
        Y6();
        Z6();
        c7();
        dp.a.m125854x26a183b(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.i3y), 0).show();
    }

    public final void W6(boolean z17, int i17) {
        s01.h hVar = this.f279487y;
        int i18 = hVar.f69167x6e664fd4;
        this.f279486x = i18;
        this.f279479q = hVar.f69171x736d1fa8;
        if (this.f279482t) {
            if (z17) {
                hVar.f69167x6e664fd4 = i18 | i17;
            } else {
                hVar.f69167x6e664fd4 = (~i17) & i18;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizChatroomInfoUI", "dealSetMute:bitFlag %s", java.lang.Integer.valueOf(hVar.f69167x6e664fd4));
            r01.q3.Ui().P0(this.f279487y);
        } else {
            if (z17) {
                s01.a0 a0Var = this.f279488z;
                a0Var.f65835x6e664fd4 = i17 | a0Var.f65835x6e664fd4;
            } else {
                s01.a0 a0Var2 = this.f279488z;
                a0Var2.f65835x6e664fd4 = (~i17) & a0Var2.f65835x6e664fd4;
            }
            r01.q3.Vi().J0(this.f279488z);
            this.f279487y.f69167x6e664fd4 = this.f279488z.f65835x6e664fd4;
            r01.q3.Ui().P0(this.f279487y);
        }
        r45.pj pjVar = new r45.pj();
        s01.h hVar2 = this.f279487y;
        pjVar.f464618d = hVar2.f69169xf75e5c37;
        pjVar.f464623i = hVar2.f69167x6e664fd4;
        r01.q3.Ni().n(this.f279487y.f69170x75756b18, pjVar, this);
    }

    public final void X6(r45.tj tjVar, r45.tj tjVar2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizChatroomInfoUI", "updateBizChatMemberList()");
        java.lang.String string = getString(tjVar == null ? com.p314xaae8f345.mm.R.C30867xcad56011.i4_ : com.p314xaae8f345.mm.R.C30867xcad56011.f571387dm);
        s01.y Ni = r01.q3.Ni();
        s01.h hVar = this.f279487y;
        java.lang.String str = hVar.f69170x75756b18;
        java.lang.String str2 = hVar.f69169xf75e5c37;
        Ni.getClass();
        s01.q0 q0Var = new s01.q0(str, str2, tjVar, tjVar2, this);
        gm0.j1.n().f354821b.g(q0Var);
        this.f279469d = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), string, true, true, new hb5.w0(this, q0Var));
    }

    public final void Y6() {
        if (this.f279476n == null) {
            this.f279476n = getSharedPreferences(getPackageName() + "_preferences", 0);
        }
        if (this.f279482t) {
            this.f279483u = this.f279487y.t0(1);
            this.f279486x = this.f279487y.f69167x6e664fd4;
        } else {
            this.f279483u = this.f279488z.t0(1);
            this.f279486x = this.f279488z.f65835x6e664fd4;
        }
        if (this.f279483u) {
            m78594xca3c3c9a(0);
            if (this.f279473h != null) {
                this.f279476n.edit().putBoolean("room_notify_new_msg", true).commit();
            }
        } else {
            m78594xca3c3c9a(8);
            if (this.f279473h != null) {
                this.f279476n.edit().putBoolean("room_notify_new_msg", false).commit();
            }
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f279470e).notifyDataSetChanged();
    }

    public final void Z6() {
        if (this.f279476n == null) {
            this.f279476n = getSharedPreferences(getPackageName() + "_preferences", 0);
        }
        if (this.f279482t) {
            this.f279485w = this.f279487y.t0(16);
            this.f279486x = this.f279487y.f69167x6e664fd4;
        } else {
            this.f279485w = this.f279488z.t0(16);
            this.f279486x = this.f279488z.f65835x6e664fd4;
        }
        if (this.f279474i != null) {
            this.f279476n.edit().putBoolean("room_placed_to_the_top", this.f279485w).commit();
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f279470e).notifyDataSetChanged();
    }

    public final void a7() {
        if (this.f279471f != null) {
            if (!(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f279482t ? this.f279487y.f69171x736d1fa8 : this.f279488z.f65841xdde069b))) {
                this.f279471f.H(getString(com.p314xaae8f345.mm.R.C30867xcad56011.i4x));
                return;
            }
            java.lang.String str = this.f279487y.f69171x736d1fa8;
            if (str != null && str.length() > 50) {
                str = str.substring(0, 32);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizChatroomInfoUI", "updateRoomName chatName:%s", str);
            com.p314xaae8f345.mm.p648x55baa833.ui.p652xa8fcbcdb.C10383x60c27393 c10383x60c27393 = this.f279471f;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            if (str == null || str.length() <= 0) {
                str = getString(com.p314xaae8f345.mm.R.C30867xcad56011.iy8);
            }
            ((ke0.e) xVar).getClass();
            c10383x60c27393.H(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(this, str));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    public final void b7() {
        java.util.LinkedList linkedList;
        if (this.f279472g != null) {
            if (this.f279482t) {
                long j17 = this.f279478p;
                java.lang.String str = s01.r.f483457a;
                linkedList = r01.q3.Ui().z0(j17).w0();
            } else {
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                linkedList2.add(this.f279487y.f69169xf75e5c37);
                linkedList = linkedList2;
            }
            if (linkedList != null) {
                this.f279481s = linkedList.size();
            } else {
                this.f279481s = 0;
            }
            if (this.f279481s <= 1) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f3 = this.f279472g;
                c19662x4f7a67f3.T(true);
                c19662x4f7a67f3.V(false);
            } else {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f32 = this.f279472g;
                c19662x4f7a67f32.T(true);
                c19662x4f7a67f32.V(this.f279480r);
            }
            r01.m mVar = this.C;
            if (mVar != null && mVar.f66037x57d5bccc) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f33 = this.f279472g;
                c19662x4f7a67f33.T(false);
                c19662x4f7a67f33.V(false);
            }
            this.f279472g.O(this.f279477o, linkedList, true);
        }
    }

    public final void c7() {
        if (this.f279476n == null) {
            this.f279476n = getSharedPreferences(getPackageName() + "_preferences", 0);
        }
        if (this.f279482t) {
            this.f279484v = this.f279487y.t0(8);
            this.f279486x = this.f279487y.f69167x6e664fd4;
        } else {
            this.f279484v = this.f279488z.t0(8);
            this.f279486x = this.f279488z.f65835x6e664fd4;
        }
        if (this.f279484v) {
            if (this.f279475m != null) {
                this.f279476n.edit().putBoolean("room_save_to_contact", true).commit();
            }
        } else if (this.f279475m != null) {
            this.f279476n.edit().putBoolean("room_save_to_contact", false).commit();
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f279470e).notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: createAdapter */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 mo43515x4153c6b3(android.content.SharedPreferences sharedPreferences) {
        return new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.b(this, m79335xcc101dd9(), sharedPreferences);
    }

    public final void d7() {
        if (!this.f279482t) {
            mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.i78));
            return;
        }
        int h17 = s01.r.h(this.f279478p);
        this.f279481s = h17;
        if (h17 == 0) {
            mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.i78));
        } else {
            mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573666fc0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.i78), java.lang.Integer.valueOf(this.f279481s)));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576369j;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f279470e = m79336x8b97809d();
        s01.h hVar = this.f279487y;
        java.lang.String str = hVar.f69178x60615314;
        this.f279481s = hVar.w0().size();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            this.f279480r = false;
        } else {
            this.f279480r = str.equals(r01.q3.Vi().z0(this.f279477o));
        }
        qk.o b17 = r01.q3.cj().b1(this.f279477o);
        this.C = r01.q3.bj().y0(b17.y0());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizChatroomInfoUI", "getMainBrandAttr father %s", b17.y0());
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f3 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f279470e).h("roominfo_contact_anchor");
        this.f279472g = c19662x4f7a67f3;
        c19662x4f7a67f3.R(this.f279470e, c19662x4f7a67f3.f279313q);
        this.f279471f = (com.p314xaae8f345.mm.p648x55baa833.ui.p652xa8fcbcdb.C10383x60c27393) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f279470e).h("room_name");
        this.f279473h = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f279470e).h("room_notify_new_msg");
        this.f279474i = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f279470e).h("room_placed_to_the_top");
        this.f279475m = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f279470e).h("room_save_to_contact");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f32 = this.f279472g;
        boolean z17 = this.f279482t;
        lz.f fVar = c19662x4f7a67f32.M;
        if (fVar != null) {
            ((r35.u1) fVar).f450807f.f450830p = z17;
        }
        boolean z18 = this.f279480r;
        if (fVar != null) {
            ((r35.u1) fVar).f450807f.f450829o = z18;
        }
        if (z18) {
            c19662x4f7a67f32.T(true);
            c19662x4f7a67f32.V(true);
        } else {
            c19662x4f7a67f32.T(true);
            c19662x4f7a67f32.V(false);
        }
        r01.m mVar = this.C;
        if (mVar != null && mVar.f66037x57d5bccc) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f33 = this.f279472g;
            c19662x4f7a67f33.T(false);
            c19662x4f7a67f33.V(false);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f34 = this.f279472g;
        java.lang.String str2 = this.f279487y.f69178x60615314;
        lz.f fVar2 = c19662x4f7a67f34.M;
        if (fVar2 != null) {
            ((r35.u1) fVar2).f450807f.D = str2;
        }
        if (fVar2 != null) {
            ((r35.u1) fVar2).f450807f.getClass();
        }
        lz.f fVar3 = this.f279472g.M;
        if (fVar3 != null) {
            ((r35.u1) fVar3).f450806e = false;
        }
        if (!this.f279482t) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f279470e).m("room_save_to_contact", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f279470e).m("room_name", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f279470e).m("room_del_quit", true);
        }
        c7();
        Z6();
        Y6();
        if (this.f279472g != null) {
            android.widget.ListView m79335xcc101dd9 = m79335xcc101dd9();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.b0 b0Var = this.D;
            m79335xcc101dd9.setOnScrollListener(b0Var);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f35 = this.f279472g;
            lz.f fVar4 = c19662x4f7a67f35.M;
            if (fVar4 != null) {
                ((r35.u1) fVar4).f450807f.f450836v = b0Var;
            }
            c19662x4f7a67f35.Z(new hb5.x0(this));
        }
        mo54448x9c8c0d33(new hb5.y0(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(int r8, int r9, android.content.Intent r10) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21589xad4109a8.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        s01.a0 y07;
        s01.h hVar;
        super.onCreate(bundle);
        s01.m Ui = r01.q3.Ui();
        Ui.f483434e.a(this.G, android.os.Looper.getMainLooper());
        this.B = getIntent().getIntExtra("key_biz_chat_info_from_scene", -1);
        this.f279477o = getIntent().getStringExtra("Chat_User");
        this.f279478p = getIntent().getLongExtra("key_biz_chat_id", -1L);
        s01.h z07 = r01.q3.Ui().z0(this.f279478p);
        this.f279487y = z07;
        this.f279479q = z07.f69171x736d1fa8;
        boolean o17 = s01.r.o(z07.f69169xf75e5c37);
        this.f279482t = o17;
        if (!o17) {
            this.f279488z = r01.q3.Vi().y0(this.f279487y.f69169xf75e5c37);
        }
        s01.d0 Vi = r01.q3.Vi();
        java.lang.String str = this.f279477o;
        if (str == null) {
            Vi.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizChatUserInfoStorage", "getMyUserInfo brandUserName is null");
        } else {
            java.lang.String z08 = Vi.z0(str);
            if (z08 != null) {
                y07 = Vi.y0(z08);
                this.A = y07;
                mo43517x10010bd5();
                hVar = this.f279487y;
                if (hVar != null || hVar.f69169xf75e5c37 == null || this.f279477o == null) {
                    return;
                }
                if (!hVar.y0()) {
                    r01.q3.Ni().i(this.f279487y.f69169xf75e5c37, this.f279477o, this);
                    return;
                }
                s01.y Ni = r01.q3.Ni();
                java.lang.String str2 = this.f279487y.f69169xf75e5c37;
                java.lang.String str3 = this.f279477o;
                Ni.getClass();
                gm0.j1.n().f354821b.g(new s01.h0(str2, str3, true));
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizChatUserInfoStorage", "getMyUserInfo myUserIdString is null");
        }
        y07 = null;
        this.A = y07;
        mo43517x10010bd5();
        hVar = this.f279487y;
        if (hVar != null) {
        }
    }

    /* renamed from: onDataChanged */
    public final void m79365xf050804b() {
        if (this.f279472g != null) {
            a7();
            d7();
            Y6();
            b7();
            c7();
            Z6();
            this.f279472g.s();
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f279470e).notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        zg5.a.b();
        zg5.a.b();
        s01.m Ui = r01.q3.Ui();
        s01.l lVar = this.G;
        l75.v0 v0Var = Ui.f483434e;
        if (v0Var != null) {
            v0Var.j(lVar);
        }
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        java.lang.String str = c21560x1fce98fb.f279313q;
        if (str.equals("room_name")) {
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f279482t ? this.f279487y.f69171x736d1fa8 : this.f279488z.f65841xdde069b) ^ true ? this.f279487y.f69171x736d1fa8 : "";
            db5.e1.N(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.i5m), str2, "", 32, new hb5.z0(this, str2));
            return false;
        }
        if (str.equals("room_notify_new_msg")) {
            boolean z17 = !this.f279483u;
            this.f279483u = z17;
            W6(z17, 1);
            Y6();
            return false;
        }
        if (!str.equals("room_placed_to_the_top")) {
            if (str.equals("room_del_quit")) {
                db5.e1.u(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.bo8), "", new hb5.a1(this), null);
                return false;
            }
            if (!str.equals("room_save_to_contact")) {
                return false;
            }
            boolean z18 = !this.f279484v;
            this.f279484v = z18;
            W6(z18, 8);
            c7();
            return false;
        }
        boolean z19 = !this.f279485w;
        this.f279485w = z19;
        W6(z19, 16);
        if (this.f279485w) {
            r01.q3.aj().i1(this.f279487y.f69168x92559640);
        } else {
            r01.q3.aj().k1(this.f279487y.f69168x92559640);
        }
        boolean z27 = this.f279485w;
        qn.e eVar = qn.e.f446419a;
        if (z27) {
            eVar.b(this.f279479q, qn.d.f446416f, qn.b.f446406e);
            return false;
        }
        eVar.b(this.f279479q, qn.d.f446415e, qn.b.f446406e);
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        a7();
        d7();
        Y6();
        Z6();
        c7();
        b7();
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f279470e).notifyDataSetChanged();
        super.onResume();
        if (this.E) {
            return;
        }
        java.lang.String stringExtra = getIntent().getStringExtra("need_matte_high_light_item");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            int o17 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f279470e).o(stringExtra);
            m79341xf579a34a(o17 - 3);
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new hb5.u0(this, o17), 10L);
        }
        this.E = true;
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizChatroomInfoUI", "onSceneEnd: [%d], [%d], [%s], scene is null", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizChatroomInfoUI", "onSceneEnd: [%d], [%d], [%s], sceneType[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()));
        this.f279481s = s01.r.h(this.f279478p);
        android.app.ProgressDialog progressDialog = this.f279469d;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        tm.a b17 = tm.a.b(str);
        if (b17 != null) {
            b17.c(this, null, null);
        } else if (i17 == 0 && i18 == 0) {
            m1Var.mo808xfb85f7b0();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizChatroomInfoUI", "willen onSceneEnd err:Network not ok");
            V6();
        }
    }
}
