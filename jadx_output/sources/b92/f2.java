package b92;

/* loaded from: classes.dex */
public final class f2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b92.m2 f18425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.he2 f18426e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f18427f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(b92.m2 m2Var, r45.he2 he2Var, java.lang.String str) {
        super(0);
        this.f18425d = m2Var;
        this.f18426e = he2Var;
        this.f18427f = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r1.a() == true) goto L8;
     */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r10 = this;
            b92.m2 r0 = r10.f18425d
            java.util.ArrayList r1 = r0.f18483f
            r45.he2 r2 = r10.f18426e
            r1.add(r2)
            kotlinx.coroutines.r2 r1 = r0.f18486i
            if (r1 == 0) goto L15
            boolean r1 = r1.a()
            r2 = 1
            if (r1 != r2) goto L15
            goto L16
        L15:
            r2 = 0
        L16:
            java.lang.String r1 = r10.f18427f
            java.lang.String r3 = "FinderLiveQosReportService"
            if (r2 == 0) goto L2e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "checkReportLoop: loop is running, source="
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r3, r0)
            goto L5f
        L2e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "checkReportLoop: start loop, source="
            r2.<init>(r4)
            r2.append(r1)
            java.lang.String r1 = ", size="
            r2.append(r1)
            java.util.ArrayList r1 = r0.f18483f
            int r1 = r1.size()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.mars.xlog.Log.i(r3, r1)
            kotlinx.coroutines.y0 r4 = r0.f18487m
            r5 = 0
            r6 = 0
            b92.j2 r7 = new b92.j2
            r1 = 0
            r7.<init>(r0, r1)
            r8 = 3
            r9 = 0
            kotlinx.coroutines.r2 r1 = kotlinx.coroutines.l.d(r4, r5, r6, r7, r8, r9)
            r0.f18486i = r1
        L5f:
            jz5.f0 r0 = jz5.f0.f302826a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b92.f2.invoke():java.lang.Object");
    }
}
