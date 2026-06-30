package c61;

/* loaded from: classes11.dex */
public final class z9 implements kv.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f39451a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f39452b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f39453c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f39454d;

    public z9(kotlin.jvm.internal.c0 c0Var, java.lang.String str, boolean z17, kotlinx.coroutines.q qVar) {
        this.f39451a = c0Var;
        this.f39452b = str;
        this.f39453c = z17;
        this.f39454d = qVar;
    }

    @Override // kv.g0
    public final int a(int i17, int i18) {
        kotlin.jvm.internal.c0 c0Var = this.f39451a;
        if (!c0Var.f310112d) {
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.tencent.mm.modelavatar.z Ai = com.tencent.mm.modelavatar.d1.Ai();
            java.lang.String str = this.f39452b;
            java.lang.String j17 = Ai.j(str, this.f39453c);
            kotlinx.coroutines.q qVar = this.f39454d;
            if (i17 != 0 || i18 != 0) {
                c0Var.f310112d = true;
                c61.a aVar = new c61.a(i17, i18, "Unable to get avatar type:" + i17 + ", code:" + i18 + " for " + str);
                kotlinx.coroutines.r rVar = (kotlinx.coroutines.r) qVar;
                rVar.getClass();
                kotlinx.coroutines.internal.l0 w17 = rVar.w(new kotlinx.coroutines.e0(aVar, false, 2, null), null, null);
                if (w17 != null) {
                    rVar.e(w17);
                }
            }
            if (com.tencent.mm.vfs.w6.j(j17)) {
                c0Var.f310112d = true;
                kotlinx.coroutines.r rVar2 = (kotlinx.coroutines.r) qVar;
                kotlinx.coroutines.internal.l0 w18 = rVar2.w(j17, null, null);
                if (w18 != null) {
                    rVar2.e(w18);
                }
            }
        }
        return 0;
    }
}
