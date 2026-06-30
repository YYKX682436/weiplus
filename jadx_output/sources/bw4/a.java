package bw4;

/* loaded from: classes8.dex */
public class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.widget.SOSEditTextView f24937d;

    public a(com.tencent.mm.plugin.websearch.widget.SOSEditTextView sOSEditTextView) {
        this.f24937d = sOSEditTextView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/websearch/widget/SOSEditTextView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.websearch.widget.SOSEditTextView sOSEditTextView = this.f24937d;
        if (sOSEditTextView.getEditText() != null) {
            sOSEditTextView.getEditText().requestFocus();
            sOSEditTextView.s();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/websearch/widget/SOSEditTextView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
