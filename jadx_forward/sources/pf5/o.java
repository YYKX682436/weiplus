package pf5;

/* loaded from: classes5.dex */
public abstract class o extends pf5.p {

    /* renamed from: Companion */
    public static final pf5.n f76420x233c02ec = new pf5.n(null);
    public static final java.lang.String TAG = "SimpleUIComponent";

    /* renamed from: activity */
    public p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f76421x9d4bf30f;

    /* renamed from: fragment */
    private p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f76422x9da2e250;

    public o(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        m158363x13de9191(activity);
    }

    public android.content.Intent N6() {
        return m158359x1e885992();
    }

    @Override // pf5.p
    /* renamed from: findViewByIdByActivity */
    public <T extends android.view.View> T mo158353x86de4d96(int i17) {
        return (T) m158354x19263085().findViewById(i17);
    }

    /* renamed from: getActivity */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f76421x9d4bf30f;
        if (activityC0065xcd7aa112 != null) {
            return activityC0065xcd7aa112;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
        throw null;
    }

    /* renamed from: getColor */
    public final int m158355x7444d5ad(int i17) {
        return m158361x893a2f6f().getColor(i17);
    }

    /* renamed from: getDimension */
    public final float m158357xbe28deb0(int i17) {
        return m158361x893a2f6f().getDimension(i17);
    }

    @Override // pf5.p
    /* renamed from: getFindViewIdRootView */
    public android.view.View mo47091x2c60d76() {
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = this.f76422x9da2e250;
        if (componentCallbacksC1101xa17d4670 == null || componentCallbacksC1101xa17d4670 == null) {
            return null;
        }
        return componentCallbacksC1101xa17d4670.m7474xfb86a31b();
    }

    /* renamed from: getFragment */
    public final p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6() {
        return this.f76422x9da2e250;
    }

    /* renamed from: getIntent */
    public final android.content.Intent m158359x1e885992() {
        android.content.Intent intent = m158354x19263085().getIntent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(intent, "getIntent(...)");
        return intent;
    }

    /* renamed from: getLifecycle */
    public final p012xc85e97e9.p093xedfae76a.o m158360xed6858b4() {
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = this.f76422x9da2e250;
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4 = componentCallbacksC1101xa17d4670 != null ? componentCallbacksC1101xa17d4670.mo273xed6858b4() : null;
        if (mo273xed6858b4 != null) {
            return mo273xed6858b4;
        }
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b42 = m158354x19263085().mo273xed6858b4();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo273xed6858b42, "getLifecycle(...)");
        return mo273xed6858b42;
    }

    /* renamed from: getResources */
    public final android.content.res.Resources m158361x893a2f6f() {
        android.content.res.Resources resources = m158354x19263085().getResources();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resources, "getResources(...)");
        return resources;
    }

    /* renamed from: getString */
    public final java.lang.String m158362x2fec8307(int i17) {
        java.lang.String string = m158361x893a2f6f().getString(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // pf5.e, p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        super.mo528x82b764cd();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onCleared] fragment=");
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = this.f76422x9da2e250;
        sb6.append(componentCallbacksC1101xa17d4670 != null ? componentCallbacksC1101xa17d4670.getClass().getName() : null);
        sb6.append(" activity=");
        sb6.append(m158354x19263085().getClass().getName());
        java.lang.String sb7 = sb6.toString();
        java.lang.Object[] objArr = new java.lang.Object[0];
        if (pf5.t.f435466a != null) {
            java.lang.Object[] obj = java.util.Arrays.copyOf(objArr, objArr.length);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, sb7, obj);
        }
    }

    /* renamed from: setActivity */
    public final void m158363x13de9191(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityC0065xcd7aa112, "<set-?>");
        this.f76421x9d4bf30f = activityC0065xcd7aa112;
    }

    /* renamed from: setFragment */
    public final void m158364x143580d2(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        this.f76422x9da2e250 = componentCallbacksC1101xa17d4670;
    }

    /* renamed from: toString */
    public java.lang.String m158365x9616526c() {
        return getClass().getName() + '@' + hashCode();
    }

    /* renamed from: getColor */
    public final int m158356x7444d5ad(int i17, android.content.res.Resources.Theme theme) {
        return m158361x893a2f6f().getColor(i17, theme);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "fragment"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r0)
            androidx.fragment.app.FragmentActivity r0 = r3.mo7430x19263085()
            java.lang.String r1 = "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r0, r1)
            androidx.appcompat.app.AppCompatActivity r0 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) r0
            r2.<init>(r0)
            r2.f76422x9da2e250 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pf5.o.<init>(androidx.fragment.app.Fragment):void");
    }

    public o() {
    }
}
