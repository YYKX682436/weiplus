package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderSharePostUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder-publish_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI */
/* loaded from: classes3.dex */
public final class ActivityC14093x52d98fcd extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa {
    public static final /* synthetic */ int B = 0;
    public r45.n46 A;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f191078t = "Finder.FinderSharePostUI";

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f191079u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f191080v;

    /* renamed from: w, reason: collision with root package name */
    public android.content.DialogInterface.OnCancelListener f191081w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f191082x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f191083y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f191084z;

    public ActivityC14093x52d98fcd() {
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        this.f191080v = string;
        this.f191084z = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.dl.f191483d);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa
    /* renamed from: X6, reason: from getter */
    public java.lang.String getF191078t() {
        return this.f191078t;
    }

    public final void c7() {
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.rk(this));
    }

    public final boolean d7(java.lang.String str, qc0.d1 d1Var, java.lang.String str2, java.lang.String str3) {
        if (d1Var == null) {
            return true;
        }
        long j17 = d1Var.f442899d;
        java.lang.String str4 = this.f191078t;
        if (j17 < 3000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "failed 3s");
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.uk(this, str2, str3));
            return false;
        }
        if (j17 > 60000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "failed 60s");
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.wk(this, str2, str3));
            return false;
        }
        if (com.p314xaae8f345.mm.vfs.w6.k(str) <= 524288000) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "failed 500M");
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.yk(this, str2, str3));
        return false;
    }

    public final void e7(int i17, java.lang.String errMsg, java.lang.String str, java.lang.String str2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f191078t, "fallback errcode:" + i17 + ", " + errMsg + ", " + str2);
        if (this.f191083y) {
            return;
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("errCode", i17);
        jSONObject.put("errmsg", errMsg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject.toString(), "toString(...)");
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        ((kt.s0) ((lt.r0) i95.n0.c(lt.r0.class))).Ai(str == null ? "" : str, jSONObject.toString(), str2 == null ? "" : str2, -1, "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007c, code lost:
    
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1253, 70, 1);
        new db2.w2(r9, r10, null, null, null, null, 60, null).l().K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.fl(r6, r18, r20));
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
            java.lang.String r3 = r1.f191078t
            r0 = 16
            r4 = 0
            r5 = 0
            r6 = r19
            byte[] r0 = yk1.b.a(r6, r0)     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto L23
            java.lang.String r6 = "UTF-8"
            java.nio.charset.Charset r6 = java.nio.charset.Charset.forName(r6)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r7 = "forName(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r6, r7)     // Catch: java.lang.Throwable -> Lab
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r0)     // Catch: java.lang.Throwable -> Lab
            r2.mo146xb9724478(r5)     // Catch: java.lang.Throwable -> Lab
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
            com.tencent.mm.plugin.report.service.g0 r11 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE     // Catch: java.lang.Throwable -> Lab
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
            r2.mo146xb9724478(r5)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r0 = "nickName or eventName is Empty"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r0)     // Catch: java.lang.Throwable -> Lab
            goto Lbb
        Lab:
            r0 = move-exception
            r2.mo146xb9724478(r5)
            java.lang.String r2 = "exception"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r2)
            java.lang.String r2 = ""
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r3, r0, r2, r4)
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14093x52d98fcd.f7(java.lang.String, yz5.l):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570627b92;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0078  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14093x52d98fcd.onCreate(android.os.Bundle):void");
    }
}
