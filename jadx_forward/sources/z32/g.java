package z32;

/* loaded from: classes12.dex */
public final class g implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.e6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z32.s f551441a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z32.b f551442b;

    public g(z32.s sVar, z32.b bVar) {
        this.f551441a = sVar;
        this.f551442b = bVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.e6
    public final void a(k91.v5 v5Var) {
        if (v5Var != null) {
            ((ku5.t0) ku5.t0.f394148d).B(new z32.f(this.f551442b, v5Var, this.f551441a));
        }
        android.app.Activity context = this.f551441a.m80379x76847179();
        android.widget.TextView textView = this.f551442b.f551412d;
        boolean z17 = v5Var != null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        ym5.a1.f(new a42.f(textView, z17 ? i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c) : i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834), null));
    }
}
