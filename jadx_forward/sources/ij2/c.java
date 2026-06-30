package ij2;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f373224a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.p f373225b;

    /* renamed from: c, reason: collision with root package name */
    public ij2.b f373226c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f373227d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f373228e;

    /* renamed from: f, reason: collision with root package name */
    public xh2.a f373229f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f373230g;

    public c(android.view.View root, yz5.p onClickInvoke) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onClickInvoke, "onClickInvoke");
        this.f373224a = root;
        this.f373225b = onClickInvoke;
        this.f373226c = ij2.b.f373221d;
        this.f373227d = (android.widget.ImageView) root.findViewById(com.p314xaae8f345.mm.R.id.a_1);
        this.f373228e = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.kb_);
        this.f373230g = root.findViewById(com.p314xaae8f345.mm.R.id.dfl);
        c();
        root.setOnClickListener(new ij2.a(this));
    }

    public final void a(xh2.a aVar) {
        km2.q qVar;
        this.f373229f = aVar;
        jz5.f0 f0Var = null;
        if (aVar != null && (qVar = aVar.f536053a) != null) {
            android.view.View view = this.f373230g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/voiceroom/view/FinderLiveVoiceRoomEditItem", "bindMicUserData", "(Lcom/tencent/mm/plugin/finder/live/mic/FinderLiveMicCoverData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/voiceroom/view/FinderLiveVoiceRoomEditItem", "bindMicUserData", "(Lcom/tencent/mm/plugin/finder/live/mic/FinderLiveMicCoverData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.ImageView avatarIconView = this.f373227d;
            avatarIconView.setVisibility(0);
            boolean S3 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.S3(qVar.f390705c);
            mn2.g1 g1Var = mn2.g1.f411508a;
            if (S3) {
                vo0.d a17 = g1Var.a();
                mn2.n nVar = new mn2.n(qVar.f390704b, null, 2, null);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(avatarIconView, "avatarIconView");
                a17.c(nVar, avatarIconView, g1Var.h(mn2.f1.f411490h));
            } else {
                vo0.d l17 = g1Var.l();
                mn2.n nVar2 = new mn2.n(qVar.f390704b, null, 2, null);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(avatarIconView, "avatarIconView");
                l17.c(nVar2, avatarIconView, g1Var.h(mn2.f1.f411494o));
            }
            java.lang.String D0 = zl2.r4.D0(zl2.r4.f555483a, qVar.f390705c, qVar.f390706d, false, 4, null);
            android.widget.TextView textView = this.f373228e;
            textView.setText(D0);
            textView.setTextColor(this.f373224a.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            c();
        }
    }

    public final void b(boolean z17) {
        android.view.View view = this.f373224a;
        if (z17) {
            xh2.a aVar = this.f373229f;
            if ((aVar != null ? aVar.f536053a : null) != null) {
                this.f373226c = ij2.b.f373222e;
                view.setSelected(true);
                return;
            }
        }
        this.f373226c = ij2.b.f373221d;
        view.setSelected(false);
    }

    public final void c() {
        android.view.View view = this.f373230g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/voiceroom/view/FinderLiveVoiceRoomEditItem", "showEmptyItem", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/voiceroom/view/FinderLiveVoiceRoomEditItem", "showEmptyItem", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f373227d.setVisibility(8);
        android.view.View view2 = this.f373224a;
        java.lang.String string = view2.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m0t);
        android.widget.TextView textView = this.f373228e;
        textView.setText(string);
        textView.setTextColor(view2.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
    }
}
