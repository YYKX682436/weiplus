package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1;

/* renamed from: androidx.camera.core.impl.utils.ExifOutputStream */
/* loaded from: classes13.dex */
public final class C0788x995d0931 extends java.io.FilterOutputStream {

    /* renamed from: BYTE_ALIGN_II */
    private static final short f1940x77eaaa11 = 18761;

    /* renamed from: BYTE_ALIGN_MM */
    private static final short f1941x77eaaa91 = 19789;

    /* renamed from: DEBUG */
    private static final boolean f1942x3de9e33 = false;

    /* renamed from: IDENTIFIER_EXIF_APP1 */
    private static final byte[] f1943x509c8809 = "Exif\u0000\u0000".getBytes(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0786xc3e0734c.f1883x3bab731);

    /* renamed from: IFD_OFFSET */
    private static final int f1944xf7b1dd0b = 8;

    /* renamed from: START_CODE */
    private static final byte f1945xc0e0ebca = 42;

    /* renamed from: STATE_FRAME_HEADER */
    private static final int f1946xe3709ecd = 1;

    /* renamed from: STATE_JPEG_DATA */
    private static final int f1947x301476d3 = 2;

    /* renamed from: STATE_SOI */
    private static final int f1948x29d79c9f = 0;

    /* renamed from: STREAMBUFFER_SIZE */
    private static final int f1949xf8b0bd20 = 65536;
    private static final java.lang.String TAG = "ExifOutputStream";

    /* renamed from: mBuffer */
    private final java.nio.ByteBuffer f1950xfd47bb0d;

    /* renamed from: mByteToCopy */
    private int f1951xfb18dc05;

    /* renamed from: mByteToSkip */
    private int f1952xfb20120f;

    /* renamed from: mExifData */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0787x848778fa f1953xa5aabc67;

    /* renamed from: mSingleByteArray */
    private final byte[] f1954x92faa29c;

    /* renamed from: mState */
    private int f1955xbec81024;

    /* renamed from: androidx.camera.core.impl.utils.ExifOutputStream$JpegHeader */
    /* loaded from: classes13.dex */
    public static final class JpegHeader {

        /* renamed from: APP1 */
        public static final short f1956x1ec250 = -31;
        public static final short DAC = -52;
        public static final short DHT = -60;
        public static final short EOI = -39;
        public static final short JPG = -56;

        /* renamed from: SOF0 */
        public static final short f1957x26ec06 = -64;

        /* renamed from: SOF15 */
        public static final short f1958x4b6950e = -49;
        public static final short SOI = -40;

        private JpegHeader() {
        }

        /* renamed from: isSofMarker */
        public static boolean m5915x884ab05a(short s17) {
            return (s17 < -64 || s17 > -49 || s17 == -60 || s17 == -56 || s17 == -52) ? false : true;
        }
    }

    public C0788x995d0931(java.io.OutputStream outputStream, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0787x848778fa c0787x848778fa) {
        super(new java.io.BufferedOutputStream(outputStream, 65536));
        this.f1954x92faa29c = new byte[1];
        this.f1950xfd47bb0d = java.nio.ByteBuffer.allocate(4);
        this.f1955xbec81024 = 0;
        this.f1953xa5aabc67 = c0787x848778fa;
    }

    /* renamed from: requestByteToBuffer */
    private int m5913xdcc7abf2(int i17, byte[] bArr, int i18, int i19) {
        int min = java.lang.Math.min(i19, i17 - this.f1950xfd47bb0d.position());
        this.f1950xfd47bb0d.put(bArr, i18, min);
        return min;
    }

