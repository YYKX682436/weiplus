package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278;

/* renamed from: com.google.android.gms.common.images.ImageManager */
/* loaded from: classes13.dex */
public final class C1893x5f3d25f2 {
    private static final java.lang.Object zaa = new java.lang.Object();
    private static final java.util.HashSet zab = new java.util.HashSet();
    private static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.C1893x5f3d25f2 zac;
    private final android.content.Context zad;
    private final android.os.Handler zae = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1.zau(android.os.Looper.getMainLooper());
    private final java.util.concurrent.ExecutorService zaf = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1.zat.zaa().zab(4, 2);
    private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1.zam zag = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1.zam();
    private final java.util.Map zah = new java.util.HashMap();
    private final java.util.Map zai = new java.util.HashMap();
    private final java.util.Map zaj = new java.util.HashMap();

    /* renamed from: com.google.android.gms.common.images.ImageManager$ImageReceiver */
    /* loaded from: classes13.dex */
    public final class ImageReceiver extends android.os.ResultReceiver {
        private final android.net.Uri zab;
        private final java.util.ArrayList zac;

        public ImageReceiver(android.net.Uri uri) {
            super(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1.zau(android.os.Looper.getMainLooper()));
            this.zab = uri;
            this.zac = new java.util.ArrayList();
        }

        @Override // android.os.ResultReceiver
        public final void onReceiveResult(int i17, android.os.Bundle bundle) {
            android.os.ParcelFileDescriptor parcelFileDescriptor = (android.os.ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.C1893x5f3d25f2 c1893x5f3d25f2 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.C1893x5f3d25f2.this;
            c1893x5f3d25f2.zaf.execute(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.zaa(c1893x5f3d25f2, this.zab, parcelFileDescriptor));
        }

        public final void zab(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.zag zagVar) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1899x39368dcd.m18079x6483284b("ImageReceiver.addImageRequest() must be called in the main thread");
            this.zac.add(zagVar);
        }

        public final void zac(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.zag zagVar) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1899x39368dcd.m18079x6483284b("ImageReceiver.removeImageRequest() must be called in the main thread");
            this.zac.remove(zagVar);
        }

        public final void zad() {
            android.content.Intent intent = new android.content.Intent(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1906x5e46b12f.f5936xf67e924b);
            intent.setPackage("com.google.android.gms");
            intent.putExtra(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1906x5e46b12f.f5939x97129c7d, this.zab);
            intent.putExtra(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1906x5e46b12f.f5938x931cb182, this);
            intent.putExtra(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1906x5e46b12f.f5937xa966d13, 3);
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.C1893x5f3d25f2.this.zad.sendBroadcast(intent);
        }
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$OnImageLoadedListener */
    /* loaded from: classes13.dex */
    public interface OnImageLoadedListener {
        /* renamed from: onImageLoaded */
        void m18054x91f79de1(android.net.Uri uri, android.graphics.drawable.Drawable drawable, boolean z17);
    }

    private C1893x5f3d25f2(android.content.Context context, boolean z17) {
        this.zad = context.getApplicationContext();
    }

    /* renamed from: create */
    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.C1893x5f3d25f2 m18048xaf65a0fc(android.content.Context context) {
        if (zac == null) {
            zac = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.C1893x5f3d25f2(context, false);
        }
        return zac;
    }

    /* renamed from: loadImage */
    public void m18049x519a1415(android.widget.ImageView imageView, int i17) {
        zaj(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.zae(imageView, i17));
    }

    public final void zaj(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.zag zagVar) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1899x39368dcd.m18079x6483284b("ImageManager.loadImage() must be called in the main thread");
        new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.zab(this, zagVar).run();
    }

    /* renamed from: loadImage */
    public void m18050x519a1415(android.widget.ImageView imageView, android.net.Uri uri) {
        zaj(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.zae(imageView, uri));
    }

    /* renamed from: loadImage */
    public void m18051x519a1415(android.widget.ImageView imageView, android.net.Uri uri, int i17) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.zae zaeVar = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.zae(imageView, uri);
        zaeVar.zab = i17;
        zaj(zaeVar);
    }

    /* renamed from: loadImage */
    public void m18052x519a1415(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.C1893x5f3d25f2.OnImageLoadedListener onImageLoadedListener, android.net.Uri uri) {
        zaj(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.zaf(onImageLoadedListener, uri));
    }

    /* renamed from: loadImage */
    public void m18053x519a1415(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.C1893x5f3d25f2.OnImageLoadedListener onImageLoadedListener, android.net.Uri uri, int i17) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.zaf zafVar = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.zaf(onImageLoadedListener, uri);
        zafVar.zab = i17;
        zaj(zafVar);
    }
}
