package com.tencent.mm.booter;

/* loaded from: classes12.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f63417a;

    /* renamed from: b, reason: collision with root package name */
    public final int f63418b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f63419c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f63420d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f63421e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f63422f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f63423g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f63424h;

    /* renamed from: i, reason: collision with root package name */
    public final m3.d f63425i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f63426j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f63427k = false;

    /* renamed from: l, reason: collision with root package name */
    public int f63428l = 0;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Boolean f63429m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Boolean f63430n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.booter.CoreService f63431o;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m(com.tencent.mm.booter.CoreService r5, int r6, int r7, byte[] r8, com.tencent.mm.booter.c r9) {
        /*
            r4 = this;
            r4.f63431o = r5
            r4.<init>()
            r9 = 0
            r4.f63427k = r9
            r4.f63428l = r9
            r4.f63417a = r6
            r4.f63418b = r7
            r4.f63419c = r8
            android.content.SharedPreferences r6 = com.tencent.mm.network.x2.j()
            java.lang.String r8 = "is_in_notify_mode"
            com.tencent.mm.sdk.platformtools.o4 r6 = (com.tencent.mm.sdk.platformtools.o4) r6
            boolean r6 = r6.getBoolean(r8, r9)
            r4.f63420d = r6
            com.tencent.mm.network.g1 r8 = r5.f63236d
            com.tencent.mm.network.AccInfo r8 = r8.f71993n
            boolean r8 = r8.isLogin()
            r4.f63421e = r8
            com.tencent.mm.network.g1 r0 = com.tencent.mm.network.x2.c()
            com.tencent.mm.network.f1 r0 = r0.f72001v
            java.lang.String r1 = ""
            java.lang.String r2 = "MicroMsg.MMAutoAuth"
            if (r0 != 0) goto L3c
            java.lang.String r0 = "workerCB == null"
            com.tencent.mars.xlog.Log.i(r2, r0)
        L3a:
            r0 = r9
            goto L48
        L3c:
            boolean r0 = r0.R0()     // Catch: java.lang.Exception -> L41
            goto L48
        L41:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r9]
            com.tencent.mars.xlog.Log.printErrStackTrace(r2, r0, r1, r3)
            goto L3a
        L48:
            r4.f63422f = r0
            if (r6 == 0) goto L51
            if (r8 == 0) goto L51
            if (r0 != 0) goto L51
            r9 = 1
        L51:
            r4.f63423g = r9
            boolean r6 = r5.f63239g
            r4.f63424h = r6
            if (r7 <= 0) goto L73
            java.lang.Class<a25.q> r9 = a25.q.class
            i95.m r9 = i95.n0.c(r9)
            a25.q r9 = (a25.q) r9
            aq1.q0 r9 = (aq1.q0) r9
            boolean r7 = r9.Ni(r7)
            if (r7 != 0) goto L73
            m3.d r6 = new m3.d
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            java.lang.String r8 = "Unsupported"
            r6.<init>(r7, r8)
            goto L96
        L73:
            if (r8 != 0) goto L7f
            m3.d r6 = new m3.d
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            java.lang.String r8 = "NotLogin"
            r6.<init>(r7, r8)
            goto L96
        L7f:
            if (r6 != 0) goto L8f
            boolean r6 = com.tencent.mm.sdk.platformtools.x2.f193077g
            if (r6 != 0) goto L8f
            m3.d r6 = new m3.d
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            java.lang.String r8 = "NotStandby"
            r6.<init>(r7, r8)
            goto L96
        L8f:
            m3.d r6 = new m3.d
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r6.<init>(r7, r1)
        L96:
            r4.f63425i = r6
            boolean r5 = r5.f63240h
            r4.f63426j = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.booter.m.<init>(com.tencent.mm.booter.CoreService, int, int, byte[], com.tencent.mm.booter.c):void");
    }

    public final boolean a() {
        return this.f63423g || ((java.lang.Boolean) this.f63425i.f323092a).booleanValue();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:34:0x004c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x033c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b() {
        /*
            Method dump skipped, instructions count: 1486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.booter.m.b():boolean");
    }

    public final boolean c() {
        if (a()) {
            return true;
        }
        return !a() && !this.f63422f && this.f63426j && ((java.lang.String) this.f63425i.f323093b).equals("NotStandby");
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LightPushQuery{opType=");
        sb6.append(this.f63417a);
        sb6.append(", respType=");
        sb6.append(this.f63418b);
        sb6.append(", respBuf=");
        byte[] bArr = this.f63419c;
        sb6.append(bArr == null ? null : java.lang.Integer.valueOf(bArr.length));
        sb6.append(", isInNotifyMode=");
        sb6.append(this.f63420d);
        sb6.append(", isLogin=");
        sb6.append(this.f63421e);
        sb6.append(", isMMProcessExist=");
        sb6.append(this.f63422f);
        sb6.append(", manualLightPushEnabled=");
        sb6.append(this.f63423g);
        sb6.append(", autoLightPushEnabled=");
        sb6.append(this.f63424h);
        sb6.append(", autoLightPushSupport=");
        sb6.append(this.f63425i);
        sb6.append(", bypassLightPushEnabled=");
        sb6.append(this.f63426j);
        sb6.append(", hasTryDealNotifyByLightPush=");
        sb6.append(this.f63427k);
        sb6.append(", lightPushResult=");
        sb6.append(this.f63428l);
        sb6.append(", isMainProcStandby=");
        sb6.append(this.f63429m);
        sb6.append(", isMainProcAlive=");
        sb6.append(this.f63430n);
        sb6.append('}');
        return sb6.toString();
    }
}
