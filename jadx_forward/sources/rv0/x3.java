package rv0;

/* loaded from: classes5.dex */
public final class x3 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f481859d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f481860e;

    public x3(boolean z17, boolean z18) {
        this.f481859d = z17;
        this.f481860e = z18;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        ((db5.h4) g4Var.a(1, com.p314xaae8f345.mm.R.C30867xcad56011.lkt)).f309908s = !this.f481859d;
        ((db5.h4) g4Var.a(2, com.p314xaae8f345.mm.R.C30867xcad56011.lku)).f309908s = true ^ this.f481860e;
        g4Var.a(3, com.p314xaae8f345.mm.R.C30867xcad56011.lks);
    }
}
