package zj3;

/* loaded from: classes14.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final zj3.j f554870a = new zj3.j();

    public static final boolean a() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_screen_project_info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(M, "getMMKV(...)");
        return M.getBoolean("screen_project_has_been_educated", false);
    }

    public static final int c(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231710t == null) {
            return -1;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231710t.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.w b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE.f231156f.b(str);
        if (b17 != null) {
            return b17.f231373a;
        }
        return -1;
    }

    public static final java.lang.String d() {
        java.lang.String b17 = f554870a.b();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17)) {
            return null;
        }
        try {
            return new cl0.g(b17).mo15082x48bce8a4("talking");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MultitalkUtils", e17, "getMulitalkMemberListSizeWording error", new java.lang.Object[0]);
            return null;
        }
    }

    public static final int e() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_multitalk_max_limited_number, 15);
    }

    public static final boolean g() {
        bm5.o1 o1Var = bm5.o1.f104252a;
        bm5.h0 h0Var = bm5.h0.RepairerConfig_MultiTalk_GlRender_Int;
        boolean z17 = (o1Var.g(h0Var, -1) == -1 ? ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_multitalk_use_new_render, 0) : o1Var.g(h0Var, -1)) == 1;
        boolean h17 = h();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultitalkUtils", "useNewRender: " + z17 + ", useNewView: " + h17);
        return z17 || h17;
    }

    public static final boolean h() {
        bm5.o1 o1Var = bm5.o1.f104252a;
        bm5.h0 h0Var = bm5.h0.RepairerConfig_MultiTalk_NewView_Int;
        boolean z17 = (o1Var.g(h0Var, -1) == -1 ? ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_multitalk_use_new_view, 1) : o1Var.g(h0Var, -1)) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultitalkUtils", "useNewView: " + z17);
        return z17;
    }

    public final java.lang.String b() {
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_multitalk_navpop_wording, "", true);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Zi)) {
            return null;
        }
        try {
            cl0.g gVar = new cl0.g(Zi);
            java.lang.String d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultitalkUtils", "getMultitalkNavpopWording, langCode:%s", d17);
            return gVar.mo15082x48bce8a4(d17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MultitalkUtils", e17, "getMultitalkNavpopWording error", new java.lang.Object[0]);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String f(android.content.Context r10, java.lang.String r11) {
        /*
            r9 = this;
            java.lang.String r0 = "context"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r0)
            java.lang.String r0 = "nickName"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r11, r0)
            java.lang.String r0 = r9.b()
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)
            r2 = 0
            if (r1 != 0) goto L2b
            cl0.g r1 = new cl0.g     // Catch: java.lang.Exception -> L21
            r1.<init>(r0)     // Catch: java.lang.Exception -> L21
            java.lang.String r0 = "screen_cast_title"
            java.lang.String r0 = r1.mo15082x48bce8a4(r0)     // Catch: java.lang.Exception -> L21
            goto L2c
        L21:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r3 = "MicroMsg.MultitalkUtils"
            java.lang.String r4 = "getMultitalkWaitingAcceptWording error"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r3, r0, r4, r1)
        L2b:
            r0 = 0
        L2c:
            if (r0 != 0) goto L3a
            r0 = 2131774863(0x7f104d8f, float:1.9181154E38)
            java.lang.String r0 = r10.getString(r0)
            java.lang.String r1 = "getString(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r1)
        L3a:
            int r1 = r0.length()
            java.lang.String r3 = "substring(...)"
            r4 = 3
            if (r1 < r4) goto L4b
            java.lang.String r1 = r0.substring(r2, r4)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r3)
            goto L4c
        L4b:
            r1 = r0
        L4c:
            com.tencent.mm.ui.ah r4 = com.p314xaae8f345.mm.ui.bh.a(r10)
            r5 = 112(0x70, float:1.57E-43)
            int r5 = i65.a.b(r10, r5)
            android.content.res.Resources r6 = r10.getResources()
            r7 = 2131167692(0x7f0709cc, float:1.7949665E38)
            float r6 = r6.getDimension(r7)
            int r10 = i65.a.a(r10, r6)
            float r10 = (float) r10
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>()
            r7.setTextSize(r10)
            int r8 = r1.length()
            r7.getTextBounds(r1, r2, r8, r6)
            int r1 = r6.width()
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>()
            r7.setTextSize(r10)
            int r10 = r11.length()
            r7.getTextBounds(r11, r2, r10, r6)
            int r10 = r6.width()
            int r6 = r1 + r10
            int r6 = r6 + r5
            java.lang.String r7 = "format(...)"
            r8 = 1
            int r4 = r4.f278668a
            if (r6 <= r4) goto Le2
            if (r10 != 0) goto La3
            goto Le2
        La3:
            int r4 = r4 - r5
            int r4 = r4 - r1
            float r1 = (float) r4
            float r10 = (float) r10
            float r1 = r1 / r10
            int r10 = r11.length()
            float r10 = (float) r10
            float r1 = r1 * r10
            float r10 = (float) r8
            float r1 = r1 - r10
            int r10 = (int) r1
            if (r10 > 0) goto Lc5
            java.lang.String r10 = ""
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r8)
            java.lang.String r10 = java.lang.String.format(r0, r10)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r10, r7)
            return r10
        Lc5:
            java.lang.String r10 = r11.substring(r2, r10)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r10, r3)
            java.lang.String r11 = "..."
            java.lang.String r10 = r10.concat(r11)
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r8)
            java.lang.String r10 = java.lang.String.format(r0, r10)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r10, r7)
            return r10
        Le2:
            java.lang.Object[] r10 = new java.lang.Object[]{r11}
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r8)
            java.lang.String r10 = java.lang.String.format(r0, r10)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r10, r7)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: zj3.j.f(android.content.Context, java.lang.String):java.lang.String");
    }
}
