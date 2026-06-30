package yt3;

/* loaded from: classes10.dex */
public final class a2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt3.b2 f546873d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(yt3.b2 b2Var) {
        super(0);
        this.f546873d = b2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.vfs.r6 j17 = com.p314xaae8f345.mm.vfs.r6.j(this.f546873d.f546899r.getDir("webview", 0));
        sb6.append(j17 != null ? j17.o() : null);
        sb6.append("/mmscreenshotedit.png");
        return sb6.toString();
    }
}
