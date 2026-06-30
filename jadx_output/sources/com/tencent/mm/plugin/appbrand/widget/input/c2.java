package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class c2 extends android.text.method.NumberKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.d2 f91375d;

    public c2(com.tencent.mm.plugin.appbrand.widget.input.d2 d2Var) {
        this.f91375d = d2Var;
    }

    @Override // android.text.method.NumberKeyListener
    public char[] getAcceptedChars() {
        return new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '.', 'X', 'x', ' '};
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return (this.f91375d.f91408e ? 16 : 0) | 2;
    }
}
