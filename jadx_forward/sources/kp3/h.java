package kp3;

/* loaded from: classes14.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f392525a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.ImageDataResult f392526b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.ImageDataResult f392527c;

    public h(java.lang.String str, com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.ImageDataResult imageDataResult, com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.ImageDataResult imageDataResult2) {
        this.f392525a = str;
        this.f392526b = imageDataResult;
        this.f392527c = imageDataResult2;
    }

    /* renamed from: equals */
    public boolean m144164xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kp3.h)) {
            return false;
        }
        kp3.h hVar = (kp3.h) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f392525a, hVar.f392525a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f392526b, hVar.f392526b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f392527c, hVar.f392527c);
    }

    /* renamed from: hashCode */
    public int m144165x8cdac1b() {
        java.lang.String str = this.f392525a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.ImageDataResult imageDataResult = this.f392526b;
        int hashCode2 = (hashCode + (imageDataResult == null ? 0 : imageDataResult.hashCode())) * 31;
        com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.ImageDataResult imageDataResult2 = this.f392527c;
        return hashCode2 + (imageDataResult2 != null ? imageDataResult2.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m144166x9616526c() {
        return "YTRegisterResult(jsonResult=" + this.f392525a + ", registerImg=" + this.f392526b + ", liveNessImg=" + this.f392527c + ')';
    }
}
