package n16;

/* loaded from: classes15.dex */
public final class g implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f415702d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f415703e;

    public g(java.lang.String str, boolean z17) {
        if (str == null) {
            a(0);
            throw null;
        }
        this.f415702d = str;
        this.f415703e = z17;
    }

    public static /* synthetic */ void a(int i17) {
        java.lang.String str = (i17 == 1 || i17 == 2 || i17 == 3 || i17 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i17 == 1 || i17 == 2 || i17 == 3 || i17 == 4) ? 2 : 3];
        if (i17 == 1 || i17 == 2 || i17 == 3 || i17 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d;
        }
        if (i17 == 1) {
            objArr[1] = "asString";
        } else if (i17 == 2) {
            objArr[1] = "getIdentifier";
        } else if (i17 == 3 || i17 == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i17) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.ParamKey.f15121xc2d3420e;
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "identifierIfValid";
                break;
            case 8:
                objArr[2] = "special";
                break;
            case 9:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i17 != 1 && i17 != 2 && i17 != 3 && i17 != 4) {
            throw new java.lang.IllegalArgumentException(format);
        }
        throw new java.lang.IllegalStateException(format);
    }

    public static n16.g j(java.lang.String str) {
        if (str != null) {
            return str.startsWith("<") ? m(str) : k(str);
        }
        a(9);
        throw null;
    }

    public static n16.g k(java.lang.String str) {
        if (str != null) {
            return new n16.g(str, false);
        }
        a(5);
        throw null;
    }

    public static boolean l(java.lang.String str) {
        if (str == null) {
            a(6);
            throw null;
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i17 = 0; i17 < str.length(); i17++) {
            char charAt = str.charAt(i17);
            if (charAt == '.' || charAt == '/' || charAt == '\\') {
                return false;
            }
        }
        return true;
    }

    public static n16.g m(java.lang.String str) {
        if (str == null) {
            a(8);
            throw null;
        }
        if (str.startsWith("<")) {
            return new n16.g(str, true);
        }
        throw new java.lang.IllegalArgumentException("special name must start with '<': ".concat(str));
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        return this.f415702d.compareTo(((n16.g) obj).f415702d);
    }

    /* renamed from: equals */
    public boolean m148891xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n16.g)) {
            return false;
        }
        n16.g gVar = (n16.g) obj;
        return this.f415703e == gVar.f415703e && this.f415702d.equals(gVar.f415702d);
    }

    public java.lang.String h() {
        java.lang.String str = this.f415702d;
        if (str != null) {
            return str;
        }
        a(1);
        throw null;
    }

    /* renamed from: hashCode */
    public int m148892x8cdac1b() {
        return (this.f415702d.hashCode() * 31) + (this.f415703e ? 1 : 0);
    }

    public java.lang.String i() {
        if (this.f415703e) {
            throw new java.lang.IllegalStateException("not identifier: " + this);
        }
        java.lang.String h17 = h();
        if (h17 != null) {
            return h17;
        }
        a(2);
        throw null;
    }

    /* renamed from: toString */
    public java.lang.String m148893x9616526c() {
        return this.f415702d;
    }
}
