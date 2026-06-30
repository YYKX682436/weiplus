package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui;

@db5.a(m123858x6ac9171 = 32)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/mv/ui/MusicMvMakerPreviewUI;", "Lcom/tencent/mm/plugin/mv/ui/BaseMusicMvUI;", "<init>", "()V", "plugin-mv_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvMakerPreviewUI */
/* loaded from: classes10.dex */
public final class ActivityC16652x736766a6 extends com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.AbstractActivityC16647x3a7d7dd1 {

    /* renamed from: e, reason: collision with root package name */
    public r45.ss4 f232399e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f232400f;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570858c54;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.AbstractActivityC16647x3a7d7dd1, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        java.util.Set mo43419xa59964ef = super.mo43419xa59964ef();
        if (mo43419xa59964ef != null) {
            return kz5.q1.i(mo43419xa59964ef, kz5.z.D0(new java.lang.Class[]{com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h6.class, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.t6.class, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.k6.class}));
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.AbstractActivityC16647x3a7d7dd1, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666;
        r45.ef2 m76971x25b90ced;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016662;
        r45.ef2 m76971x25b90ced2;
        java.util.LinkedList m75941xfb821914;
        boolean z17;
        java.util.LinkedList m75941xfb8219142;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27253;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016663;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e;
        r45.ss4 ss4Var;
        super.onCreate(bundle);
        m78531x8f8cf1fb();
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.aa8);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q(findViewById, 200, 200, 200, 200);
        findViewById.setOnClickListener(new jm3.b(this));
        android.view.View decorView = getWindow().getDecorView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView, "getDecorView(...)");
        decorView.setSystemUiVisibility(1280);
        mo64405x4dab7448(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        mo78530x8b45058f();
        this.f232399e = new r45.ss4();
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_track_data");
        if (byteArrayExtra != null && (ss4Var = this.f232399e) != null) {
            ss4Var.mo11468x92b714fd(byteArrayExtra);
        }
        kl3.t.g().a().c(0);
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h6.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h6 h6Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h6) a17;
        r45.ss4 ss4Var2 = this.f232399e;
        r45.hf2 hf2Var = null;
        h6Var.f232713e = ss4Var2 != null ? ss4Var2.m75945x2fec8307(2) : null;
        r45.ss4 ss4Var3 = this.f232399e;
        h6Var.f232714f = (ss4Var3 == null || (c19792x256d27253 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ss4Var3.m75936x14adae67(0)) == null || (m76802x2dd016663 = c19792x256d27253.m76802x2dd01666()) == null || (m76962x74cd162e = m76802x2dd016663.m76962x74cd162e()) == null || (c19788xd7cfd73e = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e)) == null) ? null : c19788xd7cfd73e.m76623xd93f812f() + c19788xd7cfd73e.m76624x4c9b7dca();
        h6Var.Q6(new jm3.c());
        h6Var.f232715g = this.f232399e;
        h6Var.R6(new jm3.e(this));
        p012xc85e97e9.p093xedfae76a.c1 a18 = pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.t6.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "get(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.t6 t6Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.t6) a18;
        h6Var.f232716h = new jm3.f(t6Var);
        t6Var.f233000o = new jm3.g(h6Var);
        r45.ss4 ss4Var4 = this.f232399e;
        t6Var.f232992d = ss4Var4;
        java.util.ArrayList arrayList = t6Var.f232993e;
        if (ss4Var4 != null && (c19792x256d27252 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ss4Var4.m75936x14adae67(0)) != null && (m76802x2dd016662 = c19792x256d27252.m76802x2dd01666()) != null && (m76971x25b90ced2 = m76802x2dd016662.m76971x25b90ced()) != null && (m75941xfb821914 = m76971x25b90ced2.m75941xfb821914(0)) != null) {
            int i17 = 0;
            for (java.lang.Object obj : m75941xfb821914) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.jf2 jf2Var = (r45.jf2) obj;
                if (jf2Var.m75942xfb822ef2(2) != 0) {
                    r45.ss4 ss4Var5 = t6Var.f232992d;
                    if (ss4Var5 != null && (m75941xfb8219142 = ss4Var5.m75941xfb821914(1)) != null) {
                        z17 = false;
                        int i19 = 0;
                        for (java.lang.Object obj2 : m75941xfb8219142) {
                            int i27 = i19 + 1;
                            if (i19 < 0) {
                                kz5.c0.p();
                                throw null;
                            }
                            if (((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) obj2).m76784x5db1b11() == jf2Var.m75942xfb822ef2(2)) {
                                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.l6 l6Var = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.l6(t6Var, i19, 0);
                                l6Var.f232809e = jf2Var;
                                arrayList.add(l6Var);
                                z17 = true;
                            }
                            i19 = i27;
                        }
                    }
                    z17 = false;
                } else {
                    java.lang.String m75945x2fec8307 = jf2Var.m75945x2fec8307(3);
                    if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.l6 l6Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.l6(t6Var, i17, 0);
                        l6Var2.f232809e = jf2Var;
                        l6Var2.f232810f = true;
                        arrayList.add(l6Var2);
                        z17 = true;
                    }
                    z17 = false;
                }
                if (!z17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.l6 l6Var3 = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.l6(t6Var, i17, 0);
                    l6Var3.f232809e = jf2Var;
                    l6Var3.f232810f = true;
                    arrayList.add(l6Var3);
                }
                i17 = i18;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.l6 l6Var4 = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.l6) kz5.n0.Z(arrayList);
        if (l6Var4 != null) {
            l6Var4.f232811g = true;
        }
        t6Var.f232996h = 0;
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q6(t6Var, null), 2, null);
        t6Var.f232994f = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) t6Var.m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.byj);
        android.view.View view = new android.view.View(t6Var.m158354x19263085());
        view.setLayoutParams(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams(i65.a.b(t6Var.m158354x19263085(), 24), i65.a.b(t6Var.m158354x19263085(), 64)));
        in5.n0.U(t6Var.O6(), view, -1, false, 4, null);
        android.view.View view2 = new android.view.View(t6Var.m158354x19263085());
        view2.setLayoutParams(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams(i65.a.b(t6Var.m158354x19263085(), 24), i65.a.b(t6Var.m158354x19263085(), 64)));
        in5.n0.P(t6Var.O6(), view2, -2, false, 4, null);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = t6Var.f232994f;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.mo7967x900dcbe1((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16706x423c5f6c) ((jz5.n) t6Var.f232999n).mo141623x754a37bb());
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = t6Var.f232994f;
        if (c22849x81a93d252 != null) {
            c22849x81a93d252.mo7960x6cab2c8d(t6Var.O6());
        }
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.c8v);
        if (button != null) {
            button.setOnClickListener(new jm3.h(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.k6 k6Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.k6) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.k6.class);
        r45.ss4 ss4Var6 = this.f232399e;
        if (ss4Var6 != null && (c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ss4Var6.m75936x14adae67(0)) != null && (m76802x2dd01666 = c19792x256d2725.m76802x2dd01666()) != null && (m76971x25b90ced = m76802x2dd01666.m76971x25b90ced()) != null) {
            hf2Var = (r45.hf2) m76971x25b90ced.m75936x14adae67(1);
        }
        k6Var.f232786e = hf2Var;
        ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.k6) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.k6.class)).O6();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        ll3.z0.a(ll3.z0.f400797a, false, 1, null);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f232400f) {
            return;
        }
        this.f232400f = false;
    }
}
