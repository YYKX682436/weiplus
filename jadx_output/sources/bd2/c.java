package bd2;

/* loaded from: classes2.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bd2.g f19245d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(bd2.g gVar) {
        super(1);
        this.f19245d = gVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.LinkedList reasons = (java.util.LinkedList) obj;
        kotlin.jvm.internal.o.g(reasons, "reasons");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(reasons, 10));
        java.util.Iterator it = reasons.iterator();
        while (it.hasNext()) {
            arrayList.add(fp.i0.a((r45.rw4) it.next()));
        }
        com.tencent.pigeon.finder.FinderDislikeReasonFetchResult finderDislikeReasonFetchResult = new com.tencent.pigeon.finder.FinderDislikeReasonFetchResult(false, false, arrayList);
        bd2.g gVar = this.f19245d;
        gVar.f19256n = finderDislikeReasonFetchResult;
        com.tencent.pigeon.finder.FinderDislikeFlutterAPI finderDislikeFlutterAPI = gVar.f19254i;
        if (finderDislikeFlutterAPI != null) {
            finderDislikeFlutterAPI.updateDislikeReasonFetchResult(finderDislikeReasonFetchResult, bd2.f.f19248d);
        }
        return jz5.f0.f302826a;
    }
}
