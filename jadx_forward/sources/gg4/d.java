package gg4;

/* loaded from: classes.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg4.i f353275d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(gg4.i iVar) {
        super(0);
        this.f353275d = iVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        gg4.i iVar = this.f353275d;
        ((cy1.a) rVar).Ej("view_clk", kz5.c1.k(new jz5.l("key_report_session_id", iVar.O6()), new jz5.l("view_id", "friends_add_button")), 33926);
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.Mj(iVar.m158354x19263085());
        cy1.a aVar2 = (cy1.a) aVar.ak(iVar.m158354x19263085(), iy1.c.AddFriendsPage);
        aVar2.dk(iVar.m158354x19263085(), "AddFriendsPage");
        aVar2.fk(iVar.m158354x19263085(), "add_friends_sessionid", iVar.O6());
        aVar2.Wj(iVar.m158354x19263085(), "page_in", "", "");
        aVar2.ik(iVar.m158354x19263085(), 4, 33926);
        return jz5.f0.f384359a;
    }
}
