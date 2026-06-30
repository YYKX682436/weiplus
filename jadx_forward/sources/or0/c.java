package or0;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static android.widget.TextView f428964c;

    /* renamed from: d, reason: collision with root package name */
    public static xr0.d f428965d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f428966e;

    /* renamed from: a, reason: collision with root package name */
    public static final or0.c f428962a = new or0.c();

    /* renamed from: b, reason: collision with root package name */
    public static long f428963b = java.lang.System.currentTimeMillis();

    /* renamed from: f, reason: collision with root package name */
    public static final or0.e f428967f = new or0.e();

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f428968g = "";

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.String f428969h = "";

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.String f428970i = "";

    /* renamed from: j, reason: collision with root package name */
    public static long f428971j = -1;

    /* renamed from: k, reason: collision with root package name */
    public static long f428972k = -1;

    /* renamed from: l, reason: collision with root package name */
    public static long f428973l = -1;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(yz5.l r7, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof or0.a
            if (r0 == 0) goto L13
            r0 = r8
            or0.a r0 = (or0.a) r0
            int r1 = r0.f428960h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f428960h = r1
            goto L18
        L13:
            or0.a r0 = new or0.a
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f428958f
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f428960h
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            long r1 = r0.f428957e
            java.lang.Object r7 = r0.f428956d
            or0.c r7 = (or0.c) r7
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L4a
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            long r4 = java.lang.System.currentTimeMillis()
            r0.f428956d = r6
            r0.f428957e = r4
            r0.f428960h = r3
            java.lang.Object r8 = r7.mo146xb9724478(r0)
            if (r8 != r1) goto L49
            return r1
        L49:
            r1 = r4
        L4a:
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r1
            or0.c.f428971j = r3
            long r0 = java.lang.System.currentTimeMillis()
            or0.c.f428972k = r0
            r0 = -1
            or0.c.f428973l = r0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: or0.c.a(yz5.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b() {
        xr0.k kVar;
        xr0.k kVar2;
        xr0.k kVar3;
        if (f428966e) {
            if (f428973l <= 0) {
                f428973l = java.lang.System.currentTimeMillis() - f428972k;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraAnalyse", "firstFrameTimeCostMs:" + f428973l);
            }
            or0.e eVar = f428967f;
            eVar.getClass();
            long currentTimeMillis = java.lang.System.currentTimeMillis() - eVar.f428978a;
            eVar.f428978a = java.lang.System.currentTimeMillis();
            if (currentTimeMillis > 0) {
                eVar.f428980c = 1000 / currentTimeMillis;
            }
            or0.d dVar = eVar.f428979b;
            dVar.f428975b++;
            if (java.lang.System.currentTimeMillis() - dVar.f428974a > 1000) {
                dVar.f428974a = java.lang.System.currentTimeMillis();
                dVar.f428977d = (dVar.f428975b * 1000) / 1000;
                dVar.f428974a = java.lang.System.currentTimeMillis();
                dVar.f428975b = 0L;
            }
            if (java.lang.System.currentTimeMillis() - f428963b > 100) {
                f428963b = java.lang.System.currentTimeMillis();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("实例:");
                sb6.append(f428970i);
                sb6.append("\n耗时:打开");
                sb6.append(f428971j);
                sb6.append("ms 首帧:");
                sb6.append(f428973l);
                sb6.append("ms\n预览方式:");
                sb6.append(f428968g);
                sb6.append("\n拍照方式:");
                sb6.append(f428969h);
                sb6.append("\n分辨率:");
                xr0.d dVar2 = f428965d;
                sb6.append((dVar2 == null || (kVar3 = dVar2.f537693b) == null) ? null : kVar3.f537709b);
                sb6.append("\n纹理裁剪:");
                xr0.d dVar3 = f428965d;
                sb6.append((dVar3 == null || (kVar2 = dVar3.f537693b) == null) ? null : kVar2.f537710c);
                sb6.append("\nView尺寸:");
                xr0.d dVar4 = f428965d;
                sb6.append((dVar4 == null || (kVar = dVar4.f537693b) == null) ? null : kVar.f537708a);
                sb6.append("\n顺时针旋转:");
                xr0.d dVar5 = f428965d;
                sb6.append(dVar5 != null ? java.lang.Integer.valueOf(dVar5.f537696e) : null);
                sb6.append("°\n设置帧率:");
                xr0.d dVar6 = f428965d;
                sb6.append(dVar6 != null ? java.lang.Integer.valueOf(dVar6.f537698g) : null);
                ((ku5.t0) ku5.t0.f394148d).B(new or0.b(sb6.toString()));
            }
        }
    }
}
