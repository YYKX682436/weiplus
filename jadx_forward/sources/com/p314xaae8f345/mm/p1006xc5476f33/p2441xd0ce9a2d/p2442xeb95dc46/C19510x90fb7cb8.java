package com.p314xaae8f345.mm.p1006xc5476f33.p2441xd0ce9a2d.p2442xeb95dc46;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandItem;", "Landroid/os/Parcelable;", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.weclaw.shortcut.ShortcutCommandItem */
/* loaded from: classes.dex */
public final /* data */ class C19510x90fb7cb8 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2441xd0ce9a2d.p2442xeb95dc46.C19510x90fb7cb8> f38789x681a0c0c = new ry4.d0();

    /* renamed from: d, reason: collision with root package name */
    public final int f269612d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f269613e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f269614f;

    public C19510x90fb7cb8(int i17, java.lang.String title, java.lang.String content) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        this.f269612d = i17;
        this.f269613e = title;
        this.f269614f = content;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p2441xd0ce9a2d.p2442xeb95dc46.C19510x90fb7cb8 b(com.p314xaae8f345.mm.p1006xc5476f33.p2441xd0ce9a2d.p2442xeb95dc46.C19510x90fb7cb8 c19510x90fb7cb8, int i17, java.lang.String title, java.lang.String content, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            i17 = c19510x90fb7cb8.f269612d;
        }
        if ((i18 & 2) != 0) {
            title = c19510x90fb7cb8.f269613e;
        }
        if ((i18 & 4) != 0) {
            content = c19510x90fb7cb8.f269614f;
        }
        c19510x90fb7cb8.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2441xd0ce9a2d.p2442xeb95dc46.C19510x90fb7cb8(i17, title, content);
    }

    public final java.lang.String a() {
        java.lang.Object obj;
        java.lang.String str = this.f269614f;
        java.util.Iterator it = r26.n0.Q(str).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((java.lang.String) obj).length() > 0) {
                break;
            }
        }
        java.lang.String str2 = (java.lang.String) obj;
        return str2 == null ? (java.lang.String) kz5.n0.X(r26.n0.Q(str)) : str2;
    }

    public final java.lang.String c() {
        java.lang.Object obj;
        java.lang.String str = this.f269613e;
        java.util.Iterator it = r26.n0.Q(str).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((java.lang.String) obj).length() > 0) {
                break;
            }
        }
        java.lang.String str2 = (java.lang.String) obj;
        return str2 == null ? (java.lang.String) kz5.n0.X(r26.n0.Q(str)) : str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m74955xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2441xd0ce9a2d.p2442xeb95dc46.C19510x90fb7cb8)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2441xd0ce9a2d.p2442xeb95dc46.C19510x90fb7cb8 c19510x90fb7cb8 = (com.p314xaae8f345.mm.p1006xc5476f33.p2441xd0ce9a2d.p2442xeb95dc46.C19510x90fb7cb8) obj;
        return this.f269612d == c19510x90fb7cb8.f269612d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f269613e, c19510x90fb7cb8.f269613e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f269614f, c19510x90fb7cb8.f269614f);
    }

    /* renamed from: hashCode */
    public int m74956x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f269612d) * 31) + this.f269613e.hashCode()) * 31) + this.f269614f.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m74957x9616526c() {
        return "ShortcutCommandItem(id=" + this.f269612d + ", title=" + this.f269613e + ", content=" + this.f269614f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f269612d);
        out.writeString(this.f269613e);
        out.writeString(this.f269614f);
    }
}
