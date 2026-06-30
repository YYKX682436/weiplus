package ub4;

/* loaded from: classes4.dex */
public class n extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22636xb1ac8c07 f507722d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f507723e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ub4.p f507724f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ub4.p pVar, android.view.View view) {
        super(view);
        this.f507724f = pVar;
        this.f507722d = null;
        this.f507723e = null;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22636xb1ac8c07 c22636xb1ac8c07 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22636xb1ac8c07) view.findViewById(com.p314xaae8f345.mm.R.id.n6_);
        this.f507722d = c22636xb1ac8c07;
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.n6a);
        this.f507723e = imageView;
        imageView.setImageDrawable(imageView.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f81043x73ab7191));
        c22636xb1ac8c07.m81429xebd28962(al5.q2.CENTER_CROP);
        c22636xb1ac8c07.setOnClickListener(new ub4.m(this, pVar));
    }
}
