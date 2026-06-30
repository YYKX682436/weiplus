package az0;

/* loaded from: classes5.dex */
public final class p5 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15805d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f15806e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15807f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f15808g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(java.lang.String str, az0.n7 n7Var, java.lang.String str2, yz5.p pVar) {
        super(2);
        this.f15805d = str;
        this.f15806e = n7Var;
        this.f15807f = str2;
        this.f15808g = pVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x003e, code lost:
    
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
            com.tencent.maas.instamovie.MJMovieSession$OnComplete r9 = (com.tencent.maas.instamovie.MJMovieSession.OnComplete) r9
            java.lang.String r8 = "onProgress"
            kotlin.jvm.internal.o.g(r5, r8)
            java.lang.String r8 = "onComplete"
            kotlin.jvm.internal.o.g(r9, r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "buildTemplate start "
            r8.<init>(r0)
            java.lang.String r0 = r7.f15805d
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            java.lang.String r1 = "MicroMsg.MaasMovieSessionManager"
            com.tencent.mars.xlog.Log.i(r1, r8)
            az0.o5 r6 = new az0.o5
            yz5.p r8 = r7.f15808g
            r6.<init>(r8, r9)
            az0.n7 r8 = r7.f15806e
            dz0.h r9 = r8.f15743b
            boolean r1 = r9.f244862h
            if (r1 == 0) goto L45
            com.tencent.maas.instamovie.MJMovieOptions r1 = r8.f15744c
            java.util.List r9 = r9.f244863i
            if (r9 == 0) goto L41
            boolean r9 = r9.contains(r0)
            r0 = 1
            if (r9 != r0) goto L41
            goto L42
        L41:
            r0 = 0
        L42:
            r1.setShouldAutoRecommendBGM(r0)
        L45:
            com.tencent.maas.instamovie.MJMovieSession r0 = r8.f15742a
            java.lang.String r1 = r7.f15805d
            java.lang.String r2 = r7.f15807f
            com.tencent.maas.instamovie.MJMovieOptions r3 = r8.f15744c
            com.tencent.maas.instamovie.MJMovieOutroInfo r4 = az0.n7.a(r8)
            com.tencent.maas.instamovie.MJAsyncTaskInfo r8 = r0.buildTemplateWithTemplate(r1, r2, r3, r4, r5, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.p5.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
