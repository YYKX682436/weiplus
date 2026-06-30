package z32;

/* loaded from: classes4.dex */
public final class u implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.e6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z32.a0 f551477a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f551478b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f551479c;

    public u(z32.a0 a0Var, android.widget.TextView textView, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352) {
        this.f551477a = a0Var;
        this.f551478b = textView;
        this.f551479c = c22699x3dcdb352;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.e6
    public final void a(k91.v5 v5Var) {
        if (v5Var != null) {
            ((ku5.t0) ku5.t0.f394148d).B(new z32.t(this.f551478b, v5Var, this.f551479c, this.f551477a));
        }
        android.app.Activity context = this.f551477a.m80379x76847179();
        android.widget.TextView textView = this.f551478b;
        boolean z17 = v5Var != null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        ym5.a1.f(new a42.f(textView, z17 ? i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c) : i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834), null));
    }
}
