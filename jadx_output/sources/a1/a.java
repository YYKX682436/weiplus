package a1;

/* loaded from: classes14.dex */
public final class a implements a1.b {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f479a;

    /* renamed from: b, reason: collision with root package name */
    public final a1.f f480b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.autofill.AutofillManager f481c;

    public a(android.view.View view, a1.f autofillTree) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(autofillTree, "autofillTree");
        this.f479a = view;
        this.f480b = autofillTree;
        android.view.autofill.AutofillManager autofillManager = (android.view.autofill.AutofillManager) view.getContext().getSystemService(android.view.autofill.AutofillManager.class);
        if (autofillManager == null) {
            throw new java.lang.IllegalStateException("Autofill service could not be located.".toString());
        }
        this.f481c = autofillManager;
        view.setImportantForAutofill(1);
    }
}
