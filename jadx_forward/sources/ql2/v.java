package ql2;

/* loaded from: classes10.dex */
public final class v implements bi4.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f446095d = java.util.Collections.synchronizedMap(new java.util.HashMap());

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f446096e = java.util.Collections.synchronizedMap(new java.util.HashMap());

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f446097f = new java.util.ArrayList();

    @Override // bi4.r0
    public al5.a0 A1(java.lang.String str, android.widget.FrameLayout container, pj4.j0 j0Var, pj4.t pullDownParam) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pullDownParam, "pullDownParam");
        if (pullDownParam.f436822e == 0) {
            return null;
        }
        java.util.Map liveEndCache = this.f446095d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(liveEndCache, "liveEndCache");
        ql2.r rVar = new ql2.r(str, container, j0Var, pullDownParam, liveEndCache);
        if (j0Var != null) {
            byte[] decode = android.util.Base64.decode(j0Var.f436675g, 0);
            pj4.e0 e0Var = new pj4.e0();
            e0Var.mo11468x92b714fd(decode);
            r45.g92 g92Var = (r45.g92) this.f446096e.get(e0Var.f436563g);
            if (g92Var != null) {
                rVar.p(g92Var);
            } else {
                this.f446097f.add(new jz5.l(e0Var.f436563g, new java.lang.ref.WeakReference(rVar)));
            }
        }
        return rVar;
    }

    @Override // bi4.r0
    /* renamed from: release */
    public void mo10634x41012807() {
    }

    @Override // bi4.r0
    public bi4.o0 w7(java.lang.String str) {
        return new ql2.u(str, this);
    }
}
