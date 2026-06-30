package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b;

/* renamed from: androidx.camera.core.imagecapture.Bitmap2JpegBytes */
/* loaded from: classes14.dex */
class C0593x8e57ef60 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0902xda8cf547<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0593x8e57ef60.In, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<byte[]>> {

    /* renamed from: androidx.camera.core.imagecapture.Bitmap2JpegBytes$Api34Impl */
    /* loaded from: classes6.dex */
    public static class Api34Impl {
        private Api34Impl() {
        }

        /* renamed from: hasGainmap */
        public static boolean m4927x6d46f983(android.graphics.Bitmap bitmap) {
            return bitmap.hasGainmap();
        }
    }

    /* renamed from: androidx.camera.core.imagecapture.Bitmap2JpegBytes$In */
    /* loaded from: classes14.dex */
    public static abstract class In {
        public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0593x8e57ef60.In of(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<android.graphics.Bitmap> abstractC0903x8e0938a8, int i17) {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0585x982623a7(abstractC0903x8e0938a8, i17);
        }

        /* renamed from: getJpegQuality */
        public abstract int mo4869x354bfa41();

        /* renamed from: getPacket */
        public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<android.graphics.Bitmap> mo4870x29bb6f7e();
    }

    /* renamed from: getOutputFormat */
    private static int m4925x42b80ace(android.graphics.Bitmap bitmap) {
        return (android.os.Build.VERSION.SDK_INT < 34 || !p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0593x8e57ef60.Api34Impl.m4927x6d46f983(bitmap)) ? 256 : 4101;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0902xda8cf547
    /* renamed from: apply, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<byte[]> mo4926x58b836e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0593x8e57ef60.In in6) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<android.graphics.Bitmap> mo4870x29bb6f7e = in6.mo4870x29bb6f7e();
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        mo4870x29bb6f7e.mo6256xfb7e5820().compress(android.graphics.Bitmap.CompressFormat.JPEG, in6.mo4869x354bfa41(), byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0785x212d30 mo6257xfb7f2186 = mo4870x29bb6f7e.mo6257xfb7f2186();
        java.util.Objects.requireNonNull(mo6257xfb7f2186);
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8.of(byteArray, mo6257xfb7f2186, m4925x42b80ace(mo4870x29bb6f7e.mo6256xfb7e5820()), mo4870x29bb6f7e.mo6261xfb854877(), mo4870x29bb6f7e.mo6255xfa2ffe0a(), mo4870x29bb6f7e.mo6259x2a7ffb93(), mo4870x29bb6f7e.mo6260x65554241(), mo4870x29bb6f7e.mo6254xedfdbca8());
    }
}
