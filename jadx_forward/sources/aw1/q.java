package aw1;

/* loaded from: classes10.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f96164d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(java.util.HashSet hashSet) {
        super(1);
        this.f96164d = hashSet;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ot1.h it = (ot1.h) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (this.f96164d.contains(new jz5.l(it.f68230xdec927b, java.lang.Long.valueOf(it.f68223x297eb4f7)))) {
            it.f68220x2918cf02 |= 1;
        }
        return jz5.f0.f384359a;
    }
}
