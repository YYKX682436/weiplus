package av5;

/* loaded from: classes16.dex */
public class n0 implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final short f95951d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f95952e;

    /* renamed from: f, reason: collision with root package name */
    public int f95953f;

    /* renamed from: g, reason: collision with root package name */
    public int f95954g;

    /* renamed from: h, reason: collision with root package name */
    public int f95955h;

    public n0(int i17, boolean z17) {
        this.f95953f = 0;
        this.f95954g = -1;
        this.f95955h = 0;
        this.f95951d = (short) i17;
        this.f95952e = z17;
        if (i17 == 0) {
            this.f95954g = 0;
            this.f95953f = 1;
            this.f95955h = 112;
        } else if (i17 == 4096) {
            this.f95953f = 1;
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        av5.n0 n0Var = (av5.n0) obj;
        int i17 = this.f95954g;
        int i18 = n0Var.f95954g;
        if (i17 == i18) {
            int i19 = i(this.f95951d);
            int i27 = i(n0Var.f95951d);
            if (i19 == i27) {
                return 0;
            }
            if (i19 < i27) {
                return -1;
            }
        } else if (i17 < i18) {
            return -1;
        }
        return 1;
    }

    public boolean h() {
        return this.f95953f > 0;
    }

    public final int i(int i17) {
        switch (i17) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 7;
            case 7:
                return 18;
            case 8:
                return 6;
            default:
                switch (i17) {
                    case 4096:
                        return 19;
                    case 4097:
                        return 9;
                    case 4098:
                        return 12;
                    case 4099:
                        return 11;
                    default:
                        switch (i17) {
                            case 8192:
                                return 16;
                            case 8193:
                                return 15;
                            case 8194:
                                return 8;
                            case 8195:
                                return 14;
                            case 8196:
                                return 10;
                            case 8197:
                                return 17;
                            case 8198:
                                return 13;
                            default:
                                throw new java.lang.IllegalArgumentException("unknown section type: " + i17);
                        }
                }
        }
    }

    /* renamed from: toString */
    public java.lang.String m9127x9616526c() {
        return java.lang.String.format("Section[type=%#x,off=%#x,size=%#x,byteCount=%#x]", java.lang.Short.valueOf(this.f95951d), java.lang.Integer.valueOf(this.f95954g), java.lang.Integer.valueOf(this.f95953f), java.lang.Integer.valueOf(this.f95955h));
    }
}
