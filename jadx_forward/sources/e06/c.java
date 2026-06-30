package e06;

/* loaded from: classes13.dex */
public final class c extends e06.a implements e06.h {
    static {
        new e06.c((char) 1, (char) 0);
    }

    public c(char c17, char c18) {
        super(c17, c18, 1);
    }

    @Override // e06.h
    public boolean e(java.lang.Comparable comparable) {
        char charValue = ((java.lang.Character) comparable).charValue();
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.i(this.f327731d, charValue) <= 0 && p3321xbce91901.jvm.p3324x21ffc6bd.o.i(charValue, this.f327732e) <= 0;
    }

    /* renamed from: equals */
    public boolean m126613xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof e06.c) {
            if (!mo126615x7aab3243() || !((e06.c) obj).mo126615x7aab3243()) {
                e06.c cVar = (e06.c) obj;
                if (this.f327731d == cVar.f327731d) {
                    if (this.f327732e == cVar.f327732e) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // e06.h
    public java.lang.Comparable g() {
        return java.lang.Character.valueOf(this.f327732e);
    }

    @Override // e06.h
    public java.lang.Comparable h() {
        return java.lang.Character.valueOf(this.f327731d);
    }

    /* renamed from: hashCode */
    public int m126614x8cdac1b() {
        if (mo126615x7aab3243()) {
            return -1;
        }
        return (this.f327731d * 31) + this.f327732e;
    }

    @Override // e06.h
    /* renamed from: isEmpty */
    public boolean mo126615x7aab3243() {
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.i(this.f327731d, this.f327732e) > 0;
    }

    /* renamed from: toString */
    public java.lang.String m126616x9616526c() {
        return this.f327731d + ".." + this.f327732e;
    }
}
