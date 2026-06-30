package aw1;

/* loaded from: classes10.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f14631d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(java.util.HashSet hashSet) {
        super(1);
        this.f14631d = hashSet;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ot1.h it = (ot1.h) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (this.f14631d.contains(new jz5.l(it.field_username, java.lang.Long.valueOf(it.field_msgId)))) {
            it.field_flags |= 1;
        }
        return jz5.f0.f302826a;
    }
}
