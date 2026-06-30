package r06;

/* loaded from: classes15.dex */
public final class w0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r06.x0 f450080d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(r06.x0 x0Var) {
        super(1);
        this.f450080d = x0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        n16.c fqName = (n16.c) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        r06.x0 x0Var = this.f450080d;
        ((r06.b1) x0Var.f450084i).getClass();
        e26.c0 storageManager = x0Var.f450081f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storageManager, "storageManager");
        return new r06.o0(x0Var, fqName, storageManager);
    }
}
