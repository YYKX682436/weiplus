package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes3.dex */
public final class jh {

    /* renamed from: b, reason: collision with root package name */
    public static tx2.i0 f107102b = null;

    /* renamed from: c, reason: collision with root package name */
    public static com.tencent.mm.plugin.finder.profile.widget.s4 f107103c = null;

    /* renamed from: d, reason: collision with root package name */
    public static int f107104d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f107105e = true;

    /* renamed from: f, reason: collision with root package name */
    public static int f107106f;

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.jh f107101a = new com.tencent.mm.plugin.finder.feed.jh();

    /* renamed from: g, reason: collision with root package name */
    public static final kk.l f107107g = new kk.l(100);

    public final void a(com.tencent.mm.ui.MMActivity mMActivity, r45.v71 v71Var, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, zy2.i5 i5Var, zy2.i5 i5Var2) {
        java.lang.String str4;
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        com.tencent.mm.plugin.finder.feed.xg xgVar = new com.tencent.mm.plugin.finder.feed.xg(h0Var, i17, mMActivity, i5Var, i5Var2);
        h0Var.f310123d = com.tencent.mm.ui.widget.dialog.u3.f(mMActivity.getContext(), mMActivity.getContext().getString(com.tencent.mm.R.string.f490604zq), true, 3, null);
        gm0.j1.d().a(6276, xgVar);
        i95.m c17 = i95.n0.c(c61.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c61.zb zbVar = (c61.zb) c17;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) v71Var.getCustom(3);
        if (finderContact == null || (str4 = finderContact.getUsername()) == null) {
            str4 = "";
        }
        java.lang.String str5 = str4;
        r45.h32 h32Var = (r45.h32) v71Var.getCustom(1);
        java.lang.String string = h32Var != null ? h32Var.getString(4) : null;
        kotlin.jvm.internal.o.d(string);
        gm0.j1.d().g(c61.zb.x3(zbVar, str5, string, i17, null, null, java.lang.Integer.valueOf(f107106f), null, null, null, null, null, str3, null, 6096, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.tencent.mm.ui.MMActivity r26, java.lang.String r27, zy2.i5 r28, zy2.i5 r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.jh.b(com.tencent.mm.ui.MMActivity, java.lang.String, zy2.i5, zy2.i5, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(com.tencent.mm.ui.MMActivity r33, java.lang.String r34, zy2.i5 r35, zy2.i5 r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.jh.c(com.tencent.mm.ui.MMActivity, java.lang.String, zy2.i5, zy2.i5, boolean):void");
    }

    public final void d(ml2.i5 i5Var, java.lang.String str, long j17, int i17, java.lang.String _scenenote, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4;
        if (f107105e) {
            ml2.q1 q1Var = ml2.q1.f327812e;
            str4 = "temp_13";
        } else {
            str4 = "39";
        }
        java.lang.String str5 = str4;
        ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
        a52.a.d(str5);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).Bi(((c61.l7) i95.n0.c(c61.l7.class)).Gj(15, 2, 65));
        ml2.r0 r0Var = (ml2.r0) ((c50.c1) i95.n0.c(c50.c1.class));
        r0Var.getClass();
        kotlin.jvm.internal.o.g(_scenenote, "_scenenote");
        r0Var.H1 = _scenenote;
        i95.m c17 = i95.n0.c(c50.c1.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c50.c1.l9((c50.c1) c17, i5Var, str, j17, i17, str5, "", 0L, "", "", null, str3, str2, null, 0L, 0, null, 61952, null);
    }
}
