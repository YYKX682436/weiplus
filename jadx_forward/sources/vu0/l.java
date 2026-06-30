package vu0;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final java.nio.ByteBuffer f521647a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4179xedb0cdf9 f521648b;

    public l(java.nio.ByteBuffer pcmData, com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4179xedb0cdf9 captionItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pcmData, "pcmData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(captionItem, "captionItem");
        this.f521647a = pcmData;
        this.f521648b = captionItem;
    }

    /* renamed from: equals */
    public boolean m172628xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vu0.l)) {
            return false;
        }
        vu0.l lVar = (vu0.l) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521647a, lVar.f521647a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521648b, lVar.f521648b);
    }

    /* renamed from: hashCode */
    public int m172629x8cdac1b() {
        return (this.f521647a.hashCode() * 31) + this.f521648b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m172630x9616526c() {
        return "CaptionItemWithPCM(pcmData=" + this.f521647a + ", captionItem=" + this.f521648b + ')';
    }
}
