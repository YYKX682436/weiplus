package bx0;

/* loaded from: classes5.dex */
public final class g implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bx0.h f117806d;

    public g(bx0.h hVar) {
        this.f117806d = hVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        cx0.c cVar = (cx0.c) obj;
        java.util.Objects.toString(cVar);
        java.util.List list = cVar.f306034b;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((cx0.b) it.next()).f306029a);
        }
        bx0.h hVar = this.f117806d;
        bx0.f fVar = hVar.f117810d;
        fVar.getClass();
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            fVar.f117797p.remove((com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78) it6.next());
        }
        bx0.f fVar2 = hVar.f117810d;
        fVar2.f117798q = true;
        fVar2.f117800s.m34344xfffbdf83();
        fVar2.b();
    }
}
