package l31;

/* loaded from: classes9.dex */
public final class b0 extends l31.b {

    /* renamed from: e, reason: collision with root package name */
    public final k31.a f396850e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f396851f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f396852g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f396853h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f396854i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(java.lang.String username, java.util.List toSaveList, boolean z17, boolean z18, boolean z19, k31.a aVar, e31.l lVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(username);
        aVar = (i17 & 32) != 0 ? null : aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toSaveList, "toSaveList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f396851f = arrayList;
        this.f396850e = aVar;
        arrayList.addAll(toSaveList);
        this.f396852g = z17;
        this.f396853h = z18;
        this.f396854i = z19;
    }

    @Override // l31.u
    public void run() {
        l31.a0 a0Var = new l31.a0(this);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
            a0Var.mo152xb9724478();
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new l31.z(a0Var));
        }
    }
}
