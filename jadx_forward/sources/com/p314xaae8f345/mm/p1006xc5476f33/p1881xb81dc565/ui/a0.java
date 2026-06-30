package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui;

/* loaded from: classes14.dex */
public final class a0 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.b0 f231785d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f231786e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f231787f;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.b0 b0Var, java.util.List list, java.lang.String str) {
        this.f231785d = b0Var;
        this.f231786e = list;
        this.f231787f = str;
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p960xd6a841b0.C11143x170c3f54 c11143x170c3f54 = (com.p314xaae8f345.mm.p960xd6a841b0.C11143x170c3f54) obj;
        com.p314xaae8f345.mm.p960xd6a841b0.C11143x170c3f54 c11143x170c3f542 = (com.p314xaae8f345.mm.p960xd6a841b0.C11143x170c3f54) obj2;
        java.lang.String str = c11143x170c3f54.f153145d;
        java.lang.String usrName = c11143x170c3f542.f153145d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(usrName, "usrName");
        int compareTo = str.compareTo(usrName);
        java.lang.String userName = this.f231787f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(userName, "$userName");
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.b0 b0Var = this.f231785d;
        java.util.List list = this.f231786e;
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.b0.N6(b0Var, c11143x170c3f54, list, userName) + (compareTo > 0 ? 1 : compareTo == 0 ? -1 : 0)) - com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.b0.N6(b0Var, c11143x170c3f542, list, userName);
    }
}
