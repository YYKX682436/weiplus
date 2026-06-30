package bs5;

/* loaded from: classes13.dex */
public class b extends bs5.f {

    /* renamed from: i, reason: collision with root package name */
    public final java.nio.channels.SocketChannel f105540i;

    /* renamed from: j, reason: collision with root package name */
    public final java.net.SocketAddress f105541j;

    /* renamed from: k, reason: collision with root package name */
    public java.nio.ByteBuffer f105542k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.StringBuilder f105543l;

    /* renamed from: m, reason: collision with root package name */
    public java.nio.ByteBuffer f105544m;

    /* renamed from: n, reason: collision with root package name */
    public final tr5.o f105545n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ bs5.c f105546o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(bs5.c cVar, tr5.a0 a0Var, tr5.r rVar, bs5.f fVar) {
        super(cVar, a0Var, rVar, fVar);
        this.f105546o = cVar;
        this.f105540i = null;
        this.f105541j = null;
        this.f105542k = null;
        this.f105543l = null;
        this.f105544m = null;
        this.f105545n = new bs5.a(this);
        if (3 == this.f105552a) {
            return;
        }
        java.nio.channels.Selector selector = this.f105553b.f502979g;
        if (selector == null) {
            throw new java.lang.IllegalArgumentException("selector".concat(" can not be null"));
        }
        try {
            try {
                java.nio.channels.SocketChannel open = java.nio.channels.SocketChannel.open();
                this.f105540i = open;
                or5.b.a(cVar.g() + "%s opened", open);
                try {
                    open.configureBlocking(false);
                    try {
                        java.nio.channels.SelectionKey register = open.register(selector, 13);
                        this.f105555d = register;
                        register.attach(open);
                        this.f105552a = 1;
                        java.net.SocketAddress h17 = cVar.h(this.f105553b.f502973a.f503011d, cVar.f105547b);
                        this.f105541j = h17;
                        if (h17 == null) {
                            or5.b.a(cVar.g() + "get target socket address failed", new java.lang.Object[0]);
                            this.f105556e.f105562i = 1006;
                            b();
                        }
                    } catch (java.lang.Exception e17) {
                        bs5.g gVar = this.f105556e;
                        gVar.f105562i = 1005;
                        gVar.f105563m = e17.getMessage();
                        throw e17;
                    }
                } catch (java.lang.Exception e18) {
                    bs5.g gVar2 = this.f105556e;
                    gVar2.f105562i = 1004;
                    gVar2.f105563m = e18.getMessage();
                    throw e18;
                }
            } catch (java.lang.Exception e19) {
                bs5.g gVar3 = this.f105556e;
                gVar3.f105562i = 1001;
                gVar3.f105563m = e19.getMessage();
                throw e19;
            }
        } catch (java.lang.Exception e27) {
            or5.b.c(3, e27, cVar.g() + "create socket channel failed", new java.lang.Object[0]);
            b();
        }
    }

    @Override // bs5.f
    public int a() {
        bs5.c cVar = this.f105546o;
        try {
            or5.b.a(cVar.g() + "connect start", new java.lang.Object[0]);
            this.f105540i.connect(this.f105541j);
            return 0;
        } catch (java.lang.Exception e17) {
            or5.b.c(3, e17, cVar.g() + "connect failed", new java.lang.Object[0]);
            b();
            bs5.g gVar = this.f105556e;
            gVar.f105562i = 11001;
            gVar.f105563m = e17.getMessage();
            return 1;
        }
    }

    @Override // bs5.f
    public int d() {
        java.lang.String str;
        tr5.f0 f0Var = this.f105553b.f502973a;
        java.lang.String str2 = f0Var.f503011d;
        java.lang.String str3 = f0Var.f503022o;
        bs5.q qVar = (bs5.q) f0Var.f503012e;
        bs5.c cVar = this.f105546o;
        java.lang.String i17 = cVar.i(str2, str3, qVar);
        boolean isEmpty = android.text.TextUtils.isEmpty(i17);
        bs5.g gVar = this.f105556e;
        if (isEmpty) {
            gVar.f105562i = 1007;
            b();
            return 1;
        }
        if (android.text.TextUtils.isEmpty(i17)) {
            throw new java.lang.IllegalArgumentException("urlStr".concat(" can not be empty"));
        }
        try {
            java.net.URL url = new java.net.URL(i17);
            java.lang.String host = url.getHost();
            str = "GET " + url.getFile() + " HTTP/1.1\r\nConnection: keep-alive\r\nHost: " + host + "\r\n\r\n";
        } catch (java.net.MalformedURLException unused) {
            str = "";
        }
        if (android.text.TextUtils.isEmpty(str)) {
            gVar.f105562i = 1008;
            b();
            return 1;
        }
        try {
            or5.b.d(cVar.g() + "send httpReq:{\n%s}", str);
            or5.b.a(cVar.g() + "lookup send byUrl: %s", i17);
            if (this.f105544m == null) {
                this.f105544m = java.nio.ByteBuffer.wrap(str.getBytes(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
            }
            java.nio.ByteBuffer byteBuffer = this.f105544m;
            int i18 = 0;
            while (byteBuffer.hasRemaining()) {
                int write = this.f105540i.write(byteBuffer);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(cVar.g());
                sb6.append("send request count:");
                i18++;
                sb6.append(i18);
                sb6.append(", res:");
                sb6.append(write);
                or5.b.a(sb6.toString(), new java.lang.Object[0]);
                if (write <= 0) {
                    break;
                }
            }
            if (byteBuffer.hasRemaining()) {
                or5.b.a(cVar.g() + "send request has remaining, try again", new java.lang.Object[0]);
                return 2;
            }
            this.f105544m = null;
            this.f105555d.interestOps(1);
            or5.b.a(cVar.g() + "send request finish", new java.lang.Object[0]);
            return 0;
        } catch (java.lang.Exception e17) {
            or5.b.c(3, e17, cVar.g() + "send request failed, for exception", new java.lang.Object[0]);
            b();
            gVar.f105562i = 21001;
            gVar.f105563m = e17.getMessage();
            return 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00dc A[EDGE_INSN: B:17:0x00dc->B:18:0x00dc BREAK  A[LOOP:0: B:8:0x0044->B:49:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[LOOP:0: B:8:0x0044->B:49:?, LOOP_END, SYNTHETIC] */
    @Override // bs5.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cs5.a e() {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bs5.b.e():cs5.a");
    }
}
