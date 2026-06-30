package n14;

/* loaded from: classes.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f415676d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String str) {
        super(1);
        this.f415676d = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2079xd1075a44.C17657x77c04133 c17657x77c04133 = it instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2079xd1075a44.C17657x77c04133 ? (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2079xd1075a44.C17657x77c04133) it : null;
        if (c17657x77c04133 == null) {
            return "";
        }
        java.lang.String format = java.lang.String.format(this.f415676d, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(c17657x77c04133.m69109xd52b6b3b() + 1)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        return format;
    }
}
