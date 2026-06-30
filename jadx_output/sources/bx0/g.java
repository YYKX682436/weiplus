package bx0;

/* loaded from: classes5.dex */
public final class g implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bx0.h f36273d;

    public g(bx0.h hVar) {
        this.f36273d = hVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        cx0.c cVar = (cx0.c) obj;
        java.util.Objects.toString(cVar);
        java.util.List list = cVar.f224501b;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((cx0.b) it.next()).f224496a);
        }
        bx0.h hVar = this.f36273d;
        bx0.f fVar = hVar.f36277d;
        fVar.getClass();
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            fVar.f36264p.remove((com.tencent.maas.base.MJID) it6.next());
        }
        bx0.f fVar2 = hVar.f36277d;
        fVar2.f36265q = true;
        fVar2.f36267s.markSequenceMapperDirty();
        fVar2.b();
    }
}
