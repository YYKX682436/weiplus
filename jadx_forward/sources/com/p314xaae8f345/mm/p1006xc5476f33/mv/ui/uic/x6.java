package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class x6 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f233063d;

    /* renamed from: e, reason: collision with root package name */
    public final int f233064e;

    /* renamed from: f, reason: collision with root package name */
    public final int f233065f;

    /* renamed from: g, reason: collision with root package name */
    public final int f233066g;

    /* renamed from: h, reason: collision with root package name */
    public r45.ss4 f233067h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f233068i;

    /* renamed from: m, reason: collision with root package name */
    public final int f233069m;

    /* renamed from: n, reason: collision with root package name */
    public int f233070n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f233063d = "MicroMsg.Mv.MusicMvSaveDraftUIC";
        this.f233064e = 1;
        this.f233065f = 2;
        this.f233066g = 10031;
        this.f233070n = 2;
        this.f233069m = m158359x1e885992().getIntExtra("key_mv_from_scene", 0);
    }

    public final void O6(r45.ss4 ss4Var, boolean z17, int i17) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016662;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27253;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016663;
        r45.ef2 m76971x25b90ced;
        this.f233070n = i17;
        if (!z17) {
            int i18 = this.f233069m;
            if (i17 == 7 && i18 != 1) {
                m158354x19263085().finish();
                return;
            }
            android.content.Intent intent = new android.content.Intent(m158354x19263085(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16655xf855844b.class);
            intent.addFlags(67108864);
            intent.putExtra("KEY_MUSIC_ROUTER", 4);
            m158354x19263085().overridePendingTransition(-1, com.p314xaae8f345.mm.R.C30854x2dc211.f559422ed);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(m158354x19263085, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvSaveDraftUIC", "doBack", "(Lcom/tencent/mm/protocal/protobuf/MusicMvData;ZI)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            m158354x19263085.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(m158354x19263085, "com/tencent/mm/plugin/mv/ui/uic/MusicMvSaveDraftUIC", "doBack", "(Lcom/tencent/mm/protocal/protobuf/MusicMvData;ZI)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            m158354x19263085().finish();
            if (i18 == 1) {
                kl3.t.g().a().mo67222x66343656();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a.C(i17, null);
            return;
        }
        this.f233067h = ss4Var;
        boolean z18 = !((ss4Var == null || (c19792x256d27253 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ss4Var.m75936x14adae67(0)) == null || (m76802x2dd016663 = c19792x256d27253.m76802x2dd01666()) == null || (m76971x25b90ced = m76802x2dd016663.m76971x25b90ced()) == null || m76971x25b90ced.m75939xb282bd08(6) != 1) ? false : true);
        if (i17 == 2 || z18) {
            r45.ss4 ss4Var2 = this.f233067h;
            r45.ef2 m76971x25b90ced2 = (ss4Var2 == null || (c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ss4Var2.m75936x14adae67(0)) == null || (m76802x2dd01666 = c19792x256d2725.m76802x2dd01666()) == null) ? null : m76802x2dd01666.m76971x25b90ced();
            if (m76971x25b90ced2 != null) {
                m76971x25b90ced2.set(7, 0);
            }
        } else if (i17 == 4 || i17 == 7) {
            r45.ss4 ss4Var3 = this.f233067h;
            r45.ef2 m76971x25b90ced3 = (ss4Var3 == null || (c19792x256d27252 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ss4Var3.m75936x14adae67(0)) == null || (m76802x2dd016662 = c19792x256d27252.m76802x2dd01666()) == null) ? null : m76802x2dd016662.m76971x25b90ced();
            if (m76971x25b90ced3 != null) {
                m76971x25b90ced3.set(7, 2);
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) m158354x19263085(), 1, true);
        k0Var.t(true);
        k0Var.r(m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h4p), 17, m158361x893a2f6f().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561463ja), null);
        k0Var.l(m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560051a0));
        k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.u6(this);
        k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.v6(this, ss4Var, k0Var);
        k0Var.f293387d = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.w6.f233050d;
        k0Var.v();
    }

    public final void P6(boolean z17, boolean z18, r45.ss4 ss4Var) {
        r45.za4 za4Var;
        java.util.LinkedList m75941xfb821914;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016662;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 b17;
        if (z17) {
            if (xy2.c.e(m80379x76847179()).length() == 0) {
                i95.m c17 = i95.n0.c(zy2.b6.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                if (zy2.b6.Mh((zy2.b6) c17, m158354x19263085(), null, null, null, 12, null)) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.setClassName(m158354x19263085(), "com.tencent.mm.plugin.finder.ui.FinderCreateContactUI");
                    intent.putExtra("key_create_scene", 7);
                    intent.putExtra("key_router_to_profile", false);
                    intent.putExtra("key_mv_status", 1);
                    m158354x19263085().startActivityForResult(intent, this.f233066g);
                    return;
                }
                return;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a.C(this.f233070n, null);
        if (ss4Var != null) {
            r45.ss4 ss4Var2 = z18 ? ss4Var : null;
            if (ss4Var2 != null) {
                jm3.h1.f381855a.b(ss4Var2);
                long j17 = (ss4Var2.m75942xfb822ef2(4) <= 0 || (b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.a90.f207926a.b(ss4Var2.m75942xfb822ef2(4))) == null) ? 0L : b17.f66238x2327e25f;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderDraftLogic", "saveDraftItem :" + ss4Var2.m75942xfb822ef2(4));
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 x80Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80();
                x80Var.f66238x2327e25f = j17;
                x80Var.f66231xac3be4e = c01.id.e();
                x80Var.f66235x52c1d072 = 1;
                r45.ec1 ec1Var = new r45.ec1();
                ec1Var.set(0, (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ss4Var2.m75936x14adae67(0));
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ec1Var.m75936x14adae67(0);
                if (c19792x256d2725 != null) {
                    c19792x256d2725.m76877x684351d(0L);
                }
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ec1Var.m75936x14adae67(0);
                if (c19792x256d27252 != null) {
                    c19792x256d27252.m76855x6e101bcb(c01.id.e());
                }
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27253 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ec1Var.m75936x14adae67(0);
                if (c19792x256d27253 != null && (m76802x2dd016662 = c19792x256d27253.m76802x2dd01666()) != null && (m76962x74cd162e2 = m76802x2dd016662.m76962x74cd162e()) != null) {
                    m76962x74cd162e2.clear();
                }
                java.lang.String m75945x2fec8307 = ss4Var2.m75945x2fec8307(2);
                if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e();
                    c19788xd7cfd73e.m76678xca029dad(ss4Var2.m75945x2fec8307(2));
                    c19788xd7cfd73e.m76676xd3f7e23b(ss4Var2.m75945x2fec8307(2));
                    c19788xd7cfd73e.m76666xdb5612fc(2);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderDraftLogic", "saveDraftItem :" + c19788xd7cfd73e.m76625xb5887639() + " thumbUrl:" + c19788xd7cfd73e.m76623xd93f812f());
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27254 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ec1Var.m75936x14adae67(0);
                    if (c19792x256d27254 != null && (m76802x2dd01666 = c19792x256d27254.m76802x2dd01666()) != null && (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) != null) {
                        m76962x74cd162e.add(c19788xd7cfd73e);
                    }
                }
                ec1Var.set(1, new r45.ar0());
                java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725> m75941xfb8219142 = ss4Var2.m75941xfb821914(1);
                if (!(m75941xfb8219142 == null || m75941xfb8219142.isEmpty())) {
                    r45.ar0 ar0Var = (r45.ar0) ec1Var.m75936x14adae67(1);
                    if (ar0Var != null) {
                        ar0Var.set(8, new r45.za4());
                    }
                    if (m75941xfb8219142 != null) {
                        for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27255 : m75941xfb8219142) {
                            r45.ec1 ec1Var2 = new r45.ec1();
                            ec1Var2.set(0, c19792x256d27255);
                            r45.ar0 ar0Var2 = (r45.ar0) ec1Var.m75936x14adae67(1);
                            if (ar0Var2 != null && (za4Var = (r45.za4) ar0Var2.m75936x14adae67(8)) != null && (m75941xfb821914 = za4Var.m75941xfb821914(0)) != null) {
                                m75941xfb821914.add(ec1Var2);
                            }
                        }
                    }
                }
                x80Var.f66234xddef18be = ec1Var;
                r45.qb4 Vi = ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).Vi();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 t07 = x80Var.t0();
                Vi.set(6, java.lang.Long.valueOf(c01.id.a()));
                t07.m59408xa3acbff0(Vi);
                x80Var.f66240x6a01bfe2 = (r45.ef2) ss4Var2.m75936x14adae67(5);
                x80Var.f66239xf8be237e = 2;
                java.lang.String m75945x2fec83072 = ss4Var2.m75945x2fec8307(2);
                if (m75945x2fec83072 != null && r26.i0.y(m75945x2fec83072, "http", false)) {
                    cu2.o.f303963a.a(x80Var);
                }
                long L0 = ((c61.l7) i95.n0.c(c61.l7.class)).Oj().L0(x80Var);
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5464x5322afbe c5464x5322afbe = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5464x5322afbe();
                am.ab abVar = c5464x5322afbe.f135803g;
                abVar.f87677a = 100;
                abVar.f87678b = L0;
                c5464x5322afbe.e();
                ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).getClass();
                mv2.f0.f413094a.c();
                db5.t7.i(m158354x19263085(), m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572081y7), com.p314xaae8f345.mm.R.raw.f79703xc84d169a);
            }
        }
        android.content.Intent intent2 = new android.content.Intent(m158354x19263085(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16655xf855844b.class);
        intent2.addFlags(67108864);
        intent2.putExtra("KEY_MUSIC_ROUTER", 4);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m158354x19263085, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvSaveDraftUIC", "doDraft", "(ZZLcom/tencent/mm/protocal/protobuf/MusicMvData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        m158354x19263085.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(m158354x19263085, "com/tencent/mm/plugin/mv/ui/uic/MusicMvSaveDraftUIC", "doDraft", "(ZZLcom/tencent/mm/protocal/protobuf/MusicMvData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        m158354x19263085().finish();
        if (this.f233069m == 1) {
            kl3.t.g().a().mo67222x66343656();
        }
        fm3.g0 g0Var = fm3.g0.f345603a;
        boolean z19 = this.f233068i;
        java.lang.String a17 = fm3.h0.a(ss4Var);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6775xb6999670 c18 = g0Var.c();
        c18.f141016l = z18 ? 1L : 0L;
        c18.f141021q = c18.b("PartList", a17, true);
        c18.f141020p = z19 ? 1L : 0L;
        c18.f141015k = 9L;
        c18.k();
        c18.o();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo2273x9d4787cb(i17, i18, intent);
        if (i17 == this.f233066g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f233063d, "callback create finder contact draft");
            r45.ss4 ss4Var = this.f233067h;
            if (ss4Var != null) {
                P6(false, true, ss4Var);
            }
        }
    }
}
