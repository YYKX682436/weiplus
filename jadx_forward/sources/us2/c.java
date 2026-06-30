package us2;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final vt3.r f512007a;

    /* renamed from: b, reason: collision with root package name */
    public final vt3.p f512008b;

    public c(vt3.r tab, vt3.p templateItem, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        if ((i17 & 1) != 0) {
            us2.u uVar = us2.u.f512081a;
            tab = us2.u.f512082b;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tab, "tab");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateItem, "templateItem");
        this.f512007a = tab;
        this.f512008b = templateItem;
    }

    /* renamed from: equals */
    public boolean m170480xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof us2.c)) {
            return false;
        }
        us2.c cVar = (us2.c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f512007a, cVar.f512007a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f512008b, cVar.f512008b);
    }

    /* renamed from: hashCode */
    public int m170481x8cdac1b() {
        return (this.f512007a.hashCode() * 31) + this.f512008b.m172621x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m170482x9616526c() {
        return "OnlyPreviewData(tab=" + this.f512007a + ", templateItem=" + this.f512008b + ')';
    }
}
