package p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\tJ\u001d\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\tJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0002¨\u0006\u0011"}, d2 = {"Landroidx/window/layout/ExtensionsWindowLayoutInfoAdapter;", "", "()V", "translate", "Landroidx/window/layout/FoldingFeature;", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100, "Landroid/app/Activity;", "oemFeature", "Landroidx/window/extensions/layout/FoldingFeature;", "translate$window_release", "Landroidx/window/layout/WindowLayoutInfo;", "info", "Landroidx/window/extensions/layout/WindowLayoutInfo;", "validBounds", "", "bounds", "Landroidx/window/core/Bounds;", "window_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: androidx.window.layout.ExtensionsWindowLayoutInfoAdapter */
/* loaded from: classes13.dex */
public final class C1235x8e231c53 {

    /* renamed from: INSTANCE */
    public static final p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1235x8e231c53 f3871x4fbc8495 = new p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1235x8e231c53();

    private C1235x8e231c53() {
    }

    /* renamed from: validBounds */
    private final boolean m8546x7a5a85d1(android.app.Activity activity, p012xc85e97e9.p117xd10bdbf0.p118x2eaf9f.C1195x76f2e2d5 bounds) {
        android.graphics.Rect m8638x12a519ab = p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1255x3accddd7.f3941x4fbc8495.mo8645x297b8891(activity).m8638x12a519ab();
        if (bounds.m8366xb9abdaf2()) {
            return false;
        }
        if (bounds.m8363x755bd410() != m8638x12a519ab.width() && bounds.m8359x1c4fb41d() != m8638x12a519ab.height()) {
            return false;
        }
        if (bounds.m8363x755bd410() >= m8638x12a519ab.width() || bounds.m8359x1c4fb41d() >= m8638x12a519ab.height()) {
            return (bounds.m8363x755bd410() == m8638x12a519ab.width() && bounds.m8359x1c4fb41d() == m8638x12a519ab.height()) ? false : true;
        }
        return false;
    }

    /* renamed from: translate$window_release */
    public final p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1236x71b7c395 m8547x72534ce(android.app.Activity activity, androidx.window.extensions.layout.FoldingFeature oemFeature) {
        p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1237x609bdf9d.Type m8569xfb7ef857;
        p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1236x71b7c395.State state;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oemFeature, "oemFeature");
        int type = oemFeature.getType();
        if (type == 1) {
            m8569xfb7ef857 = p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1237x609bdf9d.Type.INSTANCE.m8569xfb7ef857();
        } else {
            if (type != 2) {
                return null;
            }
            m8569xfb7ef857 = p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1237x609bdf9d.Type.INSTANCE.m8570x74798f75();
        }
        int state2 = oemFeature.getState();
        if (state2 == 1) {
            state = p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1236x71b7c395.State.f3881x20f779;
        } else {
            if (state2 != 2) {
                return null;
            }
            state = p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1236x71b7c395.State.f3882x7fa1f1f5;
        }
        android.graphics.Rect bounds = oemFeature.getBounds();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bounds, "oemFeature.bounds");
        if (!m8546x7a5a85d1(activity, new p012xc85e97e9.p117xd10bdbf0.p118x2eaf9f.C1195x76f2e2d5(bounds))) {
            return null;
        }
        android.graphics.Rect bounds2 = oemFeature.getBounds();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bounds2, "oemFeature.bounds");
        return new p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1237x609bdf9d(new p012xc85e97e9.p117xd10bdbf0.p118x2eaf9f.C1195x76f2e2d5(bounds2), m8569xfb7ef857, state);
    }

    /* renamed from: translate$window_release */
    public final p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1249xd38bff28 m8548x72534ce(android.app.Activity activity, androidx.window.extensions.layout.WindowLayoutInfo info) {
        p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1236x71b7c395 interfaceC1236x71b7c395;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        java.util.List<androidx.window.extensions.layout.FoldingFeature> displayFeatures = info.getDisplayFeatures();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(displayFeatures, "info.displayFeatures");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (androidx.window.extensions.layout.FoldingFeature feature : displayFeatures) {
            if (feature instanceof androidx.window.extensions.layout.FoldingFeature) {
                p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1235x8e231c53 c1235x8e231c53 = f3871x4fbc8495;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(feature, "feature");
                interfaceC1236x71b7c395 = c1235x8e231c53.m8547x72534ce(activity, feature);
            } else {
                interfaceC1236x71b7c395 = null;
            }
            if (interfaceC1236x71b7c395 != null) {
                arrayList.add(interfaceC1236x71b7c395);
            }
        }
        return new p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1249xd38bff28(arrayList);
    }
}
