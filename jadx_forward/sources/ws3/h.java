package ws3;

/* loaded from: classes9.dex */
public class h implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.p1980x300cc4.C16961xa9bd4cfb f530711d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ws3.j f530712e;

    public h(ws3.j jVar, com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.p1980x300cc4.C16961xa9bd4cfb c16961xa9bd4cfb) {
        this.f530712e = jVar;
        this.f530711d = c16961xa9bd4cfb;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        if (z17) {
            int color = view.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77636xad7ef29);
            com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.p1980x300cc4.C16961xa9bd4cfb c16961xa9bd4cfb = this.f530711d;
            c16961xa9bd4cfb.setHintTextColor(color);
            ws3.j jVar = this.f530712e;
            vs3.a aVar = jVar.f530715b;
            if (aVar != null && aVar.f521411d == 2 && !jVar.f530718e) {
                android.widget.EditText editText = jVar.f530716c.f236697f;
                if (editText != null) {
                    editText.setText("");
                }
                jVar.f530715b = null;
            } else if (jVar.f530718e) {
                jVar.f530718e = false;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16961xa9bd4cfb.getText().toString())) {
                c16961xa9bd4cfb.showDropDown();
            }
        }
    }
}
