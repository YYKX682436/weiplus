package ot0;

@j95.b
/* loaded from: classes12.dex */
public final class g3 extends i95.w implements com.p314xaae8f345.mm.app.w2 {
    public android.database.Cursor Ai() {
        android.database.Cursor N0;
        final com.p314xaae8f345.mm.p2621x8fb0427b.g9 cj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
        if (cj6.Da(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7)) {
            N0 = ot0.c3.l().c("getMessageStatsByType", new yz5.a() { // from class: com.tencent.mm.storage.g9$$o7
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return ot0.z2.f430355a.N0(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7);
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$p7
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r.B("SELECT type,sum(1),sum(length(CAST(content AS BLOB))) as contentSize,sum(length(hex(lvbuffer))/2),sum(length(hex(reserved))/2) FROM message GROUP BY type ORDER BY contentSize DESC", null);
                }
            });
        } else {
            boolean Pb = cj6.Pb(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7);
            l75.k0 k0Var = cj6.f275522r;
            N0 = Pb ? ot0.z2.f430355a.N0(k0Var, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7) : k0Var.B("SELECT type,sum(1),sum(length(CAST(content AS BLOB))) as contentSize,sum(length(hex(lvbuffer))/2),sum(length(hex(reserved))/2) FROM message GROUP BY type ORDER BY contentSize DESC", null);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(N0, "getMessageStatsByType(...)");
        return N0;
    }

    public android.database.Cursor Bi() {
        android.database.Cursor e07;
        final com.p314xaae8f345.mm.p2621x8fb0427b.g9 cj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
        if (cj6.Da(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7)) {
            e07 = ot0.c3.l().c("getVideoImgPaths", new yz5.a() { // from class: com.tencent.mm.storage.g9$$y5
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return ot0.z2.f430355a.e0(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, 43);
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$a6
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r.B("SELECT imgPath FROM message WHERE type=43", null);
                }
            });
        } else {
            boolean Pb = cj6.Pb(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7);
            l75.k0 k0Var = cj6.f275522r;
            e07 = Pb ? ot0.z2.f430355a.e0(k0Var, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, 43) : k0Var.B("SELECT imgPath FROM message WHERE type=43", null);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e07, "getVideoImgPaths(...)");
        return e07;
    }

    public android.database.Cursor Di() {
        android.database.Cursor e07;
        final com.p314xaae8f345.mm.p2621x8fb0427b.g9 cj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
        if (cj6.Da(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7)) {
            e07 = ot0.c3.l().c("getVoiceImgPaths", new yz5.a() { // from class: com.tencent.mm.storage.g9$$v
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return ot0.z2.f430355a.e0(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, 34);
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$x
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r.B("SELECT imgPath FROM message WHERE type=34", null);
                }
            });
        } else {
            boolean Pb = cj6.Pb(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7);
            l75.k0 k0Var = cj6.f275522r;
            e07 = Pb ? ot0.z2.f430355a.e0(k0Var, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, 34) : k0Var.B("SELECT imgPath FROM message WHERE type=34", null);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e07, "getVoiceImgPaths(...)");
        return e07;
    }

    public boolean Ni(final java.lang.String msgId, final int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgId, "msgId");
        final com.p314xaae8f345.mm.p2621x8fb0427b.g9 cj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
        if (cj6.Da(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7)) {
            return ot0.c3.l().a("isMsgExistByIdAndType", new yz5.a() { // from class: com.tencent.mm.storage.g9$$y0
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return java.lang.Boolean.valueOf(ot0.z2.f430355a.p1(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, msgId, i17));
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$z0
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var.getClass();
                    android.database.Cursor B = g9Var.f275522r.B("SELECT msgid FROM message WHERE type=? AND msgid=?", new java.lang.String[]{java.lang.String.valueOf(i17), msgId});
                    try {
                        return java.lang.Boolean.valueOf(B.getCount() > 0);
                    } finally {
                        B.close();
                    }
                }
            });
        }
        boolean Pb = cj6.Pb(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7);
        l75.k0 k0Var = cj6.f275522r;
        if (Pb) {
            return ot0.z2.f430355a.p1(k0Var, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, msgId, i17);
        }
        android.database.Cursor B = k0Var.B("SELECT msgid FROM message WHERE type=? AND msgid=?", new java.lang.String[]{java.lang.String.valueOf(i17), msgId});
        try {
            boolean z17 = B.getCount() > 0;
            B.close();
            return z17;
        } catch (java.lang.Throwable th6) {
            B.close();
            throw th6;
        }
    }

    public android.database.Cursor wi(final java.util.List types) {
        android.database.Cursor B;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(types, "types");
        final com.p314xaae8f345.mm.p2621x8fb0427b.g9 cj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
        if (cj6.Da(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7)) {
            B = ot0.c3.l().c("getImgPathsByTypes", new yz5.a() { // from class: com.tencent.mm.storage.g9$$z6
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return ot0.z2.f430355a.f0(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, types);
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$a7
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var.getClass();
                    return g9Var.f275522r.B("SELECT imgPath FROM message WHERE type IN (" + android.text.TextUtils.join(",", types) + ")", null);
                }
            });
        } else {
            boolean Pb = cj6.Pb(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7);
            l75.k0 k0Var = cj6.f275522r;
            if (Pb) {
                B = ot0.z2.f430355a.f0(k0Var, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, types);
            } else {
                B = k0Var.B("SELECT imgPath FROM message WHERE type IN (" + android.text.TextUtils.join(",", types) + ")", null);
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(B, "getImgPathsByTypes(...)");
        return B;
    }
}
