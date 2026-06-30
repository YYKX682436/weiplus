package bd2;

/* loaded from: classes2.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bd2.g f100778d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(bd2.g gVar) {
        super(1);
        this.f100778d = gVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.LinkedList reasons = (java.util.LinkedList) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reasons, "reasons");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(reasons, 10));
        java.util.Iterator it = reasons.iterator();
        while (it.hasNext()) {
            arrayList.add(fp.i0.a((r45.rw4) it.next()));
        }
        com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23874xcbecf254 c23874xcbecf254 = new com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23874xcbecf254(false, false, arrayList);
        bd2.g gVar = this.f100778d;
        gVar.f100789n = c23874xcbecf254;
        com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23863x1bd5fbd c23863x1bd5fbd = gVar.f100787i;
        if (c23863x1bd5fbd != null) {
            c23863x1bd5fbd.m88451x5dfa2dd7(c23874xcbecf254, bd2.f.f100781d);
        }
        return jz5.f0.f384359a;
    }
}
