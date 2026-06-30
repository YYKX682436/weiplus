package dn2;

/* loaded from: classes2.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dn2.m f323452d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qq1 f323453e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f323454f;

    public i(dn2.m mVar, r45.qq1 qq1Var, java.lang.Object obj) {
        this.f323452d = mVar;
        this.f323453e = qq1Var;
        this.f323454f = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005f  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r9) {
        /*
            r8 = this;
            java.lang.String r0 = "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/LikeRecommendBulletItem$getView$1$2$1"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r9)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r8
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            r45.qq1 r9 = r8.f323453e
            r0 = 0
            java.util.LinkedList r1 = r9.m75941xfb821914(r0)
            int r1 = r1.size()
            dn2.m r2 = r8.f323452d
            r3 = 2
            r2.e(r3, r1)
            com.tencent.mm.protocal.protobuf.FinderObject r1 = new com.tencent.mm.protocal.protobuf.FinderObject
            r1.<init>()
            dk2.ef r2 = dk2.ef.f314905a
            java.lang.Class<mm2.c1> r4 = mm2.c1.class
            androidx.lifecycle.c1 r2 = r2.i(r4)
            mm2.c1 r2 = (mm2.c1) r2
            r4 = 0
            if (r2 == 0) goto L47
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.f410379n
            if (r2 == 0) goto L47
            byte[] r2 = r2.mo14344x5f01b1f6()
            goto L48
        L47:
            r2 = r4
        L48:
            if (r2 != 0) goto L4c
        L4a:
            r1 = r4
            goto L5d
        L4c:
            r1.mo11468x92b714fd(r2)     // Catch: java.lang.Exception -> L50
            goto L5d
        L50:
            r1 = move-exception
            java.lang.String r2 = ""
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r5 = "safeParser"
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r5, r2, r1)
            goto L4a
        L5d:
            if (r1 == 0) goto L65
            com.tencent.mm.plugin.finder.storage.h90 r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r2.a(r1, r0)
        L65:
            if (r4 != 0) goto L68
            goto L73
        L68:
            java.util.LinkedList r1 = r9.m75941xfb821914(r0)
            int r1 = r1.size()
            r4.m59382x2d5669f8(r1)
        L73:
            if (r4 != 0) goto L76
            goto Lc4
        L76:
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            java.util.LinkedList r9 = r9.m75941xfb821914(r0)
            java.lang.String r2 = "getFriend_list(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r9, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r5 = 10
            int r5 = kz5.d0.q(r9, r5)
            r2.<init>(r5)
            java.util.Iterator r9 = r9.iterator()
        L93:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto Lbe
            java.lang.Object r5 = r9.next()
            r45.xj5 r5 = (r45.xj5) r5
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r6 = new com.tencent.mm.protocal.protobuf.FinderCommentInfo
            r6.<init>()
            r7 = 1
            java.lang.String r7 = r5.m75945x2fec8307(r7)
            r6.m76153x66bc2758(r7)
            java.lang.String r7 = r5.m75945x2fec8307(r3)
            r6.m76135x7ac946f0(r7)
            java.lang.String r5 = r5.m75945x2fec8307(r0)
            r6.m76125xe0a5bcad(r5)
            r2.add(r6)
            goto L93
        Lbe:
            r1.addAll(r2)
            r4.m59387xb849cf57(r1)
        Lc4:
            if (r4 == 0) goto Ld5
            java.lang.Class<c61.yb> r9 = c61.yb.class
            i95.m r9 = i95.n0.c(r9)
            c61.yb r9 = (c61.yb) r9
            java.lang.Object r0 = r8.f323454f
            c61.p2 r9 = (c61.p2) r9
            r9.Aj(r0, r4)
        Ld5:
            java.lang.String r9 = "onClick"
            java.lang.String r0 = "(Landroid/view/View;)V"
            java.lang.String r1 = "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/LikeRecommendBulletItem$getView$1$2$1"
            java.lang.String r2 = "android/view/View$OnClickListener"
            yj0.a.h(r8, r1, r2, r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dn2.i.onClick(android.view.View):void");
    }
}
