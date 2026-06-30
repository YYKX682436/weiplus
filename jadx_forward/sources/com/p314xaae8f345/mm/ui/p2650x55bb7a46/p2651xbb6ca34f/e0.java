package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f;

/* loaded from: classes9.dex */
public abstract class e0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f279934d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f279935e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f279936f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f279937g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f279938h;

    public e0(android.view.View view) {
        super(view);
        this.f279938h = view;
        this.f279934d = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.dte);
        this.f279935e = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.dvd);
        this.f279936f = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.dwo);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.dwp);
        this.f279937g = textView;
        textView.setSingleLine(false);
        textView.setMaxLines(2);
        view.setOnClickListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.c0(this));
        view.setOnLongClickListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.d0(this));
    }

    public void i(android.widget.TextView textView, java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        textView.setText(o13.q.c(textView.getContext(), textView.getText(), str));
    }
}
