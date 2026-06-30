package com.google.android.gms.common.images;

/* loaded from: classes13.dex */
public final class zae extends com.google.android.gms.common.images.zag {
    private final java.lang.ref.WeakReference zac;

    public zae(android.widget.ImageView imageView, int i17) {
        super(android.net.Uri.EMPTY, i17);
        com.google.android.gms.common.internal.Asserts.checkNotNull(imageView);
        this.zac = new java.lang.ref.WeakReference(imageView);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.common.images.zae)) {
            return false;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) this.zac.get();
        android.widget.ImageView imageView2 = (android.widget.ImageView) ((com.google.android.gms.common.images.zae) obj).zac.get();
        return (imageView2 == null || imageView == null || !com.google.android.gms.common.internal.Objects.equal(imageView2, imageView)) ? false : true;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // com.google.android.gms.common.images.zag
    public final void zaa(android.graphics.drawable.Drawable drawable, boolean z17, boolean z18, boolean z19) {
        android.widget.ImageView imageView = (android.widget.ImageView) this.zac.get();
        if (imageView != null) {
            if (!z18 && !z19 && (imageView instanceof com.google.android.gms.internal.base.zal)) {
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
                } else if (drawable2 instanceof com.google.android.gms.internal.base.zak) {
                    drawable2 = ((com.google.android.gms.internal.base.zak) drawable2).zaa();
                }
                drawable = new com.google.android.gms.internal.base.zak(drawable2, drawable);
            }
            imageView.setImageDrawable(drawable);
            if (imageView instanceof com.google.android.gms.internal.base.zal) {
                throw null;
            }
            if (drawable == null || !z27) {
                return;
            }
            ((com.google.android.gms.internal.base.zak) drawable).zab(250);
        }
    }

    public zae(android.widget.ImageView imageView, android.net.Uri uri) {
        super(uri, 0);
        com.google.android.gms.common.internal.Asserts.checkNotNull(imageView);
        this.zac = new java.lang.ref.WeakReference(imageView);
    }
}
