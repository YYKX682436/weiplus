package l31;

/* loaded from: classes9.dex */
public final class i0 extends l31.b {

    /* renamed from: e, reason: collision with root package name */
    public final k31.a f396896e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f396897f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(java.lang.String username, java.util.List templateList, k31.a aVar, e31.l lVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(username);
        aVar = (i17 & 4) != 0 ? null : aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateList, "templateList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f396897f = arrayList;
        this.f396896e = aVar;
        arrayList.addAll(templateList);
    }

    @Override // l31.u
    public void run() {
        l31.h0 h0Var = new l31.h0(this);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
            h0Var.mo152xb9724478();
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).B(new l31.g0(h0Var));
    }
}
