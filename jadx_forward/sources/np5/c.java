package np5;

/* loaded from: classes9.dex */
public abstract class c implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f420363d;

    /* renamed from: e, reason: collision with root package name */
    public int f420364e;

    /* renamed from: f, reason: collision with root package name */
    public np5.d f420365f;

    public abstract void a(np5.d dVar);

    public abstract boolean b(int i17, int i18, np5.d dVar);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var;
        java.lang.Object obj;
        if (!(m1Var instanceof np5.d) || b(i17, i18, (np5.d) m1Var) || (u0Var = this.f420363d) == null || (obj = this.f420365f) == null || !(obj instanceof com.p314xaae8f345.mm.p944x882e457a.m1)) {
            return;
        }
        u0Var.mo815x76e0bfae(i17, i18, str, (com.p314xaae8f345.mm.p944x882e457a.m1) obj);
    }
}
