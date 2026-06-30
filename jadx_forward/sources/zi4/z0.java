package zi4;

/* loaded from: classes9.dex */
public final class z0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zi4.a1 f554813d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.rb f554814e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(zi4.a1 a1Var, bw5.rb rbVar) {
        super(0);
        this.f554813d = a1Var;
        this.f554814e = rbVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        bw5.rb rbVar = this.f554814e;
        boolean z17 = true;
        java.lang.String str = rbVar.f114014e[1] ? rbVar.f114013d : "";
        zi4.a1 a1Var = this.f554813d;
        if (str != null) {
            a1Var.getClass();
            if (!r26.n0.N(str)) {
                z17 = false;
            }
        }
        if (!z17) {
            java.lang.ref.WeakReference weakReference = a1Var.f554714e;
            if ((weakReference != null ? (android.content.Context) weakReference.get() : null) != null) {
                java.lang.Object obj = weakReference.get();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
                com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18646xfde55447.f255159i.a((android.content.Context) obj, str);
                return jz5.f0.f384359a;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a1Var.f554720g, "openStatusCommentDialog: failed");
        return jz5.f0.f384359a;
    }
}
