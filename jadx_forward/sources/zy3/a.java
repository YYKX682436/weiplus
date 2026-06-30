package zy3;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f559175a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f559176b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f559177c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f559178d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Number f559179e;

    public a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, java.lang.Number number) {
        this.f559175a = bArr;
        this.f559176b = bArr2;
        this.f559177c = bArr3;
        this.f559178d = bArr4;
        this.f559179e = number;
    }

    /* renamed from: equals */
    public boolean m180082xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy3.a)) {
            return false;
        }
        zy3.a aVar = (zy3.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f559175a, aVar.f559175a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f559176b, aVar.f559176b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f559177c, aVar.f559177c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f559178d, aVar.f559178d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f559179e, aVar.f559179e);
    }

    /* renamed from: hashCode */
    public int m180083x8cdac1b() {
        byte[] bArr = this.f559175a;
        int hashCode = (bArr == null ? 0 : java.util.Arrays.hashCode(bArr)) * 31;
        byte[] bArr2 = this.f559176b;
        int hashCode2 = (hashCode + (bArr2 == null ? 0 : java.util.Arrays.hashCode(bArr2))) * 31;
        byte[] bArr3 = this.f559177c;
        int hashCode3 = (hashCode2 + (bArr3 == null ? 0 : java.util.Arrays.hashCode(bArr3))) * 31;
        byte[] bArr4 = this.f559178d;
        int hashCode4 = (hashCode3 + (bArr4 == null ? 0 : java.util.Arrays.hashCode(bArr4))) * 31;
        java.lang.Number number = this.f559179e;
        return hashCode4 + (number != null ? number.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m180084x9616526c() {
        return "BankCardOcrEncryptData(cipher_text=" + java.util.Arrays.toString(this.f559175a) + ", tag=" + java.util.Arrays.toString(this.f559176b) + ", iv=" + java.util.Arrays.toString(this.f559177c) + ", aad=" + java.util.Arrays.toString(this.f559178d) + ", key_seq=" + this.f559179e + ')';
    }
}
