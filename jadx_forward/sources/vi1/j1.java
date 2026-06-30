package vi1;

/* loaded from: classes7.dex */
public final class j1 implements vi1.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f518877a;

    /* renamed from: b, reason: collision with root package name */
    public final vi1.d0 f518878b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f518879c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.p1177xd1075a44.C12545x36e72905 f518880d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2642x2e06d1.C21490xb2dd0b6b f518881e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f518882f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.Button f518883g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f518884h;

    public j1(android.content.Context mContext, vi1.d0 d0Var) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8;
        android.widget.EditText m78930xd454f3ba;
        android.widget.EditText m52279xd454f3ba;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mContext, "mContext");
        this.f518877a = mContext;
        this.f518878b = d0Var;
        android.view.View inflate = android.view.View.inflate(mContext, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569593fr, null);
        this.f518879c = inflate;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.p1177xd1075a44.C12545x36e72905 c12545x36e72905 = inflate != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.p1177xd1075a44.C12545x36e72905) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564715yv) : null;
        this.f518880d = c12545x36e72905;
        if (c12545x36e72905 != null && (m52279xd454f3ba = c12545x36e72905.m52279xd454f3ba()) != null) {
            m52279xd454f3ba.setTextColor(mContext.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0b));
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21490xb2dd0b6b c21490xb2dd0b6b = inflate != null ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21490xb2dd0b6b) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564717yx) : null;
        this.f518881e = c21490xb2dd0b6b;
        if (c21490xb2dd0b6b != null && (m78930xd454f3ba = c21490xb2dd0b6b.m78930xd454f3ba()) != null) {
            m78930xd454f3ba.setTextColor(mContext.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0b));
        }
        if (inflate == null || (viewOnClickListenerC22631x1cc07cc8 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564716yw)) == null) {
            viewOnClickListenerC22631x1cc07cc8 = null;
        } else {
            zk1.m.f554947l.a(viewOnClickListenerC22631x1cc07cc8, (r27 & 2) != 0 ? null : null, (r27 & 4) != 0 ? null : null, (r27 & 8) != 0 ? false : false, (r27 & 16) != 0 ? null : null, (r27 & 32) != 0 ? null : null, (r27 & 64) != 0 ? null : java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.f571559iv), (r27 & 128) != 0 ? null : null, (r27 & 256) != 0 ? null : null, (r27 & 512) != 0 ? null : null, (r27 & 1024) != 0 ? null : null, (r27 & 2048) != 0 ? null : null, (r27 & 4096) == 0 ? java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9) : null);
            java.lang.String string = mContext.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571834r6);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            java.lang.String string2 = mContext.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571836r8);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            viewOnClickListenerC22631x1cc07cc8.setContentDescription(viewOnClickListenerC22631x1cc07cc8.f292896x ? string : string2);
            viewOnClickListenerC22631x1cc07cc8.m81396xb3e0a10a(new vi1.e1(viewOnClickListenerC22631x1cc07cc8, string, string2));
        }
        this.f518882f = viewOnClickListenerC22631x1cc07cc8;
        android.widget.Button button = inflate != null ? (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564714yu) : null;
        this.f518883g = button;
        this.f518884h = vi1.o0.f518949a.b();
        if (c12545x36e72905 != null) {
            c12545x36e72905.m52286xc17f97e2(3);
        }
        if (c12545x36e72905 != null) {
            c12545x36e72905.m52287x3d4bc56f(new vi1.f1(this));
        }
        if (c12545x36e72905 != null) {
            vi1.g1 g1Var = new vi1.g1(this);
            android.widget.EditText editText = c12545x36e72905.f168943e;
            if (editText != null) {
                editText.addTextChangedListener(g1Var);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.MMFormVerifyCodeInputView", "watcher : %s, contentET : %s", g1Var, editText);
            }
        }
        if (c21490xb2dd0b6b != null) {
            c21490xb2dd0b6b.m78937xc17f97e2(3);
        }
        if (c21490xb2dd0b6b != null) {
            c21490xb2dd0b6b.a(new vi1.h1(this));
        }
        if (button != null) {
            button.setOnClickListener(new vi1.i1(this));
        }
    }
}
