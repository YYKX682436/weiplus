package gk0;

/* loaded from: classes12.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk0.s f353987d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g75.z f353988e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gk0.w f353989f;

    public u(gk0.s sVar, g75.z zVar, gk0.w wVar) {
        this.f353987d = sVar;
        this.f353988e = zVar;
        this.f353989f = wVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        gk0.s sVar = this.f353987d;
        android.widget.ImageView imageView = (android.widget.ImageView) sVar.f353986d.get();
        if (imageView != null) {
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(imageView.getTag(com.p314xaae8f345.mm.R.id.h9z), sVar.f353984b)) {
                imageView = null;
            }
            if (imageView != null) {
                imageView.setImageBitmap(sVar.f353985c);
            }
        }
        java.util.Map map = (java.util.Map) this.f353988e.d("Common_ImageViewRefMap");
        if (map != null) {
            java.util.List list = (java.util.List) map.get(sVar.f353984b);
            java.lang.String str = sVar.f353984b;
            if (list != null) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    android.widget.ImageView imageView2 = (android.widget.ImageView) ((d75.c) it.next()).get();
                    if (imageView2 != null) {
                        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(imageView2.getTag(com.p314xaae8f345.mm.R.id.h9z), str)) {
                            imageView2 = null;
                        }
                        if (imageView2 != null) {
                            imageView2.setImageBitmap(sVar.f353985c);
                        }
                    }
                }
            }
        }
        this.f353989f.a(new gk0.t());
    }
}
