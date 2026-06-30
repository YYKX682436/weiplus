package l31;

/* loaded from: classes9.dex */
public final class n extends l31.b {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f396906e;

    /* renamed from: f, reason: collision with root package name */
    public final l31.k f396907f;

    /* renamed from: g, reason: collision with root package name */
    public f31.f f396908g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(k31.a aVar, java.util.List bizUsernameList, l31.k kVar) {
        super("");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizUsernameList, "bizUsernameList");
        this.f396906e = bizUsernameList;
        this.f396907f = kVar;
    }

    @Override // l31.b
    public void a() {
        this.f396849d = true;
        f31.f fVar = this.f396908g;
        if (fVar != null) {
            f31.b.f340802a.b(fVar);
        }
    }

    @Override // l31.u
    public void run() {
        l31.m mVar = new l31.m(this);
        java.util.List bizUsernameList = this.f396906e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizUsernameList, "bizUsernameList");
        f31.f fVar = new f31.f("", 7);
        fVar.f340810f = mVar;
        ((java.util.ArrayList) fVar.f340818n).addAll(bizUsernameList);
        this.f396908g = fVar;
        c(fVar);
    }
}
