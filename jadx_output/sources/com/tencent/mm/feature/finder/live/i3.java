package com.tencent.mm.feature.finder.live;

/* loaded from: classes.dex */
public final class i3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f66759d;

    /* renamed from: e, reason: collision with root package name */
    public int f66760e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f66761f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.finder.live.v4 f66762g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f66763h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f66764i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f66765m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f66766n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f66767o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(com.tencent.mm.feature.finder.live.v4 v4Var, int i17, android.content.Context context, long j17, java.lang.String str, android.widget.ImageView imageView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f66762g = v4Var;
        this.f66763h = i17;
        this.f66764i = context;
        this.f66765m = j17;
        this.f66766n = str;
        this.f66767o = imageView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.feature.finder.live.i3 i3Var = new com.tencent.mm.feature.finder.live.i3(this.f66762g, this.f66763h, this.f66764i, this.f66765m, this.f66766n, this.f66767o, continuation);
        i3Var.f66761f = obj;
        return i3Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.feature.finder.live.i3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.y0 y0Var;
        java.util.Set set;
        kotlinx.coroutines.y0 y0Var2;
        java.util.Set set2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f66760e;
        jz5.f0 f0Var = jz5.f0.f302826a;
        int i18 = this.f66763h;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var3 = (kotlinx.coroutines.y0) this.f66761f;
            com.tencent.mm.feature.finder.live.v4 v4Var = this.f66762g;
            java.util.Set set3 = (java.util.Set) ((java.util.LinkedHashMap) v4Var.H).get(new java.lang.Integer(i18));
            if (set3 == null) {
                set3 = new java.util.LinkedHashSet();
                v4Var.H.put(new java.lang.Integer(i18), set3);
            }
            java.util.Set set4 = set3;
            set4.add(y0Var3);
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", "#executeCirculationFillingActivityIcon source=" + i18 + " add done. setCount=" + set4.size());
            try {
                android.content.Context context = this.f66764i;
                long j17 = this.f66765m;
                java.lang.String str = this.f66766n;
                android.widget.ImageView imageView = this.f66767o;
                this.f66761f = y0Var3;
                this.f66759d = set4;
                this.f66760e = 1;
                try {
                    v4Var.getClass();
                    kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                    y0Var = y0Var3;
                    try {
                        set = set4;
                        try {
                            java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.internal.b0.f310484a, new com.tencent.mm.feature.finder.live.l2(j17, v4Var, context, str, imageView, null), this);
                            if (g17 != aVar) {
                                g17 = f0Var;
                            }
                            if (g17 == aVar) {
                                return aVar;
                            }
                            y0Var2 = y0Var;
                            set2 = set;
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            y0Var2 = y0Var;
                            set2 = set;
                            set2.remove(y0Var2);
                            com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", "#executeCirculationFillingActivityIcon source=" + i18 + " remove done. setCount=" + set2.size());
                            throw th;
                        }
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                        set = set4;
                        y0Var2 = y0Var;
                        set2 = set;
                        set2.remove(y0Var2);
                        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", "#executeCirculationFillingActivityIcon source=" + i18 + " remove done. setCount=" + set2.size());
                        throw th;
                    }
                } catch (java.lang.Throwable th8) {
                    th = th8;
                    y0Var = y0Var3;
                }
            } catch (java.lang.Throwable th9) {
                th = th9;
                y0Var = y0Var3;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            set2 = (java.util.Set) this.f66759d;
            y0Var2 = (kotlinx.coroutines.y0) this.f66761f;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
            } catch (java.lang.Throwable th10) {
                th = th10;
                set2.remove(y0Var2);
                com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", "#executeCirculationFillingActivityIcon source=" + i18 + " remove done. setCount=" + set2.size());
                throw th;
            }
        }
        set2.remove(y0Var2);
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", "#executeCirculationFillingActivityIcon source=" + i18 + " remove done. setCount=" + set2.size());
        return f0Var;
    }
}
