package jn1;

/* loaded from: classes12.dex */
public final class v extends jn1.i {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(g75.r pipeline) {
        super(pipeline);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pipeline, "pipeline");
    }

    @Override // jn1.i
    @h75.a
    /* renamed from: handleAvatarCheckExpired */
    public j75.b mo141159xddb0e93e(g75.z state, hn1.b action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        return super.mo141159xddb0e93e(state, action);
    }

    @Override // jn1.i, jn1.c
    @h75.a
    /* renamed from: handleAvatarImgFlag */
    public j75.b mo141156x5045c4ee(g75.z state, jn1.e action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        return super.mo141156x5045c4ee(state, action);
    }

    @Override // jn1.i, gk0.l
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Avatar.HdAvatarLoadPathFlowPPC", "put small bitmap to cache " + str);
        java.lang.String str2 = (java.lang.String) state.d("Avatar_ImgPath");
        g75.z zVar = new g75.z();
        zVar.l("Avatar_ImgPath", str2);
        zVar.l("Avatar_ImgBitmap", bitmap);
        return new g75.a0(zVar);
    }

    @Override // jn1.i, gk0.l
    @h75.a
    /* renamed from: handleDataFromFile */
    public j75.b mo131692xe3f76c58(g75.z state, gk0.q action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        if (action.f353983d != null) {
            state.l("Avatar_ImgPath", action.f353982c);
        }
        return super.mo131692xe3f76c58(state, action);
    }

    @Override // jn1.i, gk0.l
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

    @Override // jn1.i, gk0.l, g75.f
    public j75.b l(g75.z state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        return new jn1.d(state.k("Avatar_Username"));
    }
}
