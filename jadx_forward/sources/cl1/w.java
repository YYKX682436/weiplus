package cl1;

/* loaded from: classes8.dex */
public class w extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12767x7016a6fb f124434d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12767x7016a6fb c12767x7016a6fb, android.view.View view) {
        super(view);
        this.f124434d = c12767x7016a6fb;
        cl1.v vVar = new cl1.v(this);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f564637wo);
        if (textView != null) {
            textView.setFocusable(false);
            textView.setOnClickListener(vVar);
            textView.setImportantForAccessibility(2);
            view.setImportantForAccessibility(1);
            view.setContentDescription(c12767x7016a6fb.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571245l));
        }
        view.setOnClickListener(vVar);
    }
}
