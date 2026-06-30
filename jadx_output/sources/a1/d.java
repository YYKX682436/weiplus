package a1;

/* loaded from: classes14.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final a1.d f483a = new a1.d();

    public final android.view.autofill.AutofillId a(android.view.ViewStructure structure) {
        kotlin.jvm.internal.o.g(structure, "structure");
        return structure.getAutofillId();
    }

    public final boolean b(android.view.autofill.AutofillValue value) {
        kotlin.jvm.internal.o.g(value, "value");
        return value.isDate();
    }

    public final boolean c(android.view.autofill.AutofillValue value) {
        kotlin.jvm.internal.o.g(value, "value");
        return value.isList();
    }

    public final boolean d(android.view.autofill.AutofillValue value) {
        kotlin.jvm.internal.o.g(value, "value");
        return value.isText();
    }

    public final boolean e(android.view.autofill.AutofillValue value) {
        kotlin.jvm.internal.o.g(value, "value");
        return value.isToggle();
    }

    public final void f(android.view.ViewStructure structure, java.lang.String[] hints) {
        kotlin.jvm.internal.o.g(structure, "structure");
        kotlin.jvm.internal.o.g(hints, "hints");
        structure.setAutofillHints(hints);
    }

    public final void g(android.view.ViewStructure structure, android.view.autofill.AutofillId parent, int i17) {
        kotlin.jvm.internal.o.g(structure, "structure");
        kotlin.jvm.internal.o.g(parent, "parent");
        structure.setAutofillId(parent, i17);
    }

    public final void h(android.view.ViewStructure structure, int i17) {
        kotlin.jvm.internal.o.g(structure, "structure");
        structure.setAutofillType(i17);
    }

    public final java.lang.CharSequence i(android.view.autofill.AutofillValue value) {
        kotlin.jvm.internal.o.g(value, "value");
        java.lang.CharSequence textValue = value.getTextValue();
        kotlin.jvm.internal.o.f(textValue, "value.textValue");
        return textValue;
    }
}
