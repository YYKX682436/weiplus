package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class gn {

    /* renamed from: i, reason: collision with root package name */
    private static final java.lang.String f131148i = "stData";

    /* renamed from: a, reason: collision with root package name */
    public int f131149a;

    /* renamed from: b, reason: collision with root package name */
    final com.tencent.mapsdk.internal.gn.f f131150b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f131151c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f131152d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f131153e;

    /* renamed from: f, reason: collision with root package name */
    final java.io.File f131154f;

    /* renamed from: g, reason: collision with root package name */
    final java.io.File f131155g;

    /* renamed from: h, reason: collision with root package name */
    volatile boolean f131156h;

    /* renamed from: j, reason: collision with root package name */
    private final java.lang.String f131157j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f131158k;

    /* renamed from: l, reason: collision with root package name */
    private com.tencent.mapsdk.internal.gn.d f131159l;

    /* renamed from: com.tencent.mapsdk.internal.gn$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass1 implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.tencent.mapsdk.internal.gn.a f131160a;

        public AnonymousClass1(com.tencent.mapsdk.internal.gn.a aVar) {
            this.f131160a = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.tencent.mapsdk.internal.gn.c cVar = com.tencent.mapsdk.internal.gn.c.READ;
            com.tencent.mapsdk.internal.gn.e a17 = com.tencent.mapsdk.internal.gn.e.a(cVar);
            a17.f131180a = com.tencent.mapsdk.internal.gn.b.START;
            java.io.File file = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gn.this.f131154f;
            a17.f131184e = file;
            byte[] c17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.c(file);
            if (!com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gn.this.f131154f.exists() || c17 == null || c17.length == 0) {
                com.tencent.mapsdk.internal.gn.e a18 = com.tencent.mapsdk.internal.gn.e.a(cVar);
                a18.f131180a = com.tencent.mapsdk.internal.gn.b.END;
                a18.f131184e = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gn.this.f131154f;
                a18.f131182c = false;
                com.tencent.mapsdk.internal.gn.a aVar = this.f131160a;
                if (aVar != null) {
                    aVar.a(null);
                    return;
                }
                return;
            }
            com.tencent.mapsdk.internal.gn.e a19 = com.tencent.mapsdk.internal.gn.e.a(cVar);
            a19.f131180a = com.tencent.mapsdk.internal.gn.b.PROCESSING;
            a19.f131184e = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gn.this.f131154f;
            com.tencent.mapsdk.internal.gn.f fVar = (com.tencent.mapsdk.internal.gn.f) com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35881x450f6f3b(new java.lang.String(c17), com.tencent.mapsdk.internal.gn.f.class, new java.lang.Object[0]);
            com.tencent.mapsdk.internal.gn.e a27 = com.tencent.mapsdk.internal.gn.e.a(cVar);
            a27.f131180a = com.tencent.mapsdk.internal.gn.b.END;
            a27.f131184e = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gn.this.f131154f;
            a27.f131182c = true;
            com.tencent.mapsdk.internal.gn.a aVar2 = this.f131160a;
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
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gn.this.a(fVar2, new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gn.AnonymousClass2.AnonymousClass1());
        }

        /* renamed from: com.tencent.mapsdk.internal.gn$2$1, reason: invalid class name */
        /* loaded from: classes13.dex */
        public class AnonymousClass1 implements com.tencent.mapsdk.internal.gn.a<java.lang.Boolean> {
            public AnonymousClass1() {
            }

            @Override // com.tencent.mapsdk.internal.gn.a
            public final /* synthetic */ void a(java.lang.Boolean bool) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gn.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gn.this, bool.booleanValue());
            }

            /* renamed from: a, reason: avoid collision after fix types in other method */
            private void a2(java.lang.Boolean bool) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gn.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gn.this, bool.booleanValue());
            }
        }

        /* renamed from: a, reason: avoid collision after fix types in other method */
        private void a2(com.tencent.mapsdk.internal.gn.f fVar) {
            if (fVar == null || fVar.a()) {
                return;
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gn.this.a(fVar, new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gn.AnonymousClass2.AnonymousClass1());
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
        com.tencent.mapsdk.internal.gn.b f131180a;

        /* renamed from: b, reason: collision with root package name */
        com.tencent.mapsdk.internal.gn.e f131181b;

        /* renamed from: c, reason: collision with root package name */
        boolean f131182c;

        /* renamed from: d, reason: collision with root package name */
        byte[] f131183d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.Object f131184e;

        /* renamed from: f, reason: collision with root package name */
        private com.tencent.mapsdk.internal.gn.c f131185f;

        private com.tencent.mapsdk.internal.gn.e a() {
            return this;
        }

        private com.tencent.mapsdk.internal.gn.c b() {
            return this.f131185f;
        }

        private byte[] c() {
            return this.f131183d;
        }

        private boolean d() {
            return this.f131182c;
        }

        private java.lang.Object e() {
            return this.f131184e;
        }

        private com.tencent.mapsdk.internal.gn.b f() {
            return this.f131180a;
        }

        /* renamed from: toString */
        public final java.lang.String m36761x9616526c() {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("StatisticState{mState=");
            stringBuffer.append(this.f131185f);
            stringBuffer.append(", mStage=");
            stringBuffer.append(this.f131180a);
            stringBuffer.append(", mParentState=");
            stringBuffer.append(this.f131181b);
            stringBuffer.append(", mResult=");
            stringBuffer.append(this.f131182c);
            stringBuffer.append(", mData=");
            if (this.f131183d == null) {
                stringBuffer.append("null");
            } else {
                stringBuffer.append('[');
                int i17 = 0;
                while (i17 < this.f131183d.length) {
                    stringBuffer.append(i17 == 0 ? "" : ", ");
                    stringBuffer.append((int) this.f131183d[i17]);
                    i17++;
                }
                stringBuffer.append(']');
            }
            stringBuffer.append(", mTag=");
            stringBuffer.append(this.f131184e);
            stringBuffer.append('}');
            return stringBuffer.toString();
        }

        public static com.tencent.mapsdk.internal.gn.e a(com.tencent.mapsdk.internal.gn.c cVar) {
            com.tencent.mapsdk.internal.gn.e eVar = new com.tencent.mapsdk.internal.gn.e();
            eVar.f131185f = cVar;
            return eVar;
        }

        private boolean b(com.tencent.mapsdk.internal.gn.c cVar) {
            return cVar == this.f131185f;
        }

        private boolean c(com.tencent.mapsdk.internal.gn.c cVar) {
            com.tencent.mapsdk.internal.gn.e eVar = this.f131181b;
            return eVar != null && cVar == eVar.f131185f;
        }

        private boolean b(com.tencent.mapsdk.internal.gn.c cVar, com.tencent.mapsdk.internal.gn.b bVar) {
            com.tencent.mapsdk.internal.gn.e eVar = this.f131181b;
            return eVar != null && bVar == eVar.f131180a && cVar == eVar.f131185f;
        }

        private com.tencent.mapsdk.internal.gn.e a(com.tencent.mapsdk.internal.gn.e eVar) {
            this.f131181b = eVar;
            return this;
        }

        private com.tencent.mapsdk.internal.gn.e a(com.tencent.mapsdk.internal.gn.b bVar) {
            this.f131180a = bVar;
            return this;
        }

        private com.tencent.mapsdk.internal.gn.e a(byte[] bArr) {
            this.f131183d = bArr;
            return this;
        }

        private com.tencent.mapsdk.internal.gn.e a(boolean z17) {
            this.f131182c = z17;
            return this;
        }

        private com.tencent.mapsdk.internal.gn.e a(java.lang.Object obj) {
            this.f131184e = obj;
            return this;
        }

        private boolean a(com.tencent.mapsdk.internal.gn.c cVar, com.tencent.mapsdk.internal.gn.b bVar) {
            return bVar == this.f131180a && cVar == this.f131185f;
        }
    }

    /* loaded from: classes13.dex */
    public static class f extends com.p314xaae8f345.map.p511x696c9db.p512x31ece8.AbstractC4317x9d76fe48 {

        /* renamed from: a, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gn.f131148i)
        java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hg> f131186a = new java.util.ArrayList();

        /* renamed from: b, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "clsData")
        java.util.List<com.tencent.mapsdk.internal.gl.b> f131187b = new java.util.ArrayList();

        private void d() {
            this.f131186a.clear();
            this.f131187b.clear();
        }

        public final boolean a() {
            return this.f131186a.isEmpty() && this.f131187b.isEmpty();
        }

        public final void a(com.tencent.mapsdk.internal.gn.f fVar) {
            if (fVar == null) {
                return;
            }
            this.f131186a.addAll(fVar.f131186a);
            this.f131187b.addAll(fVar.f131187b);
        }

        public final byte[] b() {
            java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hg> list = this.f131186a;
            if (list == null || list.isEmpty()) {
                return new byte[0];
            }
            java.lang.String m35870x946a6641 = com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35870x946a6641(new java.util.ArrayList(this.f131186a));
            try {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131742j, "Post statistic data: ".concat(java.lang.String.valueOf(m35870x946a6641)));
                return m35870x946a6641.getBytes(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            } catch (java.io.UnsupportedEncodingException unused) {
                return new byte[0];
            }
        }

        public final byte[] c() {
            java.util.List<com.tencent.mapsdk.internal.gl.b> list = this.f131187b;
            if (list == null || list.isEmpty()) {
                return new byte[0];
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gl glVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gl();
            glVar.a(this.f131187b);
            java.lang.String m35875xa34611bd = com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35875xa34611bd(glVar);
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131742j, "Post cls data: ".concat(java.lang.String.valueOf(m35875xa34611bd)));
            try {
                return m35875xa34611bd.getBytes(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            } catch (java.io.UnsupportedEncodingException unused) {
                return new byte[0];
            }
        }
    }

    public gn(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bn bnVar) {
        this(bnVar, (byte) 0);
    }

    private gn(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bn bnVar, byte b17) {
        this.f131158k = true;
        java.lang.String str = bnVar.F().f130542a;
        this.f131151c = str;
        this.f131152d = "";
        this.f131153e = "";
        this.f131150b = new com.tencent.mapsdk.internal.gn.f();
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7 c25966x7e4576a7 = bnVar.f130531a;
        if (c25966x7e4576a7 != null) {
            this.f131152d = c25966x7e4576a7.m99217x2ff2e2f5();
            this.f131153e = bnVar.f130531a.m99216x7528ddc5();
        }
        java.lang.String str2 = bnVar.mo36630x76847179().getFilesDir().getAbsolutePath() + java.io.File.separator + "stData_" + com.p314xaae8f345.map.p511x696c9db.C4314x286422.m35832x40453099(str);
        this.f131157j = str2;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(str2);
        this.f131154f = new java.io.File(str2);
        this.f131155g = new java.io.File(str2 + ".temp");
    }

    private void c() {
        if (this.f131149a == 0) {
            a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gn.AnonymousClass1(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gn.AnonymousClass2()));
        }
        this.f131149a++;
    }

    private static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hg d() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mapsdk.internal.gn.e.a(com.tencent.mapsdk.internal.gn.c.CREATE).f131184e = java.lang.Long.valueOf(currentTimeMillis);
        return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hg(currentTimeMillis);
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gm e() {
        java.lang.String str = this.f131151c;
        java.lang.String str2 = this.f131152d;
        java.lang.String m17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.m();
        java.lang.String str3 = this.f131153e;
        java.lang.String h17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.h();
        java.lang.String d17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.d();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.j());
        return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gm(new com.tencent.mapsdk.internal.gl.b(str, str2, m17, str3, h17, d17, sb6.toString(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.k(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.n(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.c(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.g()));
    }

    private java.lang.String a() {
        return this.f131157j;
    }

    private void b() {
        a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gn.AnonymousClass1(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gn.AnonymousClass2()));
    }

    private void a(com.tencent.mapsdk.internal.gn.d dVar) {
        this.f131159l = dVar;
    }

    public final void a(java.lang.Runnable runnable) {
        if (this.f131156h) {
            return;
        }
        if (this.f131158k) {
            new java.lang.Thread(runnable).start();
        } else {
            runnable.run();
        }
    }

    private void a(com.tencent.mapsdk.internal.gn.a<com.tencent.mapsdk.internal.gn.f> aVar) {
        a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gn.AnonymousClass1(aVar));
    }

    private static com.tencent.mapsdk.internal.gn.f a(java.io.File file) {
        com.tencent.mapsdk.internal.gn.f fVar;
        com.tencent.mapsdk.internal.gn.f fVar2 = new com.tencent.mapsdk.internal.gn.f();
        byte[] c17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.c(file);
        if (c17 != null && c17.length > 0 && (fVar = (com.tencent.mapsdk.internal.gn.f) com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35881x450f6f3b(new java.lang.String(c17), com.tencent.mapsdk.internal.gn.f.class, new java.lang.Object[0])) != null) {
            fVar2.a(fVar);
        }
        return fVar2;
    }

    private static byte[] a(com.tencent.mapsdk.internal.gn.f fVar, com.tencent.mapsdk.internal.gn.e eVar) {
        com.tencent.mapsdk.internal.gn.c cVar = com.tencent.mapsdk.internal.gn.c.TRANSLATE_BYTE;
        com.tencent.mapsdk.internal.gn.e a17 = com.tencent.mapsdk.internal.gn.e.a(cVar);
        a17.f131180a = com.tencent.mapsdk.internal.gn.b.START;
        a17.f131181b = eVar;
        byte[] bArr = null;
        if (fVar.a()) {
            com.tencent.mapsdk.internal.gn.e a18 = com.tencent.mapsdk.internal.gn.e.a(cVar);
            a18.f131180a = com.tencent.mapsdk.internal.gn.b.END;
            a18.f131181b = eVar;
            a18.f131182c = false;
            return null;
        }
        com.tencent.mapsdk.internal.gn.e a19 = com.tencent.mapsdk.internal.gn.e.a(cVar);
        a19.f131180a = com.tencent.mapsdk.internal.gn.b.PROCESSING;
        a19.f131184e = fVar;
        a19.f131181b = eVar;
        java.lang.String m35875xa34611bd = com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35875xa34611bd(fVar);
        if (!android.text.TextUtils.isEmpty(m35875xa34611bd)) {
            try {
                bArr = m35875xa34611bd.getBytes(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            } catch (java.io.UnsupportedEncodingException unused) {
                bArr = m35875xa34611bd.getBytes();
            }
        }
        com.tencent.mapsdk.internal.gn.e a27 = com.tencent.mapsdk.internal.gn.e.a(com.tencent.mapsdk.internal.gn.c.TRANSLATE_BYTE);
        a27.f131180a = com.tencent.mapsdk.internal.gn.b.END;
        a27.f131183d = bArr;
        a27.f131184e = m35875xa34611bd;
        a27.f131181b = eVar;
        a27.f131182c = bArr != null;
        return bArr;
    }

    public final void a(final com.tencent.mapsdk.internal.gn.f fVar, final com.tencent.mapsdk.internal.gn.a<java.lang.Boolean> aVar) {
        a(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.gn.3
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde m36687xf0f6f7a6;
                com.tencent.mapsdk.internal.gn.c cVar = com.tencent.mapsdk.internal.gn.c.UPLOAD;
                com.tencent.mapsdk.internal.gn.e a17 = com.tencent.mapsdk.internal.gn.e.a(cVar);
                com.tencent.mapsdk.internal.gn.f fVar2 = fVar;
                a17.f131184e = fVar2;
                a17.f131180a = com.tencent.mapsdk.internal.gn.b.START;
                if (fVar2 == null || fVar2.a()) {
                    com.tencent.mapsdk.internal.gn.a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.a(java.lang.Boolean.FALSE);
                    }
                    com.tencent.mapsdk.internal.gn.e a18 = com.tencent.mapsdk.internal.gn.e.a(cVar);
                    a18.f131182c = false;
                    a18.f131180a = com.tencent.mapsdk.internal.gn.b.END;
                    return;
                }
                boolean z17 = true;
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gn.this.f131156h = true;
                try {
                    com.tencent.mapsdk.internal.gn.e.a(cVar).f131180a = com.tencent.mapsdk.internal.gn.b.PROCESSING;
                    byte[] b17 = fVar.b();
                    if (b17 != null && b17.length > 0) {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.di diVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.di) ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dx) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cp.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dx.class)).i();
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gn gnVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gn.this;
                        com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde m36700xc84c5534 = diVar.m36700xc84c5534(gnVar.f131151c, gnVar.f131152d, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.m(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gn.this.f131153e, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.h(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.d(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.j(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.k(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.n(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.c(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.g(), b17);
                        if (m36700xc84c5534 != null) {
                            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131742j, "Post statistic data with response:".concat(new java.lang.String(m36700xc84c5534.f16977x2eefaa, m36700xc84c5534.f16974x2c0d614c)));
                        }
                    }
                    byte[] c17 = fVar.c();
                    if (c17 != null && c17.length > 0 && (m36687xf0f6f7a6 = ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cz) ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.Cdo) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cp.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.Cdo.class)).i()).m36687xf0f6f7a6(c17)) != null) {
                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131742j, "Post cls data with response:".concat(new java.lang.String(m36687xf0f6f7a6.f16977x2eefaa, m36687xf0f6f7a6.f16974x2c0d614c)));
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.e(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131742j, "err:" + e17.getMessage());
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gn.this.f131155g, com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35874x1e81de8c(fVar).toString());
                    z17 = false;
                }
                com.tencent.mapsdk.internal.gn.e a19 = com.tencent.mapsdk.internal.gn.e.a(com.tencent.mapsdk.internal.gn.c.UPLOAD);
                a19.f131184e = fVar;
                a19.f131180a = com.tencent.mapsdk.internal.gn.b.END;
                a19.f131182c = z17;
                com.tencent.mapsdk.internal.gn.a aVar3 = aVar;
                if (aVar3 != null) {
                    aVar3.a(java.lang.Boolean.valueOf(z17));
                }
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gn.this.f131156h = false;
            }
        });
    }

    private void a(boolean z17) {
        com.tencent.mapsdk.internal.gn.c cVar = com.tencent.mapsdk.internal.gn.c.UPLOAD_END;
        com.tencent.mapsdk.internal.gn.e a17 = com.tencent.mapsdk.internal.gn.e.a(cVar);
        com.tencent.mapsdk.internal.gn.b bVar = com.tencent.mapsdk.internal.gn.b.START;
        a17.f131180a = bVar;
        byte[] c17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.c(this.f131155g);
        com.tencent.mapsdk.internal.gn.e a18 = com.tencent.mapsdk.internal.gn.e.a(cVar);
        a18.f131180a = com.tencent.mapsdk.internal.gn.b.PROCESSING;
        a18.f131182c = z17;
        a18.f131183d = c17;
        a18.f131184e = this.f131155g;
        if (z17) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(this.f131154f);
            if (c17 != null && c17.length > 0) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(this.f131155g, this.f131154f);
            }
        } else if (c17 != null && c17.length > 0) {
            com.tencent.mapsdk.internal.gn.f fVar = new com.tencent.mapsdk.internal.gn.f();
            com.tencent.mapsdk.internal.gn.f a19 = a(this.f131154f);
            com.tencent.mapsdk.internal.gn.f a27 = a(this.f131155g);
            fVar.a(a19);
            fVar.a(a27);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(this.f131154f);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(this.f131155g);
            byte[] a28 = a(fVar, a18);
            com.tencent.mapsdk.internal.gn.c cVar2 = com.tencent.mapsdk.internal.gn.c.WRITE;
            com.tencent.mapsdk.internal.gn.e a29 = com.tencent.mapsdk.internal.gn.e.a(cVar2);
            a29.f131180a = bVar;
            a29.f131181b = a18;
            a29.f131183d = a28;
            java.io.File file = this.f131154f;
            a29.f131184e = file;
            boolean a37 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(file, a28);
            com.tencent.mapsdk.internal.gn.e a38 = com.tencent.mapsdk.internal.gn.e.a(cVar2);
            a38.f131180a = com.tencent.mapsdk.internal.gn.b.END;
            a38.f131181b = a18;
            a38.f131182c = a37;
        }
        com.tencent.mapsdk.internal.gn.e.a(cVar).f131180a = com.tencent.mapsdk.internal.gn.b.END;
    }

    private void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hg hgVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gm gmVar) {
        this.f131149a--;
        if (hgVar != null) {
            synchronized (this) {
                this.f131150b.f131186a.add(hgVar);
                if (gmVar != null && gmVar.f131146a.f131125a != null) {
                    this.f131150b.f131187b.addAll(gmVar.f131146a.f131125a);
                }
            }
        }
        if (this.f131149a == 0 && !this.f131150b.a()) {
            a(this.f131150b, new com.tencent.mapsdk.internal.gn.a<java.lang.Boolean>() { // from class: com.tencent.mapsdk.internal.gn.4
                @Override // com.tencent.mapsdk.internal.gn.a
                public final /* synthetic */ void a(java.lang.Boolean bool) {
                    java.lang.Boolean bool2 = bool;
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gn.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gn.this, bool2.booleanValue());
                    if (bool2.booleanValue()) {
                        com.tencent.mapsdk.internal.gn.f fVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gn.this.f131150b;
                        fVar.f131186a.clear();
                        fVar.f131187b.clear();
                    }
                }

                /* renamed from: a, reason: avoid collision after fix types in other method */
                private void a2(java.lang.Boolean bool) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gn.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gn.this, bool.booleanValue());
                    if (bool.booleanValue()) {
                        com.tencent.mapsdk.internal.gn.f fVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gn.this.f131150b;
                        fVar.f131186a.clear();
                        fVar.f131187b.clear();
                    }
                }
            });
        }
    }

    private static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hg a(long j17) {
        com.tencent.mapsdk.internal.gn.e.a(com.tencent.mapsdk.internal.gn.c.CREATE).f131184e = java.lang.Long.valueOf(j17);
        return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hg(j17);
    }

    public static /* synthetic */ void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gn gnVar, boolean z17) {
        com.tencent.mapsdk.internal.gn.c cVar = com.tencent.mapsdk.internal.gn.c.UPLOAD_END;
        com.tencent.mapsdk.internal.gn.e a17 = com.tencent.mapsdk.internal.gn.e.a(cVar);
        com.tencent.mapsdk.internal.gn.b bVar = com.tencent.mapsdk.internal.gn.b.START;
        a17.f131180a = bVar;
        byte[] c17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.c(gnVar.f131155g);
        com.tencent.mapsdk.internal.gn.e a18 = com.tencent.mapsdk.internal.gn.e.a(cVar);
        a18.f131180a = com.tencent.mapsdk.internal.gn.b.PROCESSING;
        a18.f131182c = z17;
        a18.f131183d = c17;
        a18.f131184e = gnVar.f131155g;
        if (z17) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(gnVar.f131154f);
            if (c17 != null && c17.length > 0) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(gnVar.f131155g, gnVar.f131154f);
            }
        } else if (c17 != null && c17.length > 0) {
            com.tencent.mapsdk.internal.gn.f fVar = new com.tencent.mapsdk.internal.gn.f();
            com.tencent.mapsdk.internal.gn.f a19 = a(gnVar.f131154f);
            com.tencent.mapsdk.internal.gn.f a27 = a(gnVar.f131155g);
            fVar.a(a19);
            fVar.a(a27);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(gnVar.f131154f);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(gnVar.f131155g);
            byte[] a28 = a(fVar, a18);
            com.tencent.mapsdk.internal.gn.c cVar2 = com.tencent.mapsdk.internal.gn.c.WRITE;
            com.tencent.mapsdk.internal.gn.e a29 = com.tencent.mapsdk.internal.gn.e.a(cVar2);
            a29.f131180a = bVar;
            a29.f131181b = a18;
            a29.f131183d = a28;
            java.io.File file = gnVar.f131154f;
            a29.f131184e = file;
            boolean a37 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(file, a28);
            com.tencent.mapsdk.internal.gn.e a38 = com.tencent.mapsdk.internal.gn.e.a(cVar2);
            a38.f131180a = com.tencent.mapsdk.internal.gn.b.END;
            a38.f131181b = a18;
            a38.f131182c = a37;
        }
        com.tencent.mapsdk.internal.gn.e.a(cVar).f131180a = com.tencent.mapsdk.internal.gn.b.END;
    }
}
