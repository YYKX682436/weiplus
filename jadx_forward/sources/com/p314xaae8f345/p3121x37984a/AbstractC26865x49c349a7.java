package com.p314xaae8f345.p3121x37984a;

/* renamed from: com.tencent.wcdb.AbstractWindowedCursor */
/* loaded from: classes12.dex */
public abstract class AbstractC26865x49c349a7 extends com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38 {

    /* renamed from: mWindow */
    protected com.p314xaae8f345.p3121x37984a.C26876xa70fd706 f57717x207802bd;

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38
    /* renamed from: checkPosition */
    public void mo106123xbc7f5a51() {
        super.mo106123xbc7f5a51();
        if (this.f57717x207802bd == null) {
            throw new com.p314xaae8f345.p3121x37984a.C26894xe1ef88cc("Attempting to access a closed CursorWindow.Most probable cause: cursor is deactivated prior to calling this method.");
        }
    }

    /* renamed from: clearOrCreateWindow */
    public void m106132x1ac4593c(java.lang.String str) {
        com.p314xaae8f345.p3121x37984a.C26876xa70fd706 c26876xa70fd706 = this.f57717x207802bd;
        if (c26876xa70fd706 == null) {
            this.f57717x207802bd = new com.p314xaae8f345.p3121x37984a.C26876xa70fd706(str);
        } else {
            c26876xa70fd706.m106193x5a5b64d();
        }
    }

    /* renamed from: closeWindow */
    public void m106133x10864c08() {
        com.p314xaae8f345.p3121x37984a.C26876xa70fd706 c26876xa70fd706 = this.f57717x207802bd;
        if (c26876xa70fd706 != null) {
            c26876xa70fd706.close();
            this.f57717x207802bd = null;
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public void copyStringToBuffer(int i17, android.database.CharArrayBuffer charArrayBuffer) {
        mo106123xbc7f5a51();
        this.f57717x207802bd.m106194xfd674a1(this.f57710x32c6a7, i17, charArrayBuffer);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public byte[] getBlob(int i17) {
        mo106123xbc7f5a51();
        return this.f57717x207802bd.m106197xfb7d9813(this.f57710x32c6a7, i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public double getDouble(int i17) {
        mo106123xbc7f5a51();
        return this.f57717x207802bd.m106198x160e9ec7(this.f57710x32c6a7, i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public float getFloat(int i17) {
        mo106123xbc7f5a51();
        return this.f57717x207802bd.m106199x746dc8a6(this.f57710x32c6a7, i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public int getInt(int i17) {
        mo106123xbc7f5a51();
        return this.f57717x207802bd.m106200xb58848b9(this.f57710x32c6a7, i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public long getLong(int i17) {
        mo106123xbc7f5a51();
        return this.f57717x207802bd.m106201xfb822ef2(this.f57710x32c6a7, i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public short getShort(int i17) {
        mo106123xbc7f5a51();
        return this.f57717x207802bd.m106204x75232ac6(this.f57710x32c6a7, i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public java.lang.String getString(int i17) {
        mo106123xbc7f5a51();
        return this.f57717x207802bd.m106206x2fec8307(this.f57710x32c6a7, i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public int getType(int i17) {
        mo106123xbc7f5a51();
        return this.f57717x207802bd.m106207xfb85f7b0(this.f57710x32c6a7, i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26870x63710a65
    /* renamed from: getWindow */
    public com.p314xaae8f345.p3121x37984a.C26876xa70fd706 mo106127x3622fee6() {
        return this.f57717x207802bd;
    }

    /* renamed from: hasWindow */
    public boolean m106134xf5fc7f2a() {
        return this.f57717x207802bd != null;
    }

    @java.lang.Deprecated
    /* renamed from: isBlob */
    public boolean m106135xb9a10be7(int i17) {
        return getType(i17) == 4;
    }

    @java.lang.Deprecated
    /* renamed from: isFloat */
    public boolean m106136x7ab8cf52(int i17) {
        return getType(i17) == 2;
    }

    @java.lang.Deprecated
    /* renamed from: isLong */
    public boolean m106137xb9a5a2c6(int i17) {
        return getType(i17) == 1;
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public boolean isNull(int i17) {
        mo106123xbc7f5a51();
        return this.f57717x207802bd.m106207xfb85f7b0(this.f57710x32c6a7, i17) == 0;
    }

    @java.lang.Deprecated
    /* renamed from: isString */
    public boolean m106138xf30251db(int i17) {
        return getType(i17) == 3;
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38
    /* renamed from: onDeactivateOrClose */
    public void mo106130x24edfea2() {
        super.mo106130x24edfea2();
        m106133x10864c08();
    }

    /* renamed from: setWindow */
    public void mo106139x295832f2(com.p314xaae8f345.p3121x37984a.C26876xa70fd706 c26876xa70fd706) {
        if (c26876xa70fd706 != this.f57717x207802bd) {
            m106133x10864c08();
            this.f57717x207802bd = c26876xa70fd706;
        }
    }
}
