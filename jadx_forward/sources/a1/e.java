package a1;

/* loaded from: classes14.dex */
public final class e extends android.view.autofill.AutofillManager.AutofillCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final a1.e f82017a = new a1.e();

    public final void a(a1.a autofill) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(autofill, "autofill");
        autofill.f82014c.registerCallback(this);
    }

    public final void b(a1.a autofill) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(autofill, "autofill");
        autofill.f82014c.unregisterCallback(this);
    }

    @Override // android.view.autofill.AutofillManager.AutofillCallback
    public void onAutofillEvent(android.view.View view, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.onAutofillEvent(view, i17, i18);
    }
}
