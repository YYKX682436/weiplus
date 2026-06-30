package l31;

/* loaded from: classes9.dex */
public final class t extends l31.b {

    /* renamed from: e, reason: collision with root package name */
    public final e31.l f396927e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f396928f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(java.lang.String username, java.util.List templateIds, k31.a aVar, e31.l lVar) {
        super(username);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateIds, "templateIds");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f396928f = arrayList;
        this.f396927e = lVar;
        arrayList.addAll(templateIds);
    }

    @Override // l31.u
    public void run() {
        java.lang.String username = this.f396846a;
        java.util.List templateMsgList = this.f396928f;
        l31.s sVar = new l31.s(this);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateMsgList, "templateMsgList");
        f31.f fVar = new f31.f(username, 5);
        fVar.f340810f = sVar;
        java.util.Iterator it = ((java.util.ArrayList) templateMsgList).iterator();
        while (it.hasNext()) {
            jz5.l lVar = (jz5.l) it.next();
            java.util.List list = fVar.f340808d;
            r45.th6 th6Var = new r45.th6();
            th6Var.f467981m = username;
            th6Var.f467975d = (java.lang.String) lVar.f384366d;
            th6Var.f467993y = ((java.lang.Number) lVar.f384367e).intValue();
            ((java.util.ArrayList) list).add(th6Var);
        }
        c(fVar);
    }
}
