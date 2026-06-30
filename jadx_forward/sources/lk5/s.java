package lk5;

/* loaded from: classes14.dex */
public abstract class s {
    public static final android.view.ViewGroup a(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "<this>");
        if (activity instanceof com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37) {
            com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = (com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37) activity;
            if (abstractActivityC22579xbed01a37.m81213xdb83fd8c()) {
                android.view.View w17 = abstractActivityC22579xbed01a37.mo78514x143f1b92().w();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(w17, "null cannot be cast to non-null type android.view.ViewGroup");
                return (android.view.ViewGroup) w17;
            }
        }
        android.view.View findViewById = activity.findViewById(android.R.id.content);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById);
        return (android.view.ViewGroup) findViewById;
    }

    public static final boolean b(android.content.Context context) {
        android.content.Intent intent;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity == null || (intent = activity.getIntent()) == null) {
            return false;
        }
        return c(intent);
    }

    public static final boolean c(android.content.Intent intent) {
        if (intent != null) {
            return intent.getBooleanExtra(com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37.f39701x5f6db9dd, false);
        }
        return false;
    }

    public static final boolean d(android.content.Intent intent, int i17) {
        nk5.c cVar;
        java.lang.String str;
        nk5.c cVar2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "<this>");
        lk5.f fVar = com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37.f39695x233c02ec;
        fVar.getClass();
        cVar = com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37.f39716x5a4134e4;
        if (!cVar.e()) {
            return false;
        }
        if ((i17 & intent.getIntExtra(com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37.f39705x8cb7317, 3)) == 0) {
            return false;
        }
        android.content.ComponentName component = intent.getComponent();
        if (component == null || (str = component.getClassName()) == null) {
            str = "";
        }
        if (!(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, com.p314xaae8f345.mm.ui.vas.ActivityC22583xa926a22c.class.getName()) ? true : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, com.p314xaae8f345.mm.ui.vas.ActivityC22582xf7828f42.class.getName())) && intent.getBooleanExtra(com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37.f39696xc4f25f48, false)) {
            return true;
        }
        fVar.getClass();
        cVar2 = com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37.f39716x5a4134e4;
        if (!cVar2.d(str)) {
            return false;
        }
        for (java.lang.Class<?> cls = java.lang.Class.forName(str); cls.getSuperclass() != null; cls = cls.getSuperclass()) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls.getSuperclass(), com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37.class)) {
                return true;
            }
        }
        return false;
    }

    public static final android.content.Intent e(android.content.Intent intent, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "<this>");
        intent.putExtra(com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37.f39696xc4f25f48, z17);
        return intent;
    }
}
