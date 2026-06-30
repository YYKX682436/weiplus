package og3;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d f426694a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f426695b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Bundle f426696c;

    public e(com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d videoParams, java.util.ArrayList outputs, android.os.Bundle bundle, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        bundle = (i17 & 4) != 0 ? null : bundle;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoParams, "videoParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outputs, "outputs");
        this.f426694a = videoParams;
        this.f426695b = outputs;
        this.f426696c = bundle;
    }

    public final java.lang.String a() {
        java.lang.Object obj;
        java.util.Iterator it = this.f426695b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16506x8e746ffa) obj).f230142d == og3.a.f426690f) {
                break;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16506x8e746ffa c16506x8e746ffa = (com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16506x8e746ffa) obj;
        if (c16506x8e746ffa != null) {
            return c16506x8e746ffa.f230143e;
        }
        return null;
    }

    public final java.lang.String b() {
        java.lang.Object obj;
        java.util.Iterator it = this.f426695b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16506x8e746ffa) obj).f230142d == og3.a.f426688d) {
                break;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16506x8e746ffa c16506x8e746ffa = (com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16506x8e746ffa) obj;
        if (c16506x8e746ffa != null) {
            return c16506x8e746ffa.f230143e;
        }
        return null;
    }

    /* renamed from: equals */
    public boolean m151259xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof og3.e)) {
            return false;
        }
        og3.e eVar = (og3.e) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f426694a, eVar.f426694a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f426695b, eVar.f426695b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f426696c, eVar.f426696c);
    }

    /* renamed from: hashCode */
    public int m151260x8cdac1b() {
        int hashCode = ((this.f426694a.hashCode() * 31) + this.f426695b.hashCode()) * 31;
        android.os.Bundle bundle = this.f426696c;
        return hashCode + (bundle == null ? 0 : bundle.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m151261x9616526c() {
        return "MediaOutputInfo(videoParams=" + this.f426694a + ", outputs=" + this.f426695b + ", extra=" + this.f426696c + ')';
    }
}
