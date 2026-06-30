package zy3;

/* loaded from: classes7.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Number f559198a;

    /* renamed from: b, reason: collision with root package name */
    public final zy3.a f559199b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f559200c;

    public m(java.lang.Number number, zy3.a bankcard_res, byte[] bArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bankcard_res, "bankcard_res");
        this.f559198a = number;
        this.f559199b = bankcard_res;
        this.f559200c = bArr;
    }

    /* renamed from: equals */
    public boolean m180088xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy3.m)) {
            return false;
        }
        zy3.m mVar = (zy3.m) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f559198a, mVar.f559198a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f559199b, mVar.f559199b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f559200c, mVar.f559200c);
    }

    /* renamed from: hashCode */
    public int m180089x8cdac1b() {
        java.lang.Number number = this.f559198a;
        int hashCode = (((number == null ? 0 : number.hashCode()) * 31) + this.f559199b.m180083x8cdac1b()) * 31;
        byte[] bArr = this.f559200c;
        return hashCode + (bArr != null ? java.util.Arrays.hashCode(bArr) : 0);
    }

    /* renamed from: toString */
    public java.lang.String m180090x9616526c() {
        return "OcrGetBankCardInfoWechatRegResp(errcode=" + this.f559198a + ", bankcard_res=" + this.f559199b + ", data_encrypt_key=" + java.util.Arrays.toString(this.f559200c) + ')';
    }
}
