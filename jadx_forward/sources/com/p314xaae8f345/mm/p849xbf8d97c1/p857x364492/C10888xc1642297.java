package com.p314xaae8f345.mm.p849xbf8d97c1.p857x364492;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/matrix/test/PushKillerTest;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "plugin-performance_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.matrix.test.PushKillerTest */
/* loaded from: classes12.dex */
public final class C10888xc1642297 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p849xbf8d97c1.p857x364492.C10888xc1642297 f150379a = new com.p314xaae8f345.mm.p849xbf8d97c1.p857x364492.C10888xc1642297();

    private C10888xc1642297() {
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007a A[EDGE_INSN: B:28:0x007a->B:29:0x007a BREAK  A[LOOP:0: B:19:0x0045->B:36:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[LOOP:0: B:19:0x0045->B:36:?, LOOP_END, SYNTHETIC] */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onReceive(android.content.Context r9, android.content.Intent r10) {
        /*
            r8 = this;
            r9 = 0
            if (r10 == 0) goto L8
            java.lang.String r10 = r10.getAction()
            goto L9
        L8:
            r10 = r9
        L9:
            java.lang.String r0 = "com.tencent.matrix.kill.lru"
            boolean r10 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r10, r0)
            if (r10 == 0) goto Lbf
            boolean r10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.p()
            if (r10 == 0) goto Lbf
            com.tencent.matrix.lifecycle.supervisor.d0 r10 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134367k
            kr0.a r0 = kr0.a.f392833d
            r10.getClass()
            boolean r1 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.ServiceC4692xa1b1260d.f134338i
            com.tencent.matrix.lifecycle.supervisor.SupervisorService r1 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.ServiceC4692xa1b1260d.f134342p
            if (r1 == 0) goto Lbf
            r10.getClass()
            com.tencent.matrix.lifecycle.supervisor.j0 r10 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134360d
            r2 = 0
            if (r10 == 0) goto Lb6
            boolean r10 = r10.f134377a
            r3 = 1
            if (r3 == r10) goto L33
            goto Lb6
        L33:
            boolean r10 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.ServiceC4692xa1b1260d.f134338i
            if (r10 == 0) goto Lae
            com.tencent.matrix.lifecycle.supervisor.SupervisorService r10 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.ServiceC4692xa1b1260d.f134342p
            if (r10 == 0) goto La5
            r1.f134347g = r0
            java.util.concurrent.ConcurrentLinkedQueue r10 = r1.b()
            java.util.Iterator r10 = r10.iterator()
        L45:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L79
            java.lang.Object r4 = r10.next()
            r5 = r4
            com.tencent.matrix.lifecycle.supervisor.ProcessToken r5 = (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea) r5
            java.lang.String r6 = r5.f134326f
            java.lang.String r7 = oj.m.b(r1)
            boolean r6 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r6, r7)
            r6 = r6 ^ r3
            if (r6 == 0) goto L75
            com.tencent.matrix.lifecycle.supervisor.d0 r6 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134367k
            r6.getClass()
            com.tencent.matrix.lifecycle.supervisor.j0 r6 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134360d
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r6)
            java.util.List r6 = r6.f134379c
            java.lang.String r5 = r5.f134326f
            boolean r5 = r6.contains(r5)
            if (r5 != 0) goto L75
            r5 = r3
            goto L76
        L75:
            r5 = r2
        L76:
            if (r5 == 0) goto L45
            goto L7a
        L79:
            r4 = r9
        L7a:
            com.tencent.matrix.lifecycle.supervisor.ProcessToken r4 = (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea) r4
            if (r4 == 0) goto L97
            com.tencent.matrix.lifecycle.supervisor.v r9 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.v.f134416f
            com.tencent.matrix.lifecycle.supervisor.p r9 = r9.c()
            java.lang.String r10 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.ServiceC4692xa1b1260d.f134340n
            java.lang.String r0 = r4.f134326f
            int r1 = r4.f134325e
            java.util.concurrent.ConcurrentHashMap r2 = r9.c()
            com.tencent.matrix.lifecycle.supervisor.l r3 = new com.tencent.matrix.lifecycle.supervisor.l
            r3.<init>(r10, r0, r1)
            r9.b(r2, r3)
            goto Lbf
        L97:
            r10 = 4
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r1 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.mo147xb9724478(r10, r9, r1)
            goto Lbf
        La5:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "not initialized yet !"
            r9.<init>(r10)
            throw r9
        Lae:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "backgroundLruKill should only be called in supervisor"
            r9.<init>(r10)
            throw r9
        Lb6:
            java.lang.Object[] r9 = new java.lang.Object[r2]
            java.lang.String r10 = "Matrix.ProcessSupervisor.Service"
            java.lang.String r0 = "backgroundLruKill: supervisor was disabled"
            oj.j.b(r10, r0, r9)
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p849xbf8d97c1.p857x364492.C10888xc1642297.onReceive(android.content.Context, android.content.Intent):void");
    }
}
