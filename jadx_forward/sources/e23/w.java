package e23;

/* loaded from: classes12.dex */
public class w extends u13.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.x f328507b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(e23.x xVar, e23.u uVar) {
        super(xVar);
        this.f328507b = xVar;
    }

    @Override // u13.f
    public void b(android.content.Context context, u13.e eVar, u13.g gVar, java.lang.Object... objArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(this.f328507b.f328517q, ((e23.v) eVar).f328503a);
    }

    @Override // u13.f
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570648bc0, viewGroup, false);
        e23.v vVar = this.f328507b.f328519s;
        vVar.f328503a = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.cut);
        inflate.setTag(vVar);
        return inflate;
    }

    @Override // u13.f
    public boolean d(android.content.Context context, android.view.View view, u13.g gVar, java.lang.Object... objArr) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("query_phrase_list", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(this.f328507b.f505295e.f432664c));
        intent.putExtra("go_to_chatroom_direct", true);
        intent.putExtra("scene_from", 3);
        j45.l.u(context, ".ui.transmit.MMCreateChatroomUI", intent, null);
        return true;
    }
}
