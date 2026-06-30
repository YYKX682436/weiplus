package m00;

/* loaded from: classes9.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f404059d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(yz5.l lVar) {
        super(1);
        this.f404059d = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.List allAddress = (java.util.List) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(allAddress, "allAddress");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(allAddress, 10));
        java.util.Iterator it = allAddress.iterator();
        while (it.hasNext()) {
            arrayList.add(m00.g.a((s71.b) it.next()));
        }
        this.f404059d.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(arrayList)));
        return jz5.f0.f384359a;
    }
}
