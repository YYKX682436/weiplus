package androidx.preference;

/* loaded from: classes13.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public int f11843a;

    /* renamed from: b, reason: collision with root package name */
    public int f11844b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f11845c;

    public w(androidx.preference.w wVar) {
        this.f11843a = wVar.f11843a;
        this.f11844b = wVar.f11844b;
        this.f11845c = wVar.f11845c;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof androidx.preference.w)) {
            return false;
        }
        androidx.preference.w wVar = (androidx.preference.w) obj;
        return this.f11843a == wVar.f11843a && this.f11844b == wVar.f11844b && android.text.TextUtils.equals(this.f11845c, wVar.f11845c);
    }

    public int hashCode() {
        return ((((com.tencent.mm.plugin.appbrand.jsapi.v5.CTRL_INDEX + this.f11843a) * 31) + this.f11844b) * 31) + this.f11845c.hashCode();
    }
}
