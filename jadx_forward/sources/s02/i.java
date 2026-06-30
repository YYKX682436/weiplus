package s02;

/* loaded from: classes2.dex */
public final class i extends db5.d5 {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f483494b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f483495c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f483496d;

    /* renamed from: e, reason: collision with root package name */
    public final int f483497e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f483494b = context;
        this.f483497e = (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        setContentView(android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dh_, (android.view.ViewGroup) null));
        setClippingEnabled(false);
        android.view.View findViewById = getContentView().findViewById(com.p314xaae8f345.mm.R.id.a4z);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f483495c = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById;
        android.view.View findViewById2 = getContentView().findViewById(com.p314xaae8f345.mm.R.id.cgz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        ((android.view.ViewGroup) findViewById2).setOnClickListener(new s02.h(this));
    }

    public final void a(android.view.View anchor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchor, "anchor");
        if (!this.f483496d) {
            getContentView().measure(0, 0);
            this.f483496d = true;
        }
        int measuredWidth = getContentView().getMeasuredWidth();
        getContentView().getMeasuredHeight();
        int[] iArr = new int[2];
        anchor.getLocationInWindow(iArr);
        int width = iArr[0] + ((anchor.getWidth() - measuredWidth) / 2);
        int height = iArr[1] - (anchor.getHeight() * 2);
        int i17 = this.f483497e;
        int i18 = height + i17;
        int i19 = (com.p314xaae8f345.mm.ui.bh.a(this.f483494b).f278668a - i17) - measuredWidth;
        int i27 = i17 + 0;
        if (width > i19) {
            width = i19;
        } else if (width < i27) {
            width = i27;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f483495c;
        android.view.ViewGroup.LayoutParams layoutParams = c22699x3dcdb352.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(((iArr[0] + (anchor.getWidth() / 2)) - width) - (c22699x3dcdb352.getMeasuredWidth() / 2));
        showAtLocation(anchor, 0, width, i18);
    }
}
