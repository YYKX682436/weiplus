package a1;

/* loaded from: classes14.dex */
public final class a implements a1.b {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f82012a;

    /* renamed from: b, reason: collision with root package name */
    public final a1.f f82013b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.autofill.AutofillManager f82014c;

    public a(android.view.View view, a1.f autofillTree) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(autofillTree, "autofillTree");
        this.f82012a = view;
        this.f82013b = autofillTree;
        android.view.autofill.AutofillManager autofillManager = (android.view.autofill.AutofillManager) view.getContext().getSystemService(android.view.autofill.AutofillManager.class);
        if (autofillManager == null) {
            throw new java.lang.IllegalStateException("Autofill service could not be located.".toString());
        }
        this.f82014c = autofillManager;
        view.setImportantForAutofill(1);
    }
}
