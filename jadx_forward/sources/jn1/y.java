package jn1;

/* loaded from: classes12.dex */
public final class y extends jn1.c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(g75.r pipeline) {
        super(pipeline);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pipeline, "pipeline");
    }

    @h75.a
    /* renamed from: handleAvatarCheckExpired */
    public final j75.b m141166xddb0e93e(g75.z state, hn1.b action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        com.p314xaae8f345.mm.vfs.r6 r6Var = (com.p314xaae8f345.mm.vfs.r6) state.i("Common_TempFolder");
        java.lang.String k17 = state.k("Common_ImageKey");
        int ordinal = action.f363979b.ordinal();
        if (ordinal == 0) {
            return new g75.a0(null, 1, null);
        }
        if (ordinal == 1) {
            java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(r6Var, action.f363980c).o();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
            return new y01.b(k17, o17);
        }
        if (ordinal != 2) {
            return new g75.v(null, 1, null);
        }
        ((hn1.s) ((kv.b0) i95.n0.c(kv.b0.class))).pj(k17);
        return new g75.a0(null, 1, null);
    }

    @Override // jn1.c
    @h75.a
    /* renamed from: handleAvatarImgFlag */
    public j75.b mo141156x5045c4ee(g75.z state, jn1.e action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        return super.mo141156x5045c4ee(state, action);
    }

    @Override // gk0.l
    @h75.a
    /* renamed from: handleConvertDataToBitmap */
    public j75.b mo131691xef4b835f(g75.z state, gk0.e action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        android.graphics.Bitmap bitmap = action.f353954c;
        if (bitmap == null) {
            return new g75.v(null, 1, null);
        }
        ((hn1.s) ((kv.b0) i95.n0.c(kv.b0.class))).rj(action.f353953b, bitmap);
        g75.z zVar = new g75.z();
        zVar.l("Avatar_ImgBitmap", bitmap);
        return new g75.a0(zVar);
    }

    @Override // gk0.l
    @h75.a
    /* renamed from: handleDataFromRemote */
    public j75.b mo131693xd8102822(g75.z state, y01.c action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        if (action.f540121d != null) {
            state.l("Avatar_ImgPath", action.f540120c);
        }
        return super.mo131693xd8102822(state, action);
    }

    @Override // gk0.l, g75.f
    public j75.b l(g75.z state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        return new jn1.d(state.k("Avatar_Username"));
    }
}
