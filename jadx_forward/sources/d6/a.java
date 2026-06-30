package d6;

/* loaded from: classes10.dex */
public final class a implements d6.h {

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f308166c;

    public a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f308166c = context;
    }

    @Override // d6.h
    public java.lang.Object a(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        android.util.DisplayMetrics displayMetrics = this.f308166c.getResources().getDisplayMetrics();
        return new p135x2eae8f.p138x35e001.C1420x6f1c9387(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    /* renamed from: equals */
    public boolean m123536xb2c87fbf(java.lang.Object obj) {
        if (this != obj) {
            if (obj instanceof d6.a) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f308166c, ((d6.a) obj).f308166c)) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: hashCode */
    public int m123537x8cdac1b() {
        return this.f308166c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m123538x9616526c() {
        return "DisplaySizeResolver(context=" + this.f308166c + ')';
    }
}
