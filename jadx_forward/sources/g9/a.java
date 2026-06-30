package g9;

/* loaded from: classes7.dex */
public final class a implements r9.k {

    /* renamed from: a, reason: collision with root package name */
    public final r9.k f351090a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f351091b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f351092c;

    /* renamed from: d, reason: collision with root package name */
    public javax.crypto.CipherInputStream f351093d;

    public a(r9.k kVar, byte[] bArr, byte[] bArr2) {
        this.f351090a = kVar;
        this.f351091b = bArr;
        this.f351092c = bArr2;
    }

    @Override // r9.k
    public int a(byte[] bArr, int i17, int i18) {
        t9.a.d(this.f351093d != null);
        int read = this.f351093d.read(bArr, i17, i18);
        if (read < 0) {
            return -1;
        }
        return read;
    }

    @Override // r9.k
    public long b(r9.n nVar) {
        try {
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new javax.crypto.spec.SecretKeySpec(this.f351091b, "AES"), new javax.crypto.spec.IvParameterSpec(this.f351092c));
                this.f351093d = new javax.crypto.CipherInputStream(new r9.m(this.f351090a, nVar), cipher);
                return -1L;
            } catch (java.security.InvalidAlgorithmParameterException | java.security.InvalidKeyException e17) {
                throw new java.lang.RuntimeException(e17);
            }
        } catch (java.security.NoSuchAlgorithmException | javax.crypto.NoSuchPaddingException e18) {
            throw new java.lang.RuntimeException(e18);
        }
    }

    @Override // r9.k
    /* renamed from: close */
    public void mo10286x5a5ddf8() {
        this.f351093d = null;
        this.f351090a.mo10286x5a5ddf8();
    }

    @Override // r9.k
    /* renamed from: getUri */
    public android.net.Uri mo10287xb5887636() {
        return this.f351090a.mo10287xb5887636();
    }
}
