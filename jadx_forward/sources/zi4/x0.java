package zi4;

/* loaded from: classes11.dex */
public final class x0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zi4.y0 f554806d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.qb f554807e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(zi4.y0 y0Var, bw5.qb qbVar) {
        super(0);
        this.f554806d = y0Var;
        this.f554807e = qbVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        bw5.qb qbVar = this.f554807e;
        bw5.sm0 sm0Var = qbVar.f113564e[1] ? qbVar.f113563d : new bw5.sm0();
        zi4.y0 y0Var = this.f554806d;
        if (sm0Var != null) {
            java.lang.ref.WeakReference weakReference = y0Var.f554714e;
            if ((weakReference != null ? (android.content.Context) weakReference.get() : null) != null) {
                mj4.h e17 = ai4.f.e(ai4.f.f86672a, sm0Var, null, 2, null);
                bk4.q0 q0Var = bk4.q0.f103071a;
                java.lang.Object obj = weakReference.get();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
                q0Var.b((android.content.Context) obj, e17, null);
                return jz5.f0.f384359a;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(y0Var.f554809g, "openStatusGroupDialog: failed");
        return jz5.f0.f384359a;
    }
}
