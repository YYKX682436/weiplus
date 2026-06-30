package ak1;

/* loaded from: classes4.dex */
public abstract class f {
    public static final com.tencent.mm.ui.MMActivity a(com.tencent.mm.ui.MMFragment mMFragment) {
        kotlin.jvm.internal.o.g(mMFragment, "<this>");
        androidx.fragment.app.FragmentActivity thisActivity = mMFragment.thisActivity();
        if (thisActivity instanceof com.tencent.mm.ui.MMActivity) {
            return (com.tencent.mm.ui.MMActivity) thisActivity;
        }
        return null;
    }

    public static final jz5.f0 b(com.tencent.mm.ui.MMFragment mMFragment) {
        kotlin.jvm.internal.o.g(mMFragment, "<this>");
        com.tencent.mm.ui.MMActivity a17 = a(mMFragment);
        if (a17 == null) {
            return null;
        }
        a17.hideActionbarLine();
        return jz5.f0.f302826a;
    }

    public static final void c(android.content.Intent intent, java.lang.Class clazz) {
        kotlin.jvm.internal.o.g(intent, "<this>");
        kotlin.jvm.internal.o.g(clazz, "clazz");
        java.lang.String name = clazz.getName();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Privacy.MMFragmentExt", "putMMFragment, className: ".concat(name));
        intent.putExtra("MMFragment_ClassName", name);
    }

    public static final android.content.Context d(com.tencent.mm.ui.MMFragment mMFragment) {
        kotlin.jvm.internal.o.g(mMFragment, "<this>");
        com.tencent.mm.ui.MMActivity a17 = a(mMFragment);
        if (a17 != null) {
            return a17;
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return context;
    }

    public static final void e(com.tencent.mm.ui.MMFragment mMFragment, int i17) {
        ul5.k bounceView;
        kotlin.jvm.internal.o.g(mMFragment, "<this>");
        com.tencent.mm.ui.MMActivity a17 = a(mMFragment);
        if (a17 != null) {
            a17.setActionbarColor(i17);
            if (-1 != mMFragment.getCustomBounceId() || (bounceView = mMFragment.getBounceView()) == null) {
                return;
            }
            bounceView.setStart2EndBgColorByActionBar(i17);
        }
    }

    public static final void f(com.tencent.mm.ui.MMFragment mMFragment, int i17) {
        ul5.k bounceView;
        kotlin.jvm.internal.o.g(mMFragment, "<this>");
        com.tencent.mm.ui.MMActivity a17 = a(mMFragment);
        if (a17 != null) {
            a17.setNavigationbarColor(i17);
            if (-1 != mMFragment.getCustomBounceId() || (bounceView = mMFragment.getBounceView()) == null) {
                return;
            }
            bounceView.setEnd2StartBgColorByNavigationBar(i17);
        }
    }
}
