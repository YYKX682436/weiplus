package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class zk {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.LinearLayout f215005a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.ImageView f215006b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.ImageView f215007c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f215008d;

    public zk(android.widget.LinearLayout container, android.widget.ImageView icon1, android.widget.ImageView icon2, android.widget.TextView textView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(icon1, "icon1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(icon2, "icon2");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "textView");
        this.f215005a = container;
        this.f215006b = icon1;
        this.f215007c = icon2;
        this.f215008d = textView;
    }

    /* renamed from: equals */
    public boolean m63042xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.zk)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.zk zkVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.zk) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f215005a, zkVar.f215005a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f215006b, zkVar.f215006b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f215007c, zkVar.f215007c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f215008d, zkVar.f215008d);
    }

    /* renamed from: hashCode */
    public int m63043x8cdac1b() {
        return (((((this.f215005a.hashCode() * 31) + this.f215006b.hashCode()) * 31) + this.f215007c.hashCode()) * 31) + this.f215008d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m63044x9616526c() {
        return "SpeedItem(container=" + this.f215005a + ", icon1=" + this.f215006b + ", icon2=" + this.f215007c + ", textView=" + this.f215008d + ')';
    }
}
