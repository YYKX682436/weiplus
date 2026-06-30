package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class n5 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.assist.n5 f102402a = new com.tencent.mm.plugin.finder.assist.n5();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.ref.WeakReference f102403b;

    static {
        com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyt);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c(com.tencent.mm.plugin.finder.assist.n5 n5Var, android.content.Context context, long j17, java.lang.String str, java.lang.String objectNonceId, r45.xn2 xn2Var, yz5.a aVar, int i17, java.lang.Object obj) {
        long j18 = (i17 & 2) != 0 ? 0L : j17;
        java.lang.String exportId = (i17 & 4) != 0 ? "" : str;
        yz5.a aVar2 = (i17 & 32) != 0 ? null : aVar;
        n5Var.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(exportId, "exportId");
        kotlin.jvm.internal.o.g(objectNonceId, "objectNonceId");
        androidx.lifecycle.y yVar = context instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context : null;
        if (yVar == null) {
            return;
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        hb2.b0 b0Var = hb2.b0.f280025e;
        com.tencent.mm.plugin.finder.assist.m5 m5Var = new com.tencent.mm.plugin.finder.assist.m5(aVar2, context);
        b0Var.getClass();
        r45.wh2 wh2Var = new r45.wh2();
        wh2Var.set(0, java.lang.Long.valueOf(j18));
        wh2Var.set(1, 6);
        wh2Var.set(2, 0);
        wh2Var.set(3, objectNonceId);
        wh2Var.set(4, xn2Var);
        wh2Var.set(5, exportId);
        hb2.w0.h(b0Var, yVar, wh2Var, m5Var, false, false, 24, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r12 = this;
            java.lang.Class<zy2.b6> r0 = zy2.b6.class
            i95.m r0 = i95.n0.c(r0)
            zy2.b6 r0 = (zy2.b6) r0
            c61.l7 r0 = (c61.l7) r0
            boolean r0 = r0.vk()
            if (r0 != 0) goto L11
            return
        L11:
            gm0.b0 r0 = gm0.j1.u()
            com.tencent.mm.storage.n3 r0 = r0.c()
            com.tencent.mm.storage.u3 r1 = com.tencent.mm.storage.u3.USERINFO_MY_FINDER_ORIGINAL_REDDOT_FLAG2_INT_SYNC
            r2 = 0
            int r0 = r0.r(r1, r2)
            r3 = 1
            if (r0 != r3) goto L25
            r0 = r3
            goto L26
        L25:
            r0 = r2
        L26:
            if (r0 == 0) goto L29
            return
        L29:
            jz5.g r0 = com.tencent.mm.plugin.finder.storage.t70.A2
            jz5.n r0 = (jz5.n) r0
            java.lang.Object r0 = r0.getValue()
            lb2.j r0 = (lb2.j) r0
            java.lang.Object r0 = r0.r()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r4 = 0
            if (r0 == r3) goto L54
            g92.b r0 = g92.b.f269769e
            m92.b r0 = g92.a.I1(r0, r2, r3, r4)
            if (r0 == 0) goto L4e
            int r0 = r0.field_originalEntranceFlag
            if (r0 != r3) goto L4e
            r0 = r3
            goto L4f
        L4e:
            r0 = r2
        L4f:
            if (r0 == 0) goto L52
            goto L54
        L52:
            r0 = r2
            goto L55
        L54:
            r0 = r3
        L55:
            if (r0 != 0) goto L58
            return
        L58:
            g92.b r0 = g92.b.f269769e
            m92.b r0 = g92.a.I1(r0, r2, r3, r4)
            if (r0 == 0) goto L63
            int r0 = r0.field_originalEntranceFlag
            goto L64
        L63:
            r0 = r2
        L64:
            r4 = 2
            if (r0 != r4) goto L68
            r2 = r3
        L68:
            if (r2 == 0) goto L6b
            return
        L6b:
            java.lang.Class<c61.l7> r0 = c61.l7.class
            i95.m r0 = i95.n0.c(r0)
            c61.l7 r0 = (c61.l7) r0
            zy2.fa r4 = r0.nk()
            r45.vs2 r5 = new r45.vs2
            r5.<init>()
            long r6 = c01.id.c()
            java.lang.String r0 = java.lang.String.valueOf(r6)
            r5.f388490h = r0
            r0 = 50000(0xc350, float:7.0065E-41)
            r5.f388486d = r0
            r0 = 1000(0x3e8, float:1.401E-42)
            r5.f388487e = r0
            r45.f03 r0 = new r45.f03
            r0.<init>()
            r0.f373887d = r3
            r0.f373891h = r3
            java.lang.String r2 = "FinderPosterEntrance"
            r0.f373892i = r2
            java.util.LinkedList r2 = r5.f388489g
            r2.add(r0)
            r45.f03 r0 = new r45.f03
            r0.<init>()
            r0.f373887d = r3
            r0.f373891h = r3
            java.lang.String r2 = "OriginalEntrance"
            r0.f373892i = r2
            java.util.LinkedList r2 = r5.f388489g
            r2.add(r0)
            java.lang.String r6 = "checkInsertOriginalRedDot"
            r7 = 0
            r8 = 1
            r9 = 0
            r10 = 20
            r11 = 0
            zy2.fa.D(r4, r5, r6, r7, r8, r9, r10, r11)
            gm0.b0 r0 = gm0.j1.u()
            com.tencent.mm.storage.n3 r0 = r0.c()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r0.x(r1, r2)
            java.lang.String r0 = "Finder.FinderOriginalUtil"
            java.lang.String r1 = "insertOriginalRedDot"
            com.tencent.mars.xlog.Log.i(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.assist.n5.a():void");
    }

    public final java.lang.String b(android.content.Context context, boolean z17, int i17, long j17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(context, "context");
        m92.b j37 = g92.a.j3(g92.b.f269769e, xy2.c.e(context), false, 2, null);
        if (j37 == null || (str = j37.u0().getString(23)) == null) {
            str = "";
        }
        if (z17 && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return str;
        }
        if (i17 == 2) {
            java.lang.String string = context.getString(com.tencent.mm.R.string.ewb);
            kotlin.jvm.internal.o.d(string);
            return string;
        }
        if (j17 >= 5000) {
            return "";
        }
        java.lang.String string2 = context.getString(com.tencent.mm.R.string.ew_);
        kotlin.jvm.internal.o.d(string2);
        return string2;
    }

    public final void d(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17) {
        f102403b = new java.lang.ref.WeakReference(context);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        zy2.ta.f(ya2.e1.f460472a, context, str, str2, str3, z17, false, false, null, null, 480, null);
    }

    public final void e(android.content.Context context, java.lang.String feedId, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feedId, "feedId");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("objectId", feedId);
        jSONObject.put("status", i17);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        d(context, "wxalite17bb73d0180cae18320aefbf49ecd90d", "pages/status/entry", jSONObject2, true);
    }
}
