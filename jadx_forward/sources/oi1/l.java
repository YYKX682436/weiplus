package oi1;

/* loaded from: classes7.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f427136a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f427137b;

    public l(java.lang.String dialogContent, java.util.List sceneInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dialogContent, "dialogContent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sceneInfo, "sceneInfo");
        this.f427136a = dialogContent;
        this.f427137b = sceneInfo;
    }

    public final boolean a(java.lang.String scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        for (oi1.m mVar : this.f427137b) {
            if (android.text.TextUtils.equals(mVar.f427139b, scene) && mVar.f427138a) {
                return true;
            }
        }
        return false;
    }
}
