package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes15.dex */
public class z2 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f220902a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f220903b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f220904c;

    public z2(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d c15859x7405890d, java.util.List list, java.util.List list2, java.util.List list3) {
        java.util.HashSet hashSet = new java.util.HashSet();
        this.f220904c = hashSet;
        this.f220902a = list;
        this.f220903b = list2;
        if (list3 != null) {
            hashSet.addAll(list3);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public boolean a(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d67 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67) this.f220902a.get(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d672 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67) this.f220903b.get(i18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15792xf92d0ffd c15792xf92d0ffd = c15731x94356d67.f36572xbfcc3e0;
        if (!((c15792xf92d0ffd == null || c15792xf92d0ffd.f36776xae74947d == null) ? false : true)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15792xf92d0ffd c15792xf92d0ffd2 = c15731x94356d672.f36572xbfcc3e0;
            if (!((c15792xf92d0ffd2 == null || c15792xf92d0ffd2.f36776xae74947d == null) ? false : true)) {
                java.util.Set set = this.f220904c;
                if (!((java.util.HashSet) set).contains(java.lang.Long.valueOf(c15731x94356d67.seq))) {
                    if (!((java.util.HashSet) set).contains(java.lang.Long.valueOf(c15731x94356d672.seq))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public boolean b(int i17, int i18) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67) this.f220902a.get(i17)).seq == ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67) this.f220903b.get(i18)).seq;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public int d() {
        return this.f220903b.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public int e() {
        return this.f220902a.size();
    }
}
