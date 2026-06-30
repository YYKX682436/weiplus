package id2;

/* loaded from: classes3.dex */
public final class z3 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public int f372434d;

    /* renamed from: e, reason: collision with root package name */
    public int f372435e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f372436f;

    /* renamed from: g, reason: collision with root package name */
    public id2.v3 f372437g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.t f372438h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f372439i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f372440m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f372435e = 3;
        this.f372436f = true;
        this.f372438h = new id2.x3(this);
        this.f372439i = jz5.h.b(new id2.y3(activity));
        this.f372440m = jz5.h.b(new id2.w3(activity));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        int intExtra = m158359x1e885992().getIntExtra("ENTER_SCENE", 0);
        this.f372434d = intExtra;
        if (intExtra == 1) {
            id2.s5 s5Var = (id2.s5) ((jz5.n) this.f372439i).mo141623x754a37bb();
            ((id2.z3) ((jz5.n) s5Var.f372331d).mo141623x754a37bb()).f372435e = 9;
            ((id2.z3) ((jz5.n) s5Var.f372331d).mo141623x754a37bb()).f372437g = new id2.q5();
            return;
        }
        if (intExtra != 2) {
            return;
        }
        id2.l lVar = (id2.l) ((jz5.n) this.f372440m).mo141623x754a37bb();
        java.lang.String stringExtra = lVar.m158359x1e885992().getStringExtra("KEY_FROM_CHAT_ROOM_ID");
        if (stringExtra == null) {
            stringExtra = "";
        }
        lVar.f372183d = stringExtra;
        lVar.f372185f = lVar.m158359x1e885992().getBooleanExtra("KEY_WHITE_LIST_MODE_UNSELECT", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "init fromChatRoomId:" + lVar.f372183d);
        lVar.P6().f372435e = 3;
        lVar.P6().f372436f = false;
        id2.z3 P6 = lVar.P6();
        id2.i iVar = new id2.i(lVar);
        P6.getClass();
        P6.f372438h = iVar;
        lVar.P6().f372437g = new id2.j();
    }
}
