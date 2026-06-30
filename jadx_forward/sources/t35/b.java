package t35;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final t35.b f496968a = new t35.b();

    public final java.util.List a(android.content.ClipData clipData) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (clipData != null) {
            int itemCount = clipData.getItemCount();
            for (int i17 = 0; i17 < itemCount; i17++) {
                android.content.ClipData.Item itemAt = clipData.getItemAt(i17);
                java.lang.CharSequence text = itemAt.getText();
                if (!(text == null || r26.n0.N(text))) {
                    arrayList.add(new t35.a(itemAt.getText().toString()));
                } else if (itemAt.getUri() != null) {
                    android.net.Uri uri = itemAt.getUri();
                    java.lang.String type = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver().getType(uri);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PasteHelper", "uri: %s, type:%s", uri, type);
                    if (type != null && r26.i0.y(type, "image/", false)) {
                        arrayList.add(new t35.a(uri, 2));
                    } else if (type != null && r26.i0.y(type, "video/", false)) {
                        arrayList.add(new t35.a(uri, 3));
                    } else {
                        arrayList.add(new t35.a(uri, 4));
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PasteHelper", "no text and uri??? item:%s", itemAt.toString());
                }
            }
        }
        return arrayList;
    }
}
