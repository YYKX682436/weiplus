package mb2;

/* loaded from: classes5.dex */
public final class c extends mb2.a {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f406871e;

    /* renamed from: f, reason: collision with root package name */
    public r45.xb1 f406872f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.Object obj, int i17, java.lang.String exptKey, yz5.a onConfigChanged) {
        super(obj, "SVR", onConfigChanged);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exptKey, "exptKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onConfigChanged, "onConfigChanged");
        this.f406871e = exptKey;
        a();
        ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).wi(new mb2.b(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    @Override // mb2.a, mb2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            r4 = this;
            r45.xb1 r0 = r4.f406872f
            if (r0 == 0) goto L43
            r1 = 30
            java.util.LinkedList r0 = r0.m75941xfb821914(r1)
            if (r0 == 0) goto L43
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            r2 = r1
            r45.yy0 r2 = (r45.yy0) r2
            r3 = 0
            java.lang.String r2 = r2.m75945x2fec8307(r3)
            java.lang.String r3 = r4.f406871e
            boolean r2 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r2, r3)
            if (r2 == 0) goto L10
            goto L2c
        L2b:
            r1 = 0
        L2c:
            r45.yy0 r1 = (r45.yy0) r1
            if (r1 == 0) goto L43
            r0 = 1
            com.tencent.mm.protobuf.g r0 = r1.m75934xbce7f2f(r0)
            if (r0 == 0) goto L43
            byte[] r0 = r0.f273689a
            if (r0 == 0) goto L43
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r2 = r26.c.f450398a
            r1.<init>(r0, r2)
            goto L45
        L43:
            java.lang.String r1 = ""
        L45:
            java.lang.Object r0 = r4.f406866a
            boolean r2 = r0 instanceof java.lang.Integer
            if (r2 == 0) goto L5a
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(r1, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            goto La2
        L5a:
            boolean r2 = r0 instanceof java.lang.Long
            if (r2 == 0) goto L6d
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            long r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(r1, r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            goto La2
        L6d:
            boolean r2 = r0 instanceof java.lang.Boolean
            if (r2 == 0) goto L80
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y(r1, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            goto La2
        L80:
            boolean r2 = r0 instanceof java.lang.String
            if (r2 == 0) goto L8e
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r1)
            if (r2 == 0) goto La2
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            goto La2
        L8e:
            boolean r2 = r0 instanceof java.lang.Float
            if (r2 == 0) goto La1
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            float r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L(r1, r0)
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            goto La2
        La1:
            r1 = r0
        La2:
            r4.f406869d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mb2.c.a():void");
    }

    @Override // mb2.a
    public java.lang.Object c() {
        java.lang.Object obj = this.f406869d;
        return obj == null ? this.f406866a : obj;
    }
}
