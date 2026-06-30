package jn1;

/* loaded from: classes12.dex */
public class z extends jn1.c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(g75.r pipeline) {
        super(pipeline);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pipeline, "pipeline");
    }

    @h75.a
    /* renamed from: handleAvatarCheckExpired */
    public j75.b mo141155xddb0e93e(g75.z state, hn1.b action) {
        j75.b pVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        com.p314xaae8f345.mm.vfs.r6 r6Var = (com.p314xaae8f345.mm.vfs.r6) state.i("Common_TempFolder");
        java.lang.String k17 = state.k("Common_ImageKey");
        int ordinal = action.f363979b.ordinal();
        java.lang.String str = action.f363980c;
        if (ordinal == 0) {
            java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(r6Var, str).o();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
            pVar = new gk0.p(k17, o17);
        } else {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    return new g75.v(null, 1, null);
                }
                ((hn1.s) ((kv.b0) i95.n0.c(kv.b0.class))).pj(k17);
                return new g75.a0(null, 1, null);
            }
            java.lang.String o18 = new com.p314xaae8f345.mm.vfs.r6(r6Var, str).o();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o18, "getAbsolutePath(...)");
            pVar = new y01.b(k17, o18);
        }
        return pVar;
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
        hn1.s sVar = (hn1.s) ((kv.b0) i95.n0.c(kv.b0.class));
        java.lang.String str = action.f353953b;
        sVar.rj(str, bitmap);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Avatar.HdAvatarLoadBitmapFlowPPC", "put HD bitmap to cache " + str);
        g75.z zVar = new g75.z();
        zVar.l("Avatar_HdImgBitmap", bitmap);
        return new g75.a0(zVar);
    }

    @Override // gk0.l
    @h75.a
    /* renamed from: handleDataFromFile */
    public j75.b mo131692xe3f76c58(g75.z state, gk0.q action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        if (action.f353983d != null) {
            state.l("Avatar_HdImgPath", action.f353982c);
        }
        return super.mo131692xe3f76c58(state, action);
    }

    @Override // gk0.l
    @h75.a
    /* renamed from: handleDataFromRemote */
    public j75.b mo131693xd8102822(g75.z state, y01.c action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        if (action.f540121d != null) {
            state.l("Avatar_HdImgPath", action.f540120c);
        }
        return super.mo131693xd8102822(state, action);
    }

    @Override // gk0.l, g75.f
    public j75.b l(g75.z state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        java.lang.String k17 = state.k("Common_ImageKey");
        java.lang.String k18 = state.k("Avatar_Username");
        android.graphics.Bitmap Ui = ((hn1.s) ((kv.b0) i95.n0.c(kv.b0.class))).Ui(k17);
        if (Ui == null) {
            return new jn1.d(k18);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Avatar.HdAvatarLoadBitmapFlowPPC", "hit hd bitmap cache " + k17);
        g75.z zVar = new g75.z();
        zVar.l("Avatar_HdImgBitmap", Ui);
        return new g75.a0(zVar);
    }
}
