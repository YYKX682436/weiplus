package aj0;

/* loaded from: classes11.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f5225a;

    /* renamed from: b, reason: collision with root package name */
    public final io.flutter.embedding.engine.FlutterEngine f5226b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f5227c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5228d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f5229e;

    /* renamed from: f, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.FlutterRenderer f5230f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Point f5231g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Bitmap f5232h;

    /* renamed from: i, reason: collision with root package name */
    public final kotlinx.coroutines.c0 f5233i;

    /* renamed from: j, reason: collision with root package name */
    public yz5.l f5234j;

    public e(android.content.Context context, io.flutter.embedding.engine.FlutterEngine engine, java.lang.String engineId, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(engine, "engine");
        kotlin.jvm.internal.o.g(engineId, "engineId");
        this.f5225a = context;
        this.f5226b = engine;
        this.f5227c = engineId;
        this.f5228d = z17;
        this.f5229e = "FlutterImageSnapshotPreRenderController";
        io.flutter.embedding.engine.renderer.FlutterRenderer renderer = engine.getRenderer();
        kotlin.jvm.internal.o.f(renderer, "getRenderer(...)");
        this.f5230f = renderer;
        this.f5231g = pi0.r.f354717a.getDisplayRealSize(context);
        this.f5233i = kotlinx.coroutines.v2.a(null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof aj0.c
            if (r0 == 0) goto L13
            r0 = r5
            aj0.c r0 = (aj0.c) r0
            int r1 = r0.f5222g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5222g = r1
            goto L18
        L13:
            aj0.c r0 = new aj0.c
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f5220e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f5222g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f5219d
            aj0.e r0 = (aj0.e) r0
            kotlin.ResultKt.throwOnFailure(r5)
            goto L46
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.ResultKt.throwOnFailure(r5)
            kotlinx.coroutines.c0 r5 = r4.f5233i
            r0.f5219d = r4
            r0.f5222g = r3
            kotlinx.coroutines.c3 r5 = (kotlinx.coroutines.c3) r5
            java.lang.Object r5 = r5.C(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            r0 = r4
        L46:
            android.graphics.Bitmap r5 = r0.f5232h
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: aj0.e.a(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
