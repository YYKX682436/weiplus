package ru0;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f481188a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f481189b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f481190c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p479x4179489f.C4173x35b021c8 f481191d;

    public b(java.lang.String str, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.p457x3304c6.p479x4179489f.C4173x35b021c8 c4173x35b021c8) {
        this.f481188a = str;
        this.f481189b = str2;
        this.f481190c = str3;
        this.f481191d = c4173x35b021c8;
    }

    /* renamed from: equals */
    public boolean m163009xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru0.b)) {
            return false;
        }
        ru0.b bVar = (ru0.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f481188a, bVar.f481188a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f481189b, bVar.f481189b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f481190c, bVar.f481190c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f481191d, bVar.f481191d);
    }

    /* renamed from: hashCode */
    public int m163010x8cdac1b() {
        java.lang.String str = this.f481188a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f481189b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f481190c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4173x35b021c8 c4173x35b021c8 = this.f481191d;
        return hashCode3 + (c4173x35b021c8 != null ? c4173x35b021c8.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m163011x9616526c() {
        return "MJAudioResult(recordId=" + this.f481188a + ", audioFilePath=" + this.f481189b + ", silkFilePath=" + this.f481190c + ", boostParams=" + this.f481191d + ')';
    }
}
