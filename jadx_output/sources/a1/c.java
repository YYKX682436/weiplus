package a1;

/* loaded from: classes14.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final a1.c f482a = new a1.c();

    public final int a(android.view.ViewStructure structure, int i17) {
        kotlin.jvm.internal.o.g(structure, "structure");
        return structure.addChildCount(i17);
    }

    public final android.view.ViewStructure b(android.view.ViewStructure structure, int i17) {
        kotlin.jvm.internal.o.g(structure, "structure");
        return structure.newChild(i17);
    }

    public final void c(android.view.ViewStructure structure, int i17, int i18, int i19, int i27, int i28, int i29) {
        kotlin.jvm.internal.o.g(structure, "structure");
        structure.setDimens(i17, i18, i19, i27, i28, i29);
    }

    public final void d(android.view.ViewStructure structure, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.o.g(structure, "structure");
        structure.setId(i17, str, str2, str3);
    }
}
