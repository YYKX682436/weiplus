package zl2;

/* loaded from: classes.dex */
public final class r3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f555481d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f555482e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(boolean z17, android.content.Context context) {
        super(0);
        this.f555481d = z17;
        this.f555482e = context;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var;
        if (this.f555481d) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = zl2.r4.f555490h;
            if (u3Var2 == null) {
                android.content.Context context = this.f555482e;
                zl2.r4.f555490h = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(context, i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.f9y), false, 2, null);
            } else {
                if ((u3Var2.isShowing() ? false : true) && (u3Var = zl2.r4.f555490h) != null) {
                    u3Var.show();
                }
            }
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var3 = zl2.r4.f555490h;
            if (u3Var3 != null) {
                u3Var3.dismiss();
            }
            zl2.r4.f555490h = null;
        }
        return jz5.f0.f384359a;
    }
}
