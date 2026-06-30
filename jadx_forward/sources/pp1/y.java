package pp1;

/* loaded from: classes14.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pp1.z f438978d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(pp1.z zVar) {
        super(1);
        this.f438978d = zVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.ArrayList snapshotList = (java.util.ArrayList) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshotList, "snapshotList");
        snapshotList.clear();
        snapshotList.addAll(this.f438978d.f438984i);
        return jz5.f0.f384359a;
    }
}
