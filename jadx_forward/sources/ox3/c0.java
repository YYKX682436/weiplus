package ox3;

/* loaded from: classes10.dex */
public final class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ox3.f0 f431265d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(ox3.f0 f0Var) {
        super(0);
        this.f431265d = f0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ox3.f0 f0Var = this.f431265d;
        for (android.view.View view : f0Var.f431279m) {
            ((lt2.b) f0Var.f431280n).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) view : null;
            if (c15188xd8bd4bd != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderVideoPlayHelper", "release " + view);
                c15188xd8bd4bd.d();
                c15188xd8bd4bd.b();
            }
        }
        f0Var.f431279m.clear();
        return jz5.f0.f384359a;
    }
}
