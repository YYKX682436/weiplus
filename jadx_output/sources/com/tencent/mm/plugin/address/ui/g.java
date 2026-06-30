package com.tencent.mm.plugin.address.ui;

/* loaded from: classes5.dex */
public final class g extends android.text.method.NumberKeyListener {
    @Override // android.text.method.NumberKeyListener
    public char[] getAcceptedChars() {
        return new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return 3;
    }
}