    /* renamed from: writeExifSegment */
    private void m5914x4fa82aa4(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0780x6b695cf0 c0780x6b695cf0) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a[][] c0789x14cacc4aArr = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0787x848778fa.f1906x3e555de8;
        int[] iArr = new int[c0789x14cacc4aArr.length];
        int[] iArr2 = new int[c0789x14cacc4aArr.length];
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a c0789x14cacc4a : p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0787x848778fa.f1905x45e4d7ca) {
            for (int i17 = 0; i17 < p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0787x848778fa.f1906x3e555de8.length; i17++) {
                this.f1953xa5aabc67.m5889x66e614d(i17).remove(c0789x14cacc4a.f1959x337a8b);
            }
        }
        if (!this.f1953xa5aabc67.m5889x66e614d(1).isEmpty()) {
            this.f1953xa5aabc67.m5889x66e614d(0).put(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0787x848778fa.f1905x45e4d7ca[1].f1959x337a8b, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0786xc3e0734c.m5872xe1f5a4f5(0L, this.f1953xa5aabc67.m5890x84490c70()));
        }
        if (!this.f1953xa5aabc67.m5889x66e614d(2).isEmpty()) {
            this.f1953xa5aabc67.m5889x66e614d(0).put(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0787x848778fa.f1905x45e4d7ca[2].f1959x337a8b, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0786xc3e0734c.m5872xe1f5a4f5(0L, this.f1953xa5aabc67.m5890x84490c70()));
        }
        if (!this.f1953xa5aabc67.m5889x66e614d(3).isEmpty()) {
            this.f1953xa5aabc67.m5889x66e614d(1).put(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0787x848778fa.f1905x45e4d7ca[3].f1959x337a8b, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0786xc3e0734c.m5872xe1f5a4f5(0L, this.f1953xa5aabc67.m5890x84490c70()));
        }
        for (int i18 = 0; i18 < p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0787x848778fa.f1906x3e555de8.length; i18++) {
            java.util.Iterator<java.util.Map.Entry<java.lang.String, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0786xc3e0734c>> it = this.f1953xa5aabc67.m5889x66e614d(i18).entrySet().iterator();
            int i19 = 0;
            while (it.hasNext()) {
                int m5882x35e001 = it.next().getValue().m5882x35e001();
                if (m5882x35e001 > 4) {
                    i19 += m5882x35e001;
                }
            }
            iArr2[i18] = iArr2[i18] + i19;
        }
        int i27 = 8;
        for (int i28 = 0; i28 < p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0787x848778fa.f1906x3e555de8.length; i28++) {
            if (!this.f1953xa5aabc67.m5889x66e614d(i28).isEmpty()) {
                iArr[i28] = i27;
                i27 += (this.f1953xa5aabc67.m5889x66e614d(i28).size() * 12) + 2 + 4 + iArr2[i28];
            }
        }
        int i29 = i27 + 8;
        if (!this.f1953xa5aabc67.m5889x66e614d(1).isEmpty()) {
            this.f1953xa5aabc67.m5889x66e614d(0).put(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0787x848778fa.f1905x45e4d7ca[1].f1959x337a8b, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0786xc3e0734c.m5872xe1f5a4f5(iArr[1], this.f1953xa5aabc67.m5890x84490c70()));
        }
        if (!this.f1953xa5aabc67.m5889x66e614d(2).isEmpty()) {
            this.f1953xa5aabc67.m5889x66e614d(0).put(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0787x848778fa.f1905x45e4d7ca[2].f1959x337a8b, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0786xc3e0734c.m5872xe1f5a4f5(iArr[2], this.f1953xa5aabc67.m5890x84490c70()));
        }
        if (!this.f1953xa5aabc67.m5889x66e614d(3).isEmpty()) {
            this.f1953xa5aabc67.m5889x66e614d(1).put(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0787x848778fa.f1905x45e4d7ca[3].f1959x337a8b, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0786xc3e0734c.m5872xe1f5a4f5(iArr[3], this.f1953xa5aabc67.m5890x84490c70()));
        }
        c0780x6b695cf0.m5805x116e18e8(i29);
        c0780x6b695cf0.write(f1943x509c8809);
        c0780x6b695cf0.m5803xd9674fdd(this.f1953xa5aabc67.m5890x84490c70() == java.nio.ByteOrder.BIG_ENDIAN ? f1941x77eaaa91 : f1940x77eaaa11);
        c0780x6b695cf0.m5800xe09ccce4(this.f1953xa5aabc67.m5890x84490c70());
        c0780x6b695cf0.m5805x116e18e8(42);
        c0780x6b695cf0.m5804x469c575b(8L);
        for (int i37 = 0; i37 < p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0787x848778fa.f1906x3e555de8.length; i37++) {
            if (!this.f1953xa5aabc67.m5889x66e614d(i37).isEmpty()) {
                c0780x6b695cf0.m5805x116e18e8(this.f1953xa5aabc67.m5889x66e614d(i37).size());
                int size = iArr[i37] + 2 + (this.f1953xa5aabc67.m5889x66e614d(i37).size() * 12) + 4;
                for (java.util.Map.Entry<java.lang.String, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0786xc3e0734c> entry : this.f1953xa5aabc67.m5889x66e614d(i37).entrySet()) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0789x14cacc4a c0789x14cacc4a2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0787x848778fa.Builder.f1929xd610b621.get(i37).get(entry.getKey());
                    m3.h.d(c0789x14cacc4a2, "Tag not supported: " + entry.getKey() + ". Tag needs to be ported from ExifInterface to ExifData.");
                    int i38 = c0789x14cacc4a2.f1960xc258db49;
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0786xc3e0734c value = entry.getValue();
                    int m5882x35e0012 = value.m5882x35e001();
                    c0780x6b695cf0.m5805x116e18e8(i38);
                    c0780x6b695cf0.m5805x116e18e8(value.f1902xb45ff7f7);
                    c0780x6b695cf0.m5802x91f0c790(value.f1903x275cd636);
                    if (m5882x35e0012 > 4) {
                        c0780x6b695cf0.m5804x469c575b(size);
                        size += m5882x35e0012;
                    } else {
                        c0780x6b695cf0.write(value.f1900x59dc06b);
                        if (m5882x35e0012 < 4) {
                            while (m5882x35e0012 < 4) {
                                c0780x6b695cf0.m5801xac252587(0);
                                m5882x35e0012++;
                            }
                        }
                    }
                }
                c0780x6b695cf0.m5804x469c575b(0L);
                java.util.Iterator<java.util.Map.Entry<java.lang.String, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0786xc3e0734c>> it6 = this.f1953xa5aabc67.m5889x66e614d(i37).entrySet().iterator();
                while (it6.hasNext()) {
                    byte[] bArr = it6.next().getValue().f1900x59dc06b;
                    if (bArr.length > 4) {
                        c0780x6b695cf0.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        c0780x6b695cf0.m5800xe09ccce4(java.nio.ByteOrder.BIG_ENDIAN);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x010d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0106, code lost:
    
        if (r9 <= 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0108, code lost:
    
        ((java.io.FilterOutputStream) r6).out.write(r7, r8, r9);
     */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void write(byte[] r7, int r8, int r9) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0788x995d0931.write(byte[], int, int):void");
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i17) {
        byte[] bArr = this.f1954x92faa29c;
        bArr[0] = (byte) (i17 & 255);
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }
}
