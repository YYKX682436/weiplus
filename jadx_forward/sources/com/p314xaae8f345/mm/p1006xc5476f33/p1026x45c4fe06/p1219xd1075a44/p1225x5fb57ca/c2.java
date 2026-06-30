package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public class c2 extends android.text.method.NumberKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d2 f172908d;

    public c2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d2 d2Var) {
        this.f172908d = d2Var;
    }

    @Override // android.text.method.NumberKeyListener
    public char[] getAcceptedChars() {
        return new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '.', 'X', 'x', ' '};
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return (this.f172908d.f172941e ? 16 : 0) | 2;
    }
}
