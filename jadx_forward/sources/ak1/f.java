package ak1;

/* loaded from: classes4.dex */
public abstract class f {
    public static final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf a(com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(abstractViewOnAttachStateChangeListenerC21400xb429b010, "<this>");
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo78409x676b27cd = abstractViewOnAttachStateChangeListenerC21400xb429b010.mo78409x676b27cd();
        if (mo78409x676b27cd instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            return (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) mo78409x676b27cd;
        }
        return null;
    }

    public static final jz5.f0 b(com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(abstractViewOnAttachStateChangeListenerC21400xb429b010, "<this>");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf a17 = a(abstractViewOnAttachStateChangeListenerC21400xb429b010);
        if (a17 == null) {
            return null;
        }
        a17.mo78530x8b45058f();
        return jz5.f0.f384359a;
    }

    public static final void c(android.content.Intent intent, java.lang.Class clazz) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clazz, "clazz");
        java.lang.String name = clazz.getName();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Privacy.MMFragmentExt", "putMMFragment, className: ".concat(name));
        intent.putExtra("MMFragment_ClassName", name);
    }

    public static final android.content.Context d(com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(abstractViewOnAttachStateChangeListenerC21400xb429b010, "<this>");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf a17 = a(abstractViewOnAttachStateChangeListenerC21400xb429b010);
        if (a17 != null) {
            return a17;
        }
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        return context;
    }

    public static final void e(com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010, int i17) {
        ul5.k m78645x9f88d943;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(abstractViewOnAttachStateChangeListenerC21400xb429b010, "<this>");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf a17 = a(abstractViewOnAttachStateChangeListenerC21400xb429b010);
        if (a17 != null) {
            a17.mo64405x4dab7448(i17);
            if (-1 != abstractViewOnAttachStateChangeListenerC21400xb429b010.mo78648xc86d394a() || (m78645x9f88d943 = abstractViewOnAttachStateChangeListenerC21400xb429b010.m78645x9f88d943()) == null) {
                return;
            }
            m78645x9f88d943.mo82174x3b2a1eb1(i17);
        }
    }

    public static final void f(com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010, int i17) {
        ul5.k m78645x9f88d943;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(abstractViewOnAttachStateChangeListenerC21400xb429b010, "<this>");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf a17 = a(abstractViewOnAttachStateChangeListenerC21400xb429b010);
        if (a17 != null) {
            a17.mo78578x8b18f126(i17);
            if (-1 != abstractViewOnAttachStateChangeListenerC21400xb429b010.mo78648xc86d394a() || (m78645x9f88d943 = abstractViewOnAttachStateChangeListenerC21400xb429b010.m78645x9f88d943()) == null) {
                return;
            }
            m78645x9f88d943.mo82166x35ae8153(i17);
        }
    }
}
