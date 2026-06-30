package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.imagecapture.ProcessingInput2Packet */
/* loaded from: classes14.dex */
public final class C0617x5fbc2723 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0902xda8cf547<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.InputPacket, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3>> {
    /* renamed from: createPacket */
    private static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3> m4999x55592ca4(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0627xbfd50fdc c0627xbfd50fdc, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0785x212d30 c0785x212d30, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3) {
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8.of(interfaceC0536x1ffeadf3, c0785x212d30, c0627xbfd50fdc.m5021xfa2ffe0a(), c0627xbfd50fdc.m5025x2a7ffb93(), c0627xbfd50fdc.m5026x65554241(), m5001xedfdbca8(interfaceC0536x1ffeadf3));
    }

    /* renamed from: createPacketWithHalRotation */
    private static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3> m5000x20a6d147(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0627xbfd50fdc c0627xbfd50fdc, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0785x212d30 c0785x212d30, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3) {
        android.util.Size size = new android.util.Size(interfaceC0536x1ffeadf3.mo4175x755bd410(), interfaceC0536x1ffeadf3.mo4171x1c4fb41d());
        int m5025x2a7ffb93 = c0627xbfd50fdc.m5025x2a7ffb93() - c0785x212d30.m5847x79734cf4();
        android.util.Size m5002x492f0cd4 = m5002x492f0cd4(m5025x2a7ffb93, size);
        android.graphics.Matrix m5951xeff629f9 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0801x6002c4c5.m5951xeff629f9(new android.graphics.RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), new android.graphics.RectF(0.0f, 0.0f, m5002x492f0cd4.getWidth(), m5002x492f0cd4.getHeight()), m5025x2a7ffb93);
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8.of(interfaceC0536x1ffeadf3, c0785x212d30, m5002x492f0cd4, m5003x21b5ec39(c0627xbfd50fdc.m5021xfa2ffe0a(), m5951xeff629f9), c0785x212d30.m5847x79734cf4(), m5004x763b467(c0627xbfd50fdc.m5026x65554241(), m5951xeff629f9), m5001xedfdbca8(interfaceC0536x1ffeadf3));
    }

    /* renamed from: getCameraCaptureResult */
    private static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be m5001xedfdbca8(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3) {
        return interfaceC0536x1ffeadf3.mo4173xcb10cdf3() instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0830x9b01aa8b ? ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0830x9b01aa8b) interfaceC0536x1ffeadf3.mo4173xcb10cdf3()).m6049xedfdbca8() : p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be.EmptyCameraCaptureResult.m5255xaf65a0fc();
    }

    /* renamed from: getRotatedSize */
    private static android.util.Size m5002x492f0cd4(int i17, android.util.Size size) {
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0801x6002c4c5.m5956x99b544a7(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0801x6002c4c5.m5974x36f045e2(i17)) ? new android.util.Size(size.getHeight(), size.getWidth()) : size;
    }

    /* renamed from: getUpdatedCropRect */
    private static android.graphics.Rect m5003x21b5ec39(android.graphics.Rect rect, android.graphics.Matrix matrix) {
        android.graphics.RectF rectF = new android.graphics.RectF(rect);
        matrix.mapRect(rectF);
        rectF.sort();
        android.graphics.Rect rect2 = new android.graphics.Rect();
        rectF.round(rect2);
        return rect2;
    }

    /* renamed from: getUpdatedTransform */
    private static android.graphics.Matrix m5004x763b467(android.graphics.Matrix matrix, android.graphics.Matrix matrix2) {
        android.graphics.Matrix matrix3 = new android.graphics.Matrix(matrix);
        matrix3.postConcat(matrix2);
        return matrix3;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0902xda8cf547
    /* renamed from: apply, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.AbstractC0903x8e0938a8<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3> mo4926x58b836e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.InputPacket inputPacket) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0785x212d30 m5830xc56dbd39;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 mo4903x976d89c9 = inputPacket.mo4903x976d89c9();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0627xbfd50fdc mo4904x28455746 = inputPacket.mo4904x28455746();
        if (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0869x431b07dd.m6222xb838964a(mo4903x976d89c9.mo4170x19771aed())) {
            try {
                m5830xc56dbd39 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0785x212d30.m5830xc56dbd39(mo4903x976d89c9);
                mo4903x976d89c9.mo4174x2a55948d()[0].mo4177x12f2b736().rewind();
            } catch (java.io.IOException e17) {
                throw new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04(1, "Failed to extract EXIF data.", e17);
            }
        } else {
            m5830xc56dbd39 = null;
        }
        if (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0610x6ae15cfd.f1345xc51eca8d.m6197x719d92c(mo4903x976d89c9)) {
            m3.h.d(m5830xc56dbd39, "JPEG image must have exif.");
            return m5000x20a6d147(mo4904x28455746, m5830xc56dbd39, mo4903x976d89c9);
        }
        return m4999x55592ca4(mo4904x28455746, m5830xc56dbd39, mo4903x976d89c9);
    }
}
