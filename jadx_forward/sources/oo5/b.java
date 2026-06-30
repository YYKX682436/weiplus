package oo5;

/* loaded from: classes8.dex */
public final class b implements com.p314xaae8f345.p3210x3857dc.o1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ oo5.e f428735a;

    public b(oo5.e eVar) {
        this.f428735a = eVar;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.NativePreviewFileView", "onUserCancel");
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void b(java.lang.String str, java.util.HashMap hashMap) {
        java.util.Objects.toString(hashMap);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void c() {
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void d(int i17, android.graphics.Bitmap bitmap) {
        java.util.Objects.toString(bitmap);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("pageIndex", java.lang.Integer.valueOf(i17));
        oo5.e eVar = this.f428735a;
        if (bitmap != null) {
            eVar.getClass();
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(byteArray, "toByteArray(...)");
            hashMap.put(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47247x9eebe4b9, byteArray);
        }
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = eVar.f428744m;
        if (c28688xe8dbe4c2 != null) {
            c28688xe8dbe4c2.m138438xd8c5c779("onThumbnailLoad", hashMap);
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void e(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.NativePreviewFileView", "onPageCountUpdate, totalCount: " + i17);
        oo5.e eVar = this.f428735a;
        eVar.f428745n = i17;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("totalCount", java.lang.Integer.valueOf(i17));
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = eVar.f428744m;
        if (c28688xe8dbe4c2 != null) {
            c28688xe8dbe4c2.m138438xd8c5c779("onPageCountUpdate", hashMap);
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void f(int i17, int i18, int i19) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("pageIndex", java.lang.Integer.valueOf(i17));
        hashMap.put("pageWidth", java.lang.Integer.valueOf(i18));
        hashMap.put("pageHeight", java.lang.Integer.valueOf(i19));
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = this.f428735a.f428744m;
        if (c28688xe8dbe4c2 != null) {
            c28688xe8dbe4c2.m138438xd8c5c779("onPageChange", hashMap);
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void g(int i17, float f17, int i18, int i19, int i27, int i28) {
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void h(android.view.MotionEvent motionEvent) {
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = this.f428735a.f428744m;
        if (c28688xe8dbe4c2 != null) {
            c28688xe8dbe4c2.m138438xd8c5c779("onSingleTap", null);
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void i() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.NativePreviewFileView", "onReachEnd");
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    /* renamed from: onDoubleTap */
    public void mo56908xce1d2af3(android.view.MotionEvent motionEvent) {
    }
}
