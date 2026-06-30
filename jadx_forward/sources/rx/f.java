package rx;

@j95.b
/* loaded from: classes11.dex */
public final class f extends i95.w implements sx.b0 {
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.n2 Ai(java.lang.String mediaId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        com.p314xaae8f345.mm.p947xba6de98f.z aj6 = com.p314xaae8f345.mm.p947xba6de98f.s1.aj();
        if (aj6 != null) {
            return aj6.U6(mediaId);
        }
        return null;
    }

    public p3325xe03a0797.p3326xc267989b.p3328x30012e.n2 Bi(java.lang.String mediaId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        com.p314xaae8f345.mm.p947xba6de98f.z aj6 = com.p314xaae8f345.mm.p947xba6de98f.s1.aj();
        if (aj6 == null) {
            return null;
        }
        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 b17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(3, 0, null, 6, null);
        aj6.c7(new com.p314xaae8f345.mm.p947xba6de98f.j(aj6, mediaId, b17, null));
        return p3325xe03a0797.p3326xc267989b.p3328x30012e.l.a(b17);
    }

    public w65.m Di(kq.a params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        return new com.p314xaae8f345.mm.p947xba6de98f.c(params);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Ni(java.lang.String r7, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof rx.c
            if (r0 == 0) goto L13
            r0 = r8
            rx.c r0 = (rx.c) r0
            int r1 = r0.f482190f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f482190f = r1
            goto L18
        L13:
            rx.c r0 = new rx.c
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f482188d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f482190f
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L54
        L28:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L30:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            com.tencent.mm.modelcdntran.z r8 = com.p314xaae8f345.mm.p947xba6de98f.s1.aj()
            if (r8 == 0) goto L5d
            r0.f482190f = r4
            oz5.n r2 = new oz5.n
            kotlin.coroutines.Continuation r0 = pz5.f.b(r0)
            r2.<init>(r0)
            com.tencent.mm.modelcdntran.n r0 = new com.tencent.mm.modelcdntran.n
            r5 = 0
            r0.<init>(r2, r8, r7, r5)
            r8.c7(r0)
            java.lang.Object r8 = r2.a()
            if (r8 != r1) goto L54
            return r1
        L54:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            if (r7 == 0) goto L5d
            r3 = r4
        L5d:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.f.Ni(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public dn.m Ri(dn.m taskInfo, java.lang.ref.WeakReference listenerRef) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskInfo, "taskInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listenerRef, "listenerRef");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Cdn.CdnFSCJavaHelper", "startCdnDownload taskInfo field_mediaId:" + taskInfo.f69601xaca5bdda);
        com.p314xaae8f345.mm.p947xba6de98f.z aj6 = com.p314xaae8f345.mm.p947xba6de98f.s1.aj();
        p3325xe03a0797.p3326xc267989b.p3328x30012e.n2 d76 = aj6 != null ? aj6.d7(taskInfo) : null;
        if (d76 == null) {
            return null;
        }
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
        if (c20976x6ba6452a == null) {
            return taskInfo;
        }
        v65.i.b(c20976x6ba6452a, null, new com.p314xaae8f345.mm.p947xba6de98f.d0(d76, listenerRef, null), 1, null);
        return taskInfo;
    }

    public dn.m Ui(dn.m taskInfo, java.lang.ref.WeakReference listenerRef) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskInfo, "taskInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listenerRef, "listenerRef");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Cdn.CdnFSCJavaHelper", "startCdnUpload taskInfo field_mediaId:" + taskInfo.f69601xaca5bdda);
        com.p314xaae8f345.mm.p947xba6de98f.z aj6 = com.p314xaae8f345.mm.p947xba6de98f.s1.aj();
        p3325xe03a0797.p3326xc267989b.p3328x30012e.n2 e76 = aj6 != null ? aj6.e7(taskInfo) : null;
        if (e76 == null) {
            return null;
        }
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
        if (c20976x6ba6452a == null) {
            return taskInfo;
        }
        v65.i.b(c20976x6ba6452a, null, new com.p314xaae8f345.mm.p947xba6de98f.f0(e76, listenerRef, null), 1, null);
        return taskInfo;
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            ((aq1.q0) ((a25.q) i95.n0.c(a25.q.class))).getClass();
            mm.d0.f410008a.b(new rx.e(this));
        }
    }

    public java.lang.String wi(java.lang.String mediaId, java.lang.ref.WeakReference listenerRef) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listenerRef, "listenerRef");
        return com.p314xaae8f345.mm.p947xba6de98f.p0.f152648a.a(mediaId, listenerRef);
    }
}
