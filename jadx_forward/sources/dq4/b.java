package dq4;

/* loaded from: classes3.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f323901d;

    public b(android.view.View view) {
        this.f323901d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dq4.c cVar = dq4.c.f323902a;
        android.view.View view = this.f323901d;
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        int a17 = (int) cVar.a(context, view.getPaddingLeft());
        android.content.Context context2 = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        int a18 = (int) cVar.a(context2, view.getPaddingRight());
        android.content.Context context3 = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
        int a19 = (int) cVar.a(context3, view.getPaddingTop());
        android.content.Context context4 = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context4, "getContext(...)");
        view.setPadding(a17, a19, a18, (int) cVar.a(context4, view.getPaddingBottom()));
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.width > 0) {
            android.content.Context context5 = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context5, "getContext(...)");
            layoutParams.width = (int) cVar.a(context5, layoutParams.width);
        }
        if (layoutParams.height > 0) {
            android.content.Context context6 = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context6, "getContext(...)");
            layoutParams.height = (int) cVar.a(context6, layoutParams.height);
        }
        if (layoutParams instanceof android.widget.FrameLayout.LayoutParams) {
            android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
            android.content.Context context7 = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context7, "getContext(...)");
            layoutParams2.leftMargin = (int) cVar.a(context7, layoutParams2.leftMargin);
            android.content.Context context8 = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context8, "getContext(...)");
            layoutParams2.rightMargin = (int) cVar.a(context8, layoutParams2.rightMargin);
            android.content.Context context9 = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context9, "getContext(...)");
            layoutParams2.topMargin = (int) cVar.a(context9, layoutParams2.topMargin);
            android.content.Context context10 = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context10, "getContext(...)");
            layoutParams2.bottomMargin = (int) cVar.a(context10, layoutParams2.bottomMargin);
        }
        view.setLayoutParams(layoutParams);
    }
}
