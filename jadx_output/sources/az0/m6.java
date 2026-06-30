package az0;

/* loaded from: classes5.dex */
public final class m6 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15708d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f15709e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(java.lang.String str, az0.n7 n7Var) {
        super(2);
        this.f15708d = str;
        this.f15709e = n7Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
    
        if (r8 == true) goto L14;
     */
    @Override // yz5.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            r4 = r7
            com.tencent.maas.instamovie.MJMovieSession$OnTaskProgress r4 = (com.tencent.maas.instamovie.MJMovieSession.OnTaskProgress) r4
            r5 = r8
            com.tencent.maas.instamovie.MJMovieSession$OnComplete r5 = (com.tencent.maas.instamovie.MJMovieSession.OnComplete) r5
            java.lang.String r7 = "onProgress"
            kotlin.jvm.internal.o.g(r4, r7)
            java.lang.String r7 = "onComplete"
            kotlin.jvm.internal.o.g(r5, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "recreateWithMusicID "
            r7.<init>(r8)
            java.lang.String r8 = r6.f15708d
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "MicroMsg.MaasMovieSessionManager"
            com.tencent.mars.xlog.Log.i(r8, r7)
            az0.n7 r7 = r6.f15709e
            dz0.h r8 = r7.f15743b
            boolean r8 = r8.f244862h
            if (r8 == 0) goto L4f
            com.tencent.maas.instamovie.MJMovieSession r8 = r7.f15742a
            com.tencent.maas.model.MJTemplateInfo r8 = r8.getCurrentTemplateInfo()
            if (r8 == 0) goto L4f
            java.lang.String r8 = r8.getTemplateID()
            if (r8 == 0) goto L4f
            com.tencent.maas.instamovie.MJMovieOptions r0 = r7.f15744c
            dz0.h r1 = r7.f15743b
            java.util.List r1 = r1.f244863i
            if (r1 == 0) goto L4b
            boolean r8 = r1.contains(r8)
            r1 = 1
            if (r8 != r1) goto L4b
            goto L4c
        L4b:
            r1 = 0
        L4c:
            r0.setShouldAutoRecommendBGM(r1)
        L4f:
            com.tencent.maas.instamovie.MJMovieSession r0 = r7.f15742a
            java.lang.String r1 = r6.f15708d
            com.tencent.maas.instamovie.MJMovieOptions r2 = r7.f15744c
            com.tencent.maas.instamovie.MJMovieOutroInfo r3 = az0.n7.a(r7)
            com.tencent.maas.instamovie.MJAsyncTaskInfo r7 = r0.recreateWithMusicID(r1, r2, r3, r4, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.m6.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
