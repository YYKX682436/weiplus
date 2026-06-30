package c23;

/* loaded from: classes12.dex */
public final class p implements e75.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c23.q f38050d;

    public p(c23.q qVar) {
        this.f38050d = qVar;
    }

    @Override // e75.a
    public void onChanged(java.lang.Object obj) {
        b23.a state = (b23.a) obj;
        kotlin.jvm.internal.o.g(state, "state");
        b23.g gVar = (b23.g) state.a(b23.g.class);
        if (gVar != null) {
            k23.x0 x0Var = k23.c1.f303536h;
            c23.q qVar = this.f38050d;
            if (!x0Var.a(qVar.getContext()).U6()) {
                new com.tencent.mm.plugin.fts.ui.widget.w0(qVar.getActivity(), gVar.f17393b).show();
            } else {
                k23.c1 a17 = x0Var.a(qVar.getContext());
                com.tencent.mm.plugin.fts.ui.voice.FTSFloatingVoiceHalfScreenActivity.f138204f.a(a17.getContext(), new k23.b1(a17), 238, 6, k23.w0.f303735e, "", false);
            }
        }
    }
}
