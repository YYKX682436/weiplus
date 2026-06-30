package bg2;

/* loaded from: classes3.dex */
public final class t0 implements we2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f20508a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bg2.x0 f20509b;

    public t0(com.tencent.mm.protocal.protobuf.FinderObject finderObject, bg2.x0 x0Var) {
        this.f20508a = finderObject;
        this.f20509b = x0Var;
    }

    @Override // we2.a
    public boolean r() {
        bg2.k0 k0Var = (bg2.k0) this.f20509b.N6(bg2.k0.class);
        if (k0Var == null) {
            return false;
        }
        return k0Var.f20238g || k0Var.f20239h;
    }

    @Override // we2.a
    public boolean t() {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f20508a;
        return kotlin.jvm.internal.o.b(finderObject != null ? finderObject.getUsername() : null, g92.b.f269769e.T0());
    }

    @Override // we2.a
    public boolean v(java.util.LinkedList linkedList) {
        java.lang.Object obj = null;
        if (linkedList == null) {
            bg2.k0 k0Var = (bg2.k0) this.f20509b.N6(bg2.k0.class);
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
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f20508a;
        java.lang.String username = finderObject != null ? finderObject.getUsername() : null;
        return username == null ? "" : username;
    }
}
