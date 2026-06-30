package ws3;

/* loaded from: classes9.dex */
public class m extends android.text.method.NumberKeyListener {
    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.p1980x300cc4.ViewOnFocusChangeListenerC16962x770823dd viewOnFocusChangeListenerC16962x770823dd) {
    }

    @Override // android.text.method.NumberKeyListener
    public char[] getAcceptedChars() {
        return new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return 3;
    }
}
