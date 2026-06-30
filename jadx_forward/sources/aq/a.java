package aq;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f94359a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f94360b;

    public a(java.lang.String labelId, java.lang.String cropImagePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(labelId, "labelId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cropImagePath, "cropImagePath");
        this.f94359a = labelId;
        this.f94360b = cropImagePath;
    }

    /* renamed from: equals */
    public boolean m8786xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq.a)) {
            return false;
        }
        aq.a aVar = (aq.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f94359a, aVar.f94359a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f94360b, aVar.f94360b);
    }

    /* renamed from: hashCode */
    public int m8787x8cdac1b() {
        return (this.f94359a.hashCode() * 31) + this.f94360b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m8788x9616526c() {
        return "CropImageItem(labelId=" + this.f94359a + ", cropImagePath=" + this.f94360b + ')';
    }
}
