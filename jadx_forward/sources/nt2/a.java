package nt2;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f421235a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f421236b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f421237c;

    /* renamed from: d, reason: collision with root package name */
    public int f421238d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f421239e;

    /* renamed from: f, reason: collision with root package name */
    public int f421240f;

    public a(int i17, java.lang.String tabTitle, java.util.List feedList, int i18, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i19, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        tabTitle = (i27 & 2) != 0 ? "" : tabTitle;
        feedList = (i27 & 4) != 0 ? new java.util.ArrayList() : feedList;
        i18 = (i27 & 8) != 0 ? 0 : i18;
        gVar = (i27 & 16) != 0 ? null : gVar;
        i19 = (i27 & 32) != 0 ? 0 : i19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabTitle, "tabTitle");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedList, "feedList");
        this.f421235a = i17;
        this.f421236b = tabTitle;
        this.f421237c = feedList;
        this.f421238d = i18;
        this.f421239e = gVar;
        this.f421240f = i19;
    }

    /* renamed from: toString */
    public java.lang.String m149964x9616526c() {
        return "(tabId=" + this.f421235a + ", tabTitle=" + this.f421236b + ", feedSize=" + this.f421237c.size() + ')';
    }
}
