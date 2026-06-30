package jn1;

/* loaded from: classes12.dex */
public abstract class c extends gk0.l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g75.r pipeline) {
        super(pipeline);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pipeline, "pipeline");
    }

    @Override // g75.f, g75.t
    public void c() {
        super.c();
        f(jn1.b.f382019d);
    }

    @h75.a
    /* renamed from: handleAvatarImgFlag */
    public j75.b mo141156x5045c4ee(g75.z state, jn1.e action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        com.p314xaae8f345.mm.vfs.r6 r6Var = (com.p314xaae8f345.mm.vfs.r6) state.i("Common_TempFolder");
        com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var = action.f382024b;
        if (r0Var == null) {
            return new g75.v(null, 1, null);
        }
        java.lang.String e17 = r0Var.e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getUsername(...)");
        return new hn1.a(e17, r6Var);
    }

    @Override // gk0.l, g75.f
    public java.lang.String i() {
        return h().k("Common_ImageKey");
    }
}
