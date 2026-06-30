package uf;

/* loaded from: classes7.dex */
public final class r1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f508626d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.FrameLayout f508627e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ProgressBar f508628f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f508629g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f508630h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(uf.v1 v1Var, android.view.View itemView) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.omb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        this.f508626d = textView;
        android.view.View findViewById2 = itemView.findViewById(com.p314xaae8f345.mm.R.id.g7o);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f508627e = (android.widget.FrameLayout) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.p314xaae8f345.mm.R.id.f567822kt1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f508628f = (android.widget.ProgressBar) findViewById3;
        android.view.View findViewById4 = itemView.findViewById(com.p314xaae8f345.mm.R.id.hkz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById4;
        this.f508629g = imageView;
        android.view.View findViewById5 = itemView.findViewById(com.p314xaae8f345.mm.R.id.olh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById5;
        this.f508630h = textView2;
        imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f78760xb62579a);
        zk1.m.f554947l.a(itemView, (r27 & 2) != 0 ? null : null, (r27 & 4) != 0 ? null : null, (r27 & 8) != 0 ? false : true, (r27 & 16) != 0 ? null : null, (r27 & 32) != 0 ? null : null, (r27 & 64) != 0 ? null : null, (r27 & 128) != 0 ? null : null, (r27 & 256) != 0 ? null : null, (r27 & 512) != 0 ? null : null, (r27 & 1024) != 0 ? null : null, (r27 & 2048) != 0 ? null : null, (r27 & 4096) == 0 ? null : null);
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.u0.s(textView, 1);
        n3.u0.s(textView2, 1);
    }
}
