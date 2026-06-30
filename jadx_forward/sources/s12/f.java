package s12;

@j95.b
/* loaded from: classes7.dex */
public final class f extends i95.w implements xp0.f {

    /* renamed from: d, reason: collision with root package name */
    public s12.e f483662d;

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo836xb8969aab(context);
        synchronized (this) {
            rk0.c.c("MagicFinderEmojiService", "destroyBiz", new java.lang.Object[0]);
            s12.e eVar = this.f483662d;
            if (eVar != null) {
                jc3.j0 j0Var = eVar.f529908f;
                if (j0Var != null) {
                    ((rc3.w0) j0Var).m162151x5cd39ffa();
                }
                bf3.p pVar = eVar.f529909g;
                if (pVar != null) {
                    pVar.b();
                }
                eVar.f529908f = null;
                eVar.f529909g = null;
            }
            this.f483662d = null;
        }
    }
}
