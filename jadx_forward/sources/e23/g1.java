package e23;

/* loaded from: classes12.dex */
public class g1 extends u13.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.h1 f328391b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(e23.h1 h1Var) {
        super(h1Var);
        this.f328391b = h1Var;
    }

    @Override // u13.f
    public void b(android.content.Context context, u13.e eVar, u13.g gVar, java.lang.Object... objArr) {
        e23.h1 h1Var = (e23.h1) gVar;
        e23.f1 f1Var = (e23.f1) eVar;
        android.view.View view = f1Var.f328383d;
        e23.h1 h1Var2 = this.f328391b;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.j(view, h1Var2.f505294d);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(f1Var.f328380a, h1Var.f328396r);
        android.widget.TextView textView = f1Var.f328381b;
        p13.i b17 = p13.i.b(h1Var.f328397s, h1Var2.f505295e);
        b17.f432633h = textView.getPaint();
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(o13.q.e(b17).f432638a, f1Var.f328381b);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.b(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.idv, java.lang.Integer.valueOf(h1Var.f328398t)), f1Var.f328382c);
    }

    @Override // u13.f
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570659bd5, viewGroup, false);
        e23.f1 f1Var = this.f328391b.f328400v;
        f1Var.f328380a = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a_4);
        f1Var.f328381b = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kbq);
        f1Var.f328382c = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f567525jt4);
        f1Var.f328383d = inflate.findViewById(com.p314xaae8f345.mm.R.id.jt6);
        inflate.setTag(f1Var);
        return inflate;
    }

    @Override // u13.f
    public boolean d(android.content.Context context, android.view.View view, u13.g gVar, java.lang.Object... objArr) {
        android.content.Intent intent = new android.content.Intent();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        intent.putExtra("Chat_User", "notifymessage");
        intent.putExtra("key_notify_message_real_username", ((e23.h1) gVar).f328396r);
        intent.putExtra("finish_direct", true);
        intent.putExtra("chat_from_scene", 6);
        j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
        return true;
    }
}
