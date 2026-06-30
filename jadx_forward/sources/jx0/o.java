package jx0;

/* loaded from: classes5.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.RelativeLayout f383920a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.TextView f383921b;

    public o(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10962x80d4584e c10962x80d4584e) {
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(c10962x80d4584e.getContext());
        this.f383920a = relativeLayout;
        android.widget.TextView textView = new android.widget.TextView(c10962x80d4584e.getContext());
        this.f383921b = textView;
        textView.setSingleLine(true);
        textView.setGravity(17);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        relativeLayout.setClipChildren(true);
        relativeLayout.setClipToPadding(false);
        relativeLayout.addView(textView, layoutParams);
    }
}
