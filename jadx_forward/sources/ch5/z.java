package ch5;

/* loaded from: classes11.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ am.bu f123172d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22419xb3ed8ff2 f123173e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(am.bu buVar, com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22419xb3ed8ff2 c22419xb3ed8ff2) {
        super(0);
        this.f123172d = buVar;
        this.f123173e = c22419xb3ed8ff2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37;
        if (this.f123172d.f87819b < 0.05d && (abstractActivityC22579xbed01a37 = this.f123173e.P) != null) {
            abstractActivityC22579xbed01a37.finish();
        }
        return jz5.f0.f384359a;
    }
}
