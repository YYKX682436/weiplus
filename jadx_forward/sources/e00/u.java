package e00;

/* loaded from: classes9.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e00.v f327353d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(e00.v vVar) {
        super(0);
        this.f327353d = vVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        e00.v vVar = this.f327353d;
        sb6.append(vVar.f327355b.y());
        sb6.append('_');
        w05.h hVar = vVar.f327355b;
        sb6.append(hVar.j());
        sb6.append('_');
        sb6.append(hVar.l());
        sb6.append('_');
        sb6.append(vVar.f327356c);
        return sb6.toString();
    }
}
