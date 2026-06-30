package bd2;

/* loaded from: classes2.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bd2.i f19276d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f19277e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f19278f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(bd2.i iVar, long j17, com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        super(1);
        this.f19276d = iVar;
        this.f19277e = j17;
        this.f19278f = y1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.LinkedList reasons = (java.util.LinkedList) obj;
        kotlin.jvm.internal.o.g(reasons, "reasons");
        bd2.i iVar = this.f19276d;
        iVar.f19262d.addAll(reasons);
        iVar.f19263e = this.f19277e;
        iVar.notifyDataSetChanged();
        this.f19278f.s();
        return jz5.f0.f302826a;
    }
}
