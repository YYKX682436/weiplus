package a1;

/* loaded from: classes14.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final a1.d f82016a = new a1.d();

    public final android.view.autofill.AutofillId a(android.view.ViewStructure structure) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(structure, "structure");
        return structure.getAutofillId();
    }

    public final boolean b(android.view.autofill.AutofillValue value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        return value.isDate();
    }

    public final boolean c(android.view.autofill.AutofillValue value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        return value.isList();
    }

    public final boolean d(android.view.autofill.AutofillValue value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        return value.isText();
    }

    public final boolean e(android.view.autofill.AutofillValue value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        return value.isToggle();
    }

    public final void f(android.view.ViewStructure structure, java.lang.String[] hints) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(structure, "structure");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hints, "hints");
        structure.setAutofillHints(hints);
    }

    public final void g(android.view.ViewStructure structure, android.view.autofill.AutofillId parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(structure, "structure");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        structure.setAutofillId(parent, i17);
    }

    public final void h(android.view.ViewStructure structure, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(structure, "structure");
        structure.setAutofillType(i17);
    }

    public final java.lang.CharSequence i(android.view.autofill.AutofillValue value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        java.lang.CharSequence textValue = value.getTextValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(textValue, "value.textValue");
        return textValue;
    }
}
