package w82;

/* loaded from: classes10.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13619xdbaf3371 f525469d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13619xdbaf3371 c13619xdbaf3371) {
        super(1);
        this.f525469d = c13619xdbaf3371;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        yz5.l lVar;
        w82.l option = (w82.l) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(option, "option");
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13619xdbaf3371 c13619xdbaf3371 = this.f525469d;
        android.widget.TextView textView = c13619xdbaf3371.f183065h;
        if (textView != null) {
            textView.setText(option.f525440a);
        }
        c13619xdbaf3371.e(c13619xdbaf3371.f183067m, true);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13619xdbaf3371.b(c13619xdbaf3371, false, null, 3, null);
        w82.n nVar = option instanceof w82.n ? (w82.n) option : null;
        if (nVar != null && (lVar = c13619xdbaf3371.f183078x) != null) {
            lVar.mo146xb9724478(java.lang.Integer.valueOf(nVar.f525447c));
        }
        c13619xdbaf3371.m55392xc84f9537(kz5.n0.c0(c13619xdbaf3371.f183080z, option));
        return jz5.f0.f384359a;
    }
}
