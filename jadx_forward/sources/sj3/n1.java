package sj3;

/* loaded from: classes3.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f490180a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f490181b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f490182c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f490183d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f490184e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f490185f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f490186g;

    public n1(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        this.f490180a = rootView;
        android.content.Context context = rootView.getContext();
        this.f490184e = context;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) rootView.findViewById(com.p314xaae8f345.mm.R.id.f567561jx4);
        this.f490182c = c22699x3dcdb352;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79942x9dbaf4ba);
        }
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.m82040x7541828(android.graphics.Color.parseColor("#07C160"));
        }
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setVisibility(8);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) rootView.findViewById(com.p314xaae8f345.mm.R.id.f567562jx5);
        this.f490183d = c22699x3dcdb3522;
        if (c22699x3dcdb3522 != null) {
            c22699x3dcdb3522.setImageResource(com.p314xaae8f345.mm.R.raw.f79805xc851170e);
        }
        if (c22699x3dcdb3522 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
            c22699x3dcdb3522.m82040x7541828(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
        }
        if (c22699x3dcdb3522 != null) {
            c22699x3dcdb3522.setVisibility(8);
        }
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.h69);
        this.f490181b = findViewById;
        if (findViewById == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniStatusLayout", "<init>", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniStatusLayout", "<init>", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void a(boolean z17, boolean z18) {
        android.view.View view = this.f490181b;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniStatusLayout", "setDoubleIcon", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniStatusLayout", "setDoubleIcon", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f490183d;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setVisibility(0);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f490182c;
        if (c22699x3dcdb3522 != null) {
            c22699x3dcdb3522.setVisibility(0);
        }
        android.content.Context context = this.f490184e;
        if (z17) {
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79805xc851170e);
            }
            if (c22699x3dcdb352 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
                c22699x3dcdb352.m82040x7541828(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
            }
        } else {
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79805xc851170e);
            }
            if (c22699x3dcdb352 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
                c22699x3dcdb352.m82040x7541828(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
            }
        }
        if (z18) {
            if (c22699x3dcdb3522 != null) {
                c22699x3dcdb3522.setImageResource(com.p314xaae8f345.mm.R.raw.f79942x9dbaf4ba);
            }
            if (c22699x3dcdb3522 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
                c22699x3dcdb3522.m82040x7541828(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
                return;
            }
            return;
        }
        if (c22699x3dcdb3522 != null) {
            c22699x3dcdb3522.setImageResource(com.p314xaae8f345.mm.R.raw.f79942x9dbaf4ba);
        }
        if (c22699x3dcdb3522 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
            c22699x3dcdb3522.m82040x7541828(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
        }
    }
}
