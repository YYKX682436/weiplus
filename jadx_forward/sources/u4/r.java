package u4;

/* loaded from: classes13.dex */
public class r extends u4.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f506073d;

    /* renamed from: e, reason: collision with root package name */
    public final u4.e0 f506074e;

    public r(android.view.View view, u4.e0 e0Var) {
        this.f506073d = view;
        this.f506074e = e0Var;
    }

    @Override // u4.d1, u4.b1
    public void a(p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 abstractC1183x100d4975) {
        this.f506074e.mo167508x901b6914(0);
    }

    @Override // u4.d1, u4.b1
    public void c(p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 abstractC1183x100d4975) {
        this.f506074e.mo167508x901b6914(4);
    }

    @Override // u4.b1
    public void d(p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 abstractC1183x100d4975) {
        abstractC1183x100d4975.E(this);
        if (!u4.d0.f505995g) {
            try {
                if (!u4.d0.f505991c) {
                    try {
                        u4.d0.f505990b = java.lang.Class.forName("android.view.GhostView");
                    } catch (java.lang.ClassNotFoundException unused) {
                    }
                    u4.d0.f505991c = true;
                }
                java.lang.reflect.Method declaredMethod = u4.d0.f505990b.getDeclaredMethod("removeGhost", android.view.View.class);
                u4.d0.f505994f = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (java.lang.NoSuchMethodException unused2) {
            }
            u4.d0.f505995g = true;
        }
        java.lang.reflect.Method method = u4.d0.f505994f;
        android.view.View view = this.f506073d;
        if (method != null) {
            try {
                method.invoke(null, view);
            } catch (java.lang.IllegalAccessException unused3) {
            } catch (java.lang.reflect.InvocationTargetException e17) {
                throw new java.lang.RuntimeException(e17.getCause());
            }
        }
        view.setTag(com.p314xaae8f345.mm.R.id.oj9, null);
        view.setTag(com.p314xaae8f345.mm.R.id.f567795kp3, null);
    }
}
