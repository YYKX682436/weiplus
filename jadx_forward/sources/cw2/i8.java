package cw2;

/* loaded from: classes2.dex */
public final class i8 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f305307a;

    public i8(java.lang.ref.WeakReference weakVideoLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(weakVideoLayout, "weakVideoLayout");
        this.f305307a = weakVideoLayout;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.widget.ImageView m61463x4eb0f6e5;
        android.widget.ImageView m61463x4eb0f6e52;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) this.f305307a.get();
        if (c15196x85976f5f != null) {
            if (bitmap != null) {
                java.lang.String m61471xe56ce956 = c15196x85976f5f.m61471xe56ce956();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[convert] mediaId=");
                cw2.h8 playInfo = c15196x85976f5f.getPlayInfo();
                sb6.append(playInfo != null ? playInfo.f305279b : null);
                sb6.append(" thumb[");
                sb6.append(bitmap.getWidth());
                sb6.append(':');
                sb6.append(bitmap.getHeight());
                sb6.append("] view[");
                m61463x4eb0f6e5 = c15196x85976f5f.m61463x4eb0f6e5();
                sb6.append(m61463x4eb0f6e5.getWidth());
                sb6.append(':');
                m61463x4eb0f6e52 = c15196x85976f5f.m61463x4eb0f6e5();
                sb6.append(m61463x4eb0f6e52.getHeight());
                sb6.append("] size=");
                sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(bitmap.getAllocationByteCount()));
                sb6.append(' ');
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m61471xe56ce956, sb6.toString());
            } else {
                bitmap = null;
            }
            if (bitmap != null) {
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.VideoLayout", "thumb load completer,but video layout is null!");
    }
}
