package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278;

/* loaded from: classes13.dex */
public final class zaf extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.zag {
    private final java.lang.ref.WeakReference zac;

    public zaf(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.C1893x5f3d25f2.OnImageLoadedListener onImageLoadedListener, android.net.Uri uri) {
        super(uri, 0);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1899x39368dcd.m18081x7b41bcd2(onImageLoadedListener);
        this.zac = new java.lang.ref.WeakReference(onImageLoadedListener);
    }

    /* renamed from: equals */
    public final boolean m18073xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.zaf)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.zaf zafVar = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.zaf) obj;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.C1893x5f3d25f2.OnImageLoadedListener onImageLoadedListener = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.C1893x5f3d25f2.OnImageLoadedListener) this.zac.get();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.C1893x5f3d25f2.OnImageLoadedListener onImageLoadedListener2 = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.C1893x5f3d25f2.OnImageLoadedListener) zafVar.zac.get();
        return onImageLoadedListener2 != null && onImageLoadedListener != null && com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18189x5c46734(onImageLoadedListener2, onImageLoadedListener) && com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18189x5c46734(zafVar.zaa, this.zaa);
    }

    /* renamed from: hashCode */
    public final int m18074x8cdac1b() {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18190x8cdac1b(this.zaa);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.zag
    public final void zaa(android.graphics.drawable.Drawable drawable, boolean z17, boolean z18, boolean z19) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.C1893x5f3d25f2.OnImageLoadedListener onImageLoadedListener;
        if (z18 || (onImageLoadedListener = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.C1893x5f3d25f2.OnImageLoadedListener) this.zac.get()) == null) {
            return;
        }
        onImageLoadedListener.m18054x91f79de1(this.zaa.zaa, drawable, z19);
    }
}
