package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderSharePostUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder-publish_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderSharePostUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI {
    public static final /* synthetic */ int B = 0;
    public r45.n46 A;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f109545t = "Finder.FinderSharePostUI";

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f109546u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f109547v;

    /* renamed from: w, reason: collision with root package name */
    public android.content.DialogInterface.OnCancelListener f109548w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f109549x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f109550y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f109551z;

    public FinderSharePostUI() {
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490604zq);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        this.f109547v = string;
        this.f109551z = jz5.h.b(com.tencent.mm.plugin.finder.feed.ui.dl.f109950d);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: X6, reason: from getter */
    public java.lang.String getF109545t() {
        return this.f109545t;
    }

    public final void c7() {
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.ui.rk(this));
    }

    public final boolean d7(java.lang.String str, qc0.d1 d1Var, java.lang.String str2, java.lang.String str3) {
        if (d1Var == null) {
            return true;
        }
        long j17 = d1Var.f361366d;
        java.lang.String str4 = this.f109545t;
        if (j17 < 3000) {
            com.tencent.mars.xlog.Log.i(str4, "failed 3s");
            pm0.v.X(new com.tencent.mm.plugin.finder.feed.ui.uk(this, str2, str3));
            return false;
        }
        if (j17 > 60000) {
            com.tencent.mars.xlog.Log.i(str4, "failed 60s");
            pm0.v.X(new com.tencent.mm.plugin.finder.feed.ui.wk(this, str2, str3));
            return false;
        }
        if (com.tencent.mm.vfs.w6.k(str) <= 524288000) {
            return true;
        }
        com.tencent.mars.xlog.Log.i(str4, "failed 500M");
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.ui.yk(this, str2, str3));
        return false;
    }

    public final void e7(int i17, java.lang.String errMsg, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        com.tencent.mars.xlog.Log.i(this.f109545t, "fallback errcode:" + i17 + ", " + errMsg + ", " + str2);
        if (this.f109550y) {
            return;
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("errCode", i17);
        jSONObject.put("errmsg", errMsg);
        kotlin.jvm.internal.o.f(jSONObject.toString(), "toString(...)");
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
        ((kt.s0) ((lt.r0) i95.n0.c(lt.r0.class))).Ai(str == null ? "" : str, jSONObject.toString(), str2 == null ? "" : str2, -1, "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007c, code lost:
    
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1253, 70, 1);
        new db2.w2(r9, r10, null, null, null, null, 60, null).l().K(new com.tencent.mm.plugin.finder.feed.ui.fl(r6, r18, r20));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033 A[Catch: all -> 0x00ab, TryCatch #0 {all -> 0x00ab, blocks: (B:3:0x000c, B:5:0x0012, B:8:0x0027, B:13:0x0033, B:16:0x003c, B:18:0x0049, B:20:0x0054, B:21:0x005d, B:23:0x0064, B:29:0x0072, B:34:0x007c, B:36:0x00a2), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c A[Catch: all -> 0x00ab, TryCatch #0 {all -> 0x00ab, blocks: (B:3:0x000c, B:5:0x0012, B:8:0x0027, B:13:0x0033, B:16:0x003c, B:18:0x0049, B:20:0x0054, B:21:0x005d, B:23:0x0064, B:29:0x0072, B:34:0x007c, B:36:0x00a2), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f7(java.lang.String r19, yz5.l r20) {
        /*
            r18 = this;
            r1 = r18
            r2 = r20
            java.lang.String r3 = r1.f109545t
            r0 = 16
            r4 = 0
            r5 = 0
            r6 = r19
            byte[] r0 = yk1.b.a(r6, r0)     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto L23
            java.lang.String r6 = "UTF-8"
            java.nio.charset.Charset r6 = java.nio.charset.Charset.forName(r6)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r7 = "forName(...)"
            kotlin.jvm.internal.o.f(r6, r7)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r7 = new java.lang.String     // Catch: java.lang.Throwable -> Lab
            r7.<init>(r0, r6)     // Catch: java.lang.Throwable -> Lab
            goto L24
        L23:
            r7 = r5
        L24:
            r0 = 1
            if (r7 == 0) goto L30
            int r6 = r7.length()     // Catch: java.lang.Throwable -> Lab
            if (r6 != 0) goto L2e
            goto L30
        L2e:
            r6 = r4
            goto L31
        L30:
            r6 = r0
        L31:
            if (r6 == 0) goto L3c
            java.lang.String r0 = "decoderStr empty"
            com.tencent.mars.xlog.Log.i(r3, r0)     // Catch: java.lang.Throwable -> Lab
            r2.invoke(r5)     // Catch: java.lang.Throwable -> Lab
            return
        L3c:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lab
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r7 = "eventConfig"
            org.json.JSONObject r6 = r6.optJSONObject(r7)     // Catch: java.lang.Throwable -> Lab
            if (r6 == 0) goto L51
            java.lang.String r7 = "finderNickname"
            java.lang.String r7 = r6.optString(r7)     // Catch: java.lang.Throwable -> Lab
            r9 = r7
            goto L52
        L51:
            r9 = r5
        L52:
            if (r6 == 0) goto L5c
            java.lang.String r7 = "eventName"
            java.lang.String r6 = r6.optString(r7)     // Catch: java.lang.Throwable -> Lab
            r10 = r6
            goto L5d
        L5c:
            r10 = r5
        L5d:
            kotlin.jvm.internal.h0 r6 = new kotlin.jvm.internal.h0     // Catch: java.lang.Throwable -> Lab
            r6.<init>()     // Catch: java.lang.Throwable -> Lab
            if (r9 == 0) goto L6d
            int r7 = r9.length()     // Catch: java.lang.Throwable -> Lab
            if (r7 != 0) goto L6b
            goto L6d
        L6b:
            r7 = r4
            goto L6e
        L6d:
            r7 = r0
        L6e:
            if (r7 != 0) goto La2
            if (r10 == 0) goto L7a
            int r7 = r10.length()     // Catch: java.lang.Throwable -> Lab
            if (r7 != 0) goto L79
            goto L7a
        L79:
            r0 = r4
        L7a:
            if (r0 != 0) goto La2
            com.tencent.mm.plugin.report.service.g0 r11 = com.tencent.mm.plugin.report.service.g0.INSTANCE     // Catch: java.lang.Throwable -> Lab
            r12 = 1253(0x4e5, double:6.19E-321)
            r14 = 70
            r16 = 1
            r11.C(r12, r14, r16)     // Catch: java.lang.Throwable -> Lab
            db2.w2 r0 = new db2.w2     // Catch: java.lang.Throwable -> Lab
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 60
            r16 = 0
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> Lab
            pq5.g r0 = r0.l()     // Catch: java.lang.Throwable -> Lab
            com.tencent.mm.plugin.finder.feed.ui.fl r7 = new com.tencent.mm.plugin.finder.feed.ui.fl     // Catch: java.lang.Throwable -> Lab
            r7.<init>(r6, r1, r2)     // Catch: java.lang.Throwable -> Lab
            r0.K(r7)     // Catch: java.lang.Throwable -> Lab
            goto Lbb
        La2:
            r2.invoke(r5)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r0 = "nickName or eventName is Empty"
            com.tencent.mars.xlog.Log.i(r3, r0)     // Catch: java.lang.Throwable -> Lab
            goto Lbb
        Lab:
            r0 = move-exception
            r2.invoke(r5)
            java.lang.String r2 = "exception"
            com.tencent.mars.xlog.Log.i(r3, r2)
            java.lang.String r2 = ""
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.tencent.mars.xlog.Log.printErrStackTrace(r3, r0, r2, r4)
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI.f7(java.lang.String, yz5.l):void");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489094b92;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0078  */
    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI.onCreate(android.os.Bundle):void");
    }
}
