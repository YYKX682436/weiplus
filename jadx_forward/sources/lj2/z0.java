package lj2;

/* loaded from: classes8.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f400501a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f400502b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f400503c;

    public z0(android.view.View view, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352, android.widget.TextView textView) {
        this.f400501a = view;
        this.f400502b = c22699x3dcdb352;
        this.f400503c = textView;
    }

    /* renamed from: equals */
    public boolean m145865xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lj2.z0)) {
            return false;
        }
        lj2.z0 z0Var = (lj2.z0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f400501a, z0Var.f400501a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f400502b, z0Var.f400502b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f400503c, z0Var.f400503c);
    }

    /* renamed from: hashCode */
    public int m145866x8cdac1b() {
        android.view.View view = this.f400501a;
        int hashCode = (view == null ? 0 : view.hashCode()) * 31;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f400502b;
        int hashCode2 = (hashCode + (c22699x3dcdb352 == null ? 0 : c22699x3dcdb352.hashCode())) * 31;
        android.widget.TextView textView = this.f400503c;
        return hashCode2 + (textView != null ? textView.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m145867x9616526c() {
        return "MicModeViewGroup(layout=" + this.f400501a + ", icon=" + this.f400502b + ", text=" + this.f400503c + ')';
    }
}
