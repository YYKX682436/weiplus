package a1;

/* loaded from: classes14.dex */
public final class e extends android.view.autofill.AutofillManager.AutofillCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final a1.e f484a = new a1.e();

    public final void a(a1.a autofill) {
        kotlin.jvm.internal.o.g(autofill, "autofill");
        autofill.f481c.registerCallback(this);
    }

    public final void b(a1.a autofill) {
        kotlin.jvm.internal.o.g(autofill, "autofill");
        autofill.f481c.unregisterCallback(this);
    }

    @Override // android.view.autofill.AutofillManager.AutofillCallback
    public void onAutofillEvent(android.view.View view, int i17, int i18) {
        kotlin.jvm.internal.o.g(view, "view");
        super.onAutofillEvent(view, i17, i18);
    }
}
