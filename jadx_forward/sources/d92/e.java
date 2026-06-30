package d92;

/* loaded from: classes3.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f308998d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f308999e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f309000f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.view.View view, boolean z17, boolean z18) {
        super(0);
        this.f308998d = view;
        this.f308999e = z17;
        this.f309000f = z18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        d92.f fVar = d92.f.f309003a;
        android.view.View view = this.f308998d;
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        float paddingLeft = view.getPaddingLeft();
        boolean z17 = this.f308999e;
        int d17 = (int) fVar.d(context, paddingLeft, z17);
        android.content.Context context2 = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        int d18 = (int) fVar.d(context2, view.getPaddingRight(), z17);
        android.content.Context context3 = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
        int d19 = (int) fVar.d(context3, view.getPaddingTop(), z17);
        android.content.Context context4 = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context4, "getContext(...)");
        view.setPadding(d17, d19, d18, (int) fVar.d(context4, view.getPaddingBottom(), z17));
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (this.f309000f) {
            if (layoutParams.width > 0) {
                android.content.Context context5 = view.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context5, "getContext(...)");
                layoutParams.width = (int) fVar.d(context5, layoutParams.width, z17);
            }
            if (layoutParams.height > 0) {
                android.content.Context context6 = view.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context6, "getContext(...)");
                layoutParams.height = (int) fVar.d(context6, layoutParams.height, z17);
            }
        }
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            android.content.Context context7 = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context7, "getContext(...)");
            marginLayoutParams.leftMargin = (int) fVar.d(context7, marginLayoutParams.leftMargin, z17);
            android.content.Context context8 = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context8, "getContext(...)");
            marginLayoutParams.rightMargin = (int) fVar.d(context8, marginLayoutParams.rightMargin, z17);
            android.content.Context context9 = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context9, "getContext(...)");
            marginLayoutParams.topMargin = (int) fVar.d(context9, marginLayoutParams.topMargin, z17);
            android.content.Context context10 = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context10, "getContext(...)");
            marginLayoutParams.bottomMargin = (int) fVar.d(context10, marginLayoutParams.bottomMargin, z17);
            android.content.Context context11 = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context11, "getContext(...)");
            marginLayoutParams.setMarginStart((int) fVar.d(context11, marginLayoutParams.getMarginStart(), z17));
            android.content.Context context12 = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context12, "getContext(...)");
            marginLayoutParams.setMarginEnd((int) fVar.d(context12, marginLayoutParams.getMarginEnd(), z17));
        }
        view.setLayoutParams(layoutParams);
        return jz5.f0.f384359a;
    }
}
