package mh2;

/* loaded from: classes10.dex */
public final class m1 extends mh2.a {

    /* renamed from: c, reason: collision with root package name */
    public final ah2.f f407938c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 f407939d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa f407940e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(android.content.Context context, android.view.ViewGroup root, ah2.f contentService) {
        super(context, root);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentService, "contentService");
        this.f407938c = contentService;
        android.view.View findViewById = this.f407825b.findViewById(com.p314xaae8f345.mm.R.id.qxy);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f407939d = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502) findViewById;
    }

    @Override // mh2.a
    public int a() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e_x;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    @Override // mh2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(om2.d0 r8) {
        /*
            r7 = this;
            java.lang.String r0 = "singState"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r0)
            boolean r0 = r8 instanceof om2.e0
            r1 = 0
            if (r0 == 0) goto Le
            om2.e0 r8 = (om2.e0) r8
            goto Lf
        Le:
            r8 = r1
        Lf:
            com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView r0 = r7.f407939d
            if (r8 == 0) goto L75
            om2.o r8 = r8.f427832a
            r45.xn1 r8 = r8.f427894b
            r2 = 0
            if (r8 == 0) goto L21
            com.tencent.mm.protobuf.f r8 = r8.m75936x14adae67(r2)
            com.tencent.mm.protocal.protobuf.FinderContact r8 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) r8
            goto L22
        L21:
            r8 = r1
        L22:
            com.tencent.mm.protocal.protobuf.FinderContact r3 = r7.f407940e
            r4 = 1
            if (r3 != 0) goto L29
            r5 = r4
            goto L2a
        L29:
            r5 = r2
        L2a:
            if (r5 != 0) goto L41
            java.lang.String r3 = r3.m76175x6d346f39()
            if (r8 == 0) goto L37
            java.lang.String r5 = r8.m76175x6d346f39()
            goto L38
        L37:
            r5 = r1
        L38:
            boolean r3 = r26.i0.p(r3, r5, r2)
            if (r3 == 0) goto L3f
            goto L41
        L3f:
            r3 = r2
            goto L42
        L41:
            r3 = r4
        L42:
            r7.f407940e = r8
            r5 = 2131298003(0x7f0906d3, float:1.8213967E38)
            android.view.View r6 = r7.f407825b
            android.view.View r5 = r6.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            if (r8 == 0) goto L52
            r2 = r4
        L52:
            if (r2 == 0) goto L72
            if (r3 == 0) goto L5c
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r5)
            r7.b(r5, r8)
        L5c:
            java.lang.String r8 = r8.m76197x6c03c64c()
            boolean r8 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.S3(r8)
            if (r8 == 0) goto L6c
            jj2.e r8 = jj2.e.f381512d
            r0.m56875xb4464262(r8)
            goto L75
        L6c:
            jj2.e r8 = jj2.e.f381513e
            r0.m56875xb4464262(r8)
            goto L75
        L72:
            r5.setImageURI(r1)
        L75:
            mh2.k1 r8 = new mh2.k1
            r8.<init>(r7)
            r0.post(r8)
            ah2.f r8 = r7.f407938c
            kotlinx.coroutines.y0 r1 = r8.a()
            r0.b(r1)
            mh2.l1 r0 = new mh2.l1
            r0.<init>(r7)
            r8.b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mh2.m1.c(om2.d0):void");
    }
}
