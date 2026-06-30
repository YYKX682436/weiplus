package r35;

/* loaded from: classes9.dex */
public class m3 {

    /* renamed from: a, reason: collision with root package name */
    public int f450725a;

    /* renamed from: b, reason: collision with root package name */
    public int f450726b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f450727c;

    /* renamed from: d, reason: collision with root package name */
    public final int f450728d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f450729e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f450730f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f450731g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f450732h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f450733i;

    /* renamed from: j, reason: collision with root package name */
    public int f450734j;

    /* renamed from: k, reason: collision with root package name */
    public int f450735k;

    /* renamed from: l, reason: collision with root package name */
    public int f450736l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f450737m;

    /* renamed from: n, reason: collision with root package name */
    public int f450738n = 0;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 f450739o = null;

    /* renamed from: p, reason: collision with root package name */
    public int f450740p = 1;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f450741q = null;

    public m3(int i17, int i18, java.lang.String str, int i19, java.lang.Object obj) {
        this.f450725a = i17;
        this.f450726b = i18;
        this.f450727c = str;
        this.f450728d = i19;
        this.f450729e = obj;
    }

    public int a() {
        return this.f450736l;
    }

    public java.lang.Object b(java.lang.Class cls) {
        if (cls.isInstance(this.f450729e)) {
            return cls.cast(this.f450729e);
        }
        return null;
    }

    public int c() {
        return this.f450735k;
    }

    public java.lang.String d() {
        java.lang.Object obj;
        int i17 = this.f450738n;
        if ((i17 != 2 && i17 != 5) || (obj = this.f450729e) == null || !(obj instanceof android.os.Bundle)) {
            return "";
        }
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (!bundle.containsKey("msgUsername")) {
            return "";
        }
        java.lang.String string = bundle.getString("msgUsername");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return string == null ? "" : string;
    }

    public java.lang.String e() {
        java.lang.Object obj = this.f450729e;
        boolean z17 = obj instanceof android.os.Bundle;
        java.lang.String str = this.f450727c;
        if (z17) {
            java.lang.String string = ((android.os.Bundle) obj).getString("AppendURL_" + str);
            if (!android.text.TextUtils.isEmpty(string)) {
                return string;
            }
        }
        return str;
    }

    /* renamed from: equals */
    public boolean m161457xb2c87fbf(java.lang.Object obj) {
        return obj instanceof r35.m3 ? m161458x8cdac1b() == ((r35.m3) obj).m161458x8cdac1b() : super.equals(obj);
    }

    /* renamed from: hashCode */
    public int m161458x8cdac1b() {
        int hashCode = super.hashCode();
        java.lang.String str = this.f450727c;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            hashCode += str.hashCode();
        }
        int i17 = hashCode + this.f450728d + this.f450726b + this.f450725a;
        java.lang.Object obj = this.f450729e;
        return obj != null ? i17 + obj.hashCode() : i17;
    }

    /* renamed from: toString */
    public java.lang.String m161459x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("start: " + this.f450725a);
        sb6.append(", end: " + this.f450726b);
        java.lang.String str = this.f450727c;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            sb6.append(", url: " + str);
        }
        sb6.append(", type: " + this.f450728d);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f450730f)) {
            sb6.append(", username: " + this.f450730f);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f450731g)) {
            sb6.append(", selfUsername: " + this.f450731g);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f450733i)) {
            sb6.append(", chatroomName: " + this.f450733i);
        }
        sb6.append(", sysMsgType: " + this.f450734j);
        sb6.append(", linkColor: " + this.f450735k);
        sb6.append(", backgroundColor: " + this.f450736l);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f450737m)) {
            sb6.append(", mSessionId: " + this.f450737m);
        }
        sb6.append(", fromScene: " + this.f450738n);
        return sb6.toString();
    }

    public m3(java.lang.String str, int i17, java.lang.Object obj) {
        this.f450727c = str;
        this.f450729e = obj;
        this.f450728d = i17;
    }
}
