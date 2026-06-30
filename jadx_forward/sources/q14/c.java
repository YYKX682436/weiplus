package q14;

/* loaded from: classes2.dex */
public final class c implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q14.d f441222d;

    public c(q14.d dVar) {
        this.f441222d = dVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        android.widget.TextView textView;
        android.view.ViewGroup viewGroup = this.f441222d.f441223d;
        if (viewGroup == null || (textView = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.ulw)) == null) {
            return;
        }
        textView.setPadding((textView.getWidth() % ym5.x.a(textView.getContext(), 17.0f)) / 2, textView.getPaddingTop(), textView.getPaddingRight(), textView.getPaddingBottom());
    }
}
