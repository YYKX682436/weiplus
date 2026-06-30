package bg2;

/* loaded from: classes3.dex */
public final class g2 extends tc2.c implements tc2.h {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f20103e;

    /* renamed from: f, reason: collision with root package name */
    public bg2.j7 f20104f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(tc2.g store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f20103e = "Finder.LiveConvertPollingServiceController";
    }

    @Override // tc2.h
    public void H0(r45.r71 resp) {
        bg2.j7 j7Var;
        bg2.j7 j7Var2;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.util.LinkedList list = resp.getList(24);
        if (list != null && (j7Var2 = this.f20104f) != null) {
            j7Var2.d().post(new bg2.z6(list, j7Var2));
        }
        java.util.LinkedList list2 = resp.getList(23);
        if (list2 == null || (j7Var = this.f20104f) == null) {
            return;
        }
        j7Var.d().post(new bg2.w6(list2, j7Var));
    }

    @Override // tc2.c
    public void U6() {
        a7();
    }

    @Override // tc2.c
    public void X6() {
        a7();
    }

    public final void Y6(int i17, com.tencent.mm.protobuf.f req, boolean z17, bg2.s6 callback) {
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(callback, "callback");
        bg2.j7 j7Var = this.f20104f;
        if (j7Var != null) {
            j7Var.d().post(new bg2.e7(j7Var, i17, req, callback, z17));
        }
    }

    public final void Z6(int i17) {
        bg2.j7 j7Var = this.f20104f;
        if (j7Var != null) {
            j7Var.d().post(new bg2.g7(i17, j7Var));
        }
    }

    public final void a7() {
        bg2.j7 j7Var = this.f20104f;
        if (j7Var != null) {
            j7Var.f20217g = true;
            j7Var.d().post(new bg2.c7(j7Var));
        }
        this.f20104f = null;
    }

    public final void b7(int i17, com.tencent.mm.protobuf.f req) {
        kotlin.jvm.internal.o.g(req, "req");
        bg2.j7 j7Var = this.f20104f;
        if (j7Var != null) {
            j7Var.d().post(new bg2.h7(i17, req, j7Var));
        }
    }

    @Override // tc2.h
    public void onLiveEnd() {
        a7();
    }
}
