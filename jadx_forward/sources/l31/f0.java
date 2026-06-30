package l31;

/* loaded from: classes9.dex */
public final class f0 extends l31.b {

    /* renamed from: e, reason: collision with root package name */
    public e31.l f396874e;

    /* renamed from: f, reason: collision with root package name */
    public e31.l f396875f;

    /* renamed from: g, reason: collision with root package name */
    public final k31.a f396876g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f396877h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f396878i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f396879j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f396880k;

    /* renamed from: l, reason: collision with root package name */
    public final byte[] f396881l;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p965xc41bc71e.C11157x9b46987e f396882m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f396883n;

    /* renamed from: o, reason: collision with root package name */
    public f31.f f396884o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f0(e31.o r5, k31.a r6, e31.l r7) {
        /*
            r4 = this;
            java.lang.String r0 = "updateRequest"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r0)
            java.lang.String r0 = r5.f328622a
            java.lang.String r1 = "bizUsername"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r0, r1)
            r4.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.f396877h = r0
            java.lang.String r1 = ""
            r4.f396878i = r1
            r2 = 1
            byte[] r2 = new byte[r2]
            r3 = 0
            r2[r3] = r3
            r4.f396881l = r2
            r4.f396883n = r1
            r4.f396876g = r6
            java.lang.String r6 = r5.f328623b
            r4.f396878i = r6
            java.util.List r6 = r5.f328624c
            r0.addAll(r6)
            e31.l r6 = r5.f328630i
            r4.f396874e = r6
            r4.f396875f = r7
            boolean r6 = r5.f328625d
            r4.f396879j = r6
            byte[] r6 = r5.f328626e
            r4.f396881l = r6
            com.tencent.mm.msgsubscription.SubscribeMsgRequestDialogUiData r6 = r5.f328627f
            r4.f396882m = r6
            java.lang.String r6 = r5.f328628g
            r4.f396883n = r6
            boolean r5 = r5.f328629h
            r4.f396880k = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l31.f0.<init>(e31.o, k31.a, e31.l):void");
    }

    @Override // l31.b
    public void a() {
        this.f396849d = true;
        java.lang.Object[] objArr = new java.lang.Object[1];
        f31.f fVar = this.f396884o;
        objArr[0] = fVar != null ? java.lang.Integer.valueOf(fVar.hashCode()) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdateSubscribeMsgListTask", "updateSubscribeMsgList cancel task: %s", objArr);
        this.f396874e = null;
        this.f396875f = null;
        f31.b.f340802a.b(this.f396884o);
    }

    @Override // l31.b
    public java.lang.String b() {
        return (this.f396846a.length() > 0 ? this.f396846a : this.f396878i) + ",1";
    }

    @Override // l31.u
    public void run() {
        f31.f c17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdateSubscribeMsgListTask", "updateSubscribeMsgList %s, isOpened: %b", this.f396846a, java.lang.Boolean.valueOf(this.f396879j));
        l31.e0 e0Var = new l31.e0(this);
        boolean z17 = this.f396880k;
        java.util.List templates = this.f396877h;
        f31.c cVar = f31.d.f340804a;
        if (z17) {
            c17 = cVar.b(this.f396846a, this.f396878i, templates, this.f396883n, e0Var, this.f396879j, this.f396881l, this.f396882m);
        } else {
            java.lang.String username = this.f396846a;
            boolean z18 = this.f396879j;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
            java.lang.String appId = this.f396878i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templates, "templates");
            c17 = cVar.c(username, appId, z18, e0Var, templates, 1, new byte[0], (r22 & 128) != 0 ? null : null, (r22 & 256) != 0 ? "" : null);
        }
        this.f396884o = c17;
        c(c17);
    }
}
