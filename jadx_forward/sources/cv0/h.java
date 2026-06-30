package cv0;

/* loaded from: classes5.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final cv0.l f304071a = new cv0.l();

    public static final cv0.m a(bu0.b bVar, com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJRectCorner corner) {
        java.lang.Object obj;
        cv0.m mVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(corner, "corner");
        cv0.l lVar = f304071a;
        lVar.getClass();
        java.util.List list = (java.util.List) ((java.util.LinkedHashMap) lVar.f304074a).get(bVar);
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((cv0.k) obj).f304072a == corner) {
                    break;
                }
            }
            cv0.k kVar = (cv0.k) obj;
            if (kVar != null && (mVar = kVar.f304073b) != null) {
                return mVar;
            }
        }
        return cv0.m.f304076e;
    }

    public static final com.p314xaae8f345.p457x3304c6.p477x633fb29.C4111x4a556090 b(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c4190xd8dd3713, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return (c4190xd8dd3713.y() && c4190xd8dd3713.x()) ? g(context) : new com.p314xaae8f345.p457x3304c6.p477x633fb29.C4111x4a556090(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public static final java.lang.String c(android.content.Context context, int i17) {
        java.lang.String string = j65.q.a(context).getString(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    public static final java.util.List d(java.lang.String str, com.p314xaae8f345.p457x3304c6.p477x633fb29.C4118xbb09bdf5 c4118xbb09bdf5, float f17) {
        com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJRectCorner mJRectCorner = com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJRectCorner.MJRectCornerTopMidpoint;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.C4110x6b6aafc6 c4110x6b6aafc6 = com.p314xaae8f345.p457x3304c6.p477x633fb29.C4110x6b6aafc6.f129784e;
        return kz5.b0.c(new com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4053x47710492(mJRectCorner, new com.p314xaae8f345.p457x3304c6.p479x4179489f.C4166x2d8d1b74(c4118xbb09bdf5, str, 0.8f, new com.p314xaae8f345.p457x3304c6.p477x633fb29.C4124x9ef5b367(c4110x6b6aafc6, c4110x6b6aafc6, 0.0f, c4110x6b6aafc6, new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e(0.0f, 0.0f), 0.0f, "publisher_text_9", f17), new com.p314xaae8f345.p457x3304c6.p477x633fb29.C4112xcdda485d(4.0f, new com.p314xaae8f345.p457x3304c6.p477x633fb29.C4110x6b6aafc6(1.0f, 1.0f, 1.0f, 0.8f), 0.0f, new com.p314xaae8f345.p457x3304c6.p477x633fb29.C4110x6b6aafc6(0.0f, 0.0f, 0.0f, 0.1f), new com.p314xaae8f345.p457x3304c6.p477x633fb29.C4111x4a556090(2.0f, 4.0f, 2.0f, 4.0f)))));
    }

    public static final com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4050x944e439f e(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return new com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4050x944e439f(new com.p314xaae8f345.p457x3304c6.p477x633fb29.C4110x6b6aafc6(1.0f, 1.0f, 1.0f, 0.8f), j65.q.a(context).getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.afy), new com.p314xaae8f345.p457x3304c6.p477x633fb29.C4110x6b6aafc6(0.0f, 0.0f, 0.0f, 0.1f), 0.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c4, code lost:
    
        if (r1 != null) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List f(android.content.Context r12, bu0.b r13, cv0.e r14, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e r15) {
        /*
            java.lang.String r0 = "context"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r12, r0)
            java.lang.String r0 = "materialType"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r13, r0)
            java.lang.String r0 = "showOption"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r14, r0)
            java.lang.String r0 = "scale"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r15, r0)
            cv0.e r0 = cv0.e.f304063c
            cv0.e r0 = cv0.e.f304064d
            boolean r0 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r14, r0)
            if (r0 == 0) goto L4c
            rz5.a r14 = cv0.g.f304070a
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kz5.d0.q(r14, r1)
            r0.<init>(r1)
            kz5.h r14 = (kz5.h) r14
            java.util.Iterator r14 = r14.iterator()
        L31:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L45
            java.lang.Object r1 = r14.next()
            com.tencent.maas.handlebox.model.MJHandleBoxItem$MJRectCorner r1 = (com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJRectCorner) r1
            cv0.m r1 = a(r13, r1)
            r0.add(r1)
            goto L31
        L45:
            cv0.e r14 = new cv0.e
            java.lang.String r1 = "none"
            r14.<init>(r0, r1)
        L4c:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r14 = r14.f304065a
            java.util.Iterator r14 = r14.iterator()
        L57:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto Le7
            java.lang.Object r1 = r14.next()
            cv0.m r1 = (cv0.m) r1
            java.lang.String r2 = "<this>"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1, r2)
            r2 = 0
            int r3 = r1.f304082d
            if (r3 > 0) goto L6f
            goto Le0
        L6f:
            android.content.res.Resources r4 = j65.q.a(r12)
            java.lang.ThreadLocal r5 = d3.q.f307641a
            android.graphics.drawable.Drawable r6 = d3.l.a(r4, r3, r2)
            if (r6 == 0) goto Le0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 7
            r11 = 0
            android.graphics.Bitmap r3 = f3.d.a(r6, r7, r8, r9, r10, r11)
            if (r3 == 0) goto Le0
            android.content.res.Resources r4 = j65.q.a(r12)
            r5 = 2131167294(0x7f07083e, float:1.7948858E38)
            float r4 = r4.getDimension(r5)
            cv0.l r5 = cv0.h.f304071a
            r5.getClass()
            java.util.Map r5 = r5.f304074a
            java.util.LinkedHashMap r5 = (java.util.LinkedHashMap) r5
            java.lang.Object r5 = r5.get(r13)
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto Lc6
            java.util.Iterator r5 = r5.iterator()
        La6:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto Lbd
            java.lang.Object r6 = r5.next()
            r7 = r6
            cv0.k r7 = (cv0.k) r7
            cv0.m r7 = r7.f304073b
            if (r7 != r1) goto Lb9
            r7 = 1
            goto Lba
        Lb9:
            r7 = 0
        Lba:
            if (r7 == 0) goto La6
            goto Lbe
        Lbd:
            r6 = r2
        Lbe:
            cv0.k r6 = (cv0.k) r6
            if (r6 == 0) goto Lc6
            com.tencent.maas.handlebox.model.MJHandleBoxItem$MJRectCorner r1 = r6.f304072a
            if (r1 != 0) goto Lc8
        Lc6:
            com.tencent.maas.handlebox.model.MJHandleBoxItem$MJRectCorner r1 = com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJRectCorner.MJRectCornerInvalid
        Lc8:
            com.tencent.maas.handlebox.model.MJHandleBoxItem$MJRectCorner r5 = com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJRectCorner.MJRectCornerInvalid
            if (r1 != r5) goto Lcd
            goto Le0
        Lcd:
            com.tencent.maas.handlebox.model.MJHandleBoxItem r2 = new com.tencent.maas.handlebox.model.MJHandleBoxItem
            com.tencent.maas.base.Vec2 r5 = new com.tencent.maas.base.Vec2
            float r6 = r15.f129332x
            float r6 = r4 / r6
            float r7 = r15.f129333y
            float r4 = r4 / r7
            r5.<init>(r6, r4)
            com.tencent.maas.handlebox.model.MJHandleBoxItem$MJHandleBoxActionType r4 = com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJHandleBoxActionType.MJHandleBoxActionTypeNone
            r2.<init>(r3, r5, r1, r4)
        Le0:
            if (r2 == 0) goto L57
            r0.add(r2)
            goto L57
        Le7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cv0.h.f(android.content.Context, bu0.b, cv0.e, com.tencent.maas.base.Vec2):java.util.List");
    }

    public static final com.p314xaae8f345.p457x3304c6.p477x633fb29.C4111x4a556090 g(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        float dimension = j65.q.a(context).getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.afz);
        float f17 = -j65.q.a(context).getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.afx);
        float f18 = -dimension;
        return new com.p314xaae8f345.p457x3304c6.p477x633fb29.C4111x4a556090(f17, f18, f17, f18);
    }
}
