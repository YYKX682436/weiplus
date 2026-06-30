package cw1;

/* loaded from: classes3.dex */
public final class b2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f304343d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw1.o0 f304344e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13111x890e232d f304345f;

    public b2(android.widget.Button button, cw1.o0 o0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13111x890e232d activityC13111x890e232d) {
        this.f304343d = button;
        this.f304344e = o0Var;
        this.f304345f = activityC13111x890e232d;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheUI$initUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f304344e.d(!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f304343d.getTag(), java.lang.Boolean.TRUE));
        this.f304345f.f177227i.mo152xb9724478();
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheUI$initUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
