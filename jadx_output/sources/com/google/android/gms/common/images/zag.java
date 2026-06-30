package com.google.android.gms.common.images;

/* loaded from: classes13.dex */
public abstract class zag {
    final com.google.android.gms.common.images.zad zaa;
    protected int zab;

    public zag(android.net.Uri uri, int i17) {
        this.zab = 0;
        this.zaa = new com.google.android.gms.common.images.zad(uri);
        this.zab = i17;
    }

    public abstract void zaa(android.graphics.drawable.Drawable drawable, boolean z17, boolean z18, boolean z19);

    public final void zab(android.content.Context context, com.google.android.gms.internal.base.zam zamVar, boolean z17) {
        int i17 = this.zab;
        zaa(i17 != 0 ? context.getResources().getDrawable(i17) : null, z17, false, false);
    }

    public final void zac(android.content.Context context, android.graphics.Bitmap bitmap, boolean z17) {
        com.google.android.gms.common.internal.Asserts.checkNotNull(bitmap);
        zaa(new android.graphics.drawable.BitmapDrawable(context.getResources(), bitmap), false, false, true);
    }
}
