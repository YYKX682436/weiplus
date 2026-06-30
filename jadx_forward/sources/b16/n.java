package b16;

/* loaded from: classes16.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b16.r f98751d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(b16.r rVar) {
        super(0);
        this.f98751d = rVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        b16.r rVar = this.f98751d;
        java.util.List mo126782xb121b9ba = ((u06.x) rVar.f98765o).mo126782xb121b9ba();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(mo126782xb121b9ba, 10));
        java.util.Iterator it = ((java.util.ArrayList) mo126782xb121b9ba).iterator();
        while (it.hasNext()) {
            e16.v vVar = (e16.v) it.next();
            o06.e2 a17 = rVar.f98767q.f82183b.a(vVar);
            if (a17 == null) {
                throw new java.lang.AssertionError("Parameter " + vVar + " surely belongs to class " + rVar.f98765o + ", so it must be resolved");
            }
            arrayList.add(a17);
        }
        return arrayList;
    }
}
