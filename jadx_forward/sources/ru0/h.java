package ru0;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.r6 f481208a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f481209b;

    public h(com.p314xaae8f345.mm.vfs.r6 subtitleFolder, java.lang.String hexKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subtitleFolder, "subtitleFolder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hexKey, "hexKey");
        this.f481208a = subtitleFolder;
        this.f481209b = hexKey;
    }

    /* renamed from: equals */
    public boolean m163024xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru0.h)) {
            return false;
        }
        ru0.h hVar = (ru0.h) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f481208a, hVar.f481208a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f481209b, hVar.f481209b);
    }

    /* renamed from: hashCode */
    public int m163025x8cdac1b() {
        return (this.f481208a.m82468x8cdac1b() * 31) + this.f481209b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m163026x9616526c() {
        return "SubtitleUniqueHexKey(subtitleFolder=" + this.f481208a + ", hexKey=" + this.f481209b + ')';
    }
}
