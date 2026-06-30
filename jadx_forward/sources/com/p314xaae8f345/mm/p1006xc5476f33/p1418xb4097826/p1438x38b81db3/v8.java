package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class v8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.C13692x3d448d21 f186305d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5436xd7d34ee8 f186306e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.C13692x3d448d21 c13692x3d448d21, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5436xd7d34ee8 c5436xd7d34ee8) {
        super(0);
        this.f186305d = c13692x3d448d21;
        this.f186306e = c5436xd7d34ee8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ba, code lost:
    
        if (r2.f391645d != false) goto L38;
     */
    @Override // yz5.a
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo152xb9724478() {
        /*
            r6 = this;
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$StateListener r0 = r6.f186305d
            in5.s0 r1 = r0.f184360e
            java.lang.Object r2 = r1.f374658i
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) r2
            android.view.View r1 = r1.f3639x46306858
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
            com.tencent.mm.autogen.events.FeedContactChangeEvent r3 = r6.f186306e
            am.ca r3 = r3.f135779g
            if (r3 == 0) goto L2c
            java.lang.String r3 = r3.f87874a
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
            boolean r3 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r3, r4)
            if (r3 == 0) goto Lbf
            com.tencent.mm.plugin.finder.convert.qe r3 = r0.f184359d
            in5.s0 r0 = r0.f184360e
            r3.v1(r2, r0)
            android.content.Context r2 = r0.f374654e
            boolean r4 = r2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112
            if (r4 == 0) goto L4f
            androidx.appcompat.app.AppCompatActivity r2 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) r2
            goto L50
        L4f:
            r2 = r1
        L50:
            if (r2 == 0) goto L5c
            androidx.lifecycle.o r2 = r2.mo273xed6858b4()
            if (r2 == 0) goto L5c
            androidx.lifecycle.n r1 = r2.b()
        L5c:
            androidx.lifecycle.n r2 = p012xc85e97e9.p093xedfae76a.n.RESUMED
            if (r1 != r2) goto Lbc
            pf5.u r1 = pf5.u.f435469a
            android.content.Context r2 = r0.f374654e
            java.lang.String r4 = "getContext(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r4)
            pf5.v r2 = r1.b(r2)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC> r5 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15471x9d199e5b.class
            androidx.lifecycle.c1 r2 = r2.a(r5)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC r2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15471x9d199e5b) r2
            boolean r2 = r2.P6()
            if (r2 != 0) goto Lbc
            android.content.Context r2 = r0.f374654e
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r4)
            pf5.v r2 = r1.b(r2)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.s4> r5 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.s4.class
            androidx.lifecycle.c1 r2 = r2.a(r5)
            com.tencent.mm.plugin.finder.viewmodel.component.s4 r2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.s4) r2
            boolean r2 = r2.P6()
            if (r2 != 0) goto Lbc
            android.content.Context r2 = r0.f374654e
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r4)
            pf5.v r1 = r1.b(r2)
            java.lang.Class<sc2.a8> r2 = sc2.a8.class
            androidx.lifecycle.c1 r1 = r1.a(r2)
            sc2.a8 r1 = (sc2.a8) r1
            r1.getClass()
            java.lang.String r2 = "holder"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r0, r2)
            kotlin.jvm.internal.c0 r2 = new kotlin.jvm.internal.c0
            r2.<init>()
            sc2.z6 r4 = new sc2.z6
            r4.<init>(r2)
            r1.T6(r0, r4)
            boolean r1 = r2.f391645d
            if (r1 == 0) goto Lbf
        Lbc:
            r3.T0(r0)
        Lbf:
            jz5.f0 r0 = jz5.f0.f384359a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.v8.mo152xb9724478():java.lang.Object");
    }
}
