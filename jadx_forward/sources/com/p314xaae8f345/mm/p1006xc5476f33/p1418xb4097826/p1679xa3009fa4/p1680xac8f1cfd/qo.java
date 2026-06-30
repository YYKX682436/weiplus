package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes5.dex */
public final class qo {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f217257a;

    /* renamed from: b, reason: collision with root package name */
    public final wp0.b f217258b;

    public qo(android.view.View view, wp0.b meta) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(meta, "meta");
        this.f217257a = view;
        this.f217258b = meta;
    }

    /* renamed from: equals */
    public boolean m63231xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qo)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qo qoVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qo) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f217257a, qoVar.f217257a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f217258b, qoVar.f217258b);
    }

    /* renamed from: hashCode */
    public int m63232x8cdac1b() {
        android.view.View view = this.f217257a;
        return ((view == null ? 0 : view.hashCode()) * 31) + this.f217258b.m174289x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m63233x9616526c() {
        return "EmojiView(view=" + this.f217257a + ", meta=" + this.f217258b + ')';
    }
}
