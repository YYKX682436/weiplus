package ir2;

/* loaded from: classes2.dex */
public class a extends ir2.e1 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f375615d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f375616e;

    /* renamed from: f, reason: collision with root package name */
    public int f375617f;

    /* renamed from: g, reason: collision with root package name */
    public int f375618g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f375619h;

    /* renamed from: i, reason: collision with root package name */
    public int f375620i;

    /* renamed from: j, reason: collision with root package name */
    public ym5.s3 f375621j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(java.util.List r1, boolean r2, com.p314xaae8f345.mm.p2495xc50a8b8b.g r3, boolean r4, int r5, p3321xbce91901.jvm.p3324x21ffc6bd.i r6) {
        /*
            r0 = this;
            r6 = r5 & 1
            if (r6 == 0) goto L9
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L9:
            r6 = r5 & 2
            if (r6 == 0) goto Le
            r2 = 1
        Le:
            r6 = r5 & 4
            if (r6 == 0) goto L13
            r3 = 0
        L13:
            r5 = r5 & 8
            if (r5 == 0) goto L18
            r4 = 0
        L18:
            java.lang.String r5 = "feeds"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1, r5)
            r0.<init>(r1, r4)
            r0.f375615d = r2
            r0.f375616e = r3
            java.lang.String r1 = ""
            r0.f375619h = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ir2.a.<init>(java.util.List, boolean, com.tencent.mm.protobuf.g, boolean, int, kotlin.jvm.internal.i):void");
    }

    @Override // ir2.e1
    public ym5.s3 a() {
        ym5.s3 s3Var = this.f375621j;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s3Var);
        return s3Var;
    }

    @Override // ir2.e1
    public void b(java.util.List dataList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        ir2.d dVar = (ir2.d) ((jz5.n) this.f375664c).mo141623x754a37bb();
        java.util.List list = this.f375662a;
        dVar.a(dataList, list);
        boolean z17 = this.f375615d;
        ym5.s3 s3Var = new ym5.s3(!z17 ? 1 : 0);
        s3Var.f545054f = this.f375620i > 0;
        if (!z17) {
            s3Var.f545055g = list.isEmpty();
            s3Var.f545056h = list.size();
        }
        this.f375621j = s3Var;
    }
}
