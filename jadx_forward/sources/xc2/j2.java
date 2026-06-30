package xc2;

/* loaded from: classes2.dex */
public final class j2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx2.q f534703d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(gx2.q qVar) {
        super(0);
        this.f534703d = qVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        gx2.q qVar = this.f534703d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a c22702xa9a9ae2a = qVar != null ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a) qVar.findViewById(android.R.id.list) : null;
        return java.lang.Boolean.valueOf(c22702xa9a9ae2a == null || !c22702xa9a9ae2a.canScrollVertically(-1));
    }
}
