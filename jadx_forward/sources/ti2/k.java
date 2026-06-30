package ti2;

/* loaded from: classes10.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ti2.l f501092d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f501093e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vi2.h f501094f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f501095g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.xn1 f501096h;

    public k(ti2.l lVar, android.widget.TextView textView, vi2.h hVar, int i17, r45.xn1 xn1Var) {
        this.f501092d = lVar;
        this.f501093e = textView;
        this.f501094f = hVar;
        this.f501095g = i17;
        this.f501096h = xn1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/pk/convert/MicVisitorInviteUserConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ti2.l lVar = this.f501092d;
        if (((mm2.o4) lVar.f501097e.a(mm2.o4.class)).p7() >= 8) {
            android.widget.TextView textView = this.f501093e;
            db5.t7.m123883x26a183b(textView.getContext(), textView.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m37), 0).show();
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/pk/convert/MicVisitorInviteUserConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            vi2.g gVar = vi2.g.f519080e;
            vi2.h hVar = this.f501094f;
            hVar.getClass();
            hVar.f519083d = gVar;
            lVar.f501098f.a(this.f501095g, this.f501096h);
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/pk/convert/MicVisitorInviteUserConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
