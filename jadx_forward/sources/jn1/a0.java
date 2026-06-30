package jn1;

/* loaded from: classes12.dex */
public final class a0 extends jn1.z {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(g75.r pipeline) {
        super(pipeline);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pipeline, "pipeline");
    }

    @Override // jn1.z
    @h75.a
    /* renamed from: handleAvatarCheckExpired */
    public j75.b mo141155xddb0e93e(g75.z state, hn1.b action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        com.p314xaae8f345.mm.vfs.r6 r6Var = (com.p314xaae8f345.mm.vfs.r6) state.i("Common_TempFolder");
        java.lang.String k17 = state.k("Avatar_Username");
        int ordinal = action.f363979b.ordinal();
        java.lang.String str = action.f363980c;
        if (ordinal != 0) {
            if (ordinal != 1) {
                return new g75.v(null, 1, null);
            }
            java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(r6Var, str).o();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
            return new y01.b(k17, o17);
        }
        java.lang.String o18 = new com.p314xaae8f345.mm.vfs.r6(r6Var, str).o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o18, "getAbsolutePath(...)");
        g75.z zVar = new g75.z();
        zVar.l("Avatar_HdImgPath", o18);
        return new g75.a0(zVar);
    }

    @Override // jn1.z, jn1.c
    @h75.a
    /* renamed from: handleAvatarImgFlag */
    public j75.b mo141156x5045c4ee(g75.z state, jn1.e action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        return super.mo141156x5045c4ee(state, action);
    }

    @Override // jn1.z, gk0.l
    @h75.a
    /* renamed from: handleDataFromRemote */
    public j75.b mo131693xd8102822(g75.z state, y01.c action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        if (action.f540121d == null) {
            return new g75.v(null, 1, null);
        }
        g75.z zVar = new g75.z();
        zVar.l("Avatar_HdImgPath", action.f540120c);
        return new g75.a0(zVar);
    }

    @Override // jn1.z, gk0.l, g75.f
    public j75.b l(g75.z state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        return new jn1.d(state.k("Avatar_Username"));
    }
}
