package yx;

/* loaded from: classes3.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f548626d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(android.content.Context context) {
        super(1);
        this.f548626d = context;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        if (!((java.lang.Boolean) obj).booleanValue()) {
            android.content.Context context = this.f548626d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf b17 = ly.g.b(context);
            if ((b17 == null || z2.h.b(b17, "android.permission.RECORD_AUDIO")) ? false : true) {
                int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
                e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.f575382pc3);
                e4Var.c();
            } else {
                int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
                e4Var2.d(com.p314xaae8f345.mm.R.C30867xcad56011.nxn);
                e4Var2.c();
            }
        }
        return jz5.f0.f384359a;
    }
}
