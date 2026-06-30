package qp5;

/* loaded from: classes9.dex */
public class m extends android.text.method.NumberKeyListener {
    public m(qp5.n nVar) {
    }

    @Override // android.text.method.NumberKeyListener
    public char[] getAcceptedChars() {
        return new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'x', 'X'};
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return 1;
    }
}
