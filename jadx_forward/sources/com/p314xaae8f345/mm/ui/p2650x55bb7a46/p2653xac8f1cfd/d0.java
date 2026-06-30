package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public final class d0 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements yn.e {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f280448e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f280449f = "";

    @Override // yn.d
    public void f0(java.lang.String str, java.lang.String str2) {
        java.util.Collection collection;
        java.lang.String t17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AtSomeoneCopyComponent", "force return due to talker is empty");
            return;
        }
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        if (!m0() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f280449f) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f280448e)) {
            return;
        }
        java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(str2.concat(str));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getMD5String(...)");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17, this.f280449f)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AtSomeoneCopyComponent", "force return due to different key");
            return;
        }
        java.util.List g17 = new r26.t(",").g(this.f280448e, 0);
        if (!g17.isEmpty()) {
            java.util.ListIterator listIterator = g17.listIterator(g17.size());
            while (listIterator.hasPrevious()) {
                if (!(((java.lang.String) listIterator.previous()).length() == 0)) {
                    collection = kz5.n0.K0(g17, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        collection = kz5.p0.f395529d;
        java.lang.String[] strArr = (java.lang.String[]) collection.toArray(new java.lang.String[0]);
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.b3) c01.d9.b().l()).z0(this.f280113d.x());
        for (java.lang.String str3 : strArr) {
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, "notify@all")) {
                t17 = c01.e2.t(z07, str3, false);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(t17, "getRoomAtSomeShowName(...)");
            } else if (z07.P0()) {
                t17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a6j, "");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(t17, "getString(...)");
            }
            if (t17.length() > 0) {
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) this.f280113d.f542241c.a(sb5.s0.class))).f280796e.r(str, str3, t17);
            }
        }
    }

    @Override // yn.d
    public void k0(java.lang.String str, long j17, java.lang.CharSequence charSequence) {
        java.lang.String str2;
        java.util.Map d17;
        java.lang.String str3 = pt0.f0.f439742b1.n(str, j17).G;
        int i17 = c01.ia.f118787a;
        java.lang.String str4 = null;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) && (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str3, "msgsource", null)) != null) {
            str4 = (java.lang.String) d17.get(".msgsource.atuserlist");
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
            return;
        }
        if (charSequence == null || (str2 = charSequence.toString()) == null) {
            str2 = "";
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str4);
        java.lang.String x17 = this.f280113d.x();
        if (m0() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x17)) {
            java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(str2.concat(x17));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getMD5String(...)");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AtSomeoneCopyComponent", "return due to copy key is empty!");
                return;
            }
            if (str4.length() == 0) {
                this.f280448e = "";
                this.f280449f = "";
            } else {
                this.f280448e = str4;
                this.f280449f = a17;
            }
        }
    }

    public final boolean m0() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_chatroom_at_info_copy_enable_android, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AtSomeoneCopyComponent", "get expt:" + fj6);
        return fj6;
    }
}
