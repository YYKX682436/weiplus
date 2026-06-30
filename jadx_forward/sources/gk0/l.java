package gk0;

/* loaded from: classes12.dex */
public class l extends g75.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(g75.r pipeline) {
        super(pipeline);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pipeline, "pipeline");
    }

    @h75.a
    /* renamed from: handleConvertDataToBitmap */
    public j75.b mo131691xef4b835f(g75.z state, gk0.e action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        m(state, "handleConvertDataToBitmap");
        d75.c cVar = (d75.c) state.i("Common_ImageViewRef");
        android.graphics.Bitmap bitmap = action.f353954c;
        if (bitmap == null) {
            return new g75.v(null, 1, null);
        }
        n11.a b17 = n11.a.b();
        java.lang.String str = action.f353953b;
        b17.o(str, bitmap);
        return new gk0.s(str, bitmap, cVar);
    }

    @h75.a
    /* renamed from: handleDataFromFile */
    public j75.b mo131692xe3f76c58(g75.z state, gk0.q action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        m(state, "handleDataFromFile");
        gk0.k kVar = (gk0.k) state.i("Common_BitmapOptions");
        java.lang.String str = action.f353981b;
        byte[] bArr = action.f353983d;
        return bArr != null ? new gk0.d(str, bArr, kVar) : new y01.b(str, action.f353982c);
    }

    @h75.a
    /* renamed from: handleDataFromRemote */
    public j75.b mo131693xd8102822(g75.z state, y01.c action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        m(state, "handleDataFromRemote");
        gk0.k kVar = (gk0.k) state.i("Common_BitmapOptions");
        byte[] bArr = action.f540121d;
        return bArr != null ? new gk0.d(action.f540119b, bArr, kVar) : new g75.v(null, 1, null);
    }

    @h75.a
    /* renamed from: handleShowImageDone */
    public j75.b m131694xa88e6fb8(g75.z state, gk0.t action) {
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        com.p314xaae8f345.mm.vfs.r6 r6Var = (com.p314xaae8f345.mm.vfs.r6) h().i("Common_TempFolder");
        java.lang.String k17 = h().k("Common_ImageKey");
        gk0.k kVar = (gk0.k) h().i("Common_BitmapOptions");
        d75.c cVar = (d75.c) h().i("Common_ImageViewRef");
        java.lang.Boolean bool = (java.lang.Boolean) h().d("Common_ForceRefresh");
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(r6Var, k17).o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
        if (booleanValue) {
            n11.a.b().p(k17);
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) cVar.get();
        if (imageView2 != null) {
            imageView2.setTag(com.p314xaae8f345.mm.R.id.h9z, k17);
        }
        android.graphics.Bitmap e17 = n11.a.b().e(k17);
        if (e17 != null) {
            android.widget.ImageView imageView3 = (android.widget.ImageView) cVar.get();
            if (imageView3 != null) {
                imageView3.setImageBitmap(e17);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageLoader.CommonImageLoaderFlowPPC", "onCreateAfter setImageBitmap From Cache ".concat(k17));
            return new g75.a0(null, 1, null);
        }
        if (kVar.f353967e != 0) {
            android.widget.ImageView imageView4 = (android.widget.ImageView) cVar.get();
            if (imageView4 != null) {
                imageView4.setImageResource(kVar.f353967e);
            }
        } else if (kVar.f353968f != null) {
            android.widget.ImageView imageView5 = (android.widget.ImageView) cVar.get();
            if (imageView5 != null) {
                imageView5.setImageBitmap(kVar.f353968f);
            }
        } else if (kVar.f353969g != null && (imageView = (android.widget.ImageView) cVar.get()) != null) {
            imageView.setImageDrawable(kVar.f353969g);
        }
        return new gk0.p(k17, o17);
    }

    public final void m(g75.z state, java.lang.String prefix) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefix, "prefix");
        if (state.h("Common_StartTimestamp", 0L) > 0) {
            h().k("Common_ImageKey");
            android.os.SystemClock.elapsedRealtime();
        }
    }
}
