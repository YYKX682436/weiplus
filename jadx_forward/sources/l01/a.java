package l01;

/* loaded from: classes4.dex */
public enum a {
    ;


    /* renamed from: d, reason: collision with root package name */
    public static volatile java.lang.ref.WeakReference f396268d;

    public static android.graphics.drawable.Drawable h() {
        android.graphics.Bitmap bitmap;
        if (f396268d == null || (bitmap = (android.graphics.Bitmap) f396268d.get()) == null || bitmap.isRecycled()) {
            f396268d = new java.lang.ref.WeakReference(bp.b.m10969xb866ec1c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e, com.p314xaae8f345.mm.R.raw.f80616x3c6dbd49, null));
        }
        f3.i iVar = new f3.i(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e, (android.graphics.Bitmap) f396268d.get());
        iVar.b(true);
        return iVar;
    }

    /* renamed from: valueOf */
    public static l01.a m144784xdce0328(java.lang.String str) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(java.lang.Enum.valueOf(l01.a.class, str));
        return null;
    }
}
