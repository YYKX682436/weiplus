package i12;

/* loaded from: classes14.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f368749a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.ImageView f368750b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f368751c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i12.k f368752d;

    public j(i12.k kVar, android.view.View view) {
        this.f368752d = kVar;
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.def);
        this.f368750b = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.ded);
        this.f368751c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.dee);
        this.f368749a = view.findViewById(com.p314xaae8f345.mm.R.id.dbr);
        view.setAccessibilityDelegate(new i12.h(this, kVar));
        imageView.setAccessibilityDelegate(new i12.i(this, kVar));
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = kVar.f368753d;
            view.setLayoutParams(layoutParams);
        }
    }
}
