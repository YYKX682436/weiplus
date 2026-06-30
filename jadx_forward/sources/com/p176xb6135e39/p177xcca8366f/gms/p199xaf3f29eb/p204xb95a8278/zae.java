package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278;

/* loaded from: classes13.dex */
public final class zae extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.zag {
    private final java.lang.ref.WeakReference zac;

    public zae(android.widget.ImageView imageView, int i17) {
        super(android.net.Uri.EMPTY, i17);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1899x39368dcd.m18081x7b41bcd2(imageView);
        this.zac = new java.lang.ref.WeakReference(imageView);
    }

    /* renamed from: equals */
    public final boolean m18071xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.zae)) {
            return false;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) this.zac.get();
        android.widget.ImageView imageView2 = (android.widget.ImageView) ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.zae) obj).zac.get();
        return (imageView2 == null || imageView == null || !com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18189x5c46734(imageView2, imageView)) ? false : true;
    }

    /* renamed from: hashCode */
    public final int m18072x8cdac1b() {
        return 0;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.zag
    public final void zaa(android.graphics.drawable.Drawable drawable, boolean z17, boolean z18, boolean z19) {
        android.widget.ImageView imageView = (android.widget.ImageView) this.zac.get();
        if (imageView != null) {
            if (!z18 && !z19 && (imageView instanceof com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1.zal)) {
                throw null;
            }
            boolean z27 = false;
            if (!z18 && !z17) {
                z27 = true;
            }
            if (z27) {
                android.graphics.drawable.Drawable drawable2 = imageView.getDrawable();
                if (drawable2 == null) {
                    drawable2 = null;
                } else if (drawable2 instanceof com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1.zak) {
                    drawable2 = ((com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1.zak) drawable2).zaa();
                }
                drawable = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1.zak(drawable2, drawable);
            }
            imageView.setImageDrawable(drawable);
            if (imageView instanceof com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1.zal) {
                throw null;
            }
            if (drawable == null || !z27) {
                return;
            }
            ((com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1.zak) drawable).zab(250);
        }
    }

    public zae(android.widget.ImageView imageView, android.net.Uri uri) {
        super(uri, 0);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1899x39368dcd.m18081x7b41bcd2(imageView);
        this.zac = new java.lang.ref.WeakReference(imageView);
    }
}
