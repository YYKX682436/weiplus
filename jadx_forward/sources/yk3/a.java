package yk3;

/* loaded from: classes.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk3.h f544334d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(pk3.h hVar) {
        super(0);
        this.f544334d = hVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        pk3.h hVar = this.f544334d;
        android.view.View m80380x71e92c1d = hVar != null ? hVar.m80380x71e92c1d() : null;
        if (m80380x71e92c1d != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(m80380x71e92c1d, arrayList.toArray(), "com/tencent/mm/plugin/multitask/ui/panel/BaseMultiTaskPanel$hideUIComponent$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m80380x71e92c1d.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(m80380x71e92c1d, "com/tencent/mm/plugin/multitask/ui/panel/BaseMultiTaskPanel$hideUIComponent$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f384359a;
    }
}
