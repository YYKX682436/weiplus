package n3;

/* loaded from: classes15.dex */
public abstract class h1 {
    public static java.lang.String[] a(android.view.View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static n3.i b(android.view.View view, n3.i iVar) {
        android.view.ContentInfo contentInfo = ((n3.g) iVar.f415874a).f415869a;
        java.util.Objects.requireNonNull(contentInfo);
        android.view.ContentInfo performReceiveContent = view.performReceiveContent(contentInfo);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == contentInfo ? iVar : new n3.i(new n3.g(performReceiveContent));
    }

    public static void c(android.view.View view, java.lang.String[] strArr, n3.l0 l0Var) {
        if (l0Var == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new n3.i1(l0Var));
        }
    }
}
