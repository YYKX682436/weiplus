package zo1;

/* loaded from: classes.dex */
public final class v3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f556332d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(android.view.View view) {
        super(0);
        this.f556332d = view;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View view = this.f556332d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectContactUI$showSortPopWindow$2$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectContactUI$showSortPopWindow$2$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return jz5.f0.f384359a;
    }
}
