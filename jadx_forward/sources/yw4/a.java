package yw4;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f548480a;

    public a(java.lang.String str) {
        this.f548480a = str;
    }

    /* renamed from: equals */
    public boolean m177950xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yw4.a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f548480a, ((yw4.a) obj).f548480a);
    }

    /* renamed from: hashCode */
    public int m177951x8cdac1b() {
        java.lang.String str = this.f548480a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m177952x9616526c() {
        return "MpImgPreloadData(picLinkUseToLocalCache=" + this.f548480a + ')';
    }
}
