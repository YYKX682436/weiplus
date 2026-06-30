package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class v8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$StateListener f104772d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FeedContactChangeEvent f104773e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8(com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$StateListener finderFeedFullConvert$StateListener, com.tencent.mm.autogen.events.FeedContactChangeEvent feedContactChangeEvent) {
        super(0);
        this.f104772d = finderFeedFullConvert$StateListener;
        this.f104773e = feedContactChangeEvent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ba, code lost:
    
        if (r2.f310112d != false) goto L38;
     */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r6 = this;
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$StateListener r0 = r6.f104772d
            in5.s0 r1 = r0.f102827e
            java.lang.Object r2 = r1.f293125i
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) r2
            android.view.View r1 = r1.itemView
            boolean r1 = r1.isAttachedToWindow()
            if (r1 != 0) goto L12
            goto Lbf
        L12:
            r1 = 0
            if (r2 == 0) goto L20
            ya2.b2 r3 = r2.getContact()
            if (r3 == 0) goto L20
            java.lang.String r3 = r3.D0()
            goto L21
        L20:
            r3 = r1
        L21:
            if (r3 == 0) goto Lbf
            com.tencent.mm.autogen.events.FeedContactChangeEvent r3 = r6.f104773e
            am.ca r3 = r3.f54246g
            if (r3 == 0) goto L2c
            java.lang.String r3 = r3.f6341a
            goto L2d
        L2c:
            r3 = r1
        L2d:
            ya2.b2 r4 = r2.getContact()
            if (r4 == 0) goto L38
            java.lang.String r4 = r4.D0()
            goto L39
        L38:
            r4 = r1
        L39:
            boolean r3 = kotlin.jvm.internal.o.b(r3, r4)
            if (r3 == 0) goto Lbf
            com.tencent.mm.plugin.finder.convert.qe r3 = r0.f102826d
            in5.s0 r0 = r0.f102827e
            r3.v1(r2, r0)
            android.content.Context r2 = r0.f293121e
            boolean r4 = r2 instanceof androidx.appcompat.app.AppCompatActivity
            if (r4 == 0) goto L4f
            androidx.appcompat.app.AppCompatActivity r2 = (androidx.appcompat.app.AppCompatActivity) r2
            goto L50
        L4f:
            r2 = r1
        L50:
            if (r2 == 0) goto L5c
            androidx.lifecycle.o r2 = r2.mo133getLifecycle()
            if (r2 == 0) goto L5c
            androidx.lifecycle.n r1 = r2.b()
        L5c:
            androidx.lifecycle.n r2 = androidx.lifecycle.n.RESUMED
            if (r1 != r2) goto Lbc
            pf5.u r1 = pf5.u.f353936a
            android.content.Context r2 = r0.f293121e
            java.lang.String r4 = "getContext(...)"
            kotlin.jvm.internal.o.f(r2, r4)
            pf5.v r2 = r1.b(r2)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC> r5 = com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC.class
            androidx.lifecycle.c1 r2 = r2.a(r5)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC r2 = (com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC) r2
            boolean r2 = r2.P6()
            if (r2 != 0) goto Lbc
            android.content.Context r2 = r0.f293121e
            kotlin.jvm.internal.o.f(r2, r4)
            pf5.v r2 = r1.b(r2)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.s4> r5 = com.tencent.mm.plugin.finder.viewmodel.component.s4.class
            androidx.lifecycle.c1 r2 = r2.a(r5)
            com.tencent.mm.plugin.finder.viewmodel.component.s4 r2 = (com.tencent.mm.plugin.finder.viewmodel.component.s4) r2
            boolean r2 = r2.P6()
            if (r2 != 0) goto Lbc
            android.content.Context r2 = r0.f293121e
            kotlin.jvm.internal.o.f(r2, r4)
            pf5.v r1 = r1.b(r2)
            java.lang.Class<sc2.a8> r2 = sc2.a8.class
            androidx.lifecycle.c1 r1 = r1.a(r2)
            sc2.a8 r1 = (sc2.a8) r1
            r1.getClass()
            java.lang.String r2 = "holder"
            kotlin.jvm.internal.o.g(r0, r2)
            kotlin.jvm.internal.c0 r2 = new kotlin.jvm.internal.c0
            r2.<init>()
            sc2.z6 r4 = new sc2.z6
            r4.<init>(r2)
            r1.T6(r0, r4)
            boolean r1 = r2.f310112d
            if (r1 == 0) goto Lbf
        Lbc:
            r3.T0(r0)
        Lbf:
            jz5.f0 r0 = jz5.f0.f302826a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.v8.invoke():java.lang.Object");
    }
}
