package xp1;

/* loaded from: classes12.dex */
public class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f537438d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f537439e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ae0.e f537440f;

    public m(android.content.Context context, int i17, java.lang.String str, ae0.e eVar) {
        this.f537438d = context;
        this.f537439e = str;
        this.f537440f = eVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/base/model/ShortcutUtil$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xp1.d.a(this.f537438d, false, 1, this.f537439e, this.f537440f);
        yj0.a.h(this, "com/tencent/mm/plugin/base/model/ShortcutUtil$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
