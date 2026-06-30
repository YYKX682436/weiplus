package du0;

/* loaded from: classes.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f324875d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f324876e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, yz5.l lVar) {
        super(1);
        this.f324875d = u3Var;
        this.f324876e = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p949xdb1a5788.C11121x1f1011 c11121x1f1011 = (com.p314xaae8f345.mm.p949xdb1a5788.C11121x1f1011) obj;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f324875d;
        if (u3Var.isShowing()) {
            u3Var.dismiss();
        }
        this.f324876e.mo146xb9724478(c11121x1f1011);
        return jz5.f0.f384359a;
    }
}
