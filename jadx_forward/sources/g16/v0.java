package g16;

/* loaded from: classes15.dex */
public abstract class v0 {
    public static final java.lang.String a(g16.a1 a1Var, o06.g classDescriptor, java.lang.String jvmDescriptor) {
        java.lang.String internalName;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a1Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(classDescriptor, "classDescriptor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jvmDescriptor, "jvmDescriptor");
        n06.d dVar = n06.d.f415486a;
        n16.e i17 = v16.f.g(classDescriptor).i();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(i17, "toUnsafe(...)");
        n16.b g17 = dVar.g(i17);
        if (g17 != null) {
            internalName = w16.d.b(g17).e();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(internalName, "getInternalName(...)");
        } else {
            internalName = g16.u.a(classDescriptor, g16.c1.f349133a);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(internalName, "internalName");
        return internalName + '.' + jvmDescriptor;
    }
}
