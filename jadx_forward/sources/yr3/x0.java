package yr3;

/* loaded from: classes11.dex */
public final class x0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qk.k6 f546604d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yr3.c1 f546605e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.v70 f546606f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f546607g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bw5.lp0 f546608h;

    public x0(qk.k6 k6Var, yr3.c1 c1Var, r45.o5 o5Var, bw5.v70 v70Var, boolean z17, bw5.lp0 lp0Var) {
        this.f546604d = k6Var;
        this.f546605e = c1Var;
        this.f546606f = v70Var;
        this.f546607g = z17;
        this.f546608h = lp0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/msg/holder/MsgSingleAudioViewHolder$bind$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.jk.f290544a.a();
        yr3.c1 c1Var = this.f546605e;
        qk.k6 audioService = this.f546604d;
        if (audioService != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(audioService, "$audioService");
            bw5.lp0 tingItem = this.f546608h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tingItem, "$tingItem");
            bw5.v70 v70Var = this.f546606f;
            if (this.f546607g) {
                c1Var.getClass();
                qk.k6.Xg(audioService, null, v70Var.m13170xcc16feb8(), null, null, 13, null);
            } else if (qk.k6.hi(audioService, c1Var.f546289u, null, v70Var.m13170xcc16feb8(), null, null, 26, null)) {
                qk.k6.Hb(audioService, null, v70Var.m13170xcc16feb8(), null, null, 13, null);
            } else {
                java.lang.String str = c1Var.f546289u;
                bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
                ((rk4.a) audioService).Ui(str, tingItem, new il4.e(null, 0, 1212, true, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, bw5.x2.BizAudioEnterScene_Profile, false, 25165811, null));
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(c1Var.f546277f, "audioService is null, cannot play audio");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/MsgSingleAudioViewHolder$bind$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
