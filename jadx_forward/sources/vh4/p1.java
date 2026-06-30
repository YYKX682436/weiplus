package vh4;

/* loaded from: classes7.dex */
public final class p1 extends android.database.ContentObserver {
    public p1() {
        super(null);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z17, android.net.Uri uri) {
        java.lang.String str;
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
        if (uri == null || (str = uri.getPath()) == null) {
            str = "";
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(str2, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(str), vh4.x0.class, null);
    }
}
