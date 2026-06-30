package rf2;

/* loaded from: classes10.dex */
public final class w1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f476477d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rf2.c2 f476478e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rf2.d2 f476479f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f476480g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f476481h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f476482i;

    public w1(java.lang.String str, rf2.c2 c2Var, rf2.d2 d2Var, java.lang.String str2, android.widget.TextView textView, android.view.View view) {
        this.f476477d = str;
        this.f476478e = c2Var;
        this.f476479f = d2Var;
        this.f476480g = str2;
        this.f476481h = textView;
        this.f476482i = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget$refreshVoteState$4$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rf2.t.f476423a.e(this.f476477d, 8, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
        rf2.c2 c2Var = this.f476478e;
        p3325xe03a0797.p3326xc267989b.y0 y0Var = c2Var.f476213b.f313077r;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new rf2.v1(c2Var, this.f476479f, this.f476480g, this.f476481h, this.f476477d, this.f476482i, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget$refreshVoteState$4$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
