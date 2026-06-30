package o45;

/* loaded from: classes9.dex */
public class dh extends o45.ah implements o45.yg {

    /* renamed from: a, reason: collision with root package name */
    public r45.ih f424453a = new r45.ih();

    @Override // o45.yg
    /* renamed from: fromProtoBuf */
    public int mo13863x347f4535(byte[] bArr) {
        r45.ih ihVar = (r45.ih) new r45.ih().mo11468x92b714fd(bArr);
        this.f424453a = ihVar;
        return ihVar.f458575d;
    }

    @Override // o45.ah
    /* renamed from: getCmdId */
    public int mo13864x7443ca3f() {
        return 1000000312;
    }

    @Override // o45.ah, o45.yg
    /* renamed from: isRawData */
    public boolean mo150581x182b0f68() {
        return true;
    }
}
