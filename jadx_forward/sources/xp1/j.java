package xp1;

/* loaded from: classes12.dex */
public class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f537423d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f537424e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ae0.e f537425f;

    public j(android.content.Context context, int i17, java.lang.String str, ae0.e eVar) {
        this.f537423d = context;
        this.f537424e = str;
        this.f537425f = eVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/base/model/ShortcutUtil$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xp1.d.a(this.f537423d, false, 2, this.f537424e, this.f537425f);
        yj0.a.h(this, "com/tencent/mm/plugin/base/model/ShortcutUtil$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
