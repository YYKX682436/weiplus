package z10;

/* loaded from: classes9.dex */
public final class a extends y10.a {

    /* renamed from: c, reason: collision with root package name */
    public final y02.o f550795c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String name) {
        super(name);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        int i17 = y02.p.f540158d;
        this.f550795c = (y02.o) p3380x6a61f93.p3387xf51c6630.C30633x21b8a188.m170420x21b14333(180000L);
    }

    @Override // t10.c
    public void b(pq.a context, bw5.x7 jumpInfo, t10.d callback) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g b17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfo, "jumpInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        android.content.Context c17 = context.c();
        if (c17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ECS_O.NativeHandler.openArticle", "open article failed, context.context is null");
            callback.c("context.context is null");
            return;
        }
        try {
            bw5.v7 g17 = jumpInfo.g();
            jz5.f0 f0Var = null;
            if (g17 != null && (b17 = g17.b()) != null) {
                bw5.z5 mo11468x92b714fd = new bw5.z5().mo11468x92b714fd(b17.g());
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("open article: ");
                sb6.append(mo11468x92b714fd.f117362r[9] ? mo11468x92b714fd.f117359o : "");
                sb6.append(", url: ");
                sb6.append(mo11468x92b714fd.m13462xb5887639());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ECS_O.NativeHandler.openArticle", sb6.toString());
                z20.e eVar = z20.e.f551076e;
                z20.b bVar = new z20.b();
                bVar.f551070a = eVar;
                bw5.q9 q9Var = new bw5.q9();
                q9Var.f113532d = "ecso_open";
                q9Var.f113546u[1] = true;
                q9Var.c(java.lang.System.currentTimeMillis());
                q9Var.b(2);
                bVar.f551071b = q9Var;
                bVar.f(java.lang.String.valueOf(context.f439088e));
                bVar.c("open_article");
                bVar.e(kz5.b1.e(new jz5.l("url", mo11468x92b714fd.m13462xb5887639())));
                bVar.a();
                ((zv.a) ((zq1.b0) i95.n0.c(zq1.b0.class))).wi(mo11468x92b714fd, context.d(), c17);
                callback.d(null);
                f0Var = jz5.f0.f384359a;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ECS_O.NativeHandler.openArticle", "open article failed, nativeInfo.params is null");
                callback.c("nativeInfo.params is null");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("ECS_O.NativeHandler.openArticle", e17, "open article failed", new java.lang.Object[0]);
            callback.c("open article failed");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048 A[Catch: Exception -> 0x0074, TryCatch #0 {Exception -> 0x0074, blocks: (B:3:0x0012, B:5:0x0019, B:7:0x001f, B:9:0x0030, B:13:0x0048, B:16:0x004c, B:19:0x0069), top: B:2:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c A[Catch: Exception -> 0x0074, TryCatch #0 {Exception -> 0x0074, blocks: (B:3:0x0012, B:5:0x0019, B:7:0x001f, B:9:0x0030, B:13:0x0048, B:16:0x004c, B:19:0x0069), top: B:2:0x0012 }] */
    @Override // y10.a, t10.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(pq.a r6, bw5.x7 r7, bw5.l8 r8, t10.d r9) {
        /*
            r5 = this;
            java.lang.String r8 = "ECS_O.NativeHandler.openArticle"
            java.lang.String r0 = "context"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            java.lang.String r6 = "jumpInfo"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r6)
            java.lang.String r6 = "callback"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r9, r6)
            r6 = 0
            bw5.v7 r7 = r7.g()     // Catch: java.lang.Exception -> L74
            r0 = 0
            if (r7 == 0) goto L67
            com.tencent.mm.protobuf.g r7 = r7.b()     // Catch: java.lang.Exception -> L74
            if (r7 == 0) goto L67
            bw5.z5 r1 = new bw5.z5     // Catch: java.lang.Exception -> L74
            r1.<init>()     // Catch: java.lang.Exception -> L74
            byte[] r7 = r7.g()     // Catch: java.lang.Exception -> L74
            bw5.z5 r7 = r1.mo11468x92b714fd(r7)     // Catch: java.lang.Exception -> L74
            y02.o r1 = r5.f550795c     // Catch: java.lang.Exception -> L74
            if (r1 == 0) goto L45
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r7)     // Catch: java.lang.Exception -> L74
            java.lang.String r2 = s10.b.a(r7)     // Catch: java.lang.Exception -> L74
            y02.p r1 = (y02.p) r1     // Catch: java.lang.Exception -> L74
            long r3 = r1.m105978x2737f10()     // Catch: java.lang.Exception -> L74
            boolean r1 = p3380x6a61f93.p3387xf51c6630.C30633x21b8a188.m170421x21b896ec(r3, r2)     // Catch: java.lang.Exception -> L74
            r2 = 1
            if (r1 != r2) goto L45
            goto L46
        L45:
            r2 = r6
        L46:
            if (r2 != 0) goto L4c
            r9.d(r0)     // Catch: java.lang.Exception -> L74
            return
        L4c:
            java.lang.Class<zq1.a0> r1 = zq1.a0.class
            lm0.a r1 = gm0.j1.s(r1)     // Catch: java.lang.Exception -> L74
            zq1.a0 r1 = (zq1.a0) r1     // Catch: java.lang.Exception -> L74
            java.lang.String r2 = r7.m13462xb5887639()     // Catch: java.lang.Exception -> L74
            int r7 = r7.f117356i     // Catch: java.lang.Exception -> L74
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L74
            yq1.z r1 = (yq1.z) r1     // Catch: java.lang.Exception -> L74
            r4 = 2
            r1.d(r2, r7, r4, r3)     // Catch: java.lang.Exception -> L74
            r9.d(r0)     // Catch: java.lang.Exception -> L74
            jz5.f0 r0 = jz5.f0.f384359a     // Catch: java.lang.Exception -> L74
        L67:
            if (r0 != 0) goto L7f
            java.lang.String r7 = "preload article failed, nativeInfo.params is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r8, r7)     // Catch: java.lang.Exception -> L74
            java.lang.String r7 = "nativeInfo.params is null"
            r9.c(r7)     // Catch: java.lang.Exception -> L74
            goto L7f
        L74:
            r7 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r0 = "preload article failed"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r8, r7, r0, r6)
            r9.c(r0)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z10.a.c(pq.a, bw5.x7, bw5.l8, t10.d):void");
    }
}
