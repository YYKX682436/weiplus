package ch5;

/* loaded from: classes11.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f123166d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22419xb3ed8ff2 f123167e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 f123168f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22419xb3ed8ff2 c22419xb3ed8ff2, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37) {
        super(0);
        this.f123166d = c0Var;
        this.f123167e = c22419xb3ed8ff2;
        this.f123168f = abstractActivityC22579xbed01a37;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f123166d;
        if (c0Var.f391645d) {
            c0Var.f391645d = false;
            com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22418xd23ce184 c22418xd23ce184 = this.f123167e.Q;
            if (c22418xd23ce184 != null) {
                c22418xd23ce184.b(0.0f, 0.2f, new ch5.w(this.f123168f));
            }
        }
        return java.lang.Boolean.TRUE;
    }
}
