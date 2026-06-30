package qe5;

/* loaded from: classes.dex */
public final class r0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f443714d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f443715e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(java.util.List list, java.util.List list2) {
        super(2);
        this.f443714d = list;
        this.f443715e = list2;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        db5.g4 menu = (db5.g4) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        int i17 = 0;
        while (true) {
            java.util.List list = this.f443714d;
            if (i17 >= list.size()) {
                break;
            }
            java.util.List list2 = this.f443715e;
            if (i17 >= list2.size()) {
                break;
            }
            menu.g(((java.lang.Number) list2.get(i17)).intValue(), (java.lang.CharSequence) list.get(i17), com.p314xaae8f345.mm.R.raw.f79841xc8521962);
            i17++;
        }
        return jz5.f0.f384359a;
    }
}
