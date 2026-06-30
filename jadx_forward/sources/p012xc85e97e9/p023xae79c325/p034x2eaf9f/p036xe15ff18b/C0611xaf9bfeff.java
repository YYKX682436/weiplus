package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b;

/* renamed from: androidx.camera.core.imagecapture.JpegBytes2CroppedBitmap */
/* loaded from: classes14.dex */
final class C0611xaf9bfeff implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0902xda8cf547<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<byte[]>, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<android.graphics.Bitmap>> {

    /* renamed from: _hellAccFlag_ */
    private byte f1354x7f11beae;

    /* renamed from: createCroppedBitmap */
    private android.graphics.Bitmap m4980x741676f2(byte[] bArr, android.graphics.Rect rect) {
        try {
            android.graphics.BitmapRegionDecoder newInstance = android.graphics.BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false);
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(options);
            arrayList.add(rect);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(newInstance, arrayList.toArray(), "androidx/camera/core/imagecapture/JpegBytes2CroppedBitmap", "createCroppedBitmap", "([BLandroid/graphics/Rect;)Landroid/graphics/Bitmap;", "android/graphics/BitmapRegionDecoder_EXEC_", "decodeRegion", "(Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeRegion = newInstance.decodeRegion((android.graphics.Rect) arrayList.get(0), (android.graphics.BitmapFactory.Options) arrayList.get(1));
            yj0.a.e(newInstance, decodeRegion, "androidx/camera/core/imagecapture/JpegBytes2CroppedBitmap", "createCroppedBitmap", "([BLandroid/graphics/Rect;)Landroid/graphics/Bitmap;", "android/graphics/BitmapRegionDecoder_EXEC_", "decodeRegion", "(Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
            return decodeRegion;
        } catch (java.io.IOException e17) {
            throw new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04(1, "Failed to decode JPEG.", e17);
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0902xda8cf547
    /* renamed from: apply, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<android.graphics.Bitmap> mo4926x58b836e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<byte[]> abstractC0903x8e0938a8) {
        android.graphics.Rect mo6255xfa2ffe0a = abstractC0903x8e0938a8.mo6255xfa2ffe0a();
        android.graphics.Bitmap m4980x741676f2 = m4980x741676f2(abstractC0903x8e0938a8.mo6256xfb7e5820(), mo6255xfa2ffe0a);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0785x212d30 mo6257xfb7f2186 = abstractC0903x8e0938a8.mo6257xfb7f2186();
        java.util.Objects.requireNonNull(mo6257xfb7f2186);
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8.of(m4980x741676f2, mo6257xfb7f2186, new android.graphics.Rect(0, 0, m4980x741676f2.getWidth(), m4980x741676f2.getHeight()), abstractC0903x8e0938a8.mo6259x2a7ffb93(), p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0801x6002c4c5.m5972xf59ba76e(abstractC0903x8e0938a8.mo6260x65554241(), mo6255xfa2ffe0a), abstractC0903x8e0938a8.mo6254xedfdbca8());
    }
}
