package yf5;

/* loaded from: classes11.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f543549d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f543550e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(java.lang.ref.WeakReference weakReference, java.lang.String str) {
        super(0);
        this.f543549d = weakReference;
        this.f543550e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.ref.WeakReference weakReference = this.f543549d;
        if (weakReference.get() != null) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21526xca364659 c21526xca364659 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21526xca364659) weakReference.get();
            java.lang.Object tag = c21526xca364659 != null ? c21526xca364659.getTag(com.p314xaae8f345.mm.R.id.f565475t06) : null;
            java.lang.String str = this.f543550e;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tag, str)) {
                ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).rj((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21526xca364659) weakReference.get(), str, bi4.c.CONVERSATION_LIST);
            }
        }
        return jz5.f0.f384359a;
    }
}
