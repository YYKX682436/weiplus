package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes7.dex */
public final class l2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f94338d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f94339e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f94340f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f94341g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f94342h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ nu4.a f94343i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f94344m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f94345n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f94346o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f94347p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f94348q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f94349r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f94350s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f94351t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(long j17, java.lang.String str, kotlin.coroutines.Continuation continuation, java.lang.String str2, nu4.a aVar, boolean z17, boolean z18, int i17, int i18, int i19, java.lang.String str3, long j18, java.lang.String str4) {
        super(2, continuation);
        this.f94340f = j17;
        this.f94341g = str;
        this.f94342h = str2;
        this.f94343i = aVar;
        this.f94344m = z17;
        this.f94345n = z18;
        this.f94346o = i17;
        this.f94347p = i18;
        this.f94348q = i19;
        this.f94349r = str3;
        this.f94350s = j18;
        this.f94351t = str4;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.l2 l2Var = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.l2(this.f94340f, this.f94341g, continuation, this.f94342h, this.f94343i, this.f94344m, this.f94345n, this.f94346o, this.f94347p, this.f94348q, this.f94349r, this.f94350s, this.f94351t);
        l2Var.f94339e = obj;
        return l2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.brandservice.ui.timeline.preload.l2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.y0 y0Var;
        java.util.ArrayList<com.tencent.mm.plugin.brandservice.ui.timeline.preload.d2> arrayList;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f94338d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var2 = (kotlinx.coroutines.y0) this.f94339e;
            long j17 = this.f94340f;
            this.f94339e = y0Var2;
            this.f94338d = 1;
            if (kotlinx.coroutines.k1.b(j17, this) == aVar) {
                return aVar;
            }
            y0Var = y0Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y0Var = (kotlinx.coroutines.y0) this.f94339e;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (!kotlinx.coroutines.z0.h(y0Var)) {
            return jz5.f0.f302826a;
        }
        com.tencent.mm.sdk.platformtools.ca caVar = com.tencent.mm.sdk.platformtools.ca.f192506a;
        java.lang.String str = this.f94341g;
        synchronized (caVar) {
            java.util.HashMap hashMap = com.tencent.mm.sdk.platformtools.ca.f192508c;
            java.lang.Object obj2 = hashMap.get(str);
            java.util.Queue queue = obj2 instanceof java.util.Queue ? (java.util.Queue) obj2 : null;
            if (queue != null) {
                hashMap.remove(str);
                arrayList = new java.util.ArrayList(queue);
            } else {
                arrayList = null;
            }
        }
        if (arrayList != null) {
            for (com.tencent.mm.plugin.brandservice.ui.timeline.preload.d2 d2Var : arrayList) {
                java.lang.String str2 = d2Var.f94212b;
                java.lang.String i18 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.i(str2, false);
                nu4.b bVar = nu4.b0.P;
                com.tencent.mm.plugin.brandservice.ui.timeline.preload.t2 t2Var = com.tencent.mm.plugin.brandservice.ui.timeline.preload.t2.f94445a;
                com.tencent.mm.sdk.platformtools.v3 v3Var = com.tencent.mm.plugin.brandservice.ui.timeline.preload.t2.f94447c;
                java.lang.String str3 = this.f94342h;
                nu4.a aVar2 = this.f94343i;
                ts1.o oVar = new ts1.o(str2, i18, bVar, v3Var, null, str3, null, aVar2, this.f94344m, aVar2 != null ? nu4.d0.b(aVar2) : null, null, 1104, null);
                if (!oVar.w()) {
                    zw4.e eVar = zw4.e.f476912g;
                    zw4.f fVar = zw4.f.f476916f;
                    java.lang.String str4 = d2Var.f94211a;
                    int i19 = this.f94346o;
                    int i27 = this.f94347p;
                    int i28 = this.f94348q;
                    java.lang.String str5 = this.f94349r;
                    zw4.g.a(eVar, fVar, str4, i19, i27, i28, str5, str5);
                    com.tencent.mm.plugin.brandservice.ui.timeline.preload.t2.a(t2Var, d2Var.f94213c, d2Var.f94211a, oVar, 0, d2Var.f94215e, this.f94343i);
                    com.tencent.mm.plugin.brandservice.ui.timeline.preload.b3.f94192a.a(this.f94350s, this.f94351t, 13);
                } else if (!d2Var.f94214d) {
                    int max = java.lang.Math.max(oVar.n() - 60, 60);
                    oVar.o();
                    if (oVar.o() || ((oVar.f() > 0 && com.tencent.mm.sdk.platformtools.y3.a(oVar.f(), max)) || this.f94345n)) {
                        zw4.e eVar2 = zw4.e.f476911f;
                        zw4.f fVar2 = zw4.f.f476916f;
                        java.lang.String str6 = d2Var.f94211a;
                        int i29 = this.f94346o;
                        int i37 = this.f94347p;
                        int i38 = this.f94348q;
                        java.lang.String str7 = this.f94349r;
                        zw4.g.a(eVar2, fVar2, str6, i29, i37, i38, str7, str7);
                        com.tencent.mm.plugin.brandservice.ui.timeline.preload.t2.a(t2Var, d2Var.f94213c, d2Var.f94211a, oVar, 0, d2Var.f94215e, this.f94343i);
                        com.tencent.mm.plugin.brandservice.ui.timeline.preload.b3.f94192a.a(this.f94350s, this.f94351t, 13);
                    } else {
                        com.tencent.mm.plugin.brandservice.ui.timeline.preload.b3.f94192a.a(this.f94350s, this.f94351t, 12);
                        zw4.e eVar3 = zw4.e.f476910e;
                        zw4.f fVar3 = zw4.f.f476916f;
                        java.lang.String str8 = d2Var.f94211a;
                        int i39 = this.f94346o;
                        int i47 = this.f94347p;
                        int i48 = this.f94348q;
                        java.lang.String str9 = this.f94349r;
                        zw4.g.a(eVar3, fVar3, str8, i39, i47, i48, str9, str9);
                    }
                }
            }
        }
        com.tencent.mm.sdk.platformtools.ca.f192507b.remove(this.f94341g);
        return jz5.f0.f302826a;
    }
}
