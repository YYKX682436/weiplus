package gt4;

/* loaded from: classes9.dex */
public class i1 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19148x59bc9c3a f356984d;

    public i1(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19148x59bc9c3a c19148x59bc9c3a) {
        this.f356984d = c19148x59bc9c3a;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        if (z17) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19148x59bc9c3a c19148x59bc9c3a = this.f356984d;
        if (((u11.a) ((java.util.HashMap) c19148x59bc9c3a.f262255i).get(c19148x59bc9c3a.f262252f.getText().toString())) == null) {
            c19148x59bc9c3a.f262250d.m83194xb23f15e1(com.p314xaae8f345.mm.R.C30859x5a72f63.f561015a31);
            c19148x59bc9c3a.f262252f.setTextColor(c19148x59bc9c3a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561015a31));
        } else {
            c19148x59bc9c3a.f262250d.m83194xb23f15e1(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c);
            c19148x59bc9c3a.f262252f.setTextColor(c19148x59bc9c3a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        }
    }
}
