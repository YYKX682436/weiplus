package h65;

/* loaded from: classes8.dex */
public class b {
    public void a(int i17, java.lang.String str) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("type", java.lang.Integer.valueOf(i17));
        contentValues.put("value", str);
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver().update(android.net.Uri.parse("content://" + qk.d0.f445598a + "/userinfo/"), contentValues, null, null);
        } catch (java.lang.IllegalArgumentException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.EmotionStorageResolver", e17, "", new java.lang.Object[0]);
        }
    }
}
