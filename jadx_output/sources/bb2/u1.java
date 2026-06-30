package bb2;

/* loaded from: classes10.dex */
public final class u1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f19012d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bb2.w1 f19013e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f19014f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19015g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f19016h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(long j17, bb2.w1 w1Var, boolean z17, int i17, java.lang.String str) {
        super(1);
        this.f19012d = j17;
        this.f19013e = w1Var;
        this.f19014f = z17;
        this.f19015g = i17;
        this.f19016h = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0062, code lost:
    
        if ((r11 == null || r11.length() == 0) == false) goto L23;
     */
    @Override // yz5.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r11) {
        /*
            r10 = this;
            com.tencent.mm.modelbase.f r11 = (com.tencent.mm.modelbase.f) r11
            bb2.w1 r0 = r10.f19013e
            so2.u1 r1 = r0.e()
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.getFeedObject()
            long r1 = r1.getId()
            long r3 = r10.f19012d
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 == 0) goto L18
            goto La2
        L18:
            if (r11 == 0) goto L9a
            bb2.w1 r4 = r10.f19013e
            boolean r3 = r10.f19014f
            int r5 = r10.f19015g
            java.lang.String r6 = r10.f19016h
            int r1 = r11.f70616b
            int r2 = r11.f70615a
            java.lang.String r11 = r11.f70617c
            r7 = -8000(0xffffffffffffe0c0, float:NaN)
            if (r1 != r7) goto L4d
            android.view.View r11 = r4.f19036a
            android.content.Context r11 = r11.getContext()
            java.lang.String r1 = "getContext(...)"
            kotlin.jvm.internal.o.f(r11, r1)
            android.view.View r1 = r4.f19036a
            android.content.Context r1 = r1.getContext()
            r2 = 2131771525(0x7f104085, float:1.9174384E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r2 = "getString(...)"
            kotlin.jvm.internal.o.f(r1, r2)
            hc2.f1.B(r11, r1)
            goto L9a
        L4d:
            r7 = 4
            r8 = 0
            if (r2 != r7) goto L65
            r7 = -4019(0xfffffffffffff04d, float:NaN)
            if (r1 != r7) goto L65
            r7 = 1
            if (r11 == 0) goto L61
            int r9 = r11.length()
            if (r9 != 0) goto L5f
            goto L61
        L5f:
            r9 = r8
            goto L62
        L61:
            r9 = r7
        L62:
            if (r9 != 0) goto L65
            goto L66
        L65:
            r7 = r8
        L66:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "NetSceneFinderBulletPost: errType="
            r8.<init>(r9)
            r8.append(r2)
            java.lang.String r2 = ", errCode="
            r8.append(r2)
            r8.append(r1)
            java.lang.String r1 = ", errMsg="
            r8.append(r1)
            r8.append(r11)
            r11 = 32
            r8.append(r11)
            r8.append(r7)
            java.lang.String r11 = r8.toString()
            java.lang.String r1 = "FinderBulletManager"
            com.tencent.mars.xlog.Log.e(r1, r11)
            bb2.s1 r11 = new bb2.s1
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            pm0.v.X(r11)
        L9a:
            bb2.t1 r11 = new bb2.t1
            r11.<init>(r0)
            pm0.v.X(r11)
        La2:
            jz5.f0 r11 = jz5.f0.f302826a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: bb2.u1.invoke(java.lang.Object):java.lang.Object");
    }
}
