package a82;

/* loaded from: classes11.dex */
public final class p1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f2114d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f2115e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f2116f;

    /* renamed from: g, reason: collision with root package name */
    public int f2117g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2118h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f2119i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f2120m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2121n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ a82.u1 f2122o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2123p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2124q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2125r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o72.o4 f2126s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(java.lang.String str, long j17, int i17, java.lang.String str2, a82.u1 u1Var, java.lang.String str3, java.lang.String str4, java.lang.String str5, o72.o4 o4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f2118h = str;
        this.f2119i = j17;
        this.f2120m = i17;
        this.f2121n = str2;
        this.f2122o = u1Var;
        this.f2123p = str3;
        this.f2124q = str4;
        this.f2125r = str5;
        this.f2126s = o4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new a82.p1(this.f2118h, this.f2119i, this.f2120m, this.f2121n, this.f2122o, this.f2123p, this.f2124q, this.f2125r, this.f2126s, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((a82.p1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean z17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f2117g;
        if (i17 != 0) {
            if (i17 == 1) {
                kotlin.ResultKt.throwOnFailure(obj);
                return obj;
            }
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("download request: path=");
        java.lang.String str = this.f2118h;
        sb6.append(str);
        sb6.append(", size=");
        long j17 = this.f2119i;
        sb6.append(j17);
        sb6.append(", fieldType=");
        int i18 = this.f2120m;
        sb6.append(i18);
        sb6.append(", htmlId=");
        sb6.append(this.f2121n);
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavPublicCdnDownloadService", sb6.toString());
        a82.u1 u1Var = this.f2122o;
        if (a82.u1.Ai(u1Var, str, j17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavPublicCdnDownloadService", "file already exists and complete: " + str);
            return new o72.p4(1, "File already exists", str);
        }
        if (!u1Var.f2179f.containsKey(str)) {
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = u1Var.f2178e;
            if (!(concurrentLinkedQueue instanceof java.util.Collection) || !concurrentLinkedQueue.isEmpty()) {
                java.util.Iterator it = concurrentLinkedQueue.iterator();
                while (it.hasNext()) {
                    if (kotlin.jvm.internal.o.b(((a82.k1) it.next()).f2056f, str)) {
                        z17 = true;
                        break;
                    }
                }
            }
            z17 = false;
            if (!z17) {
                boolean z18 = i18 == 4;
                java.lang.String str2 = com.tencent.mm.vfs.w6.i(str, false) + ".fasttemp";
                long j18 = this.f2119i;
                java.lang.String str3 = this.f2123p;
                java.lang.String str4 = this.f2124q;
                java.lang.String str5 = this.f2125r;
                int i19 = this.f2120m;
                java.lang.String str6 = this.f2118h;
                java.lang.String str7 = this.f2121n;
                o72.o4 o4Var = this.f2126s;
                a82.k1 k1Var = new a82.k1(j18, str3, str4, str5, i19, str6, str2, z18, str7, 0, false, false, o4Var, new a82.o1(o4Var), 3584, null);
                this.f2114d = k1Var;
                this.f2115e = u1Var;
                this.f2116f = str;
                this.f2117g = 2;
                kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
                rVar.k();
                u1Var.f2180g.put(str, rVar);
                u1Var.f2178e.offer(k1Var);
                rVar.m(new a82.n1(str, u1Var));
                if (u1Var.f2182i.compareAndSet(false, true)) {
                    kotlinx.coroutines.l.d(u1Var.f2177d, kotlinx.coroutines.q1.f310570c, null, new a82.s1(u1Var, null), 2, null);
                }
                java.lang.Object j19 = rVar.j();
                pz5.a aVar2 = pz5.a.f359186d;
                return j19 == aVar ? aVar : j19;
            }
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.Fav.FavPublicCdnDownloadService", "task already exists: " + str);
        this.f2114d = u1Var;
        this.f2115e = str;
        this.f2117g = 1;
        kotlinx.coroutines.r rVar2 = new kotlinx.coroutines.r(pz5.f.b(this), 1);
        rVar2.k();
        u1Var.f2180g.put(str, rVar2);
        rVar2.m(new a82.m1(u1Var, str));
        java.lang.Object j27 = rVar2.j();
        pz5.a aVar3 = pz5.a.f359186d;
        return j27 == aVar ? aVar : j27;
    }
}
