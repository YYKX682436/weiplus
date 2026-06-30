package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class gn {

    /* renamed from: i, reason: collision with root package name */
    private static final java.lang.String f49615i = "stData";

    /* renamed from: a, reason: collision with root package name */
    public int f49616a;

    /* renamed from: b, reason: collision with root package name */
    final com.tencent.mapsdk.internal.gn.f f49617b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f49618c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f49619d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f49620e;

    /* renamed from: f, reason: collision with root package name */
    final java.io.File f49621f;

    /* renamed from: g, reason: collision with root package name */
    final java.io.File f49622g;

    /* renamed from: h, reason: collision with root package name */
    volatile boolean f49623h;

    /* renamed from: j, reason: collision with root package name */
    private final java.lang.String f49624j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f49625k;

    /* renamed from: l, reason: collision with root package name */
    private com.tencent.mapsdk.internal.gn.d f49626l;

    /* renamed from: com.tencent.mapsdk.internal.gn$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass1 implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.tencent.mapsdk.internal.gn.a f49627a;

        public AnonymousClass1(com.tencent.mapsdk.internal.gn.a aVar) {
            this.f49627a = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.tencent.mapsdk.internal.gn.c cVar = com.tencent.mapsdk.internal.gn.c.READ;
            com.tencent.mapsdk.internal.gn.e a17 = com.tencent.mapsdk.internal.gn.e.a(cVar);
            a17.f49647a = com.tencent.mapsdk.internal.gn.b.START;
            java.io.File file = com.tencent.mapsdk.internal.gn.this.f49621f;
            a17.f49651e = file;
            byte[] c17 = com.tencent.mapsdk.internal.ks.c(file);
            if (!com.tencent.mapsdk.internal.gn.this.f49621f.exists() || c17 == null || c17.length == 0) {
                com.tencent.mapsdk.internal.gn.e a18 = com.tencent.mapsdk.internal.gn.e.a(cVar);
                a18.f49647a = com.tencent.mapsdk.internal.gn.b.END;
                a18.f49651e = com.tencent.mapsdk.internal.gn.this.f49621f;
                a18.f49649c = false;
                com.tencent.mapsdk.internal.gn.a aVar = this.f49627a;
                if (aVar != null) {
                    aVar.a(null);
                    return;
                }
                return;
            }
            com.tencent.mapsdk.internal.gn.e a19 = com.tencent.mapsdk.internal.gn.e.a(cVar);
            a19.f49647a = com.tencent.mapsdk.internal.gn.b.PROCESSING;
            a19.f49651e = com.tencent.mapsdk.internal.gn.this.f49621f;
            com.tencent.mapsdk.internal.gn.f fVar = (com.tencent.mapsdk.internal.gn.f) com.tencent.map.tools.json.JsonUtils.parseToModel(new java.lang.String(c17), com.tencent.mapsdk.internal.gn.f.class, new java.lang.Object[0]);
            com.tencent.mapsdk.internal.gn.e a27 = com.tencent.mapsdk.internal.gn.e.a(cVar);
            a27.f49647a = com.tencent.mapsdk.internal.gn.b.END;
            a27.f49651e = com.tencent.mapsdk.internal.gn.this.f49621f;
            a27.f49649c = true;
            com.tencent.mapsdk.internal.gn.a aVar2 = this.f49627a;
            if (aVar2 != null) {
                aVar2.a(fVar);
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.gn$2, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass2 implements com.tencent.mapsdk.internal.gn.a<com.tencent.mapsdk.internal.gn.f> {
        public AnonymousClass2() {
        }

        @Override // com.tencent.mapsdk.internal.gn.a
        public final /* synthetic */ void a(com.tencent.mapsdk.internal.gn.f fVar) {
            com.tencent.mapsdk.internal.gn.f fVar2 = fVar;
            if (fVar2 == null || fVar2.a()) {
                return;
            }
            com.tencent.mapsdk.internal.gn.this.a(fVar2, new com.tencent.mapsdk.internal.gn.AnonymousClass2.AnonymousClass1());
        }

        /* renamed from: com.tencent.mapsdk.internal.gn$2$1, reason: invalid class name */
        /* loaded from: classes13.dex */
        public class AnonymousClass1 implements com.tencent.mapsdk.internal.gn.a<java.lang.Boolean> {
            public AnonymousClass1() {
            }

            @Override // com.tencent.mapsdk.internal.gn.a
            public final /* synthetic */ void a(java.lang.Boolean bool) {
                com.tencent.mapsdk.internal.gn.a(com.tencent.mapsdk.internal.gn.this, bool.booleanValue());
            }

            /* renamed from: a, reason: avoid collision after fix types in other method */
            private void a2(java.lang.Boolean bool) {
                com.tencent.mapsdk.internal.gn.a(com.tencent.mapsdk.internal.gn.this, bool.booleanValue());
            }
        }

        /* renamed from: a, reason: avoid collision after fix types in other method */
        private void a2(com.tencent.mapsdk.internal.gn.f fVar) {
            if (fVar == null || fVar.a()) {
                return;
            }
            com.tencent.mapsdk.internal.gn.this.a(fVar, new com.tencent.mapsdk.internal.gn.AnonymousClass2.AnonymousClass1());
        }
    }

    /* loaded from: classes6.dex */
    public interface a<T> {
        void a(T t17);
    }

    /* loaded from: classes6.dex */
    public enum b {
        START,
        PROCESSING,
        END,
        CANCEL
    }

    /* loaded from: classes6.dex */
    public enum c {
        CREATE,
        READ,
        UPLOAD,
        UPLOAD_END,
        WRITE,
        TRANSLATE_BYTE
    }

    /* loaded from: classes6.dex */
    public interface d {
        void a();
    }

    /* loaded from: classes13.dex */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        com.tencent.mapsdk.internal.gn.b f49647a;

        /* renamed from: b, reason: collision with root package name */
        com.tencent.mapsdk.internal.gn.e f49648b;

        /* renamed from: c, reason: collision with root package name */
        boolean f49649c;

        /* renamed from: d, reason: collision with root package name */
        byte[] f49650d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.Object f49651e;

        /* renamed from: f, reason: collision with root package name */
        private com.tencent.mapsdk.internal.gn.c f49652f;

        private com.tencent.mapsdk.internal.gn.e a() {
            return this;
        }

        private com.tencent.mapsdk.internal.gn.c b() {
            return this.f49652f;
        }

        private byte[] c() {
            return this.f49650d;
        }

        private boolean d() {
            return this.f49649c;
        }

        private java.lang.Object e() {
            return this.f49651e;
        }

        private com.tencent.mapsdk.internal.gn.b f() {
            return this.f49647a;
        }

        public final java.lang.String toString() {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("StatisticState{mState=");
            stringBuffer.append(this.f49652f);
            stringBuffer.append(", mStage=");
            stringBuffer.append(this.f49647a);
            stringBuffer.append(", mParentState=");
            stringBuffer.append(this.f49648b);
            stringBuffer.append(", mResult=");
            stringBuffer.append(this.f49649c);
            stringBuffer.append(", mData=");
            if (this.f49650d == null) {
                stringBuffer.append("null");
            } else {
                stringBuffer.append('[');
                int i17 = 0;
                while (i17 < this.f49650d.length) {
                    stringBuffer.append(i17 == 0 ? "" : ", ");
                    stringBuffer.append((int) this.f49650d[i17]);
                    i17++;
                }
                stringBuffer.append(']');
            }
            stringBuffer.append(", mTag=");
            stringBuffer.append(this.f49651e);
            stringBuffer.append('}');
            return stringBuffer.toString();
        }

        public static com.tencent.mapsdk.internal.gn.e a(com.tencent.mapsdk.internal.gn.c cVar) {
            com.tencent.mapsdk.internal.gn.e eVar = new com.tencent.mapsdk.internal.gn.e();
            eVar.f49652f = cVar;
            return eVar;
        }

        private boolean b(com.tencent.mapsdk.internal.gn.c cVar) {
            return cVar == this.f49652f;
        }

        private boolean c(com.tencent.mapsdk.internal.gn.c cVar) {
            com.tencent.mapsdk.internal.gn.e eVar = this.f49648b;
            return eVar != null && cVar == eVar.f49652f;
        }

        private boolean b(com.tencent.mapsdk.internal.gn.c cVar, com.tencent.mapsdk.internal.gn.b bVar) {
            com.tencent.mapsdk.internal.gn.e eVar = this.f49648b;
            return eVar != null && bVar == eVar.f49647a && cVar == eVar.f49652f;
        }

        private com.tencent.mapsdk.internal.gn.e a(com.tencent.mapsdk.internal.gn.e eVar) {
            this.f49648b = eVar;
            return this;
        }

        private com.tencent.mapsdk.internal.gn.e a(com.tencent.mapsdk.internal.gn.b bVar) {
            this.f49647a = bVar;
            return this;
        }

        private com.tencent.mapsdk.internal.gn.e a(byte[] bArr) {
            this.f49650d = bArr;
            return this;
        }

        private com.tencent.mapsdk.internal.gn.e a(boolean z17) {
            this.f49649c = z17;
            return this;
        }

        private com.tencent.mapsdk.internal.gn.e a(java.lang.Object obj) {
            this.f49651e = obj;
            return this;
        }

        private boolean a(com.tencent.mapsdk.internal.gn.c cVar, com.tencent.mapsdk.internal.gn.b bVar) {
            return bVar == this.f49647a && cVar == this.f49652f;
        }
    }

    /* loaded from: classes13.dex */
    public static class f extends com.tencent.map.tools.json.JsonComposer {

        /* renamed from: a, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = com.tencent.mapsdk.internal.gn.f49615i)
        java.util.List<com.tencent.mapsdk.internal.hg> f49653a = new java.util.ArrayList();

        /* renamed from: b, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "clsData")
        java.util.List<com.tencent.mapsdk.internal.gl.b> f49654b = new java.util.ArrayList();

        private void d() {
            this.f49653a.clear();
            this.f49654b.clear();
        }

        public final boolean a() {
            return this.f49653a.isEmpty() && this.f49654b.isEmpty();
        }

        public final void a(com.tencent.mapsdk.internal.gn.f fVar) {
            if (fVar == null) {
                return;
            }
            this.f49653a.addAll(fVar.f49653a);
            this.f49654b.addAll(fVar.f49654b);
        }

        public final byte[] b() {
            java.util.List<com.tencent.mapsdk.internal.hg> list = this.f49653a;
            if (list == null || list.isEmpty()) {
                return new byte[0];
            }
            java.lang.String collectionToJson = com.tencent.map.tools.json.JsonUtils.collectionToJson(new java.util.ArrayList(this.f49653a));
            try {
                com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50209j, "Post statistic data: ".concat(java.lang.String.valueOf(collectionToJson)));
                return collectionToJson.getBytes(com.tencent.mapsdk.internal.rv.f51270c);
            } catch (java.io.UnsupportedEncodingException unused) {
                return new byte[0];
            }
        }

        public final byte[] c() {
            java.util.List<com.tencent.mapsdk.internal.gl.b> list = this.f49654b;
            if (list == null || list.isEmpty()) {
                return new byte[0];
            }
            com.tencent.mapsdk.internal.gl glVar = new com.tencent.mapsdk.internal.gl();
            glVar.a(this.f49654b);
            java.lang.String modelToJsonString = com.tencent.map.tools.json.JsonUtils.modelToJsonString(glVar);
            com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50209j, "Post cls data: ".concat(java.lang.String.valueOf(modelToJsonString)));
            try {
                return modelToJsonString.getBytes(com.tencent.mapsdk.internal.rv.f51270c);
            } catch (java.io.UnsupportedEncodingException unused) {
                return new byte[0];
            }
        }
    }

    public gn(com.tencent.mapsdk.internal.bn bnVar) {
        this(bnVar, (byte) 0);
    }

    private gn(com.tencent.mapsdk.internal.bn bnVar, byte b17) {
        this.f49625k = true;
        java.lang.String str = bnVar.F().f49009a;
        this.f49618c = str;
        this.f49619d = "";
        this.f49620e = "";
        this.f49617b = new com.tencent.mapsdk.internal.gn.f();
        com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions = bnVar.f48998a;
        if (tencentMapOptions != null) {
            this.f49619d = tencentMapOptions.getSubKey();
            this.f49620e = bnVar.f48998a.getSubId();
        }
        java.lang.String str2 = bnVar.getContext().getFilesDir().getAbsolutePath() + java.io.File.separator + "stData_" + com.tencent.map.tools.Util.getMD5String(str);
        this.f49624j = str2;
        com.tencent.mapsdk.internal.ks.a(str2);
        this.f49621f = new java.io.File(str2);
        this.f49622g = new java.io.File(str2 + ".temp");
    }

    private void c() {
        if (this.f49616a == 0) {
            a(new com.tencent.mapsdk.internal.gn.AnonymousClass1(new com.tencent.mapsdk.internal.gn.AnonymousClass2()));
        }
        this.f49616a++;
    }

    private static com.tencent.mapsdk.internal.hg d() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mapsdk.internal.gn.e.a(com.tencent.mapsdk.internal.gn.c.CREATE).f49651e = java.lang.Long.valueOf(currentTimeMillis);
        return new com.tencent.mapsdk.internal.hg(currentTimeMillis);
    }

    private com.tencent.mapsdk.internal.gm e() {
        java.lang.String str = this.f49618c;
        java.lang.String str2 = this.f49619d;
        java.lang.String m17 = com.tencent.mapsdk.internal.hn.m();
        java.lang.String str3 = this.f49620e;
        java.lang.String h17 = com.tencent.mapsdk.internal.hn.h();
        java.lang.String d17 = com.tencent.mapsdk.internal.hn.d();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.tencent.mapsdk.internal.hn.j());
        return new com.tencent.mapsdk.internal.gm(new com.tencent.mapsdk.internal.gl.b(str, str2, m17, str3, h17, d17, sb6.toString(), com.tencent.mapsdk.internal.hn.k(), com.tencent.mapsdk.internal.hn.n(), com.tencent.mapsdk.internal.hn.c(), com.tencent.mapsdk.internal.hn.g()));
    }

    private java.lang.String a() {
        return this.f49624j;
    }

    private void b() {
        a(new com.tencent.mapsdk.internal.gn.AnonymousClass1(new com.tencent.mapsdk.internal.gn.AnonymousClass2()));
    }

    private void a(com.tencent.mapsdk.internal.gn.d dVar) {
        this.f49626l = dVar;
    }

    public final void a(java.lang.Runnable runnable) {
        if (this.f49623h) {
            return;
        }
        if (this.f49625k) {
            new java.lang.Thread(runnable).start();
        } else {
            runnable.run();
        }
    }

    private void a(com.tencent.mapsdk.internal.gn.a<com.tencent.mapsdk.internal.gn.f> aVar) {
        a(new com.tencent.mapsdk.internal.gn.AnonymousClass1(aVar));
    }

    private static com.tencent.mapsdk.internal.gn.f a(java.io.File file) {
        com.tencent.mapsdk.internal.gn.f fVar;
        com.tencent.mapsdk.internal.gn.f fVar2 = new com.tencent.mapsdk.internal.gn.f();
        byte[] c17 = com.tencent.mapsdk.internal.ks.c(file);
        if (c17 != null && c17.length > 0 && (fVar = (com.tencent.mapsdk.internal.gn.f) com.tencent.map.tools.json.JsonUtils.parseToModel(new java.lang.String(c17), com.tencent.mapsdk.internal.gn.f.class, new java.lang.Object[0])) != null) {
            fVar2.a(fVar);
        }
        return fVar2;
    }

    private static byte[] a(com.tencent.mapsdk.internal.gn.f fVar, com.tencent.mapsdk.internal.gn.e eVar) {
        com.tencent.mapsdk.internal.gn.c cVar = com.tencent.mapsdk.internal.gn.c.TRANSLATE_BYTE;
        com.tencent.mapsdk.internal.gn.e a17 = com.tencent.mapsdk.internal.gn.e.a(cVar);
        a17.f49647a = com.tencent.mapsdk.internal.gn.b.START;
        a17.f49648b = eVar;
        byte[] bArr = null;
        if (fVar.a()) {
            com.tencent.mapsdk.internal.gn.e a18 = com.tencent.mapsdk.internal.gn.e.a(cVar);
            a18.f49647a = com.tencent.mapsdk.internal.gn.b.END;
            a18.f49648b = eVar;
            a18.f49649c = false;
            return null;
        }
        com.tencent.mapsdk.internal.gn.e a19 = com.tencent.mapsdk.internal.gn.e.a(cVar);
        a19.f49647a = com.tencent.mapsdk.internal.gn.b.PROCESSING;
        a19.f49651e = fVar;
        a19.f49648b = eVar;
        java.lang.String modelToJsonString = com.tencent.map.tools.json.JsonUtils.modelToJsonString(fVar);
        if (!android.text.TextUtils.isEmpty(modelToJsonString)) {
            try {
                bArr = modelToJsonString.getBytes(com.tencent.mapsdk.internal.rv.f51270c);
            } catch (java.io.UnsupportedEncodingException unused) {
                bArr = modelToJsonString.getBytes();
            }
        }
        com.tencent.mapsdk.internal.gn.e a27 = com.tencent.mapsdk.internal.gn.e.a(com.tencent.mapsdk.internal.gn.c.TRANSLATE_BYTE);
        a27.f49647a = com.tencent.mapsdk.internal.gn.b.END;
        a27.f49650d = bArr;
        a27.f49651e = modelToJsonString;
        a27.f49648b = eVar;
        a27.f49649c = bArr != null;
        return bArr;
    }

    public final void a(final com.tencent.mapsdk.internal.gn.f fVar, final com.tencent.mapsdk.internal.gn.a<java.lang.Boolean> aVar) {
        a(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.gn.3
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.map.tools.net.NetResponse reportBehavior;
                com.tencent.mapsdk.internal.gn.c cVar = com.tencent.mapsdk.internal.gn.c.UPLOAD;
                com.tencent.mapsdk.internal.gn.e a17 = com.tencent.mapsdk.internal.gn.e.a(cVar);
                com.tencent.mapsdk.internal.gn.f fVar2 = fVar;
                a17.f49651e = fVar2;
                a17.f49647a = com.tencent.mapsdk.internal.gn.b.START;
                if (fVar2 == null || fVar2.a()) {
                    com.tencent.mapsdk.internal.gn.a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.a(java.lang.Boolean.FALSE);
                    }
                    com.tencent.mapsdk.internal.gn.e a18 = com.tencent.mapsdk.internal.gn.e.a(cVar);
                    a18.f49649c = false;
                    a18.f49647a = com.tencent.mapsdk.internal.gn.b.END;
                    return;
                }
                boolean z17 = true;
                com.tencent.mapsdk.internal.gn.this.f49623h = true;
                try {
                    com.tencent.mapsdk.internal.gn.e.a(cVar).f49647a = com.tencent.mapsdk.internal.gn.b.PROCESSING;
                    byte[] b17 = fVar.b();
                    if (b17 != null && b17.length > 0) {
                        com.tencent.mapsdk.internal.di diVar = (com.tencent.mapsdk.internal.di) ((com.tencent.mapsdk.internal.dx) com.tencent.mapsdk.internal.cp.a(com.tencent.mapsdk.internal.dx.class)).i();
                        com.tencent.mapsdk.internal.gn gnVar = com.tencent.mapsdk.internal.gn.this;
                        com.tencent.map.tools.net.NetResponse report = diVar.report(gnVar.f49618c, gnVar.f49619d, com.tencent.mapsdk.internal.hn.m(), com.tencent.mapsdk.internal.gn.this.f49620e, com.tencent.mapsdk.internal.hn.h(), com.tencent.mapsdk.internal.hn.d(), com.tencent.mapsdk.internal.hn.j(), com.tencent.mapsdk.internal.hn.k(), com.tencent.mapsdk.internal.hn.n(), com.tencent.mapsdk.internal.hn.c(), com.tencent.mapsdk.internal.hn.g(), b17);
                        if (report != null) {
                            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50209j, "Post statistic data with response:".concat(new java.lang.String(report.data, report.charset)));
                        }
                    }
                    byte[] c17 = fVar.c();
                    if (c17 != null && c17.length > 0 && (reportBehavior = ((com.tencent.mapsdk.internal.cz) ((com.tencent.mapsdk.internal.Cdo) com.tencent.mapsdk.internal.cp.a(com.tencent.mapsdk.internal.Cdo.class)).i()).reportBehavior(c17)) != null) {
                        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50209j, "Post cls data with response:".concat(new java.lang.String(reportBehavior.data, reportBehavior.charset)));
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mapsdk.core.utils.log.LogUtil.e(com.tencent.mapsdk.internal.kx.f50209j, "err:" + e17.getMessage());
                    com.tencent.mapsdk.internal.ks.c(com.tencent.mapsdk.internal.gn.this.f49622g, com.tencent.map.tools.json.JsonUtils.modelToJson(fVar).toString());
                    z17 = false;
                }
                com.tencent.mapsdk.internal.gn.e a19 = com.tencent.mapsdk.internal.gn.e.a(com.tencent.mapsdk.internal.gn.c.UPLOAD);
                a19.f49651e = fVar;
                a19.f49647a = com.tencent.mapsdk.internal.gn.b.END;
                a19.f49649c = z17;
                com.tencent.mapsdk.internal.gn.a aVar3 = aVar;
                if (aVar3 != null) {
                    aVar3.a(java.lang.Boolean.valueOf(z17));
                }
                com.tencent.mapsdk.internal.gn.this.f49623h = false;
            }
        });
    }

    private void a(boolean z17) {
        com.tencent.mapsdk.internal.gn.c cVar = com.tencent.mapsdk.internal.gn.c.UPLOAD_END;
        com.tencent.mapsdk.internal.gn.e a17 = com.tencent.mapsdk.internal.gn.e.a(cVar);
        com.tencent.mapsdk.internal.gn.b bVar = com.tencent.mapsdk.internal.gn.b.START;
        a17.f49647a = bVar;
        byte[] c17 = com.tencent.mapsdk.internal.ks.c(this.f49622g);
        com.tencent.mapsdk.internal.gn.e a18 = com.tencent.mapsdk.internal.gn.e.a(cVar);
        a18.f49647a = com.tencent.mapsdk.internal.gn.b.PROCESSING;
        a18.f49649c = z17;
        a18.f49650d = c17;
        a18.f49651e = this.f49622g;
        if (z17) {
            com.tencent.mapsdk.internal.ks.b(this.f49621f);
            if (c17 != null && c17.length > 0) {
                com.tencent.mapsdk.internal.ks.a(this.f49622g, this.f49621f);
            }
        } else if (c17 != null && c17.length > 0) {
            com.tencent.mapsdk.internal.gn.f fVar = new com.tencent.mapsdk.internal.gn.f();
            com.tencent.mapsdk.internal.gn.f a19 = a(this.f49621f);
            com.tencent.mapsdk.internal.gn.f a27 = a(this.f49622g);
            fVar.a(a19);
            fVar.a(a27);
            com.tencent.mapsdk.internal.ks.b(this.f49621f);
            com.tencent.mapsdk.internal.ks.b(this.f49622g);
            byte[] a28 = a(fVar, a18);
            com.tencent.mapsdk.internal.gn.c cVar2 = com.tencent.mapsdk.internal.gn.c.WRITE;
            com.tencent.mapsdk.internal.gn.e a29 = com.tencent.mapsdk.internal.gn.e.a(cVar2);
            a29.f49647a = bVar;
            a29.f49648b = a18;
            a29.f49650d = a28;
            java.io.File file = this.f49621f;
            a29.f49651e = file;
            boolean a37 = com.tencent.mapsdk.internal.ks.a(file, a28);
            com.tencent.mapsdk.internal.gn.e a38 = com.tencent.mapsdk.internal.gn.e.a(cVar2);
            a38.f49647a = com.tencent.mapsdk.internal.gn.b.END;
            a38.f49648b = a18;
            a38.f49649c = a37;
        }
        com.tencent.mapsdk.internal.gn.e.a(cVar).f49647a = com.tencent.mapsdk.internal.gn.b.END;
    }

    private void a(com.tencent.mapsdk.internal.hg hgVar, com.tencent.mapsdk.internal.gm gmVar) {
        this.f49616a--;
        if (hgVar != null) {
            synchronized (this) {
                this.f49617b.f49653a.add(hgVar);
                if (gmVar != null && gmVar.f49613a.f49592a != null) {
                    this.f49617b.f49654b.addAll(gmVar.f49613a.f49592a);
                }
            }
        }
        if (this.f49616a == 0 && !this.f49617b.a()) {
            a(this.f49617b, new com.tencent.mapsdk.internal.gn.a<java.lang.Boolean>() { // from class: com.tencent.mapsdk.internal.gn.4
                @Override // com.tencent.mapsdk.internal.gn.a
                public final /* synthetic */ void a(java.lang.Boolean bool) {
                    java.lang.Boolean bool2 = bool;
                    com.tencent.mapsdk.internal.gn.a(com.tencent.mapsdk.internal.gn.this, bool2.booleanValue());
                    if (bool2.booleanValue()) {
                        com.tencent.mapsdk.internal.gn.f fVar = com.tencent.mapsdk.internal.gn.this.f49617b;
                        fVar.f49653a.clear();
                        fVar.f49654b.clear();
                    }
                }

                /* renamed from: a, reason: avoid collision after fix types in other method */
                private void a2(java.lang.Boolean bool) {
                    com.tencent.mapsdk.internal.gn.a(com.tencent.mapsdk.internal.gn.this, bool.booleanValue());
                    if (bool.booleanValue()) {
                        com.tencent.mapsdk.internal.gn.f fVar = com.tencent.mapsdk.internal.gn.this.f49617b;
                        fVar.f49653a.clear();
                        fVar.f49654b.clear();
                    }
                }
            });
        }
    }

    private static com.tencent.mapsdk.internal.hg a(long j17) {
        com.tencent.mapsdk.internal.gn.e.a(com.tencent.mapsdk.internal.gn.c.CREATE).f49651e = java.lang.Long.valueOf(j17);
        return new com.tencent.mapsdk.internal.hg(j17);
    }

    public static /* synthetic */ void a(com.tencent.mapsdk.internal.gn gnVar, boolean z17) {
        com.tencent.mapsdk.internal.gn.c cVar = com.tencent.mapsdk.internal.gn.c.UPLOAD_END;
        com.tencent.mapsdk.internal.gn.e a17 = com.tencent.mapsdk.internal.gn.e.a(cVar);
        com.tencent.mapsdk.internal.gn.b bVar = com.tencent.mapsdk.internal.gn.b.START;
        a17.f49647a = bVar;
        byte[] c17 = com.tencent.mapsdk.internal.ks.c(gnVar.f49622g);
        com.tencent.mapsdk.internal.gn.e a18 = com.tencent.mapsdk.internal.gn.e.a(cVar);
        a18.f49647a = com.tencent.mapsdk.internal.gn.b.PROCESSING;
        a18.f49649c = z17;
        a18.f49650d = c17;
        a18.f49651e = gnVar.f49622g;
        if (z17) {
            com.tencent.mapsdk.internal.ks.b(gnVar.f49621f);
            if (c17 != null && c17.length > 0) {
                com.tencent.mapsdk.internal.ks.a(gnVar.f49622g, gnVar.f49621f);
            }
        } else if (c17 != null && c17.length > 0) {
            com.tencent.mapsdk.internal.gn.f fVar = new com.tencent.mapsdk.internal.gn.f();
            com.tencent.mapsdk.internal.gn.f a19 = a(gnVar.f49621f);
            com.tencent.mapsdk.internal.gn.f a27 = a(gnVar.f49622g);
            fVar.a(a19);
            fVar.a(a27);
            com.tencent.mapsdk.internal.ks.b(gnVar.f49621f);
            com.tencent.mapsdk.internal.ks.b(gnVar.f49622g);
            byte[] a28 = a(fVar, a18);
            com.tencent.mapsdk.internal.gn.c cVar2 = com.tencent.mapsdk.internal.gn.c.WRITE;
            com.tencent.mapsdk.internal.gn.e a29 = com.tencent.mapsdk.internal.gn.e.a(cVar2);
            a29.f49647a = bVar;
            a29.f49648b = a18;
            a29.f49650d = a28;
            java.io.File file = gnVar.f49621f;
            a29.f49651e = file;
            boolean a37 = com.tencent.mapsdk.internal.ks.a(file, a28);
            com.tencent.mapsdk.internal.gn.e a38 = com.tencent.mapsdk.internal.gn.e.a(cVar2);
            a38.f49647a = com.tencent.mapsdk.internal.gn.b.END;
            a38.f49648b = a18;
            a38.f49649c = a37;
        }
        com.tencent.mapsdk.internal.gn.e.a(cVar).f49647a = com.tencent.mapsdk.internal.gn.b.END;
    }
}
