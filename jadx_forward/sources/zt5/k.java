package zt5;

/* loaded from: classes15.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public int f557138a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f557139b;

    public k(int i17, java.lang.String str) {
        this(i17);
        if (zt5.l.b(str)) {
            return;
        }
        this.f557139b = str;
    }

    public boolean a() {
        return this.f557138a == 0;
    }

    /* renamed from: equals */
    public boolean m179462xb2c87fbf(java.lang.Object obj) {
        return (obj instanceof zt5.k) && ((zt5.k) obj).f557138a == this.f557138a;
    }

    /* renamed from: toString */
    public java.lang.String mo128222x9616526c() {
        return "SoterCoreResult{errCode=" + this.f557138a + ", errMsg='" + this.f557139b + "'}";
    }

    public k(int i17) {
        this.f557138a = i17;
        if (i17 == 0) {
            this.f557139b = "ok";
        } else if (i17 != 2) {
            this.f557139b = "errmsg not specified";
        } else {
            this.f557139b = "device not support soter";
        }
    }
}
