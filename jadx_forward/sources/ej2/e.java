package ej2;

/* loaded from: classes10.dex */
public final class e implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ej2.j f334826d;

    public e(ej2.j jVar) {
        this.f334826d = jVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        java.lang.String str;
        android.text.Editable text;
        ej2.j jVar = this.f334826d;
        android.widget.EditText editText = jVar.f334835e;
        java.lang.String obj = (editText == null || (text = editText.getText()) == null) ? null : text.toString();
        if (obj == null || obj.length() == 0) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = jVar.f334839i;
            if (c22699x3dcdb352 == null) {
                return;
            }
            c22699x3dcdb352.setVisibility(8);
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = jVar.f334839i;
        if (c22699x3dcdb3522 != null) {
            c22699x3dcdb3522.setVisibility(0);
        }
        if (obj == null) {
            jVar.getClass();
            return;
        }
        java.util.ArrayList arrayList = jVar.f334843m;
        arrayList.clear();
        java.util.ArrayList arrayList2 = jVar.f334842l;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            km2.q qVar = ((vi2.i) next).f519085d;
            if (((qVar == null || (str = qVar.f390706d) == null) ? -1 : r26.n0.L(str, obj, 0, false, 6, null)) != -1) {
                arrayList3.add(next);
            }
        }
        arrayList.addAll(arrayList3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(jVar.f334833c, "loadSearchData keyword:" + obj + " size:" + arrayList.size());
        jVar.a().m8146xced61ae5();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
