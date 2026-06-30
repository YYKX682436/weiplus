package cv;

/* loaded from: classes14.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f304049a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f304050b;

    /* renamed from: c, reason: collision with root package name */
    public int f304051c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f304052d;

    public v0(int i17, java.lang.String str, int i18) {
        this.f304049a = i17;
        this.f304050b = str;
        this.f304051c = i18;
        this.f304052d = "";
        if (str == null) {
            this.f304050b = b(i17);
        }
    }

    public final java.lang.String a() {
        java.lang.String str = this.f304050b;
        int i17 = this.f304049a;
        if (str == null) {
            this.f304050b = b(i17);
        }
        java.lang.String str2 = this.f304050b;
        return str2 == null ? b(i17) : str2;
    }

    public final java.lang.String b(int i17) {
        if (i17 == 1) {
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a6p);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            return string;
        }
        if (i17 == 2) {
            java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a6n);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            return string2;
        }
        if (i17 == 3) {
            java.lang.String string3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a6o);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
            return string3;
        }
        if (i17 != 4) {
            java.lang.String string4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a6n);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
            return string4;
        }
        java.lang.String string5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a6m);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string5, "getString(...)");
        return string5;
    }

    public final java.lang.String c() {
        int i17 = this.f304049a;
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? "" : "BluetoothAndroid" : "Headphones" : "Receiver" : "Speaker";
    }

    /* renamed from: equals */
    public boolean m122770xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof cv.v0)) {
            return false;
        }
        cv.v0 v0Var = (cv.v0) obj;
        return this.f304049a == v0Var.f304049a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f304050b, v0Var.f304050b);
    }

    /* renamed from: hashCode */
    public int m122771x8cdac1b() {
        long j17 = this.f304049a;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return (int) (j17 + android.os.SystemClock.elapsedRealtime());
    }

    /* renamed from: toString */
    public java.lang.String m122772x9616526c() {
        return "AudioRouteInfo(deviceType=" + this.f304049a + ", deviceName=" + this.f304050b + ", state=" + this.f304051c + ')';
    }

    public /* synthetic */ v0(int i17, java.lang.String str, int i18, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i19 & 1) != 0 ? 1 : i17, (i19 & 2) != 0 ? null : str, (i19 & 4) != 0 ? 3 : i18);
    }
}
