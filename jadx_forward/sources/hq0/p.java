package hq0;

/* loaded from: classes7.dex */
public final class p implements gq0.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hq0.b0 f364571a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364572b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ iq0.e f364573c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f364574d;

    public p(hq0.b0 b0Var, java.lang.String str, iq0.e eVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f364571a = b0Var;
        this.f364572b = str;
        this.f364573c = eVar;
        this.f364574d = h0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(boolean r9, wq0.b r10) {
        /*
            r8 = this;
            java.lang.String r0 = "preViewState"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r0)
            hq0.b0 r0 = r8.f364571a
            java.lang.String r1 = r0.f364504y
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "frameSetId: "
            r2.<init>(r3)
            java.lang.String r3 = r8.f364572b
            r2.append(r3)
            java.lang.String r3 = " attachChangeCallback isAttach:"
            r2.append(r3)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2)
            r1 = 1
            java.lang.String r3 = "rootConfigId"
            iq0.e r4 = r8.f364573c
            if (r9 != 0) goto L54
            mq0.l0 r9 = r0.E
            java.lang.String r10 = r4.a()
            r9.getClass()
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r3)
            java.util.concurrent.ConcurrentHashMap r9 = r9.f412117b
            java.lang.Object r9 = r9.get(r10)
            mq0.k0 r9 = (mq0.k0) r9
            if (r9 == 0) goto L47
            long r5 = r9.f412107b
            long r5 = r5 + r1
            r9.f412107b = r5
        L47:
            r0.getClass()
            hq0.v r9 = new hq0.v
            r9.<init>(r4, r0)
            d75.b.g(r9)
            goto Lde
        L54:
            mq0.l0 r9 = r0.E
            java.lang.String r5 = r4.a()
            r9.getClass()
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r3)
            java.util.concurrent.ConcurrentHashMap r9 = r9.f412117b
            java.lang.Object r9 = r9.get(r5)
            mq0.k0 r9 = (mq0.k0) r9
            if (r9 == 0) goto L6f
            long r5 = r9.f412113h
            long r5 = r5 + r1
            r9.f412113h = r5
        L6f:
            kotlin.jvm.internal.h0 r9 = r8.f364574d
            java.lang.Object r5 = r9.f391656d
            com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer r5 = (com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d) r5
            java.lang.Runnable r6 = r5.f150219s
            r7 = 0
            if (r6 != 0) goto L87
            fq0.x r5 = r5.frameSet
            if (r5 == 0) goto L81
            boolean r5 = r5.f347022m
            goto L82
        L81:
            r5 = r7
        L82:
            if (r5 == 0) goto L85
            goto L87
        L85:
            r5 = r7
            goto L88
        L87:
            r5 = 1
        L88:
            if (r5 == 0) goto Lb4
            wq0.b r9 = wq0.b.f530028e
            if (r10 != r9) goto Lb1
            java.lang.String r9 = r0.f364504y
            java.lang.String r10 = "frameSetView attach, hit cache"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r9, r10)
            mq0.l0 r9 = r0.E
            java.lang.String r10 = r4.a()
            r9.getClass()
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r3)
            java.util.concurrent.ConcurrentHashMap r9 = r9.f412117b
            java.lang.Object r9 = r9.get(r10)
            mq0.k0 r9 = (mq0.k0) r9
            if (r9 == 0) goto Lde
            long r3 = r9.f412109d
            long r3 = r3 + r1
            r9.f412109d = r3
            goto Lde
        Lb1:
            java.lang.String r9 = r0.f364504y
            goto Lde
        Lb4:
            java.lang.String r10 = r0.f364504y
            java.lang.String r1 = "frameSetView attach, bind frameSet again"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r10, r1)
            java.lang.Object r9 = r9.f391656d
            com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer r9 = (com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d) r9
            java.util.concurrent.ConcurrentHashMap r10 = r0.C
            java.lang.String r1 = r4.a()
            java.lang.Object r1 = r10.get(r1)
            if (r1 != 0) goto Lce
            r0.R1(r4, r7)
        Lce:
            java.lang.String r0 = r4.a()
            java.lang.Object r10 = r10.get(r0)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r10)
            hq0.e0 r10 = (hq0.e0) r10
            r9.a(r10)
        Lde:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hq0.p.a(boolean, wq0.b):void");
    }
}
