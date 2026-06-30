package qq3;

/* loaded from: classes12.dex */
public abstract class i extends qq3.a {

    /* renamed from: e, reason: collision with root package name */
    public final sq3.a f447493e;

    /* renamed from: f, reason: collision with root package name */
    public final long f447494f;

    /* renamed from: g, reason: collision with root package name */
    public long f447495g;

    public i(sq3.a msgDbItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgDbItem, "msgDbItem");
        this.f447493e = msgDbItem;
        java.lang.String A0 = msgDbItem.A0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(A0, "getMsgItemId(...)");
        this.f447494f = java.lang.Long.parseLong((java.lang.String) r26.n0.f0(A0, new java.lang.String[]{"_"}, false, 0, 6, null).get(0));
    }

    public static /* synthetic */ void e(qq3.i iVar, int i17, int i18, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: preDownloadEnd");
        }
        if ((i19 & 2) != 0) {
            i18 = 0;
        }
        iVar.d(i17, i18);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0087, code lost:
    
        if (r14 != 7) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qq3.i.d(int, int):void");
    }

    public final void f() {
        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
        nVar.m134976x2690a4ac();
        sq3.b bVar = nVar.A;
        java.lang.String A0 = this.f447493e.A0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(A0, "getMsgItemId(...)");
        bVar.a7(A0, this.f447495g);
    }
}
