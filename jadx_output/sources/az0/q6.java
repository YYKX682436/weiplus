package az0;

/* loaded from: classes5.dex */
public final class q6 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15837d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f15838e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15839f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(java.lang.String str, az0.n7 n7Var, java.lang.String str2) {
        super(2);
        this.f15837d = str;
        this.f15838e = n7Var;
        this.f15839f = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0038, code lost:
    
        if (r9 == true) goto L10;
     */
    @Override // yz5.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r8, java.lang.Object r9) {
        /*
            r7 = this;
            r5 = r8
            com.tencent.maas.instamovie.MJMovieSession$OnTaskProgress r5 = (com.tencent.maas.instamovie.MJMovieSession.OnTaskProgress) r5
            r6 = r9
            com.tencent.maas.instamovie.MJMovieSession$OnComplete r6 = (com.tencent.maas.instamovie.MJMovieSession.OnComplete) r6
            java.lang.String r8 = "onProgress"
            kotlin.jvm.internal.o.g(r5, r8)
            java.lang.String r8 = "onComplete"
            kotlin.jvm.internal.o.g(r6, r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "recreateWithTemplateID "
            r8.<init>(r9)
            java.lang.String r9 = r7.f15837d
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.String r0 = "MicroMsg.MaasMovieSessionManager"
            com.tencent.mars.xlog.Log.i(r0, r8)
            az0.n7 r8 = r7.f15838e
            dz0.h r0 = r8.f15743b
            boolean r1 = r0.f244862h
            if (r1 == 0) goto L3f
            com.tencent.maas.instamovie.MJMovieOptions r1 = r8.f15744c
            java.util.List r0 = r0.f244863i
            if (r0 == 0) goto L3b
            boolean r9 = r0.contains(r9)
            r0 = 1
            if (r9 != r0) goto L3b
            goto L3c
        L3b:
            r0 = 0
        L3c:
            r1.setShouldAutoRecommendBGM(r0)
        L3f:
            com.tencent.maas.instamovie.MJMovieSession r0 = r8.f15742a
            java.lang.String r1 = r7.f15837d
            java.lang.String r2 = r7.f15839f
            com.tencent.maas.instamovie.MJMovieOptions r3 = r8.f15744c
            com.tencent.maas.instamovie.MJMovieOutroInfo r4 = az0.n7.a(r8)
            com.tencent.maas.instamovie.MJAsyncTaskInfo r8 = r0.recreateWithTemplate(r1, r2, r3, r4, r5, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.q6.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
