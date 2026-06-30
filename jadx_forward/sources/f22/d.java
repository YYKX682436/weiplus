package f22;

/* loaded from: classes13.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f340497d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f340498e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var, yz5.l lVar) {
        super(1);
        this.f340497d = f4Var;
        this.f340498e = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.v75 v75Var = (r45.v75) obj;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var = this.f340497d;
        if (f4Var != null) {
            f4Var.hide();
        }
        this.f340498e.mo146xb9724478(v75Var);
        return jz5.f0.f384359a;
    }
}
