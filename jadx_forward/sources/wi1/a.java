package wi1;

/* loaded from: classes5.dex */
public class a implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.p1177xd1075a44.C12545x36e72905 f527684d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.p1177xd1075a44.C12545x36e72905 c12545x36e72905) {
        this.f527684d = c12545x36e72905;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.p1177xd1075a44.C12545x36e72905 c12545x36e72905 = this.f527684d;
        if (view == c12545x36e72905.f168943e) {
            c12545x36e72905.f168952q = new int[]{c12545x36e72905.getPaddingLeft(), c12545x36e72905.getPaddingTop(), c12545x36e72905.getPaddingRight(), c12545x36e72905.getPaddingBottom()};
            if (z17) {
                c12545x36e72905.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c7a);
            } else {
                c12545x36e72905.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c7b);
            }
            int[] iArr = c12545x36e72905.f168952q;
            if (iArr != null) {
                c12545x36e72905.setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
            }
        }
        android.view.View.OnFocusChangeListener onFocusChangeListener = c12545x36e72905.f168953r;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z17);
        }
    }
}
