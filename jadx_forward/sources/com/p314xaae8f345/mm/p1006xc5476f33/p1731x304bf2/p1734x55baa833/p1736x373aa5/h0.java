package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes8.dex */
public class h0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f220673a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f220674b;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15850x99d4a1f6 c15850x99d4a1f6, java.util.List list, java.util.List list2) {
        this.f220673a = list;
        this.f220674b = list2;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public boolean a(int i17, int i18) {
        return false;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public boolean b(int i17, int i18) {
        w33.a aVar = (w33.a) this.f220673a.get(i17);
        w33.a aVar2 = (w33.a) this.f220674b.get(i18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15720x34e10e9d b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.j1.b(aVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15720x34e10e9d b18 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.j1.b(aVar2);
        if (b17 == null || b18 == null) {
            return false;
        }
        java.lang.String str = b17.f36490x3923b317;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        return str.equals(b18.f36490x3923b317);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public int d() {
        return this.f220674b.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public int e() {
        return this.f220673a.size();
    }
}
