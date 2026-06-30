package xl1;

/* loaded from: classes5.dex */
public class b extends android.text.method.NumberKeyListener {
    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.sms.C12810x6cc39e95 c12810x6cc39e95) {
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
