package lj2;

/* loaded from: classes10.dex */
public final class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final gk2.e f400424d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f400425e;

    /* renamed from: f, reason: collision with root package name */
    public final zh2.c f400426f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g f400427g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.a f400428h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f400429i;

    public n(android.content.Context context, gk2.e liveData, android.view.View view, zh2.c pluginAbility, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g gVar, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        this.f400424d = liveData;
        this.f400425e = view;
        this.f400426f = pluginAbility;
        this.f400427g = gVar;
        this.f400428h = aVar;
        this.f400429i = view != null ? (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.tmk) : null;
        if (view == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveMicTopicPanelWidget", "root is null");
        }
        if (view != null) {
            view.setOnClickListener(this);
        }
        ((mm2.y2) liveData.a(mm2.y2.class)).B.mo7806x9d92d11c(pluginAbility.a(), new lj2.l(this));
    }

    public final void a() {
        android.view.View view = this.f400425e;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveMicTopicPanelWidget", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveMicTopicPanelWidget", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void b() {
        android.widget.TextView textView = this.f400429i;
        if (textView != null) {
            xh2.e eVar = (xh2.e) ((mm2.y2) this.f400424d.a(mm2.y2.class)).B.mo3195x754a37bb();
            textView.setText(eVar != null ? eVar.f536077b : null);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBind, micTopic: ");
        sb6.append((java.lang.Object) (textView != null ? textView.getText() : null));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicTopicPanelWidget", sb6.toString());
    }

    public final void c() {
        android.view.View view = this.f400425e;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveMicTopicPanelWidget", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveMicTopicPanelWidget", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveMicTopicPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(view, this.f400425e)) {
            yz5.a aVar = this.f400428h;
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
            df2.u3 u3Var = (df2.u3) this.f400426f.mo57008x143f1b92(df2.u3.class);
            if (u3Var != null) {
                df2.h3[] h3VarArr = df2.h3.f311813d;
                u3Var.Z6(2, new lj2.m(this));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveMicTopicPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
