package x06;

/* loaded from: classes15.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final x06.n f532810a = new x06.n();

    public final boolean a(o06.d callableMemberDescriptor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callableMemberDescriptor, "callableMemberDescriptor");
        java.util.Map map = x06.k.f532799a;
        if (!x06.k.f532802d.contains(callableMemberDescriptor.mo132800xfb82e301())) {
            return false;
        }
        if (!kz5.n0.O(x06.k.f532801c, v16.f.c(callableMemberDescriptor)) || !callableMemberDescriptor.W().isEmpty()) {
            if (!l06.o.A(callableMemberDescriptor)) {
                return false;
            }
            java.util.Collection i17 = callableMemberDescriptor.i();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(i17, "getOverriddenDescriptors(...)");
            java.util.Collection<o06.d> collection = i17;
            if (collection.isEmpty()) {
                return false;
            }
            for (o06.d dVar : collection) {
                x06.n nVar = f532810a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar);
                if (nVar.a(dVar)) {
                }
            }
            return false;
        }
        return true;
    }
}
