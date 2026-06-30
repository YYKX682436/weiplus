package wc5;

/* loaded from: classes.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f526175d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(java.util.ArrayList arrayList) {
        super(1);
        this.f526175d = arrayList;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.ArrayList snapshotList = (java.util.ArrayList) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshotList, "snapshotList");
        snapshotList.clear();
        snapshotList.addAll(this.f526175d);
        return jz5.f0.f384359a;
    }
}
