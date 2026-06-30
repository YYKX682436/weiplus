package y70;

/* loaded from: classes12.dex */
public final class g extends g75.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(g75.r pipeline) {
        super(pipeline);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pipeline, "pipeline");
    }

    @h75.a
    /* renamed from: handleConvertDataToBitmap */
    public j75.b m176564xef4b835f(g75.z state, m70.b action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        m(state, "handleConvertDataToBitmap");
        android.graphics.Bitmap bitmap = action.f405999c;
        if (bitmap == null) {
            return new g75.v(null, 1, null);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleConvertDataToBitmap put imageKey:");
        java.lang.String str = action.f405998b;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgDownload.MsgImgImageLoaderFlowPPC", sb6.toString());
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        ((jt0.i) m11.b1.Di().f404271e).put(str, bitmap);
        return new m70.e(str, bitmap);
    }

    @h75.a
    /* renamed from: handleDataFromFile */
    public j75.b m176565xe3f76c58(g75.z state, m70.d action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        m(state, "handleDataFromFile");
        java.lang.String str = action.f406001b;
        byte[] bArr = action.f406003d;
        if (bArr != null) {
            return new m70.a(str, bArr, action.f406002c);
        }
        return !((((oi3.f) state.i("key_msg_info")).j() & 1) > 0) ? new y01.d(str) : new g75.v(null, 1, null);
    }

    @h75.a
    /* renamed from: handleDataFromRemote */
    public j75.b m176566xd8102822(g75.z state, y01.e action) {
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
    public j75.b m176567xa88e6fb8(g75.z state, m70.g action) {
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
        java.lang.String j17 = h().j("Common_DefaultImageKey", "");
        java.lang.Boolean bool = (java.lang.Boolean) h().d("Common_ForceRefresh");
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        d75.c cVar = (d75.c) h().d("Common_ImageViewRef");
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        kk.j jVar = m11.b1.Di().f404271e;
        if (booleanValue) {
            ((jt0.i) jVar).mo141381xc84af884(k17);
        }
        jt0.i iVar = (jt0.i) jVar;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) iVar.i(k17);
        if (!(!r26.n0.N(j17))) {
            j17 = null;
        }
        android.graphics.Bitmap bitmap2 = j17 != null ? (android.graphics.Bitmap) iVar.i(j17) : null;
        if (bitmap == null) {
            if (cVar != null && (imageView = (android.widget.ImageView) cVar.get()) != null) {
                if (bitmap2 != null) {
                    imageView.setImageBitmap(bitmap2);
                    imageView.setBackgroundDrawable(null);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgDownload.MsgImgImageLoaderFlowPPC", "onCreateAfter setImageBitmap null " + k17);
                    imageView.setImageDrawable(null);
                    imageView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562680lw);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgDownload.MsgImgImageLoaderFlowPPC", "onCreateAfter setImageBitmap From File " + k17 + " forceRefresh:" + booleanValue);
            }
            return new m70.c(k17);
        }
        if (cVar != null && (imageView2 = (android.widget.ImageView) cVar.get()) != null) {
            imageView2.setImageBitmap(bitmap);
            imageView2.setBackgroundDrawable(null);
            android.view.ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
            int i17 = layoutParams != null ? layoutParams.width : 0;
            android.view.ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
            int i18 = layoutParams2 != null ? layoutParams2.height : 0;
            java.lang.Object tag = imageView2.getTag(com.p314xaae8f345.mm.R.id.uhz);
            if (tag != null) {
                android.view.View view = tag instanceof android.view.View ? (android.view.View) tag : null;
                if (view != null) {
                    view.setLayoutParams(new android.widget.FrameLayout.LayoutParams(i17, i18));
                }
            }
            java.lang.Object tag2 = imageView2.getTag(com.p314xaae8f345.mm.R.id.f567528ui0);
            if (tag2 != null) {
                android.view.View view2 = tag2 instanceof android.view.View ? (android.view.View) tag2 : null;
                if (view2 != null) {
                    view2.setLayoutParams(new android.widget.FrameLayout.LayoutParams(i17, i18));
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgDownload.MsgImgImageLoaderFlowPPC", "onCreateAfter setImageBitmap From Cache " + k17);
        return new g75.a0(null, 1, null);
    }

    public final void m(g75.z zVar, java.lang.String str) {
        if (zVar.h("Common_StartTimestamp", 0L) > 0) {
            h().k("Common_ImageKey");
            android.os.SystemClock.elapsedRealtime();
        }
    }
}
