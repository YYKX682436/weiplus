package dz0;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Boolean f326406a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Boolean f326407b;

    public i(java.lang.Boolean bool, java.lang.Boolean bool2, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        bool = (i17 & 1) != 0 ? null : bool;
        bool2 = (i17 & 2) != 0 ? null : bool2;
        this.f326406a = bool;
        this.f326407b = bool2;
    }

    /* renamed from: equals */
    public boolean m126471xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz0.i)) {
            return false;
        }
        dz0.i iVar = (dz0.i) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f326406a, iVar.f326406a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f326407b, iVar.f326407b);
    }

    /* renamed from: hashCode */
    public int m126472x8cdac1b() {
        java.lang.Boolean bool = this.f326406a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        java.lang.Boolean bool2 = this.f326407b;
        return hashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m126473x9616526c() {
        return "MusicPickerSwitchOption(musicMuted=" + this.f326406a + ", originMuted=" + this.f326407b + ')';
    }
}
