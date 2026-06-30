package xw;

/* loaded from: classes.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f539092d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f539093e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f539094f;

    public t(android.widget.TextView textView, java.lang.String str, yz5.a aVar) {
        this.f539092d = textView;
        this.f539093e = str;
        this.f539094f = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/brandservice/extension/BizTextExtKt$setExpandableText$1$onGlobalLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String str = this.f539093e;
        android.widget.TextView textView = this.f539092d;
        textView.setText(str);
        textView.setOnClickListener(null);
        yz5.a aVar = this.f539094f;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        yj0.a.h(this, "com/tencent/mm/feature/brandservice/extension/BizTextExtKt$setExpandableText$1$onGlobalLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
