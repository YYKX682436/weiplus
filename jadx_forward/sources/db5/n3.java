package db5;

/* loaded from: classes.dex */
public final class n3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a f309978d;

    public n3(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a) {
        this.f309978d = c21503x6e5a020a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMLimitedClearEditText$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f309978d.getEditText().setText("");
        yj0.a.h(this, "com/tencent/mm/ui/base/MMLimitedClearEditText$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
