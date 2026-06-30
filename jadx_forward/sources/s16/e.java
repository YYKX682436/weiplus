package s16;

/* loaded from: classes16.dex */
public final class e extends f26.w {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f483726c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f26.q2 q2Var, boolean z17) {
        super(q2Var);
        this.f483726c = z17;
    }

    @Override // f26.q2
    public boolean b() {
        return this.f483726c;
    }

    @Override // f26.q2
    public f26.l2 d(f26.o0 key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        f26.l2 d17 = this.f340766b.d(key);
        if (d17 == null) {
            return null;
        }
        o06.j i17 = key.w0().i();
        return s16.f.a(d17, i17 instanceof o06.e2 ? (o06.e2) i17 : null);
    }
}
