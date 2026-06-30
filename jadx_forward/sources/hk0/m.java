package hk0;

/* loaded from: classes3.dex */
public final class m extends hk0.n {

    /* renamed from: b, reason: collision with root package name */
    public final hk0.l f363304b;

    /* renamed from: c, reason: collision with root package name */
    public hk0.p f363305c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb f363306d;

    /* renamed from: e, reason: collision with root package name */
    public xk0.f f363307e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f363308f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(hk0.l editType, hk0.p handleType, com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb emojiInfo, xk0.f fVar, java.lang.String str) {
        super(editType, handleType, str, fVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editType, "editType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handleType, "handleType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
        this.f363304b = editType;
        this.f363305c = handleType;
        this.f363306d = emojiInfo;
        this.f363307e = fVar;
        this.f363308f = str;
    }

    @Override // hk0.n
    public xk0.f a() {
        return this.f363307e;
    }

    @Override // hk0.n
    public hk0.p b() {
        return this.f363305c;
    }

    @Override // hk0.n
    public java.lang.String c() {
        return this.f363308f;
    }

    /* renamed from: equals */
    public boolean m133650xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk0.m)) {
            return false;
        }
        hk0.m mVar = (hk0.m) obj;
        return this.f363304b == mVar.f363304b && this.f363305c == mVar.f363305c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f363306d, mVar.f363306d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f363307e, mVar.f363307e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f363308f, mVar.f363308f);
    }

    /* renamed from: hashCode */
    public int m133651x8cdac1b() {
        int hashCode = ((((this.f363304b.hashCode() * 31) + this.f363305c.hashCode()) * 31) + this.f363306d.hashCode()) * 31;
        xk0.f fVar = this.f363307e;
        int hashCode2 = (hashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        java.lang.String str = this.f363308f;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m133652x9616526c() {
        return "EmojiEditData(editType=" + this.f363304b + ", handleType=" + this.f363305c + ", emojiInfo=" + this.f363306d + ", emojiItem=" + this.f363307e + ", lastEditId=" + this.f363308f + ')';
    }
}
