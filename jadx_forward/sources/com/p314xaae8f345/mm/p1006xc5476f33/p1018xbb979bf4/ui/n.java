package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

/* loaded from: classes15.dex */
public class n extends android.text.method.NumberKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ViewOnFocusChangeListenerC11488x5fd5e9fc f156131d;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ViewOnFocusChangeListenerC11488x5fd5e9fc viewOnFocusChangeListenerC11488x5fd5e9fc) {
        this.f156131d = viewOnFocusChangeListenerC11488x5fd5e9fc;
    }

    @Override // android.text.method.NumberKeyListener
    public char[] getAcceptedChars() {
        return this.f156131d.f155943d ? new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' ', ' '} : new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '-', '+', '_', 8212, ' ', ' ', '(', ')', 65288, 65289, '@', '~', '*', '&', '^', '%', '$', '#', '@', '!', ';', ':', 65306, 65307, '{', '}', '[', ']', 65371, 65373, 12304, 12305, '<', '>', 36716, '~', '`', 183, '=', '=', '+'};
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return 3;
    }
}
