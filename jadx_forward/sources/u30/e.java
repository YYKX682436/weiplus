package u30;

@j95.b
/* loaded from: classes4.dex */
public final class e extends i95.w implements v30.e {
    public void wi(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recycleView, java.lang.String sessionPageName) {
        java.lang.ref.WeakReference weakReference;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recycleView, "recycleView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionPageName, "sessionPageName");
        e62.q a17 = e62.q.a();
        a17.getClass();
        if (sessionPageName.isEmpty() && (weakReference = a17.f331341f) != null && weakReference.get() != null) {
            sessionPageName = ((android.app.Activity) a17.f331341f.get()).getClass().getName();
        }
        e62.j b17 = a17.b(sessionPageName);
        if (b17 != null) {
            recycleView.i(b17);
        }
    }
}
