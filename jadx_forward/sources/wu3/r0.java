package wu3;

/* loaded from: classes10.dex */
public final class r0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17042xf8121282 f531334d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17042xf8121282 c17042xf8121282) {
        super(1);
        this.f531334d = c17042xf8121282;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17042xf8121282 c17042xf8121282 = this.f531334d;
        c17042xf8121282.C = it;
        boolean z17 = it.length() > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17049x96919289 c17049x96919289 = c17042xf8121282.f237533o;
        if (!z17) {
            c17049x96919289.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
        } else if (com.p314xaae8f345.mm.vfs.w6.j(it)) {
            c17049x96919289.setTypeface(android.graphics.Typeface.createFromFile(it));
        } else {
            c17049x96919289.setTypeface(android.graphics.Typeface.DEFAULT);
        }
        return jz5.f0.f384359a;
    }
}
