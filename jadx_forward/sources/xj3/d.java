package xj3;

/* loaded from: classes3.dex */
public final class d extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f536405d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f536406e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.view.View itemView) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        float b17 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 2);
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.jwz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById;
        this.f536406e = imageView;
        imageView.setClipToOutline(true);
        imageView.setOutlineProvider(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f1(b17));
        android.view.View findViewById2 = itemView.findViewById(com.p314xaae8f345.mm.R.id.f567557jx0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById2, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById2;
        this.f536405d = c22699x3dcdb352;
        c22699x3dcdb352.setClipToOutline(true);
        c22699x3dcdb352.setOutlineProvider(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f1(b17));
    }
}
