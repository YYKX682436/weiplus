package zt;

/* loaded from: classes12.dex */
public final class b extends g75.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g75.r pipeline) {
        super(pipeline);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pipeline, "pipeline");
    }

    @h75.a
    /* renamed from: handleConvertDataToBitmap */
    public j75.b m179426xef4b835f(g75.z state, m70.b action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        m(state, "handleConvertDataToBitmap");
        android.graphics.Bitmap bitmap = action.f405999c;
        if (bitmap == null) {
            return new g75.v(null, 1, null);
        }
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        jt0.i iVar = (jt0.i) m11.b1.Di().f404271e;
        java.lang.String str = action.f405998b;
        iVar.put(str, bitmap);
        return new m70.e(str, bitmap);
    }

    @h75.a
    /* renamed from: handleDataFromFile */
    public j75.b m179427xe3f76c58(g75.z state, m70.d action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        m(state, "handleDataFromFile");
        java.lang.String str = action.f406001b;
        byte[] bArr = action.f406003d;
        return bArr != null ? new m70.a(str, bArr, action.f406002c) : new y01.d(str);
    }

    @h75.a
    /* renamed from: handleDataFromRemote */
    public j75.b m179428xd8102822(g75.z state, y01.e action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        m(state, "handleDataFromRemote");
        byte[] bArr = action.f540124c;
        if (bArr == null) {
            return new g75.v(null, 1, null);
        }
        return new m70.a(action.f540123b, bArr, m70.h.f406010f);
    }

    @h75.a
    /* renamed from: handleShowImageDone */
    public j75.b m179429xa88e6fb8(g75.z state, m70.g action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        m(state, "handleShowImageDone");
        return new g75.a0(null, 1, null);
    }

    @Override // g75.f
    public java.lang.String i() {
        return h().k("Common_ImageKey");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g75.f
    public j75.b l(g75.z state) {
        android.widget.ImageView imageView;
        android.widget.ImageView imageView2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        java.lang.String k17 = h().k("Common_ImageKey");
        java.lang.Boolean bool = (java.lang.Boolean) h().d("Common_ForceRefresh");
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        d75.c cVar = (d75.c) h().d("Common_ImageViewRef");
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        kk.j jVar = m11.b1.Di().f404271e;
        if (booleanValue) {
            ((jt0.i) jVar).mo141381xc84af884(k17);
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((jt0.i) jVar).i(k17);
        zt.k kVar = (zt.k) state.i("key_record_params");
        zt.n nVar = zt.n.f557085a;
        s15.h hVar = kVar.f557078b;
        if (bitmap != null) {
            if (cVar != null && (imageView2 = (android.widget.ImageView) cVar.get()) != null) {
                nVar.a(hVar, bitmap, imageView2);
                imageView2.setImageBitmap(bitmap);
                imageView2.setBackgroundDrawable(null);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgDownload.MsgImgImageLoaderFlowPPC", "onCreateAfter setImageBitmap From Cache " + k17);
            return new g75.a0(null, 1, null);
        }
        if (cVar != null && (imageView = (android.widget.ImageView) cVar.get()) != null) {
            nVar.a(hVar, null, imageView);
            imageView.setImageDrawable(null);
            imageView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562680lw);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgDownload.MsgImgImageLoaderFlowPPC", "onCreateAfter setImageBitmap From File " + k17 + " forceRefresh:" + booleanValue);
        return new m70.c(k17);
    }

    public final void m(g75.z zVar, java.lang.String str) {
        if (zVar.h("Common_StartTimestamp", 0L) > 0) {
            h().k("Common_ImageKey");
            android.os.SystemClock.elapsedRealtime();
        }
    }
}
