package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class uh implements fs2.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f109182d;

    /* renamed from: e, reason: collision with root package name */
    public final int f109183e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f109184f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f109185g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f109186h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f109187i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.li f109188m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f109189n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.FinderLiveMentionNotifyContract$NotifyPresenter$followListener$1 f109190o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f109191p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f109192q;

    /* JADX WARN: Type inference failed for: r3v2, types: [com.tencent.mm.plugin.finder.feed.FinderLiveMentionNotifyContract$NotifyPresenter$followListener$1] */
    public uh(int i17, int i18, int[] msgTypes) {
        kotlin.jvm.internal.o.g(msgTypes, "msgTypes");
        this.f109182d = i17;
        this.f109183e = i18;
        this.f109184f = msgTypes;
        this.f109185g = new java.util.concurrent.atomic.AtomicLong(0L);
        this.f109186h = new java.util.concurrent.atomic.AtomicReference();
        this.f109187i = new java.util.HashMap();
        this.f109189n = jz5.h.b(new com.tencent.mm.plugin.finder.feed.oh(this));
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f109190o = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FollowUserEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.FinderLiveMentionNotifyContract$NotifyPresenter$followListener$1
            {
                this.__eventId = 398763182;
            }

            /* JADX WARN: Code restructure failed: missing block: B:29:0x005f, code lost:
            
                if ((((r2 != null && r2.intValue() == 2) || (r2 != null && r2.intValue() == 5)) || (r2 != null && r2.intValue() == 3)) != false) goto L23;
             */
            @Override // com.tencent.mm.sdk.event.IListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean callback(com.tencent.mm.autogen.events.FollowUserEvent r8) {
                /*
                    r7 = this;
                    com.tencent.mm.autogen.events.FollowUserEvent r8 = (com.tencent.mm.autogen.events.FollowUserEvent) r8
                    java.lang.String r0 = "event"
                    kotlin.jvm.internal.o.g(r8, r0)
                    r0 = 0
                    am.zd r8 = r8.f54346g
                    if (r8 == 0) goto Lf
                    java.lang.String r1 = r8.f8551a
                    goto L10
                Lf:
                    r1 = r0
                L10:
                    if (r8 == 0) goto L19
                    int r2 = r8.f8552b
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                    goto L1a
                L19:
                    r2 = r0
                L1a:
                    r3 = 0
                    r4 = 1
                    if (r2 != 0) goto L1f
                    goto L26
                L1f:
                    int r5 = r2.intValue()
                    if (r5 != r4) goto L26
                    goto L30
                L26:
                    if (r2 != 0) goto L29
                    goto L32
                L29:
                    int r5 = r2.intValue()
                    r6 = 4
                    if (r5 != r6) goto L32
                L30:
                    r5 = r4
                    goto L33
                L32:
                    r5 = r3
                L33:
                    r6 = 2
                    if (r5 == 0) goto L38
                L36:
                    r4 = r6
                    goto L62
                L38:
                    if (r2 != 0) goto L3b
                    goto L42
                L3b:
                    int r5 = r2.intValue()
                    if (r5 != r6) goto L42
                    goto L4c
                L42:
                    if (r2 != 0) goto L45
                    goto L4e
                L45:
                    int r5 = r2.intValue()
                    r6 = 5
                    if (r5 != r6) goto L4e
                L4c:
                    r5 = r4
                    goto L4f
                L4e:
                    r5 = r3
                L4f:
                    r6 = 3
                    if (r5 == 0) goto L53
                    goto L5c
                L53:
                    if (r2 != 0) goto L56
                    goto L5e
                L56:
                    int r2 = r2.intValue()
                    if (r2 != r6) goto L5e
                L5c:
                    r2 = r4
                    goto L5f
                L5e:
                    r2 = r3
                L5f:
                    if (r2 == 0) goto L62
                    goto L36
                L62:
                    if (r8 == 0) goto L6a
                    boolean r8 = r8.f8553c
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
                L6a:
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder
                    java.lang.String r2 = "followListener callback "
                    r8.<init>(r2)
                    r8.append(r1)
                    r2 = 32
                    r8.append(r2)
                    r8.append(r4)
                    r8.append(r2)
                    r8.append(r0)
                    java.lang.String r8 = r8.toString()
                    java.lang.String r0 = "FinderLiveMention.NotifyPresenter"
                    com.tencent.mars.xlog.Log.i(r0, r8)
                    com.tencent.mm.plugin.finder.feed.ph r8 = new com.tencent.mm.plugin.finder.feed.ph
                    com.tencent.mm.plugin.finder.feed.uh r0 = com.tencent.mm.plugin.finder.feed.uh.this
                    r8.<init>(r0, r1, r4)
                    pm0.v.X(r8)
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.FinderLiveMentionNotifyContract$NotifyPresenter$followListener$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.f109191p = new java.util.ArrayList();
        this.f109192q = true;
    }

    public final void c() {
        int i17 = this.f109182d;
        int i18 = this.f109183e;
        java.lang.String str = (java.lang.String) ((jz5.n) this.f109189n).getValue();
        byte[] bArr = (byte[]) this.f109187i.get(java.lang.Integer.valueOf(this.f109183e));
        if (bArr == null) {
            bArr = new byte[0];
        }
        pm0.v.T(new bq.a(i17, i18, str, "", com.tencent.mm.protobuf.g.b(bArr)).l(), new com.tencent.mm.plugin.finder.feed.nh(this));
        com.tencent.mm.plugin.finder.feed.mi.f107384a = android.os.SystemClock.uptimeMillis();
    }

    public final void f(boolean z17) {
        com.tencent.mm.plugin.finder.feed.li liVar = this.f109188m;
        if (liVar != null) {
            pm0.v.X(new com.tencent.mm.plugin.finder.feed.ki(null, liVar, false, 0));
        }
        com.tencent.mars.xlog.Log.i("FinderLiveMention.NotifyPresenter", "requestRefresh , " + z17);
        if (z17) {
            return;
        }
        c();
    }

    @Override // fs2.a
    public void onDetach() {
    }
}
