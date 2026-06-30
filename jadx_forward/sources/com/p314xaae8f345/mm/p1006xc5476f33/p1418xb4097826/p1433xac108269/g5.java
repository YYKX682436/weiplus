package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes8.dex */
public final class g5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f183723a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zy2.i9 f183724b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f183725c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f183726d;

    public g5(android.content.Context context, zy2.i9 i9Var, int i17, int i18) {
        this.f183723a = context;
        this.f183724b = i9Var;
        this.f183725c = i17;
        this.f183726d = i18;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.j5.f183817b;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.j5.f183817b = null;
        android.content.Context context = this.f183723a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 ? (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context : null;
        if (((activityC0065xcd7aa112 == null || (mo273xed6858b4 = activityC0065xcd7aa112.mo273xed6858b4()) == null) ? null : mo273xed6858b4.b()) != p012xc85e97e9.p093xedfae76a.n.RESUMED) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m77035x76845fea = ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19796x6abb1fc1) fVar.f152151d).m77035x76845fea();
            java.lang.String m76197x6c03c64c = m77035x76845fea != null ? m77035x76845fea.m76197x6c03c64c() : null;
            if (m76197x6c03c64c == null || m76197x6c03c64c.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderOpenSdkApi", "realUsername empty");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderOpenSdkApi", "realUsername:" + m76197x6c03c64c);
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("finder_username", m76197x6c03c64c);
                zy2.i9 i9Var = this.f183724b;
                intent.putExtra("key_interaction_action_type", i9Var.f558957e);
                intent.putExtra("key_extra_info", "");
                int i17 = this.f183725c;
                intent.putExtra("key_card_type", i17);
                intent.putExtra("key_enter_scene", this.f183726d);
                java.lang.String Bj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(11, i17, 32, intent);
                ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).Bi(Bj);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i9Var.f558954b)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(21140, Bj, i9Var.f558954b, 0, m76197x6c03c64c);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
                i0Var.mk(context, intent);
            }
        }
        return jz5.f0.f384359a;
    }
}
