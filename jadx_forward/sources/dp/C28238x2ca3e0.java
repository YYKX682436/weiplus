package dp;

/* renamed from: dp.a$$a */
/* loaded from: classes15.dex */
public final /* synthetic */ class C28238x2ca3e0 implements dp.e {
    public final void a(android.content.Context context, java.lang.CharSequence charSequence, android.view.View view, dp.d dVar, dp.c cVar, int i17) {
        android.widget.Toast toast = new android.widget.Toast(context);
        toast.setDuration(i17);
        if (view != null) {
            toast.setView(view);
        } else {
            android.widget.TextView textView = new android.widget.TextView(context);
            textView.setText(charSequence);
            toast.setView(textView);
        }
        if (dVar != null) {
            toast.setGravity(dVar.f323636a, dVar.f323637b, dVar.f323638c);
        }
        if (cVar != null) {
            toast.setMargin(cVar.f323635b, cVar.f323634a);
        }
        toast.show();
    }
}
