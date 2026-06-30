package e33;

/* loaded from: classes10.dex */
public class v5 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f329051d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f329052e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f329053f;

    public v5(android.view.View view, int i17) {
        super(view);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f564376ph);
        this.f329051d = imageView;
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = i17;
        layoutParams.height = i17;
        imageView.setLayoutParams(layoutParams);
        this.f329052e = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f564413qm);
        this.f329053f = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f564351op);
    }
}
