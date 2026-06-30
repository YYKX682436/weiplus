package rt1;

/* loaded from: classes7.dex */
public final class d extends al5.j2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rt1.l f480925d;

    public d(rt1.l lVar) {
        this.f480925d = lVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        rt1.l lVar = this.f480925d;
        android.widget.TextView[] textViewArr = lVar.f480982f;
        if (textViewArr == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("charViews");
            throw null;
        }
        boolean z17 = false;
        java.lang.String d07 = kz5.z.d0(textViewArr, "", null, null, 0, null, rt1.k.f480965d, 30, null);
        lVar.f480980d = d07;
        rt1.j jVar = new rt1.j(lVar);
        int length = d07.length();
        if ((7 <= length && length < 9) && ((java.lang.Boolean) jVar.mo152xb9724478()).booleanValue()) {
            z17 = true;
        }
        rt1.a aVar = lVar.f480979c;
        if (aVar != null) {
            java.lang.String text = lVar.f480980d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
            android.view.View view = ((rt1.t) aVar).f481019a.f176145g;
            if (view != null) {
                view.setEnabled(z17);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finishBtn");
                throw null;
            }
        }
    }
}
