package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public abstract class x2 implements zy2.fa {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f105973a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f105974b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f105975c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f105976d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.extension.reddot.ua f105977e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f105978f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f105979g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f105980h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f105981i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f105982j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f105983k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f105984l;

    public x2(zy2.ba storage) {
        kotlin.jvm.internal.o.g(storage, "storage");
        this.f105973a = jz5.h.b(com.tencent.mm.plugin.finder.extension.reddot.r2.f105797d);
        this.f105974b = jz5.h.b(new com.tencent.mm.plugin.finder.extension.reddot.s2(this));
        this.f105975c = jz5.h.b(new com.tencent.mm.plugin.finder.extension.reddot.q2(this));
        this.f105977e = new com.tencent.mm.plugin.finder.extension.reddot.l5(this, ((c61.l7) i95.n0.c(c61.l7.class)).mk());
        this.f105978f = jz5.h.b(com.tencent.mm.plugin.finder.extension.reddot.o2.f105736d);
        this.f105979g = jz5.h.b(new com.tencent.mm.plugin.finder.extension.reddot.p2(this));
        this.f105980h = jz5.h.b(com.tencent.mm.plugin.finder.extension.reddot.w2.f105957d);
        this.f105981i = jz5.h.b(com.tencent.mm.plugin.finder.extension.reddot.v2.f105917d);
        this.f105982j = jz5.h.b(new com.tencent.mm.plugin.finder.extension.reddot.t2(this));
        this.f105984l = jz5.h.b(new com.tencent.mm.plugin.finder.extension.reddot.u2(this));
    }

    public void X0(r45.vs2 ctrlInfo) {
        com.tencent.mm.plugin.finder.extension.reddot.jb i17;
        kotlin.jvm.internal.o.g(ctrlInfo, "ctrlInfo");
        java.lang.String username = g92.b.f269769e.T0();
        kotlin.jvm.internal.o.g(username, "username");
        if (hc2.u0.d(ctrlInfo, "FinderMentionEntrance") && (i17 = i("FinderEntrance", username, false, false)) != null && i17.getType() == 1051) {
            com.tencent.mars.xlog.Log.i("FinderExt", "removePath FinderMentionEntrance for redDot type 1051, uuid=" + i17.field_tips_uuid + '!');
            java.util.LinkedList show_infos = ctrlInfo.f388489g;
            kotlin.jvm.internal.o.f(show_infos, "show_infos");
            pm0.v.d0(show_infos, new hc2.t0("FinderMentionEntrance"));
        }
    }

    public void Y0(boolean z17, java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        com.tencent.mars.xlog.Log.i("FinderRedDotBaseManager", "enterFinderFromFindMoreFriend " + z17 + " source " + source);
        this.f105976d = z17;
    }

    public final com.tencent.mm.plugin.finder.extension.reddot.z2 Z0() {
        return (com.tencent.mm.plugin.finder.extension.reddot.z2) ((jz5.n) this.f105979g).getValue();
    }

    public final com.tencent.mm.plugin.finder.extension.reddot.c4 a1() {
        return (com.tencent.mm.plugin.finder.extension.reddot.c4) ((jz5.n) this.f105982j).getValue();
    }

    public final kc2.g1 b1() {
        return (kc2.g1) ((jz5.n) this.f105984l).getValue();
    }

    public final java.util.concurrent.ConcurrentHashMap c1() {
        return (java.util.concurrent.ConcurrentHashMap) ((jz5.n) this.f105980h).getValue();
    }

    public boolean d1() {
        com.tencent.mm.plugin.finder.storage.aj0 aj0Var = com.tencent.mm.plugin.finder.storage.aj0.f126440a;
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.z70.f(com.tencent.mm.plugin.finder.storage.z70.f128432a, com.tencent.mm.plugin.finder.storage.t70.f127590a, "红点manager在使用之前检查下帐号是否准备好了", e42.c0.clicfg_finder_reddot_manager_check_account_state_before_working, java.lang.Boolean.valueOf(kb2.b.f306225a.a()), false, com.tencent.mm.plugin.finder.storage.wg0.f128253d, 8, null)).booleanValue()) {
            return gm0.j1.a();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:209:0x06ea, code lost:
    
        r19 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x08bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e1(r45.dz2 r28, java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 2291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.extension.reddot.x2.e1(r45.dz2, java.lang.String):void");
    }

    @Override // zy2.la
    public void r(com.tencent.mm.plugin.finder.extension.reddot.b3 actionType, com.tencent.mm.ui.base.preference.h0 h0Var) {
        kotlin.jvm.internal.o.g(actionType, "actionType");
        if (!this.f105983k) {
            this.f105983k = true;
            i95.m c17 = i95.n0.c(c61.t8.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ((com.tencent.mm.plugin.finder.extension.reddot.g) zy2.ca.ld((zy2.ca) c17, false, 1, null)).a(null);
            com.tencent.mm.plugin.finder.extension.reddot.ga gaVar = com.tencent.mm.plugin.finder.extension.reddot.ha.f105557a;
            com.tencent.mm.plugin.finder.extension.reddot.ha.f105558b.clear();
        }
        kc2.g1 b17 = b1();
        if (b17 != null) {
            b17.b(true, actionType, h0Var);
        }
    }

    @Override // zy2.la
    public void s(com.tencent.mm.ui.base.preference.r screen, com.tencent.mm.ui.base.preference.Preference pref, com.tencent.mm.ui.base.preference.n0 source) {
        jz5.f0 f0Var;
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(screen, "screen");
        kotlin.jvm.internal.o.g(pref, "pref");
        kotlin.jvm.internal.o.g(source, "source");
        kc2.g1 b17 = b1();
        if (b17 == null || source != com.tencent.mm.ui.base.preference.n0.OnClick) {
            return;
        }
        b17.k().post(new kc2.v0(b17, pref));
        if (kotlin.jvm.internal.o.b(b17.n().f306501c, pref.f197780q)) {
            kc2.v1 n17 = b17.n();
            n17.f306500b.post(new kc2.r1(n17.d(), n17, c01.id.e()));
            return;
        }
        java.util.Iterator it = ((java.util.LinkedList) ((jz5.n) b17.f306394r).getValue()).iterator();
        while (true) {
            f0Var = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((kc2.c0) ((zy2.v7) obj)).f306336f.contains(pref.f197780q)) {
                    break;
                }
            }
        }
        zy2.v7 v7Var = (zy2.v7) obj;
        if (v7Var != null) {
            kc2.c0 c0Var = (kc2.c0) v7Var;
            c0Var.f306332b.post(new kc2.y(zy2.v7.a(c0Var, false, false, 3, null), c0Var, c01.id.e()));
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("FinderKaraInfoManager", "onFindPreferenceClick find businessManager null");
        }
    }
}
