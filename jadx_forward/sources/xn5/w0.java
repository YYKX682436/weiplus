package xn5;

/* loaded from: classes13.dex */
public final class w0 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateBefore */
    public void mo2277xb2f1ab1a(android.os.Bundle bundle) {
        super.mo2277xb2f1ab1a(bundle);
        if (xn5.q0.f537235a.b().a() != null) {
            try {
                if (xn5.q1.f537248c == null) {
                    java.lang.reflect.Field declaredField = android.view.View.class.getDeclaredField("mContext");
                    xn5.q1.f537248c = declaredField;
                    if (declaredField != null) {
                        declaredField.setAccessible(true);
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.X2C.X2CViewCreator", e17, "prepareReflect", new java.lang.Object[0]);
            }
            if (xn5.q1.f537248c != null) {
                ((ku5.t0) ku5.t0.f394148d).d(xn5.n1.f537230d, 0L, 300000L);
            }
        }
    }
}
