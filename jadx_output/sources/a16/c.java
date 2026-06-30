package a16;

/* loaded from: classes16.dex */
public abstract class c {
    public static a16.l a(a16.l lVar, o06.i containingDeclaration, e16.w wVar, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            wVar = null;
        }
        if ((i18 & 4) != 0) {
            i17 = 0;
        }
        kotlin.jvm.internal.o.g(lVar, "<this>");
        kotlin.jvm.internal.o.g(containingDeclaration, "containingDeclaration");
        return new a16.l(lVar.f649a, wVar != null ? new a16.n(lVar, containingDeclaration, wVar, i17) : lVar.f650b, jz5.h.a(jz5.i.f302831f, new a16.a(lVar, containingDeclaration)));
    }

    public static final a16.l b(a16.l lVar, p06.k additionalAnnotations) {
        kotlin.jvm.internal.o.g(lVar, "<this>");
        kotlin.jvm.internal.o.g(additionalAnnotations, "additionalAnnotations");
        if (additionalAnnotations.isEmpty()) {
            return lVar;
        }
        return new a16.l(lVar.f649a, lVar.f650b, jz5.h.a(jz5.i.f302831f, new a16.b(lVar, additionalAnnotations)));
    }
}
