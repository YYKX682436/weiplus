package zt;

/* loaded from: classes11.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zt.m f557082d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m70.e f557083e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g75.z f557084f;

    public l(zt.m mVar, m70.e eVar, g75.z zVar) {
        this.f557082d = mVar;
        this.f557083e = eVar;
        this.f557084f = zVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        android.widget.ImageView imageView;
        d75.c cVar = (d75.c) this.f557082d.h().d("Common_ImageViewRef");
        if (cVar == null || (imageView = (android.widget.ImageView) cVar.get()) == null) {
            return;
        }
        java.lang.Object tag = imageView.getTag(com.p314xaae8f345.mm.R.id.h9z);
        m70.e eVar = this.f557083e;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tag, eVar.f406004b)) {
            imageView = null;
        }
        if (imageView != null) {
            zt.n.f557085a.a(((zt.k) this.f557084f.i("key_record_params")).f557078b, eVar.f406005c, imageView);
            imageView.setImageBitmap(eVar.f406005c);
            imageView.setBackgroundDrawable(null);
        }
    }
}
