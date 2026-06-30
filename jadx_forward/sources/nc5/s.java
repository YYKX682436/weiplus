package nc5;

/* loaded from: classes2.dex */
public final class s extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f417763d;

    public s(android.content.Context activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f417763d = activity;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        int u07 = parent.u0(view);
        android.content.Context context = this.f417763d;
        if (u07 == 0) {
            outRect.left = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        }
        outRect.right = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
    }
}
