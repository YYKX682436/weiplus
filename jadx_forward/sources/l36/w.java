package l36;

/* loaded from: classes13.dex */
public final class w {

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.regex.Pattern f397201j = java.util.regex.Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    public static final java.util.regex.Pattern f397202k = java.util.regex.Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    public static final java.util.regex.Pattern f397203l = java.util.regex.Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.regex.Pattern f397204m = java.util.regex.Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f397205a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f397206b;

    /* renamed from: c, reason: collision with root package name */
    public final long f397207c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f397208d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f397209e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f397210f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f397211g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f397212h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f397213i;

    public w(java.lang.String str, java.lang.String str2, long j17, java.lang.String str3, java.lang.String str4, boolean z17, boolean z18, boolean z19, boolean z27) {
        this.f397205a = str;
        this.f397206b = str2;
        this.f397207c = j17;
        this.f397208d = str3;
        this.f397209e = str4;
        this.f397210f = z17;
        this.f397211g = z18;
        this.f397213i = z19;
        this.f397212h = z27;
    }

    public static int a(java.lang.String str, int i17, int i18, boolean z17) {
        while (i17 < i18) {
            char charAt = str.charAt(i17);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z17)) {
                return i17;
            }
            i17++;
        }
        return i18;
    }

    public static long b(java.lang.String str, int i17, int i18) {
        int a17 = a(str, i17, i18, false);
        java.util.regex.Pattern pattern = f397204m;
        java.util.regex.Matcher matcher = pattern.matcher(str);
        int i19 = -1;
        int i27 = -1;
        int i28 = -1;
        int i29 = -1;
        int i37 = -1;
        int i38 = -1;
        while (a17 < i18) {
            int a18 = a(str, a17 + 1, i18, true);
            matcher.region(a17, a18);
            if (i27 == -1 && matcher.usePattern(pattern).matches()) {
                i27 = java.lang.Integer.parseInt(matcher.group(1));
                i37 = java.lang.Integer.parseInt(matcher.group(2));
                i38 = java.lang.Integer.parseInt(matcher.group(3));
            } else if (i28 == -1 && matcher.usePattern(f397203l).matches()) {
                i28 = java.lang.Integer.parseInt(matcher.group(1));
            } else {
                if (i29 == -1) {
                    java.util.regex.Pattern pattern2 = f397202k;
                    if (matcher.usePattern(pattern2).matches()) {
                        i29 = pattern2.pattern().indexOf(matcher.group(1).toLowerCase(java.util.Locale.US)) / 4;
                    }
                }
                if (i19 == -1 && matcher.usePattern(f397201j).matches()) {
                    i19 = java.lang.Integer.parseInt(matcher.group(1));
                }
            }
            a17 = a(str, a18 + 1, i18, false);
        }
        if (i19 >= 70 && i19 <= 99) {
            i19 += 1900;
        }
        if (i19 >= 0 && i19 <= 69) {
            i19 += 2000;
        }
        if (i19 < 1601) {
            throw new java.lang.IllegalArgumentException();
        }
        if (i29 == -1) {
            throw new java.lang.IllegalArgumentException();
        }
        if (i28 < 1 || i28 > 31) {
            throw new java.lang.IllegalArgumentException();
        }
        if (i27 < 0 || i27 > 23) {
            throw new java.lang.IllegalArgumentException();
        }
        if (i37 < 0 || i37 > 59) {
            throw new java.lang.IllegalArgumentException();
        }
        if (i38 < 0 || i38 > 59) {
            throw new java.lang.IllegalArgumentException();
        }
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar(m36.e.f404923e);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i19);
        gregorianCalendar.set(2, i29 - 1);
        gregorianCalendar.set(5, i28);
        gregorianCalendar.set(11, i27);
        gregorianCalendar.set(12, i37);
        gregorianCalendar.set(13, i38);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    /* renamed from: equals */
    public boolean m145053xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof l36.w)) {
            return false;
        }
        l36.w wVar = (l36.w) obj;
        return wVar.f397205a.equals(this.f397205a) && wVar.f397206b.equals(this.f397206b) && wVar.f397208d.equals(this.f397208d) && wVar.f397209e.equals(this.f397209e) && wVar.f397207c == this.f397207c && wVar.f397210f == this.f397210f && wVar.f397211g == this.f397211g && wVar.f397212h == this.f397212h && wVar.f397213i == this.f397213i;
    }

    /* renamed from: hashCode */
    public int m145054x8cdac1b() {
        int hashCode = (((((((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v5.f34918x366c91de + this.f397205a.hashCode()) * 31) + this.f397206b.hashCode()) * 31) + this.f397208d.hashCode()) * 31) + this.f397209e.hashCode()) * 31;
        long j17 = this.f397207c;
        return ((((((((hashCode + ((int) (j17 ^ (j17 >>> 32)))) * 31) + (!this.f397210f ? 1 : 0)) * 31) + (!this.f397211g ? 1 : 0)) * 31) + (!this.f397212h ? 1 : 0)) * 31) + (!this.f397213i ? 1 : 0);
    }

    /* renamed from: toString */
    public java.lang.String m145055x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f397205a);
        sb6.append('=');
        sb6.append(this.f397206b);
        if (this.f397212h) {
            long j17 = this.f397207c;
            if (j17 == Long.MIN_VALUE) {
                sb6.append("; max-age=0");
            } else {
                sb6.append("; expires=");
                sb6.append(((java.text.DateFormat) p36.f.f433251a.get()).format(new java.util.Date(j17)));
            }
        }
        if (!this.f397213i) {
            sb6.append("; domain=");
            sb6.append(this.f397208d);
        }
        sb6.append("; path=");
        sb6.append(this.f397209e);
        if (this.f397210f) {
            sb6.append("; secure");
        }
        if (this.f397211g) {
            sb6.append("; httponly");
        }
        return sb6.toString();
    }
}
