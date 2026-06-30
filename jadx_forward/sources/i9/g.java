package i9;

/* loaded from: classes15.dex */
public final class g implements i9.h {
    public i9.e a(com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e417) {
        java.lang.String str = c1601x7dc4e417.f125613i;
        str.getClass();
        char c17 = 65535;
        switch (str.hashCode()) {
            case -1351681404:
                if (str.equals(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54224xd964a414)) {
                    c17 = 0;
                    break;
                }
                break;
            case -1026075066:
                if (str.equals(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54232x26881eb4)) {
                    c17 = 1;
                    break;
                }
                break;
            case -1004728940:
                if (str.equals("text/vtt")) {
                    c17 = 2;
                    break;
                }
                break;
            case 691401887:
                if (str.equals(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54240x122adda7)) {
                    c17 = 3;
                    break;
                }
                break;
            case 822864842:
                if (str.equals(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54272xf2e74fcf)) {
                    c17 = 4;
                    break;
                }
                break;
            case 930165504:
                if (str.equals(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54231xd925ae21)) {
                    c17 = 5;
                    break;
                }
                break;
            case 1566015601:
                if (str.equals(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54222x14e2122e)) {
                    c17 = 6;
                    break;
                }
                break;
            case 1566016562:
                if (str.equals(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54223x14e215ef)) {
                    c17 = 7;
                    break;
                }
                break;
            case 1668750253:
                if (str.equals(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54238x3111f4c8)) {
                    c17 = '\b';
                    break;
                }
                break;
            case 1693976202:
                if (str.equals(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54239x122ad1ce)) {
                    c17 = '\t';
                    break;
                }
                break;
        }
        int i17 = c1601x7dc4e417.F;
        java.util.List list = c1601x7dc4e417.f125615n;
        switch (c17) {
            case 0:
                return new k9.a(list);
            case 1:
                return new p9.b();
            case 2:
                return new p9.k();
            case 3:
                return new o9.a(list);
            case 4:
                return new l9.a(list);
            case 5:
            case 6:
                return new j9.c(c1601x7dc4e417.f125613i, i17);
            case 7:
                return new j9.g(i17);
            case '\b':
                return new m9.a();
            case '\t':
                return new n9.b();
            default:
                throw new java.lang.IllegalArgumentException("Attempted to create decoder for unsupported format");
        }
    }
}
