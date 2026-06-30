package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29;

/* loaded from: classes10.dex */
public final class l2 extends rz3.g {
    public l2(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f483344f = context;
    }

    @Override // rz3.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void b(long j17, android.os.Bundle bundle) {
        if (bundle == null) {
            return;
        }
        java.lang.String string = bundle.getString("key_translate_file_path");
        if (string == null) {
            string = "";
        }
        if (string.length() > 0) {
            ((ku5.t0) ku5.t0.f394148d).a(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.j2(this, string));
            return;
        }
        byte[] byteArray = bundle.getByteArray("key_translate_yuv_byte_array");
        if (byteArray == null) {
            byteArray = new byte[0];
        }
        byte[] bArr = byteArray;
        if (!(bArr.length == 0)) {
            ((ku5.t0) ku5.t0.f394148d).a(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.k2(this, bArr, (android.graphics.Point) bundle.getParcelable("key_translate_camera_resolution"), bundle.getInt("key_translate_camera_rotation", 0), bundle.getLong("key_translate_capture_time", 0L)));
        }
    }

    @Override // rz3.a
    /* renamed from: destroy */
    public void mo9410x5cd39ffa() {
    }

    public final void e(java.lang.String path, int i17, android.graphics.Bitmap bitmap, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslateHandler", "jumpResultUI originPath: %s, captureTime: %d", path, java.lang.Long.valueOf(j17));
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.n2.f240497a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.n2.f240497a.put(path, bitmap);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_translation_origin_image_path", path);
        intent.putExtra("key_translation_source", i17);
        intent.putExtra("key_translation_capture_time", j17);
        intent.setClass(this.f483344f, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17308x95e1b65.class);
        android.content.Context context = this.f483344f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/scanner/model/ScanTranslateHandler", "jumpResultUI", "(Ljava/lang/String;ILandroid/graphics/Bitmap;J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/scanner/model/ScanTranslateHandler", "jumpResultUI", "(Ljava/lang/String;ILandroid/graphics/Bitmap;J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
