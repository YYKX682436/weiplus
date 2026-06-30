package bg2;

/* loaded from: classes3.dex */
public final class s implements we2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f20479a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bg2.u f20480b;

    public s(com.tencent.mm.protocal.protobuf.FinderObject finderObject, bg2.u uVar) {
        this.f20479a = finderObject;
        this.f20480b = uVar;
    }

    @Override // we2.a
    public boolean r() {
        bg2.k0 k0Var = (bg2.k0) this.f20480b.N6(bg2.k0.class);
        if (k0Var == null) {
            return false;
        }
        return k0Var.f20238g || k0Var.f20239h;
    }

    @Override // we2.a
    public boolean t() {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f20479a;
        return kotlin.jvm.internal.o.b(finderObject != null ? finderObject.getUsername() : null, g92.b.f269769e.T0());
    }

    @Override // we2.a
    public boolean v(java.util.LinkedList linkedList) {
        java.lang.Object obj = null;
        if (linkedList == null) {
            bg2.k0 k0Var = (bg2.k0) this.f20480b.N6(bg2.k0.class);
            linkedList = k0Var != null ? k0Var.f20241m : null;
        }
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (((r45.yl1) next).getInteger(0) == 10) {
                    obj = next;
                    break;
                }
            }
            obj = (r45.yl1) obj;
        }
        return obj != null;
    }

    @Override // we2.a
    public java.lang.String w() {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f20479a;
        java.lang.String username = finderObject != null ? finderObject.getUsername() : null;
        return username == null ? "" : username;
    }
}
