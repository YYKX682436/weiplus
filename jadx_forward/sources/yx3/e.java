package yx3;

/* loaded from: classes15.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx3.j f549433d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f549434e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(yx3.j jVar, long j17) {
        super(0);
        this.f549433d = jVar;
        this.f549434e = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        yx3.j jVar = this.f549433d;
        d9.v vVar = new d9.v(android.net.Uri.parse(com.p314xaae8f345.mm.vfs.w6.i(jVar.f549445a.f316016t, false)), new r9.v(), new q8.c(), null, null);
        m8.i0 i0Var = jVar.f549444f;
        if (i0Var != null) {
            ((m8.k) i0Var.f406094b).j(vVar);
        }
        m8.i0 i0Var2 = jVar.f549444f;
        if (i0Var2 != null) {
            i0Var2.mo146928xc9fc1b13(this.f549434e);
        }
        m8.i0 i0Var3 = jVar.f549444f;
        if (i0Var3 != null) {
            i0Var3.k(jVar.f549445a.f316008l ? 1 : 0);
        }
        return jz5.f0.f384359a;
    }
}
