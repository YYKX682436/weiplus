package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278;

/* loaded from: classes13.dex */
public abstract class zag {
    final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.zad zaa;
    protected int zab;

    public zag(android.net.Uri uri, int i17) {
        this.zab = 0;
        this.zaa = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.zad(uri);
        this.zab = i17;
    }

    public abstract void zaa(android.graphics.drawable.Drawable drawable, boolean z17, boolean z18, boolean z19);

    public final void zab(android.content.Context context, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1.zam zamVar, boolean z17) {
        int i17 = this.zab;
        zaa(i17 != 0 ? context.getResources().getDrawable(i17) : null, z17, false, false);
    }

    public final void zac(android.content.Context context, android.graphics.Bitmap bitmap, boolean z17) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1899x39368dcd.m18081x7b41bcd2(bitmap);
        zaa(new android.graphics.drawable.BitmapDrawable(context.getResources(), bitmap), false, false, true);
    }
}
