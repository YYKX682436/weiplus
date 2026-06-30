package cb0;

/* loaded from: classes10.dex */
public final class b extends cb0.d {

    /* renamed from: i, reason: collision with root package name */
    public final r45.dx5 f40199i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context, r45.dx5 searchContactReq, ab0.f0 f0Var) {
        super(context, searchContactReq.f372837m, null, null, false, f0Var);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(searchContactReq, "searchContactReq");
        this.f40199i = searchContactReq;
    }

    @Override // cb0.d
    public l41.e0 b() {
        return new l41.e0(this.f40199i);
    }
}
