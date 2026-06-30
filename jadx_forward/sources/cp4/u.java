package cp4;

/* loaded from: classes8.dex */
public final class u implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public int f302614d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cp4.x f302615e;

    public u(cp4.x xVar) {
        this.f302615e = xVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        if (editable != null) {
            r45.is isVar = (r45.is) this.f302615e.f302623e.get(this.f302614d);
            byte[] bytes = editable.toString().getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            isVar.f458830d = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bytes, 0, bytes.length);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
