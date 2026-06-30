package l20;

/* loaded from: classes9.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f396688d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p735x75644e17.C10549x2172f2ce f396689e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(android.content.Context context, com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p735x75644e17.C10549x2172f2ce c10549x2172f2ce) {
        super(0);
        this.f396688d = context;
        this.f396689e = c10549x2172f2ce;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p738x373aa5.C10563x3e05669b m44357x64594042;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 m44355xc241696c;
        android.content.Context context = this.f396688d;
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        linearLayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p735x75644e17.C10549x2172f2ce c10549x2172f2ce = this.f396689e;
        m44357x64594042 = c10549x2172f2ce.m44357x64594042();
        linearLayout.addView(m44357x64594042);
        m44355xc241696c = c10549x2172f2ce.m44355xc241696c();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMarginStart(i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl));
        linearLayout.addView(m44355xc241696c, marginLayoutParams);
        return linearLayout;
    }
}
